# SdkKeysApi

All URIs are relative to *https://test-api.configcat.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSdkKeys**](SdkKeysApi.md#getSdkKeys) | **GET** /v1/configs/{configId}/environments/{environmentId} | Get SDK Key |


<a id="getSdkKeys"></a>
# **getSdkKeys**
> SdkKeysModel getSdkKeys(configId, environmentId)

Get SDK Key

This endpoint returns the SDK Key for your Config in a specified Environment.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.SdkKeysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test-api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    SdkKeysApi apiInstance = new SdkKeysApi(defaultClient);
    UUID configId = UUID.randomUUID(); // UUID | The identifier of the Config.
    UUID environmentId = UUID.randomUUID(); // UUID | The identifier of the Environment.
    try {
      SdkKeysModel result = apiInstance.getSdkKeys(configId, environmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SdkKeysApi#getSdkKeys");
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

[**SdkKeysModel**](SdkKeysModel.md)

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

