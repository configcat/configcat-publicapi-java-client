# FeatureFlagSettingValuesUsingSdkKeyApi

All URIs are relative to *https://test-api.configcat.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSettingValueBySdkkey**](FeatureFlagSettingValuesUsingSdkKeyApi.md#getSettingValueBySdkkey) | **GET** /v1/settings/{settingKeyOrId}/value | Get value |
| [**replaceSettingValueBySdkkey**](FeatureFlagSettingValuesUsingSdkKeyApi.md#replaceSettingValueBySdkkey) | **PUT** /v1/settings/{settingKeyOrId}/value | Replace value |
| [**updateSettingValueBySdkkey**](FeatureFlagSettingValuesUsingSdkKeyApi.md#updateSettingValueBySdkkey) | **PATCH** /v1/settings/{settingKeyOrId}/value | Update value |


<a id="getSettingValueBySdkkey"></a>
# **getSettingValueBySdkkey**
> SettingValueModel getSettingValueBySdkkey(settingKeyOrId, X_CONFIGCAT_SDKKEY)

Get value

This endpoint returns the value of a Feature Flag or Setting  in a specified Environment identified by the &lt;a target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;https://app.configcat.com/sdkkey\&quot;&gt;SDK key&lt;/a&gt; passed in the &#x60;X-CONFIGCAT-SDKKEY&#x60; header.  The most important attributes in the response are the &#x60;value&#x60;, &#x60;rolloutRules&#x60; and &#x60;percentageRules&#x60;. The &#x60;value&#x60; represents what the clients will get when the evaluation requests of our SDKs  are not matching to any of the defined Targeting or Percentage Rules, or when there are no additional rules to evaluate.  The &#x60;rolloutRules&#x60; and &#x60;percentageRules&#x60; attributes are representing the current  Targeting and Percentage Rules configuration of the actual Feature Flag or Setting  in an **ordered** collection, which means the order of the returned rules is matching to the evaluation order. You can read more about these rules [here](https://configcat.com/docs/targeting/targeting-overview/).

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.FeatureFlagSettingValuesUsingSdkKeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test-api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    FeatureFlagSettingValuesUsingSdkKeyApi apiInstance = new FeatureFlagSettingValuesUsingSdkKeyApi(defaultClient);
    String settingKeyOrId = "settingKeyOrId_example"; // String | The key or id of the Setting.
    String X_CONFIGCAT_SDKKEY = "X_CONFIGCAT_SDKKEY_example"; // String | The ConfigCat SDK Key. (https://app.configcat.com/sdkkey)
    try {
      SettingValueModel result = apiInstance.getSettingValueBySdkkey(settingKeyOrId, X_CONFIGCAT_SDKKEY);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagSettingValuesUsingSdkKeyApi#getSettingValueBySdkkey");
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

[**SettingValueModel**](SettingValueModel.md)

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

<a id="replaceSettingValueBySdkkey"></a>
# **replaceSettingValueBySdkkey**
> SettingValueModel replaceSettingValueBySdkkey(settingKeyOrId, updateSettingValueModel, reason, X_CONFIGCAT_SDKKEY)

Replace value

This endpoint replaces the value of a Feature Flag or Setting  in a specified Environment identified by the &lt;a target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;https://app.configcat.com/sdkkey\&quot;&gt;SDK key&lt;/a&gt; passed in the &#x60;X-CONFIGCAT-SDKKEY&#x60; header.  Only the &#x60;value&#x60;, &#x60;rolloutRules&#x60; and &#x60;percentageRules&#x60; attributes are modifiable by this endpoint.  **Important:** As this endpoint is doing a complete replace, it&#39;s important to set every other attribute that you don&#39;t  want to change to its original state. Not listing one means it will reset.  For example: We have the following resource. &#x60;&#x60;&#x60;json {   \&quot;rolloutPercentageItems\&quot;: [     {       \&quot;percentage\&quot;: 30,       \&quot;value\&quot;: true     },     {       \&quot;percentage\&quot;: 70,       \&quot;value\&quot;: false     }   ],   \&quot;rolloutRules\&quot;: [],   \&quot;value\&quot;: false } &#x60;&#x60;&#x60; If we send a replace request body as below: &#x60;&#x60;&#x60;json {   \&quot;value\&quot;: true } &#x60;&#x60;&#x60; Then besides that the default served value is set to &#x60;true&#x60;, all the Percentage Rules are deleted.  So we get a response like this: &#x60;&#x60;&#x60;json {   \&quot;rolloutPercentageItems\&quot;: [],   \&quot;rolloutRules\&quot;: [],   \&quot;value\&quot;: true } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.FeatureFlagSettingValuesUsingSdkKeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test-api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    FeatureFlagSettingValuesUsingSdkKeyApi apiInstance = new FeatureFlagSettingValuesUsingSdkKeyApi(defaultClient);
    String settingKeyOrId = "settingKeyOrId_example"; // String | The key or id of the Setting.
    UpdateSettingValueModel updateSettingValueModel = new UpdateSettingValueModel(); // UpdateSettingValueModel | 
    String reason = "reason_example"; // String | The reason note for the Audit Log if the Product's \"Config changes require a reason\" preference is turned on.
    String X_CONFIGCAT_SDKKEY = "X_CONFIGCAT_SDKKEY_example"; // String | The ConfigCat SDK Key. (https://app.configcat.com/sdkkey)
    try {
      SettingValueModel result = apiInstance.replaceSettingValueBySdkkey(settingKeyOrId, updateSettingValueModel, reason, X_CONFIGCAT_SDKKEY);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagSettingValuesUsingSdkKeyApi#replaceSettingValueBySdkkey");
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
| **updateSettingValueModel** | [**UpdateSettingValueModel**](UpdateSettingValueModel.md)|  | |
| **reason** | **String**| The reason note for the Audit Log if the Product&#39;s \&quot;Config changes require a reason\&quot; preference is turned on. | [optional] |
| **X_CONFIGCAT_SDKKEY** | **String**| The ConfigCat SDK Key. (https://app.configcat.com/sdkkey) | [optional] |

### Return type

[**SettingValueModel**](SettingValueModel.md)

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

<a id="updateSettingValueBySdkkey"></a>
# **updateSettingValueBySdkkey**
> SettingValueModel updateSettingValueBySdkkey(settingKeyOrId, jsonPatchOperation, reason, X_CONFIGCAT_SDKKEY)

Update value

This endpoint updates the value of a Feature Flag or Setting  with a collection of [JSON Patch](https://jsonpatch.com) operations in a specified Environment identified by the &lt;a target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;https://app.configcat.com/sdkkey\&quot;&gt;SDK key&lt;/a&gt; passed in the &#x60;X-CONFIGCAT-SDKKEY&#x60; header.  Only the &#x60;value&#x60;, &#x60;rolloutRules&#x60; and &#x60;percentageRules&#x60; attributes are modifiable by this endpoint.  The advantage of using JSON Patch is that you can describe individual update operations on a resource without touching attributes that you don&#39;t want to change. It supports collection reordering, so it also  can be used for reordering the targeting rules of a Feature Flag or Setting.  For example: We have the following resource. &#x60;&#x60;&#x60;json {   \&quot;rolloutPercentageItems\&quot;: [     {       \&quot;percentage\&quot;: 30,       \&quot;value\&quot;: true     },     {       \&quot;percentage\&quot;: 70,       \&quot;value\&quot;: false     }   ],   \&quot;rolloutRules\&quot;: [],   \&quot;value\&quot;: false } &#x60;&#x60;&#x60; If we send an update request body as below: &#x60;&#x60;&#x60;json [   {     \&quot;op\&quot;: \&quot;replace\&quot;,     \&quot;path\&quot;: \&quot;/value\&quot;,     \&quot;value\&quot;: true   } ] &#x60;&#x60;&#x60; Only the default served value is going to be set to &#x60;true&#x60; and all the Percentage Rules are remaining unchanged. So we get a response like this: &#x60;&#x60;&#x60;json {   \&quot;rolloutPercentageItems\&quot;: [     {       \&quot;percentage\&quot;: 30,       \&quot;value\&quot;: true     },     {       \&quot;percentage\&quot;: 70,       \&quot;value\&quot;: false     }   ],   \&quot;rolloutRules\&quot;: [],   \&quot;value\&quot;: true } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.FeatureFlagSettingValuesUsingSdkKeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test-api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    FeatureFlagSettingValuesUsingSdkKeyApi apiInstance = new FeatureFlagSettingValuesUsingSdkKeyApi(defaultClient);
    String settingKeyOrId = "settingKeyOrId_example"; // String | The key or id of the Setting.
    List<JsonPatchOperation> jsonPatchOperation = Arrays.asList(); // List<JsonPatchOperation> | 
    String reason = "reason_example"; // String | The reason note for the Audit Log if the Product's \"Config changes require a reason\" preference is turned on.
    String X_CONFIGCAT_SDKKEY = "X_CONFIGCAT_SDKKEY_example"; // String | The ConfigCat SDK Key. (https://app.configcat.com/sdkkey)
    try {
      SettingValueModel result = apiInstance.updateSettingValueBySdkkey(settingKeyOrId, jsonPatchOperation, reason, X_CONFIGCAT_SDKKEY);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagSettingValuesUsingSdkKeyApi#updateSettingValueBySdkkey");
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

[**SettingValueModel**](SettingValueModel.md)

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

