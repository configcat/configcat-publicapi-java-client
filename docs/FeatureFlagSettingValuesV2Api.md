# FeatureFlagSettingValuesV2Api

All URIs are relative to *https://api.configcat.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSettingValueV2**](FeatureFlagSettingValuesV2Api.md#getSettingValueV2) | **GET** /v2/environments/{environmentId}/settings/{settingId}/value | Get value |
| [**getSettingValuesV2**](FeatureFlagSettingValuesV2Api.md#getSettingValuesV2) | **GET** /v2/configs/{configId}/environments/{environmentId}/values | Get values |
| [**postSettingValuesV2**](FeatureFlagSettingValuesV2Api.md#postSettingValuesV2) | **POST** /v2/configs/{configId}/environments/{environmentId}/values | Post values |
| [**replaceSettingValueV2**](FeatureFlagSettingValuesV2Api.md#replaceSettingValueV2) | **PUT** /v2/environments/{environmentId}/settings/{settingId}/value | Replace value |
| [**updateSettingValueV2**](FeatureFlagSettingValuesV2Api.md#updateSettingValueV2) | **PATCH** /v2/environments/{environmentId}/settings/{settingId}/value | Update value |


<a id="getSettingValueV2"></a>
# **getSettingValueV2**
> SettingFormulaModel getSettingValueV2(environmentId, settingId)

Get value

This endpoint returns the value of a Feature Flag or Setting in a specified Environment identified by the &#x60;environmentId&#x60; parameter.  The most important fields in the response are the &#x60;defaultValue&#x60;, &#x60;targetingRules&#x60;, and &#x60;percentageEvaluationAttribute&#x60;. The &#x60;defaultValue&#x60; represents what the clients will get when the evaluation requests of our SDKs are not matching to any of the defined Targeting Rules, or when there are no additional rules to evaluate.  The &#x60;targetingRules&#x60; represents the current Targeting Rule configuration of the actual Feature Flag or Setting in an **ordered** collection, which means the order of the returned rules is matching to the evaluation order. You can read more about these rules [here](https://configcat.com/docs/targeting/targeting-overview/).  The &#x60;percentageEvaluationAttribute&#x60; represents the custom [User Object](https://configcat.com/docs/targeting/user-object/) attribute that must be used for [percentage evaluation](https://configcat.com/docs/targeting/percentage-options/) of the Feature Flag or Setting.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.FeatureFlagSettingValuesV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    FeatureFlagSettingValuesV2Api apiInstance = new FeatureFlagSettingValuesV2Api(defaultClient);
    UUID environmentId = UUID.randomUUID(); // UUID | The identifier of the Environment.
    Integer settingId = 56; // Integer | The id of the Setting.
    try {
      SettingFormulaModel result = apiInstance.getSettingValueV2(environmentId, settingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagSettingValuesV2Api#getSettingValueV2");
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
| **environmentId** | **UUID**| The identifier of the Environment. | |
| **settingId** | **Integer**| The id of the Setting. | |

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
| **200** | When everything is ok, the setting value data returned. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="getSettingValuesV2"></a>
# **getSettingValuesV2**
> ConfigSettingFormulasModel getSettingValuesV2(configId, environmentId)

Get values

This endpoint returns all Feature Flag and Setting values of a Config identified by the &#x60;configId&#x60; parameter in a specified Environment identified by the &#x60;environmentId&#x60; parameter.  The most important fields in the response are the &#x60;defaultValue&#x60;, &#x60;targetingRules&#x60;. The &#x60;defaultValue&#x60; represents what the clients will get when the evaluation requests of our SDKs are not matching to any of the defined Targeting Rules, or when there are no additional rules to evaluate.  The &#x60;targetingRules&#x60; represents the current Targeting Rule configuration of the actual Feature Flag or Setting in an **ordered** collection, which means the order of the returned rules is matching to the evaluation order. You can read more about these rules [here](https://configcat.com/docs/targeting/targeting-overview/).  The &#x60;percentageEvaluationAttribute&#x60; represents the custom [User Object](https://configcat.com/docs/targeting/user-object/) attribute that must be used for [percentage evaluation](https://configcat.com/docs/targeting/percentage-options/) of the Feature Flag or Setting.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.FeatureFlagSettingValuesV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    FeatureFlagSettingValuesV2Api apiInstance = new FeatureFlagSettingValuesV2Api(defaultClient);
    UUID configId = UUID.randomUUID(); // UUID | The identifier of the Config.
    UUID environmentId = UUID.randomUUID(); // UUID | The identifier of the Environment.
    try {
      ConfigSettingFormulasModel result = apiInstance.getSettingValuesV2(configId, environmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagSettingValuesV2Api#getSettingValuesV2");
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
| **configId** | **UUID**| The identifier of the Config. | |
| **environmentId** | **UUID**| The identifier of the Environment. | |

### Return type

[**ConfigSettingFormulasModel**](ConfigSettingFormulasModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When everything is ok, the setting values returned. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="postSettingValuesV2"></a>
# **postSettingValuesV2**
> ConfigSettingFormulasModel postSettingValuesV2(configId, environmentId, updateEvaluationFormulasModel, reason)

Post values

This endpoint batch updates the Feature Flags and Settings of a Config identified by the &#x60;configId&#x60; parameter in a specified Environment identified by the &#x60;environmentId&#x60; parameter.  Only those Feature Flags and Settings are updated which are part of the request, all the others are left untouched.  **Important:** As this endpoint is doing a complete replace on those Feature Flags and Settings, which are set in the request.  It&#39;s important to set every other field that you don&#39;t want to change in its original state. Not listing a field means that it will reset.  For example: We have the following resource of a Feature Flag. &#x60;&#x60;&#x60;json {   \&quot;settingFormulas\&quot;: [     {       \&quot;defaultValue\&quot;: {         \&quot;boolValue\&quot;: false       },       \&quot;targetingRules\&quot;: [         {           \&quot;conditions\&quot;: [             {               \&quot;userCondition\&quot;: {                 \&quot;comparisonAttribute\&quot;: \&quot;Email\&quot;,                 \&quot;comparator\&quot;: \&quot;sensitiveTextEquals\&quot;,                 \&quot;comparisonValue\&quot;: {                   \&quot;stringValue\&quot;: \&quot;test@example.com\&quot;                 }               }             }           ],           \&quot;percentageOptions\&quot;: [],           \&quot;value\&quot;: {             \&quot;boolValue\&quot;: true           }         }       ],       \&quot;settingId\&quot;: 1     }   ] } &#x60;&#x60;&#x60; If we send a batch replace request body as below: &#x60;&#x60;&#x60;json {    \&quot;updateFormulas\&quot;: [     {       \&quot;defaultValue\&quot;: {         \&quot;boolValue\&quot;: false       },       \&quot;settingId\&quot;: 1     }   ] } &#x60;&#x60;&#x60; Then besides that the default value is set to &#x60;true&#x60;, all Targeting Rules of the related Feature Flag are deleted. So we get a response like this: &#x60;&#x60;&#x60;json {   \&quot;settingFormulas\&quot;: [     {       \&quot;defaultValue\&quot;: {         \&quot;boolValue\&quot;: false       },       \&quot;targetingRules\&quot;: [],       \&quot;setting\&quot;:        {         \&quot;settingId\&quot;: 1       }     }   ] } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.FeatureFlagSettingValuesV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    FeatureFlagSettingValuesV2Api apiInstance = new FeatureFlagSettingValuesV2Api(defaultClient);
    UUID configId = UUID.randomUUID(); // UUID | The identifier of the Config.
    UUID environmentId = UUID.randomUUID(); // UUID | The identifier of the Environment.
    UpdateEvaluationFormulasModel updateEvaluationFormulasModel = new UpdateEvaluationFormulasModel(); // UpdateEvaluationFormulasModel | 
    String reason = "reason_example"; // String | The reason note for the Audit Log if the Product's \"Config changes require a reason\" preference is turned on.
    try {
      ConfigSettingFormulasModel result = apiInstance.postSettingValuesV2(configId, environmentId, updateEvaluationFormulasModel, reason);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagSettingValuesV2Api#postSettingValuesV2");
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
| **configId** | **UUID**| The identifier of the Config. | |
| **environmentId** | **UUID**| The identifier of the Environment. | |
| **updateEvaluationFormulasModel** | [**UpdateEvaluationFormulasModel**](UpdateEvaluationFormulasModel.md)|  | |
| **reason** | **String**| The reason note for the Audit Log if the Product&#39;s \&quot;Config changes require a reason\&quot; preference is turned on. | [optional] |

### Return type

[**ConfigSettingFormulasModel**](ConfigSettingFormulasModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When everything is ok, the updated setting values returned. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="replaceSettingValueV2"></a>
# **replaceSettingValueV2**
> SettingFormulaModel replaceSettingValueV2(environmentId, settingId, updateEvaluationFormulaModel, reason)

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
import com.configcat.publicapi.java.client.api.FeatureFlagSettingValuesV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    FeatureFlagSettingValuesV2Api apiInstance = new FeatureFlagSettingValuesV2Api(defaultClient);
    UUID environmentId = UUID.randomUUID(); // UUID | The identifier of the Environment.
    Integer settingId = 56; // Integer | The id of the Setting.
    UpdateEvaluationFormulaModel updateEvaluationFormulaModel = new UpdateEvaluationFormulaModel(); // UpdateEvaluationFormulaModel | 
    String reason = "reason_example"; // String | The reason note for the Audit Log if the Product's \"Config changes require a reason\" preference is turned on.
    try {
      SettingFormulaModel result = apiInstance.replaceSettingValueV2(environmentId, settingId, updateEvaluationFormulaModel, reason);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagSettingValuesV2Api#replaceSettingValueV2");
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
| **environmentId** | **UUID**| The identifier of the Environment. | |
| **settingId** | **Integer**| The id of the Setting. | |
| **updateEvaluationFormulaModel** | [**UpdateEvaluationFormulaModel**](UpdateEvaluationFormulaModel.md)|  | |
| **reason** | **String**| The reason note for the Audit Log if the Product&#39;s \&quot;Config changes require a reason\&quot; preference is turned on. | [optional] |

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

<a id="updateSettingValueV2"></a>
# **updateSettingValueV2**
> SettingFormulaModel updateSettingValueV2(environmentId, settingId, jsonPatchOperation, reason)

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
import com.configcat.publicapi.java.client.api.FeatureFlagSettingValuesV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    FeatureFlagSettingValuesV2Api apiInstance = new FeatureFlagSettingValuesV2Api(defaultClient);
    UUID environmentId = UUID.randomUUID(); // UUID | The identifier of the Environment.
    Integer settingId = 56; // Integer | The id of the Setting.
    List<JsonPatchOperation> jsonPatchOperation = Arrays.asList(); // List<JsonPatchOperation> | 
    String reason = "reason_example"; // String | The reason note for the Audit Log if the Product's \"Config changes require a reason\" preference is turned on.
    try {
      SettingFormulaModel result = apiInstance.updateSettingValueV2(environmentId, settingId, jsonPatchOperation, reason);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagSettingValuesV2Api#updateSettingValueV2");
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
| **environmentId** | **UUID**| The identifier of the Environment. | |
| **settingId** | **Integer**| The id of the Setting. | |
| **jsonPatchOperation** | [**List&lt;JsonPatchOperation&gt;**](JsonPatchOperation.md)|  | |
| **reason** | **String**| The reason note for the Audit Log if the Product&#39;s \&quot;Config changes require a reason\&quot; preference is turned on. | [optional] |

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
| **200** | When the patch was successful. |  -  |
| **204** | When no change applied on the resource. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

