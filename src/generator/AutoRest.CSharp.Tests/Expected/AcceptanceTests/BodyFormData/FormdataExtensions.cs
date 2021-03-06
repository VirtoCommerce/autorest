// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsBodyFormData
{
    using System.Threading.Tasks;
   using Models;

    /// <summary>
    /// Extension methods for Formdata.
    /// </summary>
    public static partial class FormdataExtensions
    {
            /// <summary>
            /// Upload file
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='fileContent'>
            /// File to upload.
            /// </param>
            /// <param name='fileName'>
            /// File name to upload. Name has to be spelled exactly as written here.
            /// </param>
            public static System.IO.Stream UploadFile(this IFormdata operations, System.IO.Stream fileContent, string fileName)
            {
                return System.Threading.Tasks.Task.Factory.StartNew(s => ((IFormdata)s).UploadFileAsync(fileContent, fileName), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None, System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Upload file
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='fileContent'>
            /// File to upload.
            /// </param>
            /// <param name='fileName'>
            /// File name to upload. Name has to be spelled exactly as written here.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task<System.IO.Stream> UploadFileAsync(this IFormdata operations, System.IO.Stream fileContent, string fileName, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                var _result = await operations.UploadFileWithHttpMessagesAsync(fileContent, fileName, null, cancellationToken).ConfigureAwait(false);
                _result.Request.Dispose();
                return _result.Body;
            }

            /// <summary>
            /// Upload file
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='fileContent'>
            /// File to upload.
            /// </param>
            public static System.IO.Stream UploadFileViaBody(this IFormdata operations, System.IO.Stream fileContent)
            {
                return System.Threading.Tasks.Task.Factory.StartNew(s => ((IFormdata)s).UploadFileViaBodyAsync(fileContent), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None, System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Upload file
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='fileContent'>
            /// File to upload.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task<System.IO.Stream> UploadFileViaBodyAsync(this IFormdata operations, System.IO.Stream fileContent, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                var _result = await operations.UploadFileViaBodyWithHttpMessagesAsync(fileContent, null, cancellationToken).ConfigureAwait(false);
                _result.Request.Dispose();
                return _result.Body;
            }

    }
}
