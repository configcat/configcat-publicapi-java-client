# ProxyProfilesApi

All URIs are relative to *https://api.configcat.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createProxyProfile**](ProxyProfilesApi.md#createProxyProfile) | **POST** /v1/organizations/{organizationId}/proxy-profiles | Create Proxy Profile |
| [**deleteProxyProfile**](ProxyProfilesApi.md#deleteProxyProfile) | **DELETE** /v1/proxy-profiles/{proxyProfileId} | Delete Proxy Profile |
| [**deselectProxyProfileSdkKeys**](ProxyProfilesApi.md#deselectProxyProfileSdkKeys) | **POST** /v1/proxy-profiles/{proxyProfileId}/sdk-keys/deselect | Deselect SDK keys |
| [**generateProxyProfileSecret**](ProxyProfilesApi.md#generateProxyProfileSecret) | **POST** /v1/proxy-profiles/{proxyProfileId}/secret | Generate Secret |
| [**getProxyProfile**](ProxyProfilesApi.md#getProxyProfile) | **GET** /v1/proxy-profiles/{proxyProfileId} | Get Proxy Profile |
| [**getProxyProfileSdkKeys**](ProxyProfilesApi.md#getProxyProfileSdkKeys) | **GET** /v1/proxy-profiles/{proxyProfileId}/sdk-keys | Get selected SDK keys |
| [**getProxyProfiles**](ProxyProfilesApi.md#getProxyProfiles) | **GET** /v1/organizations/{organizationId}/proxy-profiles | List Proxy Profiles |
| [**replaceProxyProfile**](ProxyProfilesApi.md#replaceProxyProfile) | **PUT** /v1/proxy-profiles/{proxyProfileId} | Replace Proxy Profile |
| [**selectProxyProfileSdkKeys**](ProxyProfilesApi.md#selectProxyProfileSdkKeys) | **POST** /v1/proxy-profiles/{proxyProfileId}/sdk-keys/select | Select SDK keys |
| [**updateProxyProfile**](ProxyProfilesApi.md#updateProxyProfile) | **PATCH** /v1/proxy-profiles/{proxyProfileId} | Update Proxy Profile |


<a id="createProxyProfile"></a>
# **createProxyProfile**
> ProxyProfileModel createProxyProfile(organizationId, createOrUpdateProxyProfileRequest)

Create Proxy Profile

This endpoint creates a new Proxy Profile in the given Organization identified by the &#x60;organizationId&#x60; parameter, which can be obtained from the [List Organizations](#operation/get-organizations) endpoint.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.ProxyProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ProxyProfilesApi apiInstance = new ProxyProfilesApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | The identifier of the Organization.
    CreateOrUpdateProxyProfileRequest createOrUpdateProxyProfileRequest = new CreateOrUpdateProxyProfileRequest(); // CreateOrUpdateProxyProfileRequest | 
    try {
      ProxyProfileModel result = apiInstance.createProxyProfile(organizationId, createOrUpdateProxyProfileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProxyProfilesApi#createProxyProfile");
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
| **organizationId** | **UUID**| The identifier of the Organization. | |
| **createOrUpdateProxyProfileRequest** | [**CreateOrUpdateProxyProfileRequest**](CreateOrUpdateProxyProfileRequest.md)|  | |

### Return type

[**ProxyProfileModel**](ProxyProfileModel.md)

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

<a id="deleteProxyProfile"></a>
# **deleteProxyProfile**
> deleteProxyProfile(proxyProfileId)

Delete Proxy Profile

This endpoint removes a Proxy Profile identified by the &#x60;proxyProfileId&#x60; parameter.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.ProxyProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ProxyProfilesApi apiInstance = new ProxyProfilesApi(defaultClient);
    UUID proxyProfileId = UUID.randomUUID(); // UUID | The identifier of the Proxy Profile.
    try {
      apiInstance.deleteProxyProfile(proxyProfileId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProxyProfilesApi#deleteProxyProfile");
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
| **proxyProfileId** | **UUID**| The identifier of the Proxy Profile. | |

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

<a id="deselectProxyProfileSdkKeys"></a>
# **deselectProxyProfileSdkKeys**
> ProxyProfileSdkKeysListModel deselectProxyProfileSdkKeys(proxyProfileId, proxyProfileSdkKeysRequest)

Deselect SDK keys

This endpoint removes the given list of Config / Environment pairs&#39; SDK Keys from a Proxy Profile identified by the &#x60;proxyProfileId&#x60;.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.ProxyProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ProxyProfilesApi apiInstance = new ProxyProfilesApi(defaultClient);
    UUID proxyProfileId = UUID.randomUUID(); // UUID | The identifier of the Proxy Profile.
    ProxyProfileSdkKeysRequest proxyProfileSdkKeysRequest = new ProxyProfileSdkKeysRequest(); // ProxyProfileSdkKeysRequest | 
    try {
      ProxyProfileSdkKeysListModel result = apiInstance.deselectProxyProfileSdkKeys(proxyProfileId, proxyProfileSdkKeysRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProxyProfilesApi#deselectProxyProfileSdkKeys");
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
| **proxyProfileId** | **UUID**| The identifier of the Proxy Profile. | |
| **proxyProfileSdkKeysRequest** | [**ProxyProfileSdkKeysRequest**](ProxyProfileSdkKeysRequest.md)|  | |

### Return type

[**ProxyProfileSdkKeysListModel**](ProxyProfileSdkKeysListModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When the deselection was successful. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **403** | Forbidden. When selection rules are applied to the Proxy Profile. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="generateProxyProfileSecret"></a>
# **generateProxyProfileSecret**
> ProxyProfileSecretModel generateProxyProfileSecret(proxyProfileId)

Generate Secret

This endpoint (re)generates a secret token for a Proxy Profile identified by the &#x60;proxyProfileId&#x60; parameter.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.ProxyProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ProxyProfilesApi apiInstance = new ProxyProfilesApi(defaultClient);
    UUID proxyProfileId = UUID.randomUUID(); // UUID | The identifier of the Proxy Profile.
    try {
      ProxyProfileSecretModel result = apiInstance.generateProxyProfileSecret(proxyProfileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProxyProfilesApi#generateProxyProfileSecret");
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
| **proxyProfileId** | **UUID**| The identifier of the Proxy Profile. | |

### Return type

[**ProxyProfileSecretModel**](ProxyProfileSecretModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When the generation was successful. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="getProxyProfile"></a>
# **getProxyProfile**
> ProxyProfileModel getProxyProfile(proxyProfileId)

Get Proxy Profile

This endpoint returns a Proxy Profile  identified by the &#x60;proxyProfileId&#x60;.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.ProxyProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ProxyProfilesApi apiInstance = new ProxyProfilesApi(defaultClient);
    UUID proxyProfileId = UUID.randomUUID(); // UUID | The identifier of the Proxy Profile.
    try {
      ProxyProfileModel result = apiInstance.getProxyProfile(proxyProfileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProxyProfilesApi#getProxyProfile");
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
| **proxyProfileId** | **UUID**| The identifier of the Proxy Profile. | |

### Return type

[**ProxyProfileModel**](ProxyProfileModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When everything is ok, the Proxy Profile is returned. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="getProxyProfileSdkKeys"></a>
# **getProxyProfileSdkKeys**
> ProxyProfileSdkKeysListModel getProxyProfileSdkKeys(proxyProfileId)

Get selected SDK keys

This endpoint returns the list of SDK keys selected for a Proxy Profile  identified by the &#x60;proxyProfileId&#x60;.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.ProxyProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ProxyProfilesApi apiInstance = new ProxyProfilesApi(defaultClient);
    UUID proxyProfileId = UUID.randomUUID(); // UUID | The identifier of the Proxy Profile.
    try {
      ProxyProfileSdkKeysListModel result = apiInstance.getProxyProfileSdkKeys(proxyProfileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProxyProfilesApi#getProxyProfileSdkKeys");
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
| **proxyProfileId** | **UUID**| The identifier of the Proxy Profile. | |

### Return type

[**ProxyProfileSdkKeysListModel**](ProxyProfileSdkKeysListModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When everything is ok, the SDK keys selected for the Proxy Profile are returned. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="getProxyProfiles"></a>
# **getProxyProfiles**
> ProxyProfileListModel getProxyProfiles(organizationId)

List Proxy Profiles

This endpoint returns the list of Proxy profiles for the given Organization identified by the &#x60;organizationId&#x60; parameter.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.ProxyProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ProxyProfilesApi apiInstance = new ProxyProfilesApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | The identifier of the Organization.
    try {
      ProxyProfileListModel result = apiInstance.getProxyProfiles(organizationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProxyProfilesApi#getProxyProfiles");
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
| **organizationId** | **UUID**| The identifier of the Organization. | |

### Return type

[**ProxyProfileListModel**](ProxyProfileListModel.md)

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

<a id="replaceProxyProfile"></a>
# **replaceProxyProfile**
> ProxyProfileModel replaceProxyProfile(proxyProfileId, createOrUpdateProxyProfileRequest)

Replace Proxy Profile

This endpoint replaces a Proxy Profile identified by the &#x60;proxyProfileId&#x60; parameter.  **Important:** As this endpoint is doing a complete replace, it&#39;s important to set every other attribute that you don&#39;t want to change in its original state. Not listing one means it will reset.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.ProxyProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ProxyProfilesApi apiInstance = new ProxyProfilesApi(defaultClient);
    UUID proxyProfileId = UUID.randomUUID(); // UUID | The identifier of the Proxy Profile.
    CreateOrUpdateProxyProfileRequest createOrUpdateProxyProfileRequest = new CreateOrUpdateProxyProfileRequest(); // CreateOrUpdateProxyProfileRequest | 
    try {
      ProxyProfileModel result = apiInstance.replaceProxyProfile(proxyProfileId, createOrUpdateProxyProfileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProxyProfilesApi#replaceProxyProfile");
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
| **proxyProfileId** | **UUID**| The identifier of the Proxy Profile. | |
| **createOrUpdateProxyProfileRequest** | [**CreateOrUpdateProxyProfileRequest**](CreateOrUpdateProxyProfileRequest.md)|  | |

### Return type

[**ProxyProfileModel**](ProxyProfileModel.md)

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

<a id="selectProxyProfileSdkKeys"></a>
# **selectProxyProfileSdkKeys**
> ProxyProfileSdkKeysListModel selectProxyProfileSdkKeys(proxyProfileId, proxyProfileSdkKeysRequest)

Select SDK keys

This endpoint adds the given list of Config / Environment pairs&#39; SDK Keys to a Proxy Profile  identified by the &#x60;proxyProfileId&#x60;.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.ProxyProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ProxyProfilesApi apiInstance = new ProxyProfilesApi(defaultClient);
    UUID proxyProfileId = UUID.randomUUID(); // UUID | The identifier of the Proxy Profile.
    ProxyProfileSdkKeysRequest proxyProfileSdkKeysRequest = new ProxyProfileSdkKeysRequest(); // ProxyProfileSdkKeysRequest | 
    try {
      ProxyProfileSdkKeysListModel result = apiInstance.selectProxyProfileSdkKeys(proxyProfileId, proxyProfileSdkKeysRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProxyProfilesApi#selectProxyProfileSdkKeys");
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
| **proxyProfileId** | **UUID**| The identifier of the Proxy Profile. | |
| **proxyProfileSdkKeysRequest** | [**ProxyProfileSdkKeysRequest**](ProxyProfileSdkKeysRequest.md)|  | |

### Return type

[**ProxyProfileSdkKeysListModel**](ProxyProfileSdkKeysListModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When the selection was successful. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **403** | Forbidden. When selection rules are applied to the Proxy Profile. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="updateProxyProfile"></a>
# **updateProxyProfile**
> ProxyProfileModel updateProxyProfile(proxyProfileId, jsonPatchOperation)

Update Proxy Profile

This endpoint updates a Proxy Profile identified by the &#x60;proxyProfileId&#x60; parameter with a collection of [JSON Patch](https://jsonpatch.com) operations.  The advantage of using JSON Patch is that you can describe individual update operations on a resource without touching attributes that you don&#39;t want to change.  For example: We have the following resource. &#x60;&#x60;&#x60;json {   \&quot;proxyProfileId\&quot;: \&quot;4ebe288d-6415-44a8-85c8-7b9f78316a86\&quot;,   \&quot;name\&quot;: \&quot;production\&quot;,   \&quot;description\&quot;: \&quot;profile for production environments\&quot;,   \&quot;lastAccessedAt\&quot;: \&quot;2019-08-24T14:15:22Z\&quot;,   \&quot;connectionPreferences\&quot;: {     \&quot;sdkPollInterval\&quot;: 60,     \&quot;webhookNotification\&quot;: null   },   \&quot;sdkKeySelectionRules\&quot;: [] } &#x60;&#x60;&#x60; If we send an update request body as below (it changes the &#x60;sdkPollInterval&#x60; field and adds a new Proxy Webhook URL): &#x60;&#x60;&#x60;json [   {     \&quot;op\&quot;: \&quot;replace\&quot;,      \&quot;path\&quot;: \&quot;/connectionPreferences/sdkPollInterval\&quot;,      \&quot;value\&quot;: 120   },    {     \&quot;op\&quot;: \&quot;add\&quot;,     \&quot;path\&quot;: \&quot;/connectionPreferences/webhookNotification\&quot;,     \&quot;value\&quot;: {       \&quot;webhookProxyUrl\&quot;: \&quot;https://my-proxy-url.com\&quot;     }   } ] &#x60;&#x60;&#x60; Only the &#x60;sdkPollInterval&#x60; and &#x60;webhookProxyUrl&#x60; are updated and all the other attributes remain unchanged. So we get a response like this: &#x60;&#x60;&#x60;json {   \&quot;proxyProfileId\&quot;: \&quot;4ebe288d-6415-44a8-85c8-7b9f78316a86\&quot;,   \&quot;name\&quot;: \&quot;production\&quot;,   \&quot;description\&quot;: \&quot;profile for production environments\&quot;,   \&quot;lastAccessedAt\&quot;: \&quot;2019-08-24T14:15:22Z\&quot;,   \&quot;connectionPreferences\&quot;: {     \&quot;sdkPollInterval\&quot;: 120,     \&quot;webhookNotification\&quot;: {       \&quot;webhookProxyUrl\&quot;: \&quot;https://my-proxy-url.com\&quot;,       \&quot;signingKey1\&quot;: \&quot;&lt;generated-signing-key&gt;\&quot;,       \&quot;signingKey2\&quot;: null     }   },   \&quot;sdkKeySelectionRules\&quot;: [] } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.ProxyProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ProxyProfilesApi apiInstance = new ProxyProfilesApi(defaultClient);
    UUID proxyProfileId = UUID.randomUUID(); // UUID | The identifier of the Proxy Profile.
    List<JsonPatchOperation> jsonPatchOperation = Arrays.asList(); // List<JsonPatchOperation> | 
    try {
      ProxyProfileModel result = apiInstance.updateProxyProfile(proxyProfileId, jsonPatchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProxyProfilesApi#updateProxyProfile");
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
| **proxyProfileId** | **UUID**| The identifier of the Proxy Profile. | |
| **jsonPatchOperation** | [**List&lt;JsonPatchOperation&gt;**](JsonPatchOperation.md)|  | |

### Return type

[**ProxyProfileModel**](ProxyProfileModel.md)

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

