/*
 * ConfigCat Public Management API
 * The purpose of this API is to access the ConfigCat platform programmatically. You can **Create**, **Read**, **Update** and **Delete** any entities like **Feature Flags, Configs, Environments** or **Products** within ConfigCat.  **Base API URL**: https://test-api.configcat.com  If you prefer the swagger documentation, you can find it here: [Swagger UI](https://test-api.configcat.com/swagger).  The API is based on HTTP REST, uses resource-oriented URLs, status codes and supports JSON  format.   **Important:** Do not use this API for accessing and evaluating feature flag values. Use the [SDKs](https://configcat.com/docs/sdk-reference/overview) or the [ConfigCat Proxy](https://configcat.com/docs/advanced/proxy/proxy-overview/) instead.  # OpenAPI Specification  The complete specification is publicly available in the following formats:  - [OpenAPI v3](https://test-api.configcat.com/docs/v1/swagger.json) - [Swagger v2](https://test-api.configcat.com/docs/v1/swagger.v2.json)  You can use it to generate client libraries in various languages with [OpenAPI Generator](https://github.com/OpenAPITools/openapi-generator) or [Swagger Codegen](https://swagger.io/tools/swagger-codegen/) to interact with this API.  # Authentication This API uses the [Basic HTTP Authentication Scheme](https://en.wikipedia.org/wiki/Basic_access_authentication).   <!-- ReDoc-Inject: <security-definitions> -->  # Throttling and rate limits All the rate limited API calls are returning information about the current rate limit period in the following HTTP headers:  | Header | Description | | :- | :- | | X-Rate-Limit-Remaining | The maximum number of requests remaining in the current rate limit period. | | X-Rate-Limit-Reset     | The time when the current rate limit period resets.        |  When the rate limit is exceeded by a request, the API returns with a `HTTP 429 - Too many requests` status along with a `Retry-After` HTTP header. 
 *
 * The version of the OpenAPI document: v1
 * Contact: support@configcat.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.configcat.publicapi.java.client.api;

import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.model.CreateSettingInitialValues;
import com.configcat.publicapi.java.client.model.JsonPatchOperation;
import com.configcat.publicapi.java.client.model.ReplaceSettingModel;
import com.configcat.publicapi.java.client.model.SettingModel;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FeatureFlagsSettingsApi
 */
@Disabled
public class FeatureFlagsSettingsApiTest {

    private final FeatureFlagsSettingsApi api = new FeatureFlagsSettingsApi();

    /**
     * Create Flag
     *
     * This endpoint creates a new Feature Flag or Setting in a specified Config identified by the &#x60;configId&#x60; parameter.  **Important:** The &#x60;key&#x60; attribute must be unique within the given Config.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSettingTest() throws ApiException {
        UUID configId = null;
        CreateSettingInitialValues createSettingInitialValues = null;
        SettingModel response = api.createSetting(configId, createSettingInitialValues);
        // TODO: test validations
    }

    /**
     * Delete Flag
     *
     * This endpoint removes a Feature Flag or Setting from a specified Config,  identified by the &#x60;configId&#x60; parameter.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteSettingTest() throws ApiException {
        Integer settingId = null;
        api.deleteSetting(settingId);
        // TODO: test validations
    }

    /**
     * Get Flag
     *
     * This endpoint returns the metadata attributes of a Feature Flag or Setting  identified by the &#x60;settingId&#x60; parameter.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSettingTest() throws ApiException {
        Integer settingId = null;
        SettingModel response = api.getSetting(settingId);
        // TODO: test validations
    }

    /**
     * List Flags
     *
     * This endpoint returns the list of the Feature Flags and Settings defined in a  specified Config, identified by the &#x60;configId&#x60; parameter.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSettingsTest() throws ApiException {
        UUID configId = null;
        List<SettingModel> response = api.getSettings(configId);
        // TODO: test validations
    }

    /**
     * Replace Flag
     *
     * This endpoint replaces the whole value of a Feature Flag or Setting identified by the &#x60;settingId&#x60; parameter.  **Important:** As this endpoint is doing a complete replace, it&#39;s important to set every other attribute that you don&#39;t  want to change in its original state. Not listing one means it will reset.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void replaceSettingTest() throws ApiException {
        Integer settingId = null;
        ReplaceSettingModel replaceSettingModel = null;
        SettingModel response = api.replaceSetting(settingId, replaceSettingModel);
        // TODO: test validations
    }

    /**
     * Update Flag
     *
     * This endpoint updates the metadata of a Feature Flag or Setting  with a collection of [JSON Patch](https://jsonpatch.com) operations in a specified Config.  Only the &#x60;name&#x60;, &#x60;hint&#x60; and &#x60;tags&#x60; attributes are modifiable by this endpoint. The &#x60;tags&#x60; attribute is a simple collection of the [tag IDs](#operation/get-tags) attached to the given setting.  The advantage of using JSON Patch is that you can describe individual update operations on a resource without touching attributes that you don&#39;t want to change.  For example: We have the following resource. &#x60;&#x60;&#x60;json {   \&quot;settingId\&quot;: 5345,   \&quot;key\&quot;: \&quot;myGrandFeature\&quot;,   \&quot;name\&quot;: \&quot;Tihs is a naem with soem typos.\&quot;,   \&quot;hint\&quot;: \&quot;This flag controls my grandioso feature.\&quot;,   \&quot;settingType\&quot;: \&quot;boolean\&quot;,   \&quot;tags\&quot;: [     {       \&quot;tagId\&quot;: 0,        \&quot;name\&quot;: \&quot;sample tag\&quot;,        \&quot;color\&quot;: \&quot;whale\&quot;     }   ] } &#x60;&#x60;&#x60; If we send an update request body as below (it changes the &#x60;name&#x60; and adds the already existing tag with the id &#x60;2&#x60;): &#x60;&#x60;&#x60;json [   {     \&quot;op\&quot;: \&quot;replace\&quot;,      \&quot;path\&quot;: \&quot;/name\&quot;,      \&quot;value\&quot;: \&quot;This is the name without typos.\&quot;   },    {     \&quot;op\&quot;: \&quot;add\&quot;,      \&quot;path\&quot;: \&quot;/tags/-\&quot;,      \&quot;value\&quot;: 2   } ] &#x60;&#x60;&#x60; Only the &#x60;name&#x60; and &#x60;tags&#x60; are updated and all the other attributes remain unchanged. So we get a response like this: &#x60;&#x60;&#x60;json {   \&quot;settingId\&quot;: 5345,    \&quot;key\&quot;: \&quot;myGrandFeature\&quot;,    \&quot;name\&quot;: \&quot;This is the name without typos.\&quot;,    \&quot;hint\&quot;: \&quot;This flag controls my grandioso feature.\&quot;,    \&quot;settingType\&quot;: \&quot;boolean\&quot;,    \&quot;tags\&quot;: [     {       \&quot;tagId\&quot;: 0,        \&quot;name\&quot;: \&quot;sample tag\&quot;,        \&quot;color\&quot;: \&quot;whale\&quot;     },      {       \&quot;tagId\&quot;: 2,        \&quot;name\&quot;: \&quot;another tag\&quot;,        \&quot;color\&quot;: \&quot;koala\&quot;     }   ] } &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSettingTest() throws ApiException {
        Integer settingId = null;
        List<JsonPatchOperation> jsonPatchOperation = null;
        SettingModel response = api.updateSetting(settingId, jsonPatchOperation);
        // TODO: test validations
    }

}
