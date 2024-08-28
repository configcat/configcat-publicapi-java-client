# MeApi

All URIs are relative to *https://test-api.configcat.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMe**](MeApi.md#getMe) | **GET** /v1/me | Get authenticated user details |


<a id="getMe"></a>
# **getMe**
> MeModel getMe()

Get authenticated user details



### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.MeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test-api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    MeApi apiInstance = new MeApi(defaultClient);
    try {
      MeModel result = apiInstance.getMe();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#getMe");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MeModel**](MeModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

