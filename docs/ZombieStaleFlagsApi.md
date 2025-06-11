# ZombieStaleFlagsApi

All URIs are relative to *https://api.configcat.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getStaleflags**](ZombieStaleFlagsApi.md#getStaleflags) | **GET** /v1/products/{productId}/staleflags | List Zombie (stale) flags for Product |


<a id="getStaleflags"></a>
# **getStaleflags**
> StaleFlagProductModel getStaleflags(productId, scope, staleFlagAgeDays, staleFlagStaleInEnvironmentsType, ignoredEnvironmentIds, ignoredTagIds)

List Zombie (stale) flags for Product

This endpoint returns the list of Zombie (stale) flags for a given Product  and the result can be optionally filtered by various parameters.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.ZombieStaleFlagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ZombieStaleFlagsApi apiInstance = new ZombieStaleFlagsApi(defaultClient);
    UUID productId = UUID.randomUUID(); // UUID | The identifier of the Product.
    StaleFlagReminderScope scope = StaleFlagReminderScope.fromValue("all"); // StaleFlagReminderScope | The scope of the report.
    Integer staleFlagAgeDays = 56; // Integer | The inactivity in days after a feature flag should be considered stale.
    StaleFlagStaleInEnvironmentsType staleFlagStaleInEnvironmentsType = StaleFlagStaleInEnvironmentsType.fromValue("staleInAnyEnvironments"); // StaleFlagStaleInEnvironmentsType | Consider a feature flag as stale if the feature flag is stale in all/any of the environments.
    List<UUID> ignoredEnvironmentIds = Arrays.asList(); // List<UUID> | Ignore environment identifiers from the report.
    List<Long> ignoredTagIds = Arrays.asList(); // List<Long> | Ignore feature flags from the report based on their tag identifiers.
    try {
      StaleFlagProductModel result = apiInstance.getStaleflags(productId, scope, staleFlagAgeDays, staleFlagStaleInEnvironmentsType, ignoredEnvironmentIds, ignoredTagIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZombieStaleFlagsApi#getStaleflags");
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
| **productId** | **UUID**| The identifier of the Product. | |
| **scope** | [**StaleFlagReminderScope**](.md)| The scope of the report. | [optional] [enum: all, watchedByMe] |
| **staleFlagAgeDays** | **Integer**| The inactivity in days after a feature flag should be considered stale. | [optional] |
| **staleFlagStaleInEnvironmentsType** | [**StaleFlagStaleInEnvironmentsType**](.md)| Consider a feature flag as stale if the feature flag is stale in all/any of the environments. | [optional] [enum: staleInAnyEnvironments, staleInAllEnvironments] |
| **ignoredEnvironmentIds** | [**List&lt;UUID&gt;**](UUID.md)| Ignore environment identifiers from the report. | [optional] |
| **ignoredTagIds** | [**List&lt;Long&gt;**](Long.md)| Ignore feature flags from the report based on their tag identifiers. | [optional] |

### Return type

[**StaleFlagProductModel**](StaleFlagProductModel.md)

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

