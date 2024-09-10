# FeatureFlagSettingValuesUsingSdkKeyV2Api

All URIs are relative to *https://api.configcat.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSettingValueBySdkkeyV2**](FeatureFlagSettingValuesUsingSdkKeyV2Api.md#getSettingValueBySdkkeyV2) | **GET** /v2/settings/{settingKeyOrId}/value | Get value |
| [**replaceSettingValueBySdkkeyV2**](FeatureFlagSettingValuesUsingSdkKeyV2Api.md#replaceSettingValueBySdkkeyV2) | **PUT** /v2/settings/{settingKeyOrId}/value | Replace value |
| [**updateSettingValueBySdkkeyV2**](FeatureFlagSettingValuesUsingSdkKeyV2Api.md#updateSettingValueBySdkkeyV2) | **PATCH** /v2/settings/{settingKeyOrId}/value | Update value |


<a id="getSettingValueBySdkkeyV2"></a>
# **getSettingValueBySdkkeyV2**
> SettingFormulaModel getSettingValueBySdkkeyV2(settingKeyOrId, X_CONFIGCAT_SDKKEY)

Get value

This endpoint returns the value of a Feature Flag or Setting in a specified Environment identified by the &lt;a target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;https://app.configcat.com/sdkkey\&quot;&gt;SDK key&lt;/a&gt; passed in the &#x60;X-CONFIGCAT-SDKKEY&#x60; header.  The most important fields in the response are the &#x60;defaultValue&#x60;, &#x60;targetingRules&#x60;. The &#x60;defaultValue&#x60; represents what the clients will get when the evaluation requests of our SDKs are not matching to any of the defined Targeting Rules, or when there are no additional rules to evaluate.  The &#x60;targetingRules&#x60; represents the current Targeting Rule configuration of the actual Feature Flag or Setting in an **ordered** collection, which means the order of the returned rules is matching to the evaluation order. You can read more about these rules [here](https://configcat.com/docs/targeting/targeting-overview/).  The &#x60;percentageEvaluationAttribute&#x60; represents the custom [User Object](https://configcat.com/docs/targeting/user-object/) attribute that must be used at the [percentage evaluation](https://configcat.com/docs/advanced/targeting/#anatomy-of-the-percentage-based-targeting) of the Feature Flag or Setting.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.FeatureFlagSettingValuesUsingSdkKeyV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    FeatureFlagSettingValuesUsingSdkKeyV2Api apiInstance = new FeatureFlagSettingValuesUsingSdkKeyV2Api(defaultClient);
    String settingKeyOrId = "settingKeyOrId_example"; // String | The key or id of the Setting.
    String X_CONFIGCAT_SDKKEY = "X_CONFIGCAT_SDKKEY_example"; // String | The ConfigCat SDK Key. (https://app.configcat.com/sdkkey)
    try {
      SettingFormulaModel result = apiInstance.getSettingValueBySdkkeyV2(settingKeyOrId, X_CONFIGCAT_SDKKEY);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagSettingValuesUsingSdkKeyV2Api#getSettingValueBySdkkeyV2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **settingKeyOrId** | **String**| The key or id of the Setting. | |
| **X_CONFIGCAT_SDKKEY** | **String**| The ConfigCat SDK Key. (https://app.configcat.com/sdkkey) | [optional] |

### Return type

[**SettingFormulaModel**](SettingFormulaModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="replaceSettingValueBySdkkeyV2"></a>
# **replaceSettingValueBySdkkeyV2**
> SettingFormulaModel replaceSettingValueBySdkkeyV2(settingKeyOrId, updateEvaluationFormulaModel, reason, X_CONFIGCAT_SDKKEY)

Replace value

This endpoint replaces the value and the Targeting Rules of a Feature Flag or Setting in a specified Environment identified by the &lt;a target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;https://app.configcat.com/sdkkey\&quot;&gt;SDK key&lt;/a&gt; passed in the &#x60;X-CONFIGCAT-SDKKEY&#x60; header.  Only the &#x60;defaultValue&#x60;, &#x60;targetingRules&#x60;, and &#x60;percentageEvaluationAttribute&#x60; fields are modifiable by this endpoint.  **Important:** As this endpoint is doing a complete replace, it&#39;s important to set every other field that you don&#39;t want to change to its original state. Not listing one means it will reset.  For example: We have the following resource of a Feature Flag. &#x60;&#x60;&#x60;json {   \&quot;defaultValue\&quot;: {     \&quot;boolValue\&quot;: false   },   \&quot;targetingRules\&quot;: [     {       \&quot;conditions\&quot;: [         {           \&quot;userCondition\&quot;: {             \&quot;comparisonAttribute\&quot;: \&quot;Email\&quot;,             \&quot;comparator\&quot;: \&quot;sensitiveTextEquals\&quot;,             \&quot;comparisonValue\&quot;: {               \&quot;stringValue\&quot;: \&quot;test@example.com\&quot;             }           }         }       ],       \&quot;percentageOptions\&quot;: [],       \&quot;value\&quot;: {         \&quot;boolValue\&quot;: true       }     }   ] } &#x60;&#x60;&#x60; If we send a replace request body as below: &#x60;&#x60;&#x60;json {   \&quot;defaultValue\&quot;: {     \&quot;boolValue\&quot;: true   } } &#x60;&#x60;&#x60; Then besides that the default served value is set to &#x60;true&#x60;, all the Targeting Rules are deleted. So we get a response like this: &#x60;&#x60;&#x60;json {   \&quot;defaultValue\&quot;: {     \&quot;boolValue\&quot;: true   },   \&quot;targetingRules\&quot;: [] } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.FeatureFlagSettingValuesUsingSdkKeyV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    FeatureFlagSettingValuesUsingSdkKeyV2Api apiInstance = new FeatureFlagSettingValuesUsingSdkKeyV2Api(defaultClient);
    String settingKeyOrId = "settingKeyOrId_example"; // String | The key or id of the Setting.
    UpdateEvaluationFormulaModel updateEvaluationFormulaModel = new UpdateEvaluationFormulaModel(); // UpdateEvaluationFormulaModel | 
    String reason = "reason_example"; // String | The reason note for the Audit Log if the Product's \"Config changes require a reason\" preference is turned on.
    String X_CONFIGCAT_SDKKEY = "X_CONFIGCAT_SDKKEY_example"; // String | The ConfigCat SDK Key. (https://app.configcat.com/sdkkey)
    try {
      SettingFormulaModel result = apiInstance.replaceSettingValueBySdkkeyV2(settingKeyOrId, updateEvaluationFormulaModel, reason, X_CONFIGCAT_SDKKEY);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagSettingValuesUsingSdkKeyV2Api#replaceSettingValueBySdkkeyV2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **settingKeyOrId** | **String**| The key or id of the Setting. | |
| **updateEvaluationFormulaModel** | [**UpdateEvaluationFormulaModel**](UpdateEvaluationFormulaModel.md)|  | |
| **reason** | **String**| The reason note for the Audit Log if the Product&#39;s \&quot;Config changes require a reason\&quot; preference is turned on. | [optional] |
| **X_CONFIGCAT_SDKKEY** | **String**| The ConfigCat SDK Key. (https://app.configcat.com/sdkkey) | [optional] |

### Return type

[**SettingFormulaModel**](SettingFormulaModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="updateSettingValueBySdkkeyV2"></a>
# **updateSettingValueBySdkkeyV2**
> SettingFormulaModel updateSettingValueBySdkkeyV2(settingKeyOrId, jsonPatchOperation, reason, X_CONFIGCAT_SDKKEY)

Update value

This endpoint updates the value of a Feature Flag or Setting with a collection of [JSON Patch](https://jsonpatch.com) operations in a specified Environment.  Only the &#x60;defaultValue&#x60;, &#x60;targetingRules&#x60;, and &#x60;percentageEvaluationAttribute&#x60; fields are modifiable by this endpoint.  The advantage of using JSON Patch is that you can describe individual update operations on a resource without touching attributes that you don&#39;t want to change. It supports collection reordering, so it also can be used for reordering the targeting rules of a Feature Flag or Setting.  For example: We have the following resource of a Feature Flag. &#x60;&#x60;&#x60;json {   \&quot;defaultValue\&quot;: {     \&quot;boolValue\&quot;: false   },   \&quot;targetingRules\&quot;: [     {       \&quot;conditions\&quot;: [         {           \&quot;userCondition\&quot;: {             \&quot;comparisonAttribute\&quot;: \&quot;Email\&quot;,             \&quot;comparator\&quot;: \&quot;sensitiveTextEquals\&quot;,             \&quot;comparisonValue\&quot;: {               \&quot;stringValue\&quot;: \&quot;test@example.com\&quot;             }           }         }       ],       \&quot;percentageOptions\&quot;: [],       \&quot;value\&quot;: {         \&quot;boolValue\&quot;: true       }     }   ] } &#x60;&#x60;&#x60; If we send an update request body as below: &#x60;&#x60;&#x60;json [   {     \&quot;op\&quot;: \&quot;replace\&quot;,     \&quot;path\&quot;: \&quot;/targetingRules/0/value/boolValue\&quot;,     \&quot;value\&quot;: true   } ] &#x60;&#x60;&#x60; Only the first Targeting Rule&#39;s &#x60;value&#x60; is going to be set to &#x60;false&#x60; and all the other fields are remaining unchanged.  So we get a response like this: &#x60;&#x60;&#x60;json {   \&quot;defaultValue\&quot;: {     \&quot;boolValue\&quot;: false   },   \&quot;targetingRules\&quot;: [     {       \&quot;conditions\&quot;: [         {           \&quot;userCondition\&quot;: {             \&quot;comparisonAttribute\&quot;: \&quot;Email\&quot;,             \&quot;comparator\&quot;: \&quot;sensitiveTextEquals\&quot;,             \&quot;comparisonValue\&quot;: {               \&quot;stringValue\&quot;: \&quot;test@example.com\&quot;             }           }         }       ],       \&quot;percentageOptions\&quot;: [],       \&quot;value\&quot;: {         \&quot;boolValue\&quot;: false       }     }   ] } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.FeatureFlagSettingValuesUsingSdkKeyV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    FeatureFlagSettingValuesUsingSdkKeyV2Api apiInstance = new FeatureFlagSettingValuesUsingSdkKeyV2Api(defaultClient);
    String settingKeyOrId = "settingKeyOrId_example"; // String | The key or id of the Setting.
    List<JsonPatchOperation> jsonPatchOperation = Arrays.asList(); // List<JsonPatchOperation> | 
    String reason = "reason_example"; // String | The reason note for the Audit Log if the Product's \"Config changes require a reason\" preference is turned on.
    String X_CONFIGCAT_SDKKEY = "X_CONFIGCAT_SDKKEY_example"; // String | The ConfigCat SDK Key. (https://app.configcat.com/sdkkey)
    try {
      SettingFormulaModel result = apiInstance.updateSettingValueBySdkkeyV2(settingKeyOrId, jsonPatchOperation, reason, X_CONFIGCAT_SDKKEY);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagSettingValuesUsingSdkKeyV2Api#updateSettingValueBySdkkeyV2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **settingKeyOrId** | **String**| The key or id of the Setting. | |
| **jsonPatchOperation** | [**List&lt;JsonPatchOperation&gt;**](JsonPatchOperation.md)|  | |
| **reason** | **String**| The reason note for the Audit Log if the Product&#39;s \&quot;Config changes require a reason\&quot; preference is turned on. | [optional] |
| **X_CONFIGCAT_SDKKEY** | **String**| The ConfigCat SDK Key. (https://app.configcat.com/sdkkey) | [optional] |

### Return type

[**SettingFormulaModel**](SettingFormulaModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **204** | When no change applied on the resource. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

