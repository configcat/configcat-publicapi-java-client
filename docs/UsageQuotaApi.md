# UsageQuotaApi

All URIs are relative to *https://api.configcat.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getOrganizationUsageAndQuota**](UsageQuotaApi.md#getOrganizationUsageAndQuota) | **GET** /v1/organizations/{organizationId}/usage-and-quota | Get usage and quota |


<a id="getOrganizationUsageAndQuota"></a>
# **getOrganizationUsageAndQuota**
> StatisticsV2Model getOrganizationUsageAndQuota(organizationId, productId)

Get usage and quota

This endpoint returns the current usage and quota information for an Organization. You can optionally filter the result by Product using the &#x60;productId&#x60; query parameter.  The response includes monthly aggregate values, detailed request statistics, and quota limits used to monitor consumption and over-limit conditions.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.UsageQuotaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    UsageQuotaApi apiInstance = new UsageQuotaApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | The identifier of the Organization.
    UUID productId = UUID.randomUUID(); // UUID | The identifier of the Product to filter statistics for.
    try {
      StatisticsV2Model result = apiInstance.getOrganizationUsageAndQuota(organizationId, productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageQuotaApi#getOrganizationUsageAndQuota");
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
| **productId** | **UUID**| The identifier of the Product to filter statistics for. | [optional] |

### Return type

[**StatisticsV2Model**](StatisticsV2Model.md)

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

