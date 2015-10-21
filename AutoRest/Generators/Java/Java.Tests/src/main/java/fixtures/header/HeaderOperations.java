/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.header;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import retrofit.Call;
import com.squareup.okhttp.ResponseBody;
import org.joda.time.LocalDate;
import org.joda.time.DateTime;
import com.microsoft.rest.DateTimeRfc1123;
import org.joda.time.Period;
import fixtures.header.models.GreyscaleColors;
import retrofit.http.POST;
import retrofit.http.Header;

/**
 * An instance of this class provides access to all the operations defined
 * in HeaderOperations.
 */
public interface HeaderOperations {
    /**
     * The interface defining all the services for HeaderOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface HeaderService {
        @POST("/header/param/existingkey")
        Call<ResponseBody> paramExistingKey(@Header("User-Agent") String userAgent);

        @POST("/header/response/existingkey")
        Call<ResponseBody> responseExistingKey();

        @POST("/header/param/protectedkey")
        Call<ResponseBody> paramProtectedKey(@Header("Content-Type") String contentType);

        @POST("/header/response/protectedkey")
        Call<ResponseBody> responseProtectedKey();

        @POST("/header/param/prim/integer")
        Call<ResponseBody> paramInteger(@Header("scenario") String scenario, @Header("value") int value);

        @POST("/header/response/prim/integer")
        Call<ResponseBody> responseInteger(@Header("scenario") String scenario);

        @POST("/header/param/prim/long")
        Call<ResponseBody> paramLong(@Header("scenario") String scenario, @Header("value") long value);

        @POST("/header/response/prim/long")
        Call<ResponseBody> responseLong(@Header("scenario") String scenario);

        @POST("/header/param/prim/float")
        Call<ResponseBody> paramFloat(@Header("scenario") String scenario, @Header("value") double value);

        @POST("/header/response/prim/float")
        Call<ResponseBody> responseFloat(@Header("scenario") String scenario);

        @POST("/header/param/prim/double")
        Call<ResponseBody> paramDouble(@Header("scenario") String scenario, @Header("value") double value);

        @POST("/header/response/prim/double")
        Call<ResponseBody> responseDouble(@Header("scenario") String scenario);

        @POST("/header/param/prim/bool")
        Call<ResponseBody> paramBool(@Header("scenario") String scenario, @Header("value") boolean value);

        @POST("/header/response/prim/bool")
        Call<ResponseBody> responseBool(@Header("scenario") String scenario);

        @POST("/header/param/prim/string")
        Call<ResponseBody> paramString(@Header("scenario") String scenario, @Header("value") String value);

        @POST("/header/response/prim/string")
        Call<ResponseBody> responseString(@Header("scenario") String scenario);

        @POST("/header/param/prim/date")
        Call<ResponseBody> paramDate(@Header("scenario") String scenario, @Header("value") String value);

        @POST("/header/response/prim/date")
        Call<ResponseBody> responseDate(@Header("scenario") String scenario);

        @POST("/header/param/prim/datetime")
        Call<ResponseBody> paramDatetime(@Header("scenario") String scenario, @Header("value") String value);

        @POST("/header/response/prim/datetime")
        Call<ResponseBody> responseDatetime(@Header("scenario") String scenario);

        @POST("/header/param/prim/datetimerfc1123")
        Call<ResponseBody> paramDatetimeRfc1123(@Header("scenario") String scenario, @Header("value") DateTimeRfc1123 value);

        @POST("/header/response/prim/datetimerfc1123")
        Call<ResponseBody> responseDatetimeRfc1123(@Header("scenario") String scenario);

        @POST("/header/param/prim/duration")
        Call<ResponseBody> paramDuration(@Header("scenario") String scenario, @Header("value") Period value);

        @POST("/header/response/prim/duration")
        Call<ResponseBody> responseDuration(@Header("scenario") String scenario);

        @POST("/header/param/prim/byte")
        Call<ResponseBody> paramByte(@Header("scenario") String scenario, @Header("value") String value);

        @POST("/header/response/prim/byte")
        Call<ResponseBody> responseByte(@Header("scenario") String scenario);

        @POST("/header/param/prim/enum")
        Call<ResponseBody> paramEnum(@Header("scenario") String scenario, @Header("value") String value);

        @POST("/header/response/prim/enum")
        Call<ResponseBody> responseEnum(@Header("scenario") String scenario);

        @POST("/header/custom/x-ms-client-request-id/9C4D50EE-2D56-4CD3-8152-34347DC9F2B0")
        Call<ResponseBody> customRequestId();

    }
    /**
     * Send a post request with header value "User-Agent": "overwrite"
     *
     * @param userAgent Send a post request with header value "User-Agent": "overwrite"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void paramExistingKey(String userAgent) throws ServiceException;

    /**
     * Send a post request with header value "User-Agent": "overwrite"
     *
     * @param userAgent Send a post request with header value "User-Agent": "overwrite"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> paramExistingKeyAsync(String userAgent, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a response with header value "User-Agent": "overwrite"
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void responseExistingKey() throws ServiceException;

    /**
     * Get a response with header value "User-Agent": "overwrite"
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> responseExistingKeyAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Send a post request with header value "Content-Type": "text/html"
     *
     * @param contentType Send a post request with header value "Content-Type": "text/html"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void paramProtectedKey(String contentType) throws ServiceException;

    /**
     * Send a post request with header value "Content-Type": "text/html"
     *
     * @param contentType Send a post request with header value "Content-Type": "text/html"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> paramProtectedKeyAsync(String contentType, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a response with header value "Content-Type": "text/html"
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void responseProtectedKey() throws ServiceException;

    /**
     * Get a response with header value "Content-Type": "text/html"
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> responseProtectedKeyAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Send a post request with header values "scenario": "positive", "value": 1 or "scenario": "negative", "value": -2 
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @param value Send a post request with header values 1 or -2
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void paramInteger(String scenario, int value) throws ServiceException;

    /**
     * Send a post request with header values "scenario": "positive", "value": 1 or "scenario": "negative", "value": -2 
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @param value Send a post request with header values 1 or -2
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> paramIntegerAsync(String scenario, int value, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a response with header value "value": 1 or -2
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void responseInteger(String scenario) throws ServiceException;

    /**
     * Get a response with header value "value": 1 or -2
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> responseIntegerAsync(String scenario, final ServiceCallback<Void> serviceCallback);

    /**
     * Send a post request with header values "scenario": "positive", "value": 105 or "scenario": "negative", "value": -2 
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @param value Send a post request with header values 105 or -2
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void paramLong(String scenario, long value) throws ServiceException;

    /**
     * Send a post request with header values "scenario": "positive", "value": 105 or "scenario": "negative", "value": -2 
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @param value Send a post request with header values 105 or -2
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> paramLongAsync(String scenario, long value, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a response with header value "value": 105 or -2
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void responseLong(String scenario) throws ServiceException;

    /**
     * Get a response with header value "value": 105 or -2
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> responseLongAsync(String scenario, final ServiceCallback<Void> serviceCallback);

    /**
     * Send a post request with header values "scenario": "positive", "value": 0.07 or "scenario": "negative", "value": -3.0
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @param value Send a post request with header values 0.07 or -3.0
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void paramFloat(String scenario, double value) throws ServiceException;

    /**
     * Send a post request with header values "scenario": "positive", "value": 0.07 or "scenario": "negative", "value": -3.0
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @param value Send a post request with header values 0.07 or -3.0
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> paramFloatAsync(String scenario, double value, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a response with header value "value": 0.07 or -3.0
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void responseFloat(String scenario) throws ServiceException;

    /**
     * Get a response with header value "value": 0.07 or -3.0
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> responseFloatAsync(String scenario, final ServiceCallback<Void> serviceCallback);

    /**
     * Send a post request with header values "scenario": "positive", "value": 7e120 or "scenario": "negative", "value": -3.0
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @param value Send a post request with header values 7e120 or -3.0
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void paramDouble(String scenario, double value) throws ServiceException;

    /**
     * Send a post request with header values "scenario": "positive", "value": 7e120 or "scenario": "negative", "value": -3.0
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @param value Send a post request with header values 7e120 or -3.0
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> paramDoubleAsync(String scenario, double value, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a response with header value "value": 7e120 or -3.0
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void responseDouble(String scenario) throws ServiceException;

    /**
     * Get a response with header value "value": 7e120 or -3.0
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> responseDoubleAsync(String scenario, final ServiceCallback<Void> serviceCallback);

    /**
     * Send a post request with header values "scenario": "true", "value": true or "scenario": "false", "value": false
     *
     * @param scenario Send a post request with header values "scenario": "true" or "false"
     * @param value Send a post request with header values true or false
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void paramBool(String scenario, boolean value) throws ServiceException;

    /**
     * Send a post request with header values "scenario": "true", "value": true or "scenario": "false", "value": false
     *
     * @param scenario Send a post request with header values "scenario": "true" or "false"
     * @param value Send a post request with header values true or false
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> paramBoolAsync(String scenario, boolean value, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a response with header value "value": true or false
     *
     * @param scenario Send a post request with header values "scenario": "true" or "false"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void responseBool(String scenario) throws ServiceException;

    /**
     * Get a response with header value "value": true or false
     *
     * @param scenario Send a post request with header values "scenario": "true" or "false"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> responseBoolAsync(String scenario, final ServiceCallback<Void> serviceCallback);

    /**
     * Send a post request with header values "scenario": "valid", "value": "The quick brown fox jumps over the lazy dog" or "scenario": "null", "value": null or "scenario": "empty", "value": ""
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "null" or "empty"
     * @param value Send a post request with header values "The quick brown fox jumps over the lazy dog" or null or ""
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void paramString(String scenario, String value) throws ServiceException;

    /**
     * Send a post request with header values "scenario": "valid", "value": "The quick brown fox jumps over the lazy dog" or "scenario": "null", "value": null or "scenario": "empty", "value": ""
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "null" or "empty"
     * @param value Send a post request with header values "The quick brown fox jumps over the lazy dog" or null or ""
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> paramStringAsync(String scenario, String value, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a response with header values "The quick brown fox jumps over the lazy dog" or null or ""
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "null" or "empty"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void responseString(String scenario) throws ServiceException;

    /**
     * Get a response with header values "The quick brown fox jumps over the lazy dog" or null or ""
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "null" or "empty"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> responseStringAsync(String scenario, final ServiceCallback<Void> serviceCallback);

    /**
     * Send a post request with header values "scenario": "valid", "value": "2010-01-01" or "scenario": "min", "value": "0001-01-01"
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "min"
     * @param value Send a post request with header values "2010-01-01" or "0001-01-01"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void paramDate(String scenario, LocalDate value) throws ServiceException;

    /**
     * Send a post request with header values "scenario": "valid", "value": "2010-01-01" or "scenario": "min", "value": "0001-01-01"
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "min"
     * @param value Send a post request with header values "2010-01-01" or "0001-01-01"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> paramDateAsync(String scenario, LocalDate value, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a response with header values "2010-01-01" or "0001-01-01"
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "min"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void responseDate(String scenario) throws ServiceException;

    /**
     * Get a response with header values "2010-01-01" or "0001-01-01"
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "min"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> responseDateAsync(String scenario, final ServiceCallback<Void> serviceCallback);

    /**
     * Send a post request with header values "scenario": "valid", "value": "2010-01-01T12:34:56Z" or "scenario": "min", "value": "0001-01-01T00:00:00Z"
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "min"
     * @param value Send a post request with header values "2010-01-01T12:34:56Z" or "0001-01-01T00:00:00Z"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void paramDatetime(String scenario, DateTime value) throws ServiceException;

    /**
     * Send a post request with header values "scenario": "valid", "value": "2010-01-01T12:34:56Z" or "scenario": "min", "value": "0001-01-01T00:00:00Z"
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "min"
     * @param value Send a post request with header values "2010-01-01T12:34:56Z" or "0001-01-01T00:00:00Z"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> paramDatetimeAsync(String scenario, DateTime value, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a response with header values "2010-01-01T12:34:56Z" or "0001-01-01T00:00:00Z"
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "min"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void responseDatetime(String scenario) throws ServiceException;

    /**
     * Get a response with header values "2010-01-01T12:34:56Z" or "0001-01-01T00:00:00Z"
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "min"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> responseDatetimeAsync(String scenario, final ServiceCallback<Void> serviceCallback);

    /**
     * Send a post request with header values "scenario": "valid", "value": "Wed, 01 Jan 2010 12:34:56 GMT" or "scenario": "min", "value": "Mon, 01 Jan 0001 00:00:00 GMT"
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "min"
     * @param value Send a post request with header values "Wed, 01 Jan 2010 12:34:56 GMT" or "Mon, 01 Jan 0001 00:00:00 GMT"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void paramDatetimeRfc1123(String scenario, DateTimeRfc1123 value) throws ServiceException;

    /**
     * Send a post request with header values "scenario": "valid", "value": "Wed, 01 Jan 2010 12:34:56 GMT" or "scenario": "min", "value": "Mon, 01 Jan 0001 00:00:00 GMT"
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "min"
     * @param value Send a post request with header values "Wed, 01 Jan 2010 12:34:56 GMT" or "Mon, 01 Jan 0001 00:00:00 GMT"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> paramDatetimeRfc1123Async(String scenario, DateTimeRfc1123 value, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a response with header values "Wed, 01 Jan 2010 12:34:56 GMT" or "Mon, 01 Jan 0001 00:00:00 GMT"
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "min"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void responseDatetimeRfc1123(String scenario) throws ServiceException;

    /**
     * Get a response with header values "Wed, 01 Jan 2010 12:34:56 GMT" or "Mon, 01 Jan 0001 00:00:00 GMT"
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "min"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> responseDatetimeRfc1123Async(String scenario, final ServiceCallback<Void> serviceCallback);

    /**
     * Send a post request with header values "scenario": "valid", "value": "P123DT22H14M12.011S"
     *
     * @param scenario Send a post request with header values "scenario": "valid"
     * @param value Send a post request with header values "P123DT22H14M12.011S"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void paramDuration(String scenario, Period value) throws ServiceException;

    /**
     * Send a post request with header values "scenario": "valid", "value": "P123DT22H14M12.011S"
     *
     * @param scenario Send a post request with header values "scenario": "valid"
     * @param value Send a post request with header values "P123DT22H14M12.011S"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> paramDurationAsync(String scenario, Period value, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a response with header values "P123DT22H14M12.011S"
     *
     * @param scenario Send a post request with header values "scenario": "valid"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void responseDuration(String scenario) throws ServiceException;

    /**
     * Get a response with header values "P123DT22H14M12.011S"
     *
     * @param scenario Send a post request with header values "scenario": "valid"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> responseDurationAsync(String scenario, final ServiceCallback<Void> serviceCallback);

    /**
     * Send a post request with header values "scenario": "valid", "value": "啊齄丂狛狜隣郎隣兀﨩"
     *
     * @param scenario Send a post request with header values "scenario": "valid"
     * @param value Send a post request with header values "啊齄丂狛狜隣郎隣兀﨩"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void paramByte(String scenario, byte[] value) throws ServiceException;

    /**
     * Send a post request with header values "scenario": "valid", "value": "啊齄丂狛狜隣郎隣兀﨩"
     *
     * @param scenario Send a post request with header values "scenario": "valid"
     * @param value Send a post request with header values "啊齄丂狛狜隣郎隣兀﨩"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> paramByteAsync(String scenario, byte[] value, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a response with header values "啊齄丂狛狜隣郎隣兀﨩"
     *
     * @param scenario Send a post request with header values "scenario": "valid"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void responseByte(String scenario) throws ServiceException;

    /**
     * Get a response with header values "啊齄丂狛狜隣郎隣兀﨩"
     *
     * @param scenario Send a post request with header values "scenario": "valid"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> responseByteAsync(String scenario, final ServiceCallback<Void> serviceCallback);

    /**
     * Send a post request with header values "scenario": "valid", "value": "GREY" or "scenario": "null", "value": null
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "null" or "empty"
     * @param value Send a post request with header values 'GREY' . Possible values for this parameter include: 'White', 'black', 'GREY'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void paramEnum(String scenario, GreyscaleColors value) throws ServiceException;

    /**
     * Send a post request with header values "scenario": "valid", "value": "GREY" or "scenario": "null", "value": null
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "null" or "empty"
     * @param value Send a post request with header values 'GREY' . Possible values for this parameter include: 'White', 'black', 'GREY'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> paramEnumAsync(String scenario, GreyscaleColors value, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a response with header values "GREY" or null
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "null" or "empty"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void responseEnum(String scenario) throws ServiceException;

    /**
     * Get a response with header values "GREY" or null
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "null" or "empty"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> responseEnumAsync(String scenario, final ServiceCallback<Void> serviceCallback);

    /**
     * Send x-ms-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void customRequestId() throws ServiceException;

    /**
     * Send x-ms-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> customRequestIdAsync(final ServiceCallback<Void> serviceCallback);

}