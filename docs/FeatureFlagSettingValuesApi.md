# FeatureFlagSettingValuesApi

All URIs are relative to *https://api.configcat.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSettingValue**](FeatureFlagSettingValuesApi.md#getSettingValue) | **GET** /v1/environments/{environmentId}/settings/{settingId}/value | Get value |
| [**getSettingValues**](FeatureFlagSettingValuesApi.md#getSettingValues) | **GET** /v1/configs/{configId}/environments/{environmentId}/values | Get values |
| [**postSettingValues**](FeatureFlagSettingValuesApi.md#postSettingValues) | **POST** /v1/configs/{configId}/environments/{environmentId}/values | Post values |
| [**replaceSettingValue**](FeatureFlagSettingValuesApi.md#replaceSettingValue) | **PUT** /v1/environments/{environmentId}/settings/{settingId}/value | Replace value |
| [**updateSettingValue**](FeatureFlagSettingValuesApi.md#updateSettingValue) | **PATCH** /v1/environments/{environmentId}/settings/{settingId}/value | Update value |


<a id="getSettingValue"></a>
# **getSettingValue**
> SettingValueModel getSettingValue(environmentId, settingId)

Get value

This endpoint returns the value of a Feature Flag or Setting  in a specified Environment identified by the &#x60;environmentId&#x60; parameter.  The most important attributes in the response are the &#x60;value&#x60;, &#x60;rolloutRules&#x60; and &#x60;percentageRules&#x60;. The &#x60;value&#x60; represents what the clients will get when the evaluation requests of our SDKs  are not matching to any of the defined Targeting or Percentage Rules, or when there are no additional rules to evaluate.  The &#x60;rolloutRules&#x60; and &#x60;percentageRules&#x60; attributes are representing the current  Targeting and Percentage Rules configuration of the actual Feature Flag or Setting  in an **ordered** collection, which means the order of the returned rules is matching to the evaluation order. You can read more about these rules [here](https://configcat.com/docs/targeting/targeting-overview).

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.FeatureFlagSettingValuesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    FeatureFlagSettingValuesApi apiInstance = new FeatureFlagSettingValuesApi(defaultClient);
    UUID environmentId = UUID.randomUUID(); // UUID | The identifier of the Environment.
    Integer settingId = 56; // Integer | The id of the Setting.
    try {
      SettingValueModel result = apiInstance.getSettingValue(environmentId, settingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagSettingValuesApi#getSettingValue");
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

[**SettingValueModel**](SettingValueModel.md)

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

<a id="getSettingValues"></a>
# **getSettingValues**
> ConfigSettingValuesModel getSettingValues(configId, environmentId)

Get values

This endpoint returns the value of a specified Config&#39;s Feature Flags or Settings identified by the &#x60;configId&#x60; parameter in a specified Environment identified by the &#x60;environmentId&#x60; parameter.  The most important attributes in the response are the &#x60;value&#x60;, &#x60;rolloutRules&#x60; and &#x60;percentageRules&#x60;. The &#x60;value&#x60; represents what the clients will get when the evaluation requests of our SDKs  are not matching to any of the defined Targeting or Percentage Rules, or when there are no additional rules to evaluate.  The &#x60;rolloutRules&#x60; and &#x60;percentageRules&#x60; attributes are representing the current  Targeting and Percentage Rules configuration of the actual Feature Flag or Setting  in an **ordered** collection, which means the order of the returned rules is matching to the evaluation order. You can read more about these rules [here](https://configcat.com/docs/targeting/targeting-overview/).

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.FeatureFlagSettingValuesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    FeatureFlagSettingValuesApi apiInstance = new FeatureFlagSettingValuesApi(defaultClient);
    UUID configId = UUID.randomUUID(); // UUID | The identifier of the Config.
    UUID environmentId = UUID.randomUUID(); // UUID | The identifier of the Environment.
    try {
      ConfigSettingValuesModel result = apiInstance.getSettingValues(configId, environmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagSettingValuesApi#getSettingValues");
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

[**ConfigSettingValuesModel**](ConfigSettingValuesModel.md)

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

<a id="postSettingValues"></a>
# **postSettingValues**
> ConfigSettingValuesModel postSettingValues(configId, environmentId, updateSettingValuesWithIdModel, reason)

Post values

This endpoint replaces the values of a specified Config&#39;s Feature Flags or Settings identified by the &#x60;configId&#x60; parameter in a specified Environment identified by the &#x60;environmentId&#x60; parameter.  Only the &#x60;value&#x60;, &#x60;rolloutRules&#x60; and &#x60;percentageRules&#x60; attributes are modifiable by this endpoint.  **Important:** As this endpoint is doing a complete replace, it&#39;s important to set every other attribute that you don&#39;t  want to change in its original state. Not listing one means it will reset.  For example: We have the following resource. &#x60;&#x60;&#x60;json {   \&quot;settingValues\&quot;: [     {       \&quot;rolloutPercentageItems\&quot;: [         {           \&quot;percentage\&quot;: 30,           \&quot;value\&quot;: true         },         {           \&quot;percentage\&quot;: 70,           \&quot;value\&quot;: false         }       ],       \&quot;rolloutRules\&quot;: [],       \&quot;value\&quot;: false,       \&quot;settingId\&quot;: 1     }   ] } &#x60;&#x60;&#x60; If we send a replace request body as below: &#x60;&#x60;&#x60;json {    \&quot;settingValues\&quot;: [     {       \&quot;value\&quot;: true,       \&quot;settingId\&quot;: 1     }   ] } &#x60;&#x60;&#x60; Then besides that the default value is set to &#x60;true&#x60;, all the Percentage Rules are deleted.  So we get a response like this: &#x60;&#x60;&#x60;json {   \&quot;settingValues\&quot;: [     {       \&quot;rolloutPercentageItems\&quot;: [],       \&quot;rolloutRules\&quot;: [],       \&quot;value\&quot;: true,       \&quot;setting\&quot;:        {         \&quot;settingId\&quot;: 1       }     }   ] } &#x60;&#x60;&#x60;  The &#x60;rolloutRules&#x60; property describes two types of rules:  - **Targeting rules**: When you want to add or update a targeting rule, the &#x60;comparator&#x60;, &#x60;comparisonAttribute&#x60;, and &#x60;comparisonValue&#x60; members are required. - **Segment rules**: When you want to add add or update a segment rule, the &#x60;segmentId&#x60; which identifies the desired segment and the &#x60;segmentComparator&#x60; members are required.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.FeatureFlagSettingValuesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    FeatureFlagSettingValuesApi apiInstance = new FeatureFlagSettingValuesApi(defaultClient);
    UUID configId = UUID.randomUUID(); // UUID | The identifier of the Config.
    UUID environmentId = UUID.randomUUID(); // UUID | The identifier of the Environment.
    UpdateSettingValuesWithIdModel updateSettingValuesWithIdModel = new UpdateSettingValuesWithIdModel(); // UpdateSettingValuesWithIdModel | 
    String reason = "reason_example"; // String | The reason note for the Audit Log if the Product's \"Config changes require a reason\" preference is turned on.
    try {
      ConfigSettingValuesModel result = apiInstance.postSettingValues(configId, environmentId, updateSettingValuesWithIdModel, reason);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagSettingValuesApi#postSettingValues");
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
| **updateSettingValuesWithIdModel** | [**UpdateSettingValuesWithIdModel**](UpdateSettingValuesWithIdModel.md)|  | |
| **reason** | **String**| The reason note for the Audit Log if the Product&#39;s \&quot;Config changes require a reason\&quot; preference is turned on. | [optional] |

### Return type

[**ConfigSettingValuesModel**](ConfigSettingValuesModel.md)

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

<a id="replaceSettingValue"></a>
# **replaceSettingValue**
> SettingValueModel replaceSettingValue(environmentId, settingId, updateSettingValueModel, reason)

Replace value

This endpoint replaces the whole value of a Feature Flag or Setting in a specified Environment.  Only the &#x60;value&#x60;, &#x60;rolloutRules&#x60; and &#x60;percentageRules&#x60; attributes are modifiable by this endpoint.  **Important:** As this endpoint is doing a complete replace, it&#39;s important to set every other attribute that you don&#39;t  want to change in its original state. Not listing one means it will reset.  For example: We have the following resource. &#x60;&#x60;&#x60;json {   \&quot;rolloutPercentageItems\&quot;: [     {       \&quot;percentage\&quot;: 30,       \&quot;value\&quot;: true     },     {       \&quot;percentage\&quot;: 70,       \&quot;value\&quot;: false     }   ],   \&quot;rolloutRules\&quot;: [],   \&quot;value\&quot;: false } &#x60;&#x60;&#x60; If we send a replace request body as below: &#x60;&#x60;&#x60;json {   \&quot;value\&quot;: true } &#x60;&#x60;&#x60; Then besides that the default value is set to &#x60;true&#x60;, all the Percentage Rules are deleted.  So we get a response like this: &#x60;&#x60;&#x60;json {   \&quot;rolloutPercentageItems\&quot;: [],   \&quot;rolloutRules\&quot;: [],   \&quot;value\&quot;: true } &#x60;&#x60;&#x60;  The &#x60;rolloutRules&#x60; property describes two types of rules:  - **Targeting rules**: When you want to add or update a targeting rule, the &#x60;comparator&#x60;, &#x60;comparisonAttribute&#x60;, and &#x60;comparisonValue&#x60; members are required. - **Segment rules**: When you want to add add or update a segment rule, the &#x60;segmentId&#x60; which identifies the desired segment and the &#x60;segmentComparator&#x60; members are required.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.FeatureFlagSettingValuesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    FeatureFlagSettingValuesApi apiInstance = new FeatureFlagSettingValuesApi(defaultClient);
    UUID environmentId = UUID.randomUUID(); // UUID | The identifier of the Environment.
    Integer settingId = 56; // Integer | The id of the Setting.
    UpdateSettingValueModel updateSettingValueModel = new UpdateSettingValueModel(); // UpdateSettingValueModel | 
    String reason = "reason_example"; // String | The reason note for the Audit Log if the Product's \"Config changes require a reason\" preference is turned on.
    try {
      SettingValueModel result = apiInstance.replaceSettingValue(environmentId, settingId, updateSettingValueModel, reason);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagSettingValuesApi#replaceSettingValue");
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
| **updateSettingValueModel** | [**UpdateSettingValueModel**](UpdateSettingValueModel.md)|  | |
| **reason** | **String**| The reason note for the Audit Log if the Product&#39;s \&quot;Config changes require a reason\&quot; preference is turned on. | [optional] |

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

<a id="updateSettingValue"></a>
# **updateSettingValue**
> SettingValueModel updateSettingValue(environmentId, settingId, jsonPatchOperation, reason)

Update value

This endpoint updates the value of a Feature Flag or Setting  with a collection of [JSON Patch](https://jsonpatch.com) operations in a specified Environment.  Only the &#x60;value&#x60;, &#x60;rolloutRules&#x60; and &#x60;percentageRules&#x60; attributes are modifiable by this endpoint.  The advantage of using JSON Patch is that you can describe individual update operations on a resource without touching attributes that you don&#39;t want to change. It supports collection reordering, so it also  can be used for reordering the targeting rules of a Feature Flag or Setting.  For example: We have the following resource. &#x60;&#x60;&#x60;json {   \&quot;rolloutPercentageItems\&quot;: [     {       \&quot;percentage\&quot;: 30,       \&quot;value\&quot;: true     },     {       \&quot;percentage\&quot;: 70,       \&quot;value\&quot;: false     }   ],   \&quot;rolloutRules\&quot;: [],   \&quot;value\&quot;: false } &#x60;&#x60;&#x60; If we send an update request body as below: &#x60;&#x60;&#x60;json [   {     \&quot;op\&quot;: \&quot;replace\&quot;,     \&quot;path\&quot;: \&quot;/value\&quot;,     \&quot;value\&quot;: true   } ] &#x60;&#x60;&#x60; Only the default value is going to be set to &#x60;true&#x60; and all the Percentage Rules are remaining unchanged. So we get a response like this: &#x60;&#x60;&#x60;json {   \&quot;rolloutPercentageItems\&quot;: [     {       \&quot;percentage\&quot;: 30,       \&quot;value\&quot;: true     },     {       \&quot;percentage\&quot;: 70,       \&quot;value\&quot;: false     }   ],   \&quot;rolloutRules\&quot;: [],   \&quot;value\&quot;: true } &#x60;&#x60;&#x60;  The &#x60;rolloutRules&#x60; property describes two types of rules:  - **Targeting rules**: When you want to add or update a targeting rule, the &#x60;comparator&#x60;, &#x60;comparisonAttribute&#x60;, and &#x60;comparisonValue&#x60; members are required. - **Segment rules**: When you want to add add or update a segment rule, the &#x60;segmentId&#x60; which identifies the desired segment and the &#x60;segmentComparator&#x60; members are required.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.FeatureFlagSettingValuesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    FeatureFlagSettingValuesApi apiInstance = new FeatureFlagSettingValuesApi(defaultClient);
    UUID environmentId = UUID.randomUUID(); // UUID | The identifier of the Environment.
    Integer settingId = 56; // Integer | The id of the Setting.
    List<JsonPatchOperation> jsonPatchOperation = Arrays.asList(); // List<JsonPatchOperation> | 
    String reason = "reason_example"; // String | The reason note for the Audit Log if the Product's \"Config changes require a reason\" preference is turned on.
    try {
      SettingValueModel result = apiInstance.updateSettingValue(environmentId, settingId, jsonPatchOperation, reason);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagSettingValuesApi#updateSettingValue");
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

[**SettingValueModel**](SettingValueModel.md)

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

