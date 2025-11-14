# FeatureFlagsSettingsApi

All URIs are relative to *https://api.configcat.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSetting**](FeatureFlagsSettingsApi.md#createSetting) | **POST** /v1/configs/{configId}/settings | Create Flag |
| [**deleteSetting**](FeatureFlagsSettingsApi.md#deleteSetting) | **DELETE** /v1/settings/{settingId} | Delete Flag |
| [**getSetting**](FeatureFlagsSettingsApi.md#getSetting) | **GET** /v1/settings/{settingId} | Get Flag |
| [**getSettings**](FeatureFlagsSettingsApi.md#getSettings) | **GET** /v1/configs/{configId}/settings | List Flags |
| [**replaceSetting**](FeatureFlagsSettingsApi.md#replaceSetting) | **PUT** /v1/settings/{settingId} | Replace Flag |
| [**updatePredefinedVariations**](FeatureFlagsSettingsApi.md#updatePredefinedVariations) | **PUT** /v1/settings/{settingId}/predefined-variations | Update predefined variations (Beta) |
| [**updateSetting**](FeatureFlagsSettingsApi.md#updateSetting) | **PATCH** /v1/settings/{settingId} | Update Flag |


<a id="createSetting"></a>
# **createSetting**
> SettingModel createSetting(configId, createSettingInitialValues)

Create Flag

This endpoint creates a new Feature Flag or Setting in a specified Config identified by the &#x60;configId&#x60; parameter.  **Important:** The &#x60;key&#x60; attribute must be unique within the given Config.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.FeatureFlagsSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    FeatureFlagsSettingsApi apiInstance = new FeatureFlagsSettingsApi(defaultClient);
    UUID configId = UUID.randomUUID(); // UUID | The identifier of the Config.
    CreateSettingInitialValues createSettingInitialValues = new CreateSettingInitialValues(); // CreateSettingInitialValues | 
    try {
      SettingModel result = apiInstance.createSetting(configId, createSettingInitialValues);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsSettingsApi#createSetting");
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
| **createSettingInitialValues** | [**CreateSettingInitialValues**](CreateSettingInitialValues.md)|  | |

### Return type

[**SettingModel**](SettingModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | When the creation was successful. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="deleteSetting"></a>
# **deleteSetting**
> deleteSetting(settingId)

Delete Flag

This endpoint removes a Feature Flag or Setting from a specified Config,  identified by the &#x60;configId&#x60; parameter.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.FeatureFlagsSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    FeatureFlagsSettingsApi apiInstance = new FeatureFlagsSettingsApi(defaultClient);
    Integer settingId = 56; // Integer | The identifier of the Setting.
    try {
      apiInstance.deleteSetting(settingId);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsSettingsApi#deleteSetting");
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
| **settingId** | **Integer**| The identifier of the Setting. | |

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | When the delete was successful. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="getSetting"></a>
# **getSetting**
> SettingModel getSetting(settingId)

Get Flag

This endpoint returns the metadata attributes of a Feature Flag or Setting  identified by the &#x60;settingId&#x60; parameter.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.FeatureFlagsSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    FeatureFlagsSettingsApi apiInstance = new FeatureFlagsSettingsApi(defaultClient);
    Integer settingId = 56; // Integer | The identifier of the Setting.
    try {
      SettingModel result = apiInstance.getSetting(settingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsSettingsApi#getSetting");
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
| **settingId** | **Integer**| The identifier of the Setting. | |

### Return type

[**SettingModel**](SettingModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When everything is ok, the setting data returned. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="getSettings"></a>
# **getSettings**
> List&lt;SettingModel&gt; getSettings(configId)

List Flags

This endpoint returns the list of the Feature Flags and Settings defined in a  specified Config, identified by the &#x60;configId&#x60; parameter.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.FeatureFlagsSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    FeatureFlagsSettingsApi apiInstance = new FeatureFlagsSettingsApi(defaultClient);
    UUID configId = UUID.randomUUID(); // UUID | The identifier of the Config.
    try {
      List<SettingModel> result = apiInstance.getSettings(configId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsSettingsApi#getSettings");
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

### Return type

[**List&lt;SettingModel&gt;**](SettingModel.md)

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

<a id="replaceSetting"></a>
# **replaceSetting**
> SettingModel replaceSetting(settingId, replaceSettingModel)

Replace Flag

This endpoint replaces the whole value of a Feature Flag or Setting identified by the &#x60;settingId&#x60; parameter.  **Important:** As this endpoint is doing a complete replace, it&#39;s important to set every other attribute that you don&#39;t  want to change in its original state. Not listing one means it will reset.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.FeatureFlagsSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    FeatureFlagsSettingsApi apiInstance = new FeatureFlagsSettingsApi(defaultClient);
    Integer settingId = 56; // Integer | The identifier of the Setting.
    ReplaceSettingModel replaceSettingModel = new ReplaceSettingModel(); // ReplaceSettingModel | 
    try {
      SettingModel result = apiInstance.replaceSetting(settingId, replaceSettingModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsSettingsApi#replaceSetting");
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
| **settingId** | **Integer**| The identifier of the Setting. | |
| **replaceSettingModel** | [**ReplaceSettingModel**](ReplaceSettingModel.md)|  | |

### Return type

[**SettingModel**](SettingModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When the replace was successful. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="updatePredefinedVariations"></a>
# **updatePredefinedVariations**
> PredefinedVariationsModel updatePredefinedVariations(settingId, updatePredefinedVariationsRequest)

Update predefined variations (Beta)

This endpoint updates the predefined variations for a Feature Flag or Setting identified by the &#x60;settingId&#x60; parameter.  **Important:** You can only update a predefined variation&#39;s value if it is not used anywhere in your feature flags.  **Beta feature:** The feature is currently in closed beta state and cannot be used.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.FeatureFlagsSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    FeatureFlagsSettingsApi apiInstance = new FeatureFlagsSettingsApi(defaultClient);
    Integer settingId = 56; // Integer | The identifier of the Setting.
    UpdatePredefinedVariationsRequest updatePredefinedVariationsRequest = new UpdatePredefinedVariationsRequest(); // UpdatePredefinedVariationsRequest | 
    try {
      PredefinedVariationsModel result = apiInstance.updatePredefinedVariations(settingId, updatePredefinedVariationsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsSettingsApi#updatePredefinedVariations");
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
| **settingId** | **Integer**| The identifier of the Setting. | |
| **updatePredefinedVariationsRequest** | [**UpdatePredefinedVariationsRequest**](UpdatePredefinedVariationsRequest.md)|  | |

### Return type

[**PredefinedVariationsModel**](PredefinedVariationsModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When the update was successful. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="updateSetting"></a>
# **updateSetting**
> SettingModel updateSetting(settingId, jsonPatchOperation)

Update Flag

This endpoint updates the metadata of a Feature Flag or Setting  with a collection of [JSON Patch](https://jsonpatch.com) operations in a specified Config.  Only the &#x60;name&#x60;, &#x60;hint&#x60; and &#x60;tags&#x60; attributes are modifiable by this endpoint. The &#x60;tags&#x60; attribute is a simple collection of the [tag IDs](#operation/get-tags) attached to the given setting.  The advantage of using JSON Patch is that you can describe individual update operations on a resource without touching attributes that you don&#39;t want to change.  For example: We have the following resource. &#x60;&#x60;&#x60;json {   \&quot;settingId\&quot;: 5345,   \&quot;key\&quot;: \&quot;myGrandFeature\&quot;,   \&quot;name\&quot;: \&quot;Tihs is a naem with soem typos.\&quot;,   \&quot;hint\&quot;: \&quot;This flag controls my grandioso feature.\&quot;,   \&quot;settingType\&quot;: \&quot;boolean\&quot;,   \&quot;tags\&quot;: [     {       \&quot;tagId\&quot;: 0,        \&quot;name\&quot;: \&quot;sample tag\&quot;,        \&quot;color\&quot;: \&quot;whale\&quot;     }   ] } &#x60;&#x60;&#x60; If we send an update request body as below (it changes the &#x60;name&#x60; and adds the already existing tag with the id &#x60;2&#x60;): &#x60;&#x60;&#x60;json [   {     \&quot;op\&quot;: \&quot;replace\&quot;,      \&quot;path\&quot;: \&quot;/name\&quot;,      \&quot;value\&quot;: \&quot;This is the name without typos.\&quot;   },    {     \&quot;op\&quot;: \&quot;add\&quot;,      \&quot;path\&quot;: \&quot;/tags/-\&quot;,      \&quot;value\&quot;: 2   } ] &#x60;&#x60;&#x60; Only the &#x60;name&#x60; and &#x60;tags&#x60; are updated and all the other attributes remain unchanged. So we get a response like this: &#x60;&#x60;&#x60;json {   \&quot;settingId\&quot;: 5345,    \&quot;key\&quot;: \&quot;myGrandFeature\&quot;,    \&quot;name\&quot;: \&quot;This is the name without typos.\&quot;,    \&quot;hint\&quot;: \&quot;This flag controls my grandioso feature.\&quot;,    \&quot;settingType\&quot;: \&quot;boolean\&quot;,    \&quot;tags\&quot;: [     {       \&quot;tagId\&quot;: 0,        \&quot;name\&quot;: \&quot;sample tag\&quot;,        \&quot;color\&quot;: \&quot;whale\&quot;     },      {       \&quot;tagId\&quot;: 2,        \&quot;name\&quot;: \&quot;another tag\&quot;,        \&quot;color\&quot;: \&quot;koala\&quot;     }   ] } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.FeatureFlagsSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    FeatureFlagsSettingsApi apiInstance = new FeatureFlagsSettingsApi(defaultClient);
    Integer settingId = 56; // Integer | The identifier of the Setting.
    List<JsonPatchOperation> jsonPatchOperation = Arrays.asList(); // List<JsonPatchOperation> | 
    try {
      SettingModel result = apiInstance.updateSetting(settingId, jsonPatchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsSettingsApi#updateSetting");
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
| **settingId** | **Integer**| The identifier of the Setting. | |
| **jsonPatchOperation** | [**List&lt;JsonPatchOperation&gt;**](JsonPatchOperation.md)|  | |

### Return type

[**SettingModel**](SettingModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When the update was successful. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

