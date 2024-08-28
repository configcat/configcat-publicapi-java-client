# CodeReferencesApi

All URIs are relative to *https://test-api.configcat.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1CodeReferencesDeleteReportsPost**](CodeReferencesApi.md#v1CodeReferencesDeleteReportsPost) | **POST** /v1/code-references/delete-reports | Delete Reference reports |
| [**v1CodeReferencesPost**](CodeReferencesApi.md#v1CodeReferencesPost) | **POST** /v1/code-references | Upload References |
| [**v1SettingsSettingIdCodeReferencesGet**](CodeReferencesApi.md#v1SettingsSettingIdCodeReferencesGet) | **GET** /v1/settings/{settingId}/code-references | Get References for Feature Flag or Setting |


<a id="v1CodeReferencesDeleteReportsPost"></a>
# **v1CodeReferencesDeleteReportsPost**
> v1CodeReferencesDeleteReportsPost(deleteRepositoryReportsRequest)

Delete Reference reports



### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.CodeReferencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test-api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    CodeReferencesApi apiInstance = new CodeReferencesApi(defaultClient);
    DeleteRepositoryReportsRequest deleteRepositoryReportsRequest = new DeleteRepositoryReportsRequest(); // DeleteRepositoryReportsRequest | 
    try {
      apiInstance.v1CodeReferencesDeleteReportsPost(deleteRepositoryReportsRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodeReferencesApi#v1CodeReferencesDeleteReportsPost");
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
| **deleteRepositoryReportsRequest** | [**DeleteRepositoryReportsRequest**](DeleteRepositoryReportsRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="v1CodeReferencesPost"></a>
# **v1CodeReferencesPost**
> v1CodeReferencesPost(codeReferenceRequest)

Upload References



### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.CodeReferencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test-api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    CodeReferencesApi apiInstance = new CodeReferencesApi(defaultClient);
    CodeReferenceRequest codeReferenceRequest = new CodeReferenceRequest(); // CodeReferenceRequest | 
    try {
      apiInstance.v1CodeReferencesPost(codeReferenceRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodeReferencesApi#v1CodeReferencesPost");
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
| **codeReferenceRequest** | [**CodeReferenceRequest**](CodeReferenceRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="v1SettingsSettingIdCodeReferencesGet"></a>
# **v1SettingsSettingIdCodeReferencesGet**
> List&lt;CodeReferenceModel&gt; v1SettingsSettingIdCodeReferencesGet(settingId)

Get References for Feature Flag or Setting



### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.CodeReferencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test-api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    CodeReferencesApi apiInstance = new CodeReferencesApi(defaultClient);
    Integer settingId = 56; // Integer | The identifier of the Feature Flag or Setting.
    try {
      List<CodeReferenceModel> result = apiInstance.v1SettingsSettingIdCodeReferencesGet(settingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodeReferencesApi#v1SettingsSettingIdCodeReferencesGet");
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
| **settingId** | **Integer**| The identifier of the Feature Flag or Setting. | |

### Return type

[**List&lt;CodeReferenceModel&gt;**](CodeReferenceModel.md)

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

