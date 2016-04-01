﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System;
using System.Linq;
using System.Globalization;
using System.Collections.Generic;
using Microsoft.Rest.Generator.Logging;

namespace Microsoft.Rest.Modeler.Swagger.Model
{
    /// <summary>
    /// Swagger schema object.
    /// </summary>
    [Serializable]
    public class Schema : SwaggerObject
    {
        public string Title { get; set; }

        /// <summary>
        /// Adds support for polymorphism. The discriminator is the schema 
        /// property serviceTypeName that is used to differentiate between other schemas 
        /// that inherit this schema. The property serviceTypeName used MUST be defined 
        /// at this schema and it MUST be in the required property list. When used, 
        /// the value MUST be the serviceTypeName of this schema or any schema that inherits it,
        /// or it can be overridden with the x-ms-discriminator-value extension.
        /// </summary>
        public string Discriminator { get; set; }

        /// <summary>
        /// Key is a type serviceTypeName.
        /// </summary>
        public Dictionary<string, Schema> Properties { get; set; }

        public bool ReadOnly { get; set; }

        public ExternalDoc ExternalDocs { get; set; }

        public object Example { get; set; }

        /// <summary>
        /// The value of this property MUST be another schema which will provide 
        /// a base schema which the current schema will inherit from.  The
        /// inheritance rules are such that any instance that is valid according
        /// to the current schema MUST be valid according to the referenced
        /// schema.  This MAY also be an array, in which case, the instance MUST
        /// be valid for all the schemas in the array.  A schema that extends
        /// another schema MAY define additional attributes, constrain existing
        /// attributes, or add other constraints.
        /// </summary>
        public string Extends { get; set; }

        //For now (till the PBI gets addressed for the refactoring work), a generic field is used
        //for the reason that SwaggerParameter inherits from this class, but per spec, it's 'IsRequired' 
        //field should be boolean, not an array.
        public IList<string> Required { get; set; }

        /// <summary>
        /// Defines the set of schemas this shema is composed of
        /// </summary>
        public IList<Schema> AllOf { get; set; }

        /// <summary>
        /// Validate the Swagger object against a number of object-specific validation rules.
        /// </summary>
        /// <returns>True if there are no validation errors, false otherwise.</returns>
        public override bool Validate(ValidationContext context)
        {
            var errorCount = context.ValidationErrors.Count;

            base.Validate(context);

            if (Required != null)
            {
                foreach (var req in Required.Where(r =>!string.IsNullOrEmpty(r)))
                {
                    Schema value = null;
                    if (Properties == null || !Properties.TryGetValue(req, out value))
                    {
                        context.LogError(string.Format(CultureInfo.InvariantCulture, "'{0}' is supposedly required, but no such property exists.", req));
                    }
                }
            }

            if (Properties != null)
            {
                foreach (var prop in Properties.Values)
                {
                    prop.Validate(context);
                }
            }

            if (ExternalDocs != null)
            {
                ExternalDocs.Validate(context);
            }

            return context.ValidationErrors.Count == errorCount;
        }

        public override bool Compare(SwaggerBase priorVersion, ValidationContext context)
        {
            var priorSchema = priorVersion as Schema;
            
            if (priorSchema == null)
            {
                throw new ArgumentNullException("priorVersion");
            }

            var errorCount = context.ValidationErrors.Count;

            base.Compare(priorVersion, context);

            if (priorSchema.ReadOnly != ReadOnly)
            {
                context.LogBreakingChange(string.Format("The 'readonly' property has changed from '{0}' to '{1}'.", priorSchema.ReadOnly.ToString().ToLowerInvariant(), ReadOnly.ToString().ToLowerInvariant()));
            }

            if ((priorSchema.Discriminator == null && Discriminator != null) || 
                (priorSchema.Discriminator != null && !priorSchema.Discriminator.Equals(Discriminator)))
            {
                context.LogBreakingChange("The new version has a different discriminator than the previous one");
            }

            if ((priorSchema.Extends == null && Extends != null) ||
                (priorSchema.Extends != null && !priorSchema.Extends.Equals(Extends)))
            {
                context.LogBreakingChange("The new version has a different 'extends' property than the previous one");
            }

            if ((priorSchema.AllOf == null && AllOf != null) || 
                (priorSchema.AllOf != null && AllOf == null))
            {
                context.LogBreakingChange("The new version has a different 'allOf' property than the previous one");
            }
            else if (priorSchema.AllOf != null)
            {
                if (priorSchema.AllOf.Count != AllOf.Count ||
                    priorSchema.AllOf.Union(AllOf).Count() != priorSchema.AllOf.Count)
                {
                    context.LogBreakingChange("The new version has a different 'allOf' property than the previous one");
                }
            }

            CompareProperties(priorSchema, context);

            return context.ValidationErrors.Count == errorCount;
        }

        private void CompareProperties(Schema priorSchema, ValidationContext context)
        {
            // Were any properties removed?

            if (priorSchema.Properties != null)
            {
                foreach (var def in priorSchema.Properties)
                {
                    Schema model = null;
                    if (Properties == null || !Properties.TryGetValue(def.Key, out model))
                    {
                        context.LogBreakingChange(string.Format("The new version is missing a property found in the old version. Was '{0}' renamed or removed?", def.Key));
                    }
                    else
                    {
                        context.PushTitle(context.Title + "/" + def.Key);
                        model.Compare(def.Value, context);
                        context.PopTitle();
                    }
                }
            }

            // Were any required properties added?

            if (Properties != null)
            {
                foreach (var def in Properties.Keys)
                {
                    Schema model = null;
                    if (priorSchema.Properties == null || !priorSchema.Properties.TryGetValue(def, out model) && Required.Contains(def))
                    {
                        context.LogBreakingChange(string.Format("The new version has a new required property '{0}' not found in the old version", def));
                    }
                }
            }
        }
    }
}