# WebhooksApi

All URIs are relative to *https://test-api.configcat.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWebhook**](WebhooksApi.md#createWebhook) | **POST** /v1/configs/{configId}/environments/{environmentId}/webhooks | Create Webhook |
| [**deleteWebhook**](WebhooksApi.md#deleteWebhook) | **DELETE** /v1/webhooks/{webhookId} | Delete Webhook |
| [**getWebhook**](WebhooksApi.md#getWebhook) | **GET** /v1/webhooks/{webhookId} | Get Webhook |
| [**getWebhookSigningKeys**](WebhooksApi.md#getWebhookSigningKeys) | **GET** /v1/webhooks/{webhookId}/keys | Get Webhook Signing Keys |
| [**getWebhooks**](WebhooksApi.md#getWebhooks) | **GET** /v1/products/{productId}/webhooks | List Webhooks |
| [**replaceWebhook**](WebhooksApi.md#replaceWebhook) | **PUT** /v1/webhooks/{webhookId} | Replace Webhook |
| [**updateWebhook**](WebhooksApi.md#updateWebhook) | **PATCH** /v1/webhooks/{webhookId} | Update Webhook |


<a id="createWebhook"></a>
# **createWebhook**
> WebhookModel createWebhook(configId, environmentId, webHookRequest)

Create Webhook

This endpoint creates a new Webhook in a specified Product identified by the &#x60;productId&#x60; parameter, which can be obtained from the [List Products](#operation/get-products) endpoint.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test-api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    UUID configId = UUID.randomUUID(); // UUID | The identifier of the Config.
    UUID environmentId = UUID.randomUUID(); // UUID | The identifier of the Environment.
    WebHookRequest webHookRequest = new WebHookRequest(); // WebHookRequest | 
    try {
      WebhookModel result = apiInstance.createWebhook(configId, environmentId, webHookRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#createWebhook");
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
| **webHookRequest** | [**WebHookRequest**](WebHookRequest.md)|  | |

### Return type

[**WebhookModel**](WebhookModel.md)

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

<a id="deleteWebhook"></a>
# **deleteWebhook**
> deleteWebhook(webhookId)

Delete Webhook

This endpoint removes a Webhook identified by the &#x60;webhookId&#x60; parameter.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test-api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    Integer webhookId = 56; // Integer | The identifier of the Webhook.
    try {
      apiInstance.deleteWebhook(webhookId);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#deleteWebhook");
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
| **webhookId** | **Integer**| The identifier of the Webhook. | |

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

<a id="getWebhook"></a>
# **getWebhook**
> WebhookModel getWebhook(webhookId)

Get Webhook

This endpoint returns the metadata of a Webhook  identified by the &#x60;webhookId&#x60;.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test-api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    Integer webhookId = 56; // Integer | The identifier of the Webhook.
    try {
      WebhookModel result = apiInstance.getWebhook(webhookId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getWebhook");
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
| **webhookId** | **Integer**| The identifier of the Webhook. | |

### Return type

[**WebhookModel**](WebhookModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When everything is ok, the webhook data is returned. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="getWebhookSigningKeys"></a>
# **getWebhookSigningKeys**
> WebhookSigningKeysModel getWebhookSigningKeys(webhookId)

Get Webhook Signing Keys

This endpoint returns the signing keys of a Webhook  identified by the &#x60;webhookId&#x60;.  Signing keys are used for ensuring the Webhook requests you receive are actually sent by ConfigCat.  &lt;a href&#x3D;\&quot;https://configcat.com/docs/advanced/notifications-webhooks/#verifying-webhook-requests\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Here&lt;/a&gt; you can read more about Webhook request verification.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test-api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    Integer webhookId = 56; // Integer | The identifier of the Webhook.
    try {
      WebhookSigningKeysModel result = apiInstance.getWebhookSigningKeys(webhookId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getWebhookSigningKeys");
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
| **webhookId** | **Integer**| The identifier of the Webhook. | |

### Return type

[**WebhookSigningKeysModel**](WebhookSigningKeysModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When everything is ok, the webhook signing keys are returned. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="getWebhooks"></a>
# **getWebhooks**
> List&lt;WebhookModel&gt; getWebhooks(productId)

List Webhooks

This endpoint returns the list of the Webhooks that belongs to the given Product identified by the &#x60;productId&#x60; parameter, which can be obtained from the [List Products](#operation/get-products) endpoint.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test-api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    UUID productId = UUID.randomUUID(); // UUID | The identifier of the Product.
    try {
      List<WebhookModel> result = apiInstance.getWebhooks(productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getWebhooks");
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

[**List&lt;WebhookModel&gt;**](WebhookModel.md)

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

<a id="replaceWebhook"></a>
# **replaceWebhook**
> WebhookModel replaceWebhook(webhookId, webHookRequest)

Replace Webhook

This endpoint replaces the whole value of a Webhook identified by the &#x60;webhookId&#x60; parameter.  **Important:** As this endpoint is doing a complete replace, it&#39;s important to set every other attribute that you don&#39;t want to change in its original state. Not listing one means it will reset.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test-api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    Integer webhookId = 56; // Integer | The identifier of the Webhook.
    WebHookRequest webHookRequest = new WebHookRequest(); // WebHookRequest | 
    try {
      WebhookModel result = apiInstance.replaceWebhook(webhookId, webHookRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#replaceWebhook");
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
| **webhookId** | **Integer**| The identifier of the Webhook. | |
| **webHookRequest** | [**WebHookRequest**](WebHookRequest.md)|  | |

### Return type

[**WebhookModel**](WebhookModel.md)

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

<a id="updateWebhook"></a>
# **updateWebhook**
> WebhookModel updateWebhook(webhookId, jsonPatchOperation)

Update Webhook

This endpoint updates a Webhook identified by the &#x60;webhookId&#x60; parameter with a collection of [JSON Patch](https://jsonpatch.com) operations.  The advantage of using JSON Patch is that you can describe individual update operations on a resource without touching attributes that you don&#39;t want to change.  For example: We have the following resource. &#x60;&#x60;&#x60;json {   \&quot;webhookId\&quot;: 6,   \&quot;url\&quot;: \&quot;https://example.com/hook\&quot;,   \&quot;httpMethod\&quot;: \&quot;post\&quot;,   \&quot;content\&quot;: \&quot;null\&quot;,   \&quot;webHookHeaders\&quot;: [] } &#x60;&#x60;&#x60; If we send an update request body as below (it changes the &#x60;content&#x60; field and adds a new HTTP header): &#x60;&#x60;&#x60;json [   {     \&quot;op\&quot;: \&quot;replace\&quot;,      \&quot;path\&quot;: \&quot;/content\&quot;,      \&quot;value\&quot;: \&quot;Some webhook content.\&quot;   },    {     \&quot;op\&quot;: \&quot;add\&quot;,      \&quot;path\&quot;: \&quot;/webHookHeaders/-\&quot;,      \&quot;value\&quot;: {       \&quot;key\&quot;: \&quot;X-Custom-Header\&quot;,        \&quot;value\&quot;: \&quot;Custom header value\&quot;     }   } ] &#x60;&#x60;&#x60; Only the &#x60;content&#x60; and &#x60;webHookHeaders&#x60; are updated and all the other attributes remain unchanged. So we get a response like this: &#x60;&#x60;&#x60;json {   \&quot;webhookId\&quot;: 6,   \&quot;url\&quot;: \&quot;https://example.com/hook\&quot;,   \&quot;httpMethod\&quot;: \&quot;post\&quot;,    \&quot;content\&quot;: \&quot;Some webhook content.\&quot;,    \&quot;webHookHeaders\&quot;: [     {       \&quot;key\&quot;: \&quot;X-Custom-Header\&quot;,        \&quot;value\&quot;: \&quot;Custom header value\&quot;,        \&quot;isSecure\&quot;: false     }   ] } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test-api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    Integer webhookId = 56; // Integer | The identifier of the Webhook.
    List<JsonPatchOperation> jsonPatchOperation = Arrays.asList(); // List<JsonPatchOperation> | 
    try {
      WebhookModel result = apiInstance.updateWebhook(webhookId, jsonPatchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#updateWebhook");
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
| **webhookId** | **Integer**| The identifier of the Webhook. | |
| **jsonPatchOperation** | [**List&lt;JsonPatchOperation&gt;**](JsonPatchOperation.md)|  | |

### Return type

[**WebhookModel**](WebhookModel.md)

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

