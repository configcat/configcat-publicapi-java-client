# IntegrationLinksApi

All URIs are relative to *https://api.configcat.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addOrUpdateIntegrationLink**](IntegrationLinksApi.md#addOrUpdateIntegrationLink) | **POST** /v1/environments/{environmentId}/settings/{settingId}/integrationLinks/{integrationLinkType}/{key} | Add or update Integration link |
| [**deleteIntegrationLink**](IntegrationLinksApi.md#deleteIntegrationLink) | **DELETE** /v1/environments/{environmentId}/settings/{settingId}/integrationLinks/{integrationLinkType}/{key} | Delete Integration link |
| [**getIntegrationLinkDetails**](IntegrationLinksApi.md#getIntegrationLinkDetails) | **GET** /v1/integrationLink/{integrationLinkType}/{key}/details | Get Integration link |
| [**jiraAddOrUpdateIntegrationLink**](IntegrationLinksApi.md#jiraAddOrUpdateIntegrationLink) | **POST** /v1/jira/environments/{environmentId}/settings/{settingId}/integrationLinks/{key} |  |
| [**jiraConnect**](IntegrationLinksApi.md#jiraConnect) | **POST** /v1/jira/connect |  |


<a id="addOrUpdateIntegrationLink"></a>
# **addOrUpdateIntegrationLink**
> IntegrationLinkModel addOrUpdateIntegrationLink(environmentId, settingId, integrationLinkType, key, addOrUpdateIntegrationLinkModel)

Add or update Integration link



### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.IntegrationLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    IntegrationLinksApi apiInstance = new IntegrationLinksApi(defaultClient);
    UUID environmentId = UUID.randomUUID(); // UUID | The identifier of the Environment.
    Integer settingId = 56; // Integer | The id of the Setting.
    IntegrationLinkType integrationLinkType = IntegrationLinkType.fromValue("trello"); // IntegrationLinkType | The integration link's type.
    String key = "key_example"; // String | The key of the integration link.
    AddOrUpdateIntegrationLinkModel addOrUpdateIntegrationLinkModel = new AddOrUpdateIntegrationLinkModel(); // AddOrUpdateIntegrationLinkModel | 
    try {
      IntegrationLinkModel result = apiInstance.addOrUpdateIntegrationLink(environmentId, settingId, integrationLinkType, key, addOrUpdateIntegrationLinkModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationLinksApi#addOrUpdateIntegrationLink");
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
| **integrationLinkType** | [**IntegrationLinkType**](.md)| The integration link&#39;s type. | [enum: trello, jira, monday] |
| **key** | **String**| The key of the integration link. | |
| **addOrUpdateIntegrationLinkModel** | [**AddOrUpdateIntegrationLinkModel**](AddOrUpdateIntegrationLinkModel.md)|  | [optional] |

### Return type

[**IntegrationLinkModel**](IntegrationLinkModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When everything is ok, the integration link data returned. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="deleteIntegrationLink"></a>
# **deleteIntegrationLink**
> DeleteIntegrationLinkModel deleteIntegrationLink(environmentId, settingId, integrationLinkType, key)

Delete Integration link



### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.IntegrationLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    IntegrationLinksApi apiInstance = new IntegrationLinksApi(defaultClient);
    UUID environmentId = UUID.randomUUID(); // UUID | The identifier of the Environment.
    Integer settingId = 56; // Integer | The id of the Setting.
    IntegrationLinkType integrationLinkType = IntegrationLinkType.fromValue("trello"); // IntegrationLinkType | The integration's type.
    String key = "key_example"; // String | The key of the integration link.
    try {
      DeleteIntegrationLinkModel result = apiInstance.deleteIntegrationLink(environmentId, settingId, integrationLinkType, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationLinksApi#deleteIntegrationLink");
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
| **integrationLinkType** | [**IntegrationLinkType**](.md)| The integration&#39;s type. | [enum: trello, jira, monday] |
| **key** | **String**| The key of the integration link. | |

### Return type

[**DeleteIntegrationLinkModel**](DeleteIntegrationLinkModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When everything is ok. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="getIntegrationLinkDetails"></a>
# **getIntegrationLinkDetails**
> IntegrationLinkDetailsModel getIntegrationLinkDetails(integrationLinkType, key)

Get Integration link



### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.IntegrationLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    IntegrationLinksApi apiInstance = new IntegrationLinksApi(defaultClient);
    IntegrationLinkType integrationLinkType = IntegrationLinkType.fromValue("trello"); // IntegrationLinkType | The integration link's type.
    String key = "key_example"; // String | The key of the integration link.
    try {
      IntegrationLinkDetailsModel result = apiInstance.getIntegrationLinkDetails(integrationLinkType, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationLinksApi#getIntegrationLinkDetails");
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
| **integrationLinkType** | [**IntegrationLinkType**](.md)| The integration link&#39;s type. | [enum: trello, jira, monday] |
| **key** | **String**| The key of the integration link. | |

### Return type

[**IntegrationLinkDetailsModel**](IntegrationLinkDetailsModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When everything is ok, the details for the integration link returned. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="jiraAddOrUpdateIntegrationLink"></a>
# **jiraAddOrUpdateIntegrationLink**
> IntegrationLinkModel jiraAddOrUpdateIntegrationLink(environmentId, settingId, key, addOrUpdateJiraIntegrationLinkModel)



### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.IntegrationLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    IntegrationLinksApi apiInstance = new IntegrationLinksApi(defaultClient);
    UUID environmentId = UUID.randomUUID(); // UUID | The identifier of the Environment.
    Integer settingId = 56; // Integer | The id of the Setting.
    String key = "key_example"; // String | The key of the integration link.
    AddOrUpdateJiraIntegrationLinkModel addOrUpdateJiraIntegrationLinkModel = new AddOrUpdateJiraIntegrationLinkModel(); // AddOrUpdateJiraIntegrationLinkModel | 
    try {
      IntegrationLinkModel result = apiInstance.jiraAddOrUpdateIntegrationLink(environmentId, settingId, key, addOrUpdateJiraIntegrationLinkModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationLinksApi#jiraAddOrUpdateIntegrationLink");
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
| **key** | **String**| The key of the integration link. | |
| **addOrUpdateJiraIntegrationLinkModel** | [**AddOrUpdateJiraIntegrationLinkModel**](AddOrUpdateJiraIntegrationLinkModel.md)|  | [optional] |

### Return type

[**IntegrationLinkModel**](IntegrationLinkModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When everything is ok, the integration link data returned. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="jiraConnect"></a>
# **jiraConnect**
> jiraConnect(connectRequest)



### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.IntegrationLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    IntegrationLinksApi apiInstance = new IntegrationLinksApi(defaultClient);
    ConnectRequest connectRequest = new ConnectRequest(); // ConnectRequest | 
    try {
      apiInstance.jiraConnect(connectRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationLinksApi#jiraConnect");
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
| **connectRequest** | [**ConnectRequest**](ConnectRequest.md)|  | [optional] |

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
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

