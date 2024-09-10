# IntegrationsApi

All URIs are relative to *https://api.configcat.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createIntegration**](IntegrationsApi.md#createIntegration) | **POST** /v1/products/{productId}/integrations | Create Integration |
| [**deleteIntegration**](IntegrationsApi.md#deleteIntegration) | **DELETE** /v1/integrations/{integrationId} | Delete Integration |
| [**getIntegration**](IntegrationsApi.md#getIntegration) | **GET** /v1/integrations/{integrationId} | Get Integration |
| [**getIntegrations**](IntegrationsApi.md#getIntegrations) | **GET** /v1/products/{productId}/integrations | List Integrations |
| [**updateIntegration**](IntegrationsApi.md#updateIntegration) | **PUT** /v1/integrations/{integrationId} | Update Integration |


<a id="createIntegration"></a>
# **createIntegration**
> IntegrationModel createIntegration(productId, createIntegrationModel)

Create Integration

This endpoint creates a new Integration in a specified Product  identified by the &#x60;productId&#x60; parameter, which can be obtained from the [List Products](#operation/get-products) endpoint.  The Parameters dictionary differs for each IntegrationType: - Datadog  - &#x60;apikey&#x60;: Required. Datadog API key.  - &#x60;site&#x60;: Datadog site. Available values: &#x60;Us&#x60;, &#x60;Eu&#x60;, &#x60;Us1Fed&#x60;, &#x60;Us3&#x60;, &#x60;Us5&#x60;. Default: &#x60;Us&#x60;. - Slack    Connecting the Slack integration through the Public Management API will not post messages with the ConfigCat Feature Flags Slack app but with an incoming webhook.  - &#x60;incoming_webhook.url&#x60;: Required. The [incoming webhook URL](https://api.slack.com/messaging/webhooks) where the integration should post messages. - Amplitude  - &#x60;apiKey&#x60;: Required. Amplitude API Key.  - &#x60;secretKey&#x60;: Required. Amplitude Secret Key. - Mixpanel  - &#x60;serviceAccountUserName&#x60;: Required. Mixpanel Service Account Username.  - &#x60;serviceAccountSecret&#x60;: Required. Mixpanel Service Account Secret.  - &#x60;projectId&#x60;: Required. Mixpanel Project ID.  - &#x60;server&#x60;: Mixpanel Server. Available values: &#x60;StandardServer&#x60;, &#x60;EUResidencyServer&#x60;. Default: &#x60;StandardServer&#x60;. - Twilio Segment  - &#x60;writeKey&#x60;: Required. Twilio Segment Write Key.  - &#x60;server&#x60;: Twilio Segment Server. Available values: &#x60;Us&#x60;, &#x60;Eu&#x60;. Default: &#x60;Us&#x60;. - PubNub (work in progress)

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.IntegrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    IntegrationsApi apiInstance = new IntegrationsApi(defaultClient);
    UUID productId = UUID.randomUUID(); // UUID | The identifier of the Product.
    CreateIntegrationModel createIntegrationModel = new CreateIntegrationModel(); // CreateIntegrationModel | 
    try {
      IntegrationModel result = apiInstance.createIntegration(productId, createIntegrationModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#createIntegration");
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
| **createIntegrationModel** | [**CreateIntegrationModel**](CreateIntegrationModel.md)|  | |

### Return type

[**IntegrationModel**](IntegrationModel.md)

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

<a id="deleteIntegration"></a>
# **deleteIntegration**
> deleteIntegration(integrationId)

Delete Integration

This endpoint removes a Integration identified by the &#x60;integrationId&#x60; parameter.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.IntegrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    IntegrationsApi apiInstance = new IntegrationsApi(defaultClient);
    UUID integrationId = UUID.randomUUID(); // UUID | The identifier of the Integration.
    try {
      apiInstance.deleteIntegration(integrationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#deleteIntegration");
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
| **integrationId** | **UUID**| The identifier of the Integration. | |

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

<a id="getIntegration"></a>
# **getIntegration**
> IntegrationModel getIntegration(integrationId)

Get Integration

This endpoint returns the metadata of an Integration identified by the &#x60;integrationId&#x60;.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.IntegrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    IntegrationsApi apiInstance = new IntegrationsApi(defaultClient);
    UUID integrationId = UUID.randomUUID(); // UUID | The identifier of the Integration.
    try {
      IntegrationModel result = apiInstance.getIntegration(integrationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#getIntegration");
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
| **integrationId** | **UUID**| The identifier of the Integration. | |

### Return type

[**IntegrationModel**](IntegrationModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When everything is ok, the integration data returned. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="getIntegrations"></a>
# **getIntegrations**
> IntegrationsModel getIntegrations(productId)

List Integrations

This endpoint returns the list of the Integrations that belongs to the given Product identified by the &#x60;productId&#x60; parameter, which can be obtained from the [List Products](#operation/get-products) endpoint.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.IntegrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    IntegrationsApi apiInstance = new IntegrationsApi(defaultClient);
    UUID productId = UUID.randomUUID(); // UUID | The identifier of the Product.
    try {
      IntegrationsModel result = apiInstance.getIntegrations(productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#getIntegrations");
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

[**IntegrationsModel**](IntegrationsModel.md)

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

<a id="updateIntegration"></a>
# **updateIntegration**
> IntegrationModel updateIntegration(integrationId, modifyIntegrationRequest)

Update Integration

This endpoint updates a Config identified by the &#x60;integrationId&#x60; parameter.  The Parameters dictionary differs for each IntegrationType: - Datadog  - &#x60;apikey&#x60;: Required. Datadog API key.  - &#x60;site&#x60;: Datadog site. Available values: &#x60;Us&#x60;, &#x60;Eu&#x60;, &#x60;Us1Fed&#x60;, &#x60;Us3&#x60;, &#x60;Us5&#x60;. Default: &#x60;Us&#x60;. - Slack    Connecting the Slack integration through the Public Management API will not post messages with the ConfigCat Feature Flags Slack app but with an incoming webhook.  - &#x60;incoming_webhook.url&#x60;: Required. The [incoming webhook URL](https://api.slack.com/messaging/webhooks) where the integration should post messages. - Amplitude  - &#x60;apiKey&#x60;: Required. Amplitude API Key.  - &#x60;secretKey&#x60;: Required. Amplitude Secret Key. - Mixpanel  - &#x60;serviceAccountUserName&#x60;: Required. Mixpanel Service Account Username.  - &#x60;serviceAccountSecret&#x60;: Required. Mixpanel Service Account Secret.  - &#x60;projectId&#x60;: Required. Mixpanel Project ID.  - &#x60;server&#x60;: Mixpanel Server. Available values: &#x60;StandardServer&#x60;, &#x60;EUResidencyServer&#x60;. Default: &#x60;StandardServer&#x60;. - Twilio Segment  - &#x60;writeKey&#x60;: Required. Twilio Segment Write Key.  - &#x60;server&#x60;: Twilio Segment Server. Available values: &#x60;Us&#x60;, &#x60;Eu&#x60;. Default: &#x60;Us&#x60;. - PubNub (work in progress)

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.IntegrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    IntegrationsApi apiInstance = new IntegrationsApi(defaultClient);
    UUID integrationId = UUID.randomUUID(); // UUID | The identifier of the Integration.
    ModifyIntegrationRequest modifyIntegrationRequest = new ModifyIntegrationRequest(); // ModifyIntegrationRequest | 
    try {
      IntegrationModel result = apiInstance.updateIntegration(integrationId, modifyIntegrationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#updateIntegration");
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
| **integrationId** | **UUID**| The identifier of the Integration. | |
| **modifyIntegrationRequest** | [**ModifyIntegrationRequest**](ModifyIntegrationRequest.md)|  | |

### Return type

[**IntegrationModel**](IntegrationModel.md)

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

