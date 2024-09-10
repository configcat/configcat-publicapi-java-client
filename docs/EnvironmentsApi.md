# EnvironmentsApi

All URIs are relative to *https://api.configcat.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEnvironment**](EnvironmentsApi.md#createEnvironment) | **POST** /v1/products/{productId}/environments | Create Environment |
| [**deleteEnvironment**](EnvironmentsApi.md#deleteEnvironment) | **DELETE** /v1/environments/{environmentId} | Delete Environment |
| [**getEnvironment**](EnvironmentsApi.md#getEnvironment) | **GET** /v1/environments/{environmentId} | Get Environment |
| [**getEnvironments**](EnvironmentsApi.md#getEnvironments) | **GET** /v1/products/{productId}/environments | List Environments |
| [**updateEnvironment**](EnvironmentsApi.md#updateEnvironment) | **PUT** /v1/environments/{environmentId} | Update Environment |


<a id="createEnvironment"></a>
# **createEnvironment**
> EnvironmentModel createEnvironment(productId, createEnvironmentModel)

Create Environment

This endpoint creates a new Environment in a specified Product  identified by the &#x60;productId&#x60; parameter, which can be obtained from the [List Products](#operation/get-products) endpoint.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    UUID productId = UUID.randomUUID(); // UUID | The identifier of the Product.
    CreateEnvironmentModel createEnvironmentModel = new CreateEnvironmentModel(); // CreateEnvironmentModel | 
    try {
      EnvironmentModel result = apiInstance.createEnvironment(productId, createEnvironmentModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#createEnvironment");
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
| **createEnvironmentModel** | [**CreateEnvironmentModel**](CreateEnvironmentModel.md)|  | |

### Return type

[**EnvironmentModel**](EnvironmentModel.md)

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

<a id="deleteEnvironment"></a>
# **deleteEnvironment**
> deleteEnvironment(environmentId, cleanupAuditLogs)

Delete Environment

This endpoint removes an Environment identified by the &#x60;environmentId&#x60; parameter. If the &#x60;cleanupAuditLogs&#x60; flag is set to true, it also deletes the audit log records related to the environment (except for the &#x60;Created a new environment&#x60; and &#x60;Deleted an environment&#x60; records).

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    UUID environmentId = UUID.randomUUID(); // UUID | The identifier of the Environment.
    Boolean cleanupAuditLogs = true; // Boolean | An optional flag which indicates whether the audit log records related to the environment should be deleted or not.
    try {
      apiInstance.deleteEnvironment(environmentId, cleanupAuditLogs);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#deleteEnvironment");
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
| **cleanupAuditLogs** | **Boolean**| An optional flag which indicates whether the audit log records related to the environment should be deleted or not. | [optional] |

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

<a id="getEnvironment"></a>
# **getEnvironment**
> EnvironmentModel getEnvironment(environmentId)

Get Environment

This endpoint returns the metadata of an Environment  identified by the &#x60;environmentId&#x60;.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    UUID environmentId = UUID.randomUUID(); // UUID | The identifier of the Environment.
    try {
      EnvironmentModel result = apiInstance.getEnvironment(environmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#getEnvironment");
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

### Return type

[**EnvironmentModel**](EnvironmentModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When everything is ok, the environment data returned. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="getEnvironments"></a>
# **getEnvironments**
> List&lt;EnvironmentModel&gt; getEnvironments(productId)

List Environments

This endpoint returns the list of the Environments that belongs to the given Product identified by the &#x60;productId&#x60; parameter, which can be obtained from the [List Products](#operation/get-products) endpoint.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    UUID productId = UUID.randomUUID(); // UUID | The identifier of the Product.
    try {
      List<EnvironmentModel> result = apiInstance.getEnvironments(productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#getEnvironments");
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

### Return type

[**List&lt;EnvironmentModel&gt;**](EnvironmentModel.md)

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

<a id="updateEnvironment"></a>
# **updateEnvironment**
> EnvironmentModel updateEnvironment(environmentId, updateEnvironmentModel)

Update Environment

This endpoint updates an Environment identified by the &#x60;environmentId&#x60; parameter.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    UUID environmentId = UUID.randomUUID(); // UUID | The identifier of the Environment.
    UpdateEnvironmentModel updateEnvironmentModel = new UpdateEnvironmentModel(); // UpdateEnvironmentModel | 
    try {
      EnvironmentModel result = apiInstance.updateEnvironment(environmentId, updateEnvironmentModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#updateEnvironment");
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
| **updateEnvironmentModel** | [**UpdateEnvironmentModel**](UpdateEnvironmentModel.md)|  | |

### Return type

[**EnvironmentModel**](EnvironmentModel.md)

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

