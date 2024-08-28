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
import com.configcat.publicapi.java.client.model.JsonPatchOperation;
import com.configcat.publicapi.java.client.model.SettingValueModel;
import com.configcat.publicapi.java.client.model.UpdateSettingValueModel;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FeatureFlagSettingValuesUsingSdkKeyApi
 */
@Disabled
public class FeatureFlagSettingValuesUsingSdkKeyApiTest {

    private final FeatureFlagSettingValuesUsingSdkKeyApi api = new FeatureFlagSettingValuesUsingSdkKeyApi();

    /**
     * Get value
     *
     * This endpoint returns the value of a Feature Flag or Setting  in a specified Environment identified by the &lt;a target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;https://app.configcat.com/sdkkey\&quot;&gt;SDK key&lt;/a&gt; passed in the &#x60;X-CONFIGCAT-SDKKEY&#x60; header.  The most important attributes in the response are the &#x60;value&#x60;, &#x60;rolloutRules&#x60; and &#x60;percentageRules&#x60;. The &#x60;value&#x60; represents what the clients will get when the evaluation requests of our SDKs  are not matching to any of the defined Targeting or Percentage Rules, or when there are no additional rules to evaluate.  The &#x60;rolloutRules&#x60; and &#x60;percentageRules&#x60; attributes are representing the current  Targeting and Percentage Rules configuration of the actual Feature Flag or Setting  in an **ordered** collection, which means the order of the returned rules is matching to the evaluation order. You can read more about these rules [here](https://configcat.com/docs/targeting/targeting-overview/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSettingValueBySdkkeyTest() throws ApiException {
        String settingKeyOrId = null;
        String X_CONFIGCAT_SDKKEY = null;
        SettingValueModel response = api.getSettingValueBySdkkey(settingKeyOrId, X_CONFIGCAT_SDKKEY);
        // TODO: test validations
    }

    /**
     * Replace value
     *
     * This endpoint replaces the value of a Feature Flag or Setting  in a specified Environment identified by the &lt;a target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;https://app.configcat.com/sdkkey\&quot;&gt;SDK key&lt;/a&gt; passed in the &#x60;X-CONFIGCAT-SDKKEY&#x60; header.  Only the &#x60;value&#x60;, &#x60;rolloutRules&#x60; and &#x60;percentageRules&#x60; attributes are modifiable by this endpoint.  **Important:** As this endpoint is doing a complete replace, it&#39;s important to set every other attribute that you don&#39;t  want to change to its original state. Not listing one means it will reset.  For example: We have the following resource. &#x60;&#x60;&#x60;json {   \&quot;rolloutPercentageItems\&quot;: [     {       \&quot;percentage\&quot;: 30,       \&quot;value\&quot;: true     },     {       \&quot;percentage\&quot;: 70,       \&quot;value\&quot;: false     }   ],   \&quot;rolloutRules\&quot;: [],   \&quot;value\&quot;: false } &#x60;&#x60;&#x60; If we send a replace request body as below: &#x60;&#x60;&#x60;json {   \&quot;value\&quot;: true } &#x60;&#x60;&#x60; Then besides that the default served value is set to &#x60;true&#x60;, all the Percentage Rules are deleted.  So we get a response like this: &#x60;&#x60;&#x60;json {   \&quot;rolloutPercentageItems\&quot;: [],   \&quot;rolloutRules\&quot;: [],   \&quot;value\&quot;: true } &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void replaceSettingValueBySdkkeyTest() throws ApiException {
        String settingKeyOrId = null;
        UpdateSettingValueModel updateSettingValueModel = null;
        String reason = null;
        String X_CONFIGCAT_SDKKEY = null;
        SettingValueModel response = api.replaceSettingValueBySdkkey(settingKeyOrId, updateSettingValueModel, reason, X_CONFIGCAT_SDKKEY);
        // TODO: test validations
    }

    /**
     * Update value
     *
     * This endpoint updates the value of a Feature Flag or Setting  with a collection of [JSON Patch](https://jsonpatch.com) operations in a specified Environment identified by the &lt;a target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;https://app.configcat.com/sdkkey\&quot;&gt;SDK key&lt;/a&gt; passed in the &#x60;X-CONFIGCAT-SDKKEY&#x60; header.  Only the &#x60;value&#x60;, &#x60;rolloutRules&#x60; and &#x60;percentageRules&#x60; attributes are modifiable by this endpoint.  The advantage of using JSON Patch is that you can describe individual update operations on a resource without touching attributes that you don&#39;t want to change. It supports collection reordering, so it also  can be used for reordering the targeting rules of a Feature Flag or Setting.  For example: We have the following resource. &#x60;&#x60;&#x60;json {   \&quot;rolloutPercentageItems\&quot;: [     {       \&quot;percentage\&quot;: 30,       \&quot;value\&quot;: true     },     {       \&quot;percentage\&quot;: 70,       \&quot;value\&quot;: false     }   ],   \&quot;rolloutRules\&quot;: [],   \&quot;value\&quot;: false } &#x60;&#x60;&#x60; If we send an update request body as below: &#x60;&#x60;&#x60;json [   {     \&quot;op\&quot;: \&quot;replace\&quot;,     \&quot;path\&quot;: \&quot;/value\&quot;,     \&quot;value\&quot;: true   } ] &#x60;&#x60;&#x60; Only the default served value is going to be set to &#x60;true&#x60; and all the Percentage Rules are remaining unchanged. So we get a response like this: &#x60;&#x60;&#x60;json {   \&quot;rolloutPercentageItems\&quot;: [     {       \&quot;percentage\&quot;: 30,       \&quot;value\&quot;: true     },     {       \&quot;percentage\&quot;: 70,       \&quot;value\&quot;: false     }   ],   \&quot;rolloutRules\&quot;: [],   \&quot;value\&quot;: true } &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSettingValueBySdkkeyTest() throws ApiException {
        String settingKeyOrId = null;
        List<JsonPatchOperation> jsonPatchOperation = null;
        String reason = null;
        String X_CONFIGCAT_SDKKEY = null;
        SettingValueModel response = api.updateSettingValueBySdkkey(settingKeyOrId, jsonPatchOperation, reason, X_CONFIGCAT_SDKKEY);
        // TODO: test validations
    }

}
