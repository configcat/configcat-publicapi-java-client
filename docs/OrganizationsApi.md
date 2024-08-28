# OrganizationsApi

All URIs are relative to *https://test-api.configcat.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getOrganizations**](OrganizationsApi.md#getOrganizations) | **GET** /v1/organizations | List Organizations |


<a id="getOrganizations"></a>
# **getOrganizations**
> List&lt;OrganizationModel&gt; getOrganizations()

List Organizations

This endpoint returns the list of the Organizations that belongs to the user.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test-api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    try {
      List<OrganizationModel> result = apiInstance.getOrganizations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#getOrganizations");
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

[**List&lt;OrganizationModel&gt;**](OrganizationModel.md)

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

