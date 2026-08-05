# ChangeRequestsApprovalFlowScheduledChangesBetaApi

All URIs are relative to *https://api.configcat.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addChangeRequestComment**](ChangeRequestsApprovalFlowScheduledChangesBetaApi.md#addChangeRequestComment) | **POST** /v2/change-requests/{changeRequestId}/comments | Add Comment |
| [**applyChangeRequest**](ChangeRequestsApprovalFlowScheduledChangesBetaApi.md#applyChangeRequest) | **POST** /v2/change-requests/{changeRequestId}/apply | Apply Change Request |
| [**approveChangeRequest**](ChangeRequestsApprovalFlowScheduledChangesBetaApi.md#approveChangeRequest) | **POST** /v2/change-requests/{changeRequestId}/approve | Approve Change Request |
| [**claimChangeRequestOwnership**](ChangeRequestsApprovalFlowScheduledChangesBetaApi.md#claimChangeRequestOwnership) | **POST** /v2/change-requests/{changeRequestId}/claim-ownership | Claim Ownership |
| [**closeChangeRequest**](ChangeRequestsApprovalFlowScheduledChangesBetaApi.md#closeChangeRequest) | **POST** /v2/change-requests/{changeRequestId}/close | Close Change Request |
| [**createChangeRequest**](ChangeRequestsApprovalFlowScheduledChangesBetaApi.md#createChangeRequest) | **POST** /v2/configs/{configId}/environments/{environmentId}/change-requests | Create Change Request |
| [**deleteChangeRequestComment**](ChangeRequestsApprovalFlowScheduledChangesBetaApi.md#deleteChangeRequestComment) | **DELETE** /v2/change-request-comments/{commentId} | Delete Comment |
| [**deleteChangeRequestProposedChange**](ChangeRequestsApprovalFlowScheduledChangesBetaApi.md#deleteChangeRequestProposedChange) | **DELETE** /v2/change-requests/{changeRequestId}/proposed-changes/{settingId} | Delete Setting from Change Request |
| [**getChangeRequest**](ChangeRequestsApprovalFlowScheduledChangesBetaApi.md#getChangeRequest) | **GET** /v2/change-requests/{changeRequestId} | Get Change Request |
| [**getChangeRequestProposedChanges**](ChangeRequestsApprovalFlowScheduledChangesBetaApi.md#getChangeRequestProposedChanges) | **GET** /v2/change-requests/{changeRequestId}/proposed-changes | Get Settings included in Change Request |
| [**getChangeRequests**](ChangeRequestsApprovalFlowScheduledChangesBetaApi.md#getChangeRequests) | **GET** /v2/products/{productId}/change-requests | List Change Requests |
| [**removeChangeRequestApproval**](ChangeRequestsApprovalFlowScheduledChangesBetaApi.md#removeChangeRequestApproval) | **POST** /v2/change-requests/{changeRequestId}/remove-approval | Remove Approval |
| [**resolveChangeRequestSettingConflicts**](ChangeRequestsApprovalFlowScheduledChangesBetaApi.md#resolveChangeRequestSettingConflicts) | **POST** /v2/change-requests/{changeRequestId}/proposed-changes/{settingId}/resolve-conflicts | Resolve Setting Conflicts |
| [**updateChangeRequest**](ChangeRequestsApprovalFlowScheduledChangesBetaApi.md#updateChangeRequest) | **PUT** /v2/change-requests/{changeRequestId} | Update Change Request |
| [**updateChangeRequestComment**](ChangeRequestsApprovalFlowScheduledChangesBetaApi.md#updateChangeRequestComment) | **PUT** /v2/change-request-comments/{commentId} | Update Comment |
| [**updateChangeRequestProposedChanges**](ChangeRequestsApprovalFlowScheduledChangesBetaApi.md#updateChangeRequestProposedChanges) | **PUT** /v2/change-requests/{changeRequestId}/proposed-changes | Update Settings included in Change Request |


<a id="addChangeRequestComment"></a>
# **addChangeRequestComment**
> ChangeRequestCommentModel addChangeRequestComment(changeRequestId, addChangeRequestCommentModel)

Add Comment

Adds a new comment to the Change Request.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.ChangeRequestsApprovalFlowScheduledChangesBetaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ChangeRequestsApprovalFlowScheduledChangesBetaApi apiInstance = new ChangeRequestsApprovalFlowScheduledChangesBetaApi(defaultClient);
    Long changeRequestId = 56L; // Long | The identifier of the Change Request.
    AddChangeRequestCommentModel addChangeRequestCommentModel = new AddChangeRequestCommentModel(); // AddChangeRequestCommentModel | 
    try {
      ChangeRequestCommentModel result = apiInstance.addChangeRequestComment(changeRequestId, addChangeRequestCommentModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeRequestsApprovalFlowScheduledChangesBetaApi#addChangeRequestComment");
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
| **changeRequestId** | **Long**| The identifier of the Change Request. | |
| **addChangeRequestCommentModel** | [**AddChangeRequestCommentModel**](AddChangeRequestCommentModel.md)|  | |

### Return type

[**ChangeRequestCommentModel**](ChangeRequestCommentModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When adding the comment was successful. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="applyChangeRequest"></a>
# **applyChangeRequest**
> ChangeRequestModel applyChangeRequest(changeRequestId)

Apply Change Request

Applies the Change Request. The proposed changes will be applied and published immediately.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.ChangeRequestsApprovalFlowScheduledChangesBetaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ChangeRequestsApprovalFlowScheduledChangesBetaApi apiInstance = new ChangeRequestsApprovalFlowScheduledChangesBetaApi(defaultClient);
    Long changeRequestId = 56L; // Long | The identifier of the Change Request.
    try {
      ChangeRequestModel result = apiInstance.applyChangeRequest(changeRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeRequestsApprovalFlowScheduledChangesBetaApi#applyChangeRequest");
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
| **changeRequestId** | **Long**| The identifier of the Change Request. | |

### Return type

[**ChangeRequestModel**](ChangeRequestModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When applying the Change Request was successful. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="approveChangeRequest"></a>
# **approveChangeRequest**
> ChangeRequestModel approveChangeRequest(changeRequestId)

Approve Change Request

Adds your approval to the Change Request.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.ChangeRequestsApprovalFlowScheduledChangesBetaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ChangeRequestsApprovalFlowScheduledChangesBetaApi apiInstance = new ChangeRequestsApprovalFlowScheduledChangesBetaApi(defaultClient);
    Long changeRequestId = 56L; // Long | The identifier of the Change Request.
    try {
      ChangeRequestModel result = apiInstance.approveChangeRequest(changeRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeRequestsApprovalFlowScheduledChangesBetaApi#approveChangeRequest");
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
| **changeRequestId** | **Long**| The identifier of the Change Request. | |

### Return type

[**ChangeRequestModel**](ChangeRequestModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When the approval was successful. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="claimChangeRequestOwnership"></a>
# **claimChangeRequestOwnership**
> ChangeRequestModel claimChangeRequestOwnership(changeRequestId)

Claim Ownership

Claims ownership of the Change Request.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.ChangeRequestsApprovalFlowScheduledChangesBetaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ChangeRequestsApprovalFlowScheduledChangesBetaApi apiInstance = new ChangeRequestsApprovalFlowScheduledChangesBetaApi(defaultClient);
    Long changeRequestId = 56L; // Long | The identifier of the Change Request.
    try {
      ChangeRequestModel result = apiInstance.claimChangeRequestOwnership(changeRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeRequestsApprovalFlowScheduledChangesBetaApi#claimChangeRequestOwnership");
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
| **changeRequestId** | **Long**| The identifier of the Change Request. | |

### Return type

[**ChangeRequestModel**](ChangeRequestModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When claiming ownership was successful. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="closeChangeRequest"></a>
# **closeChangeRequest**
> ChangeRequestModel closeChangeRequest(changeRequestId)

Close Change Request

Closes the Change Request without applying it.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.ChangeRequestsApprovalFlowScheduledChangesBetaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ChangeRequestsApprovalFlowScheduledChangesBetaApi apiInstance = new ChangeRequestsApprovalFlowScheduledChangesBetaApi(defaultClient);
    Long changeRequestId = 56L; // Long | The identifier of the Change Request.
    try {
      ChangeRequestModel result = apiInstance.closeChangeRequest(changeRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeRequestsApprovalFlowScheduledChangesBetaApi#closeChangeRequest");
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
| **changeRequestId** | **Long**| The identifier of the Change Request. | |

### Return type

[**ChangeRequestModel**](ChangeRequestModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When closing the Change Request was successful. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="createChangeRequest"></a>
# **createChangeRequest**
> ChangeRequestModel createChangeRequest(configId, environmentId, createChangeRequestModel)

Create Change Request

Creates a new Change Request for the specified Config and Environment.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.ChangeRequestsApprovalFlowScheduledChangesBetaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ChangeRequestsApprovalFlowScheduledChangesBetaApi apiInstance = new ChangeRequestsApprovalFlowScheduledChangesBetaApi(defaultClient);
    UUID configId = UUID.randomUUID(); // UUID | The identifier of the Config.
    UUID environmentId = UUID.randomUUID(); // UUID | The identifier of the Environment.
    CreateChangeRequestModel createChangeRequestModel = new CreateChangeRequestModel(); // CreateChangeRequestModel | 
    try {
      ChangeRequestModel result = apiInstance.createChangeRequest(configId, environmentId, createChangeRequestModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeRequestsApprovalFlowScheduledChangesBetaApi#createChangeRequest");
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
| **createChangeRequestModel** | [**CreateChangeRequestModel**](CreateChangeRequestModel.md)|  | |

### Return type

[**ChangeRequestModel**](ChangeRequestModel.md)

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

<a id="deleteChangeRequestComment"></a>
# **deleteChangeRequestComment**
> deleteChangeRequestComment(commentId)

Delete Comment

Deletes a Change Request comment.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.ChangeRequestsApprovalFlowScheduledChangesBetaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ChangeRequestsApprovalFlowScheduledChangesBetaApi apiInstance = new ChangeRequestsApprovalFlowScheduledChangesBetaApi(defaultClient);
    Long commentId = 56L; // Long | The identifier of the Change Request comment.
    try {
      apiInstance.deleteChangeRequestComment(commentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeRequestsApprovalFlowScheduledChangesBetaApi#deleteChangeRequestComment");
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
| **commentId** | **Long**| The identifier of the Change Request comment. | |

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
| **204** | When deleting the comment was successful. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="deleteChangeRequestProposedChange"></a>
# **deleteChangeRequestProposedChange**
> ChangeRequestModel deleteChangeRequestProposedChange(changeRequestId, settingId)

Delete Setting from Change Request

Removes a setting from a Change Request.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.ChangeRequestsApprovalFlowScheduledChangesBetaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ChangeRequestsApprovalFlowScheduledChangesBetaApi apiInstance = new ChangeRequestsApprovalFlowScheduledChangesBetaApi(defaultClient);
    Long changeRequestId = 56L; // Long | The identifier of the Change Request.
    Integer settingId = 56; // Integer | The identifier of the Setting.
    try {
      ChangeRequestModel result = apiInstance.deleteChangeRequestProposedChange(changeRequestId, settingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeRequestsApprovalFlowScheduledChangesBetaApi#deleteChangeRequestProposedChange");
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
| **changeRequestId** | **Long**| The identifier of the Change Request. | |
| **settingId** | **Integer**| The identifier of the Setting. | |

### Return type

[**ChangeRequestModel**](ChangeRequestModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When the delete was successful. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="getChangeRequest"></a>
# **getChangeRequest**
> ChangeRequestModel getChangeRequest(changeRequestId)

Get Change Request

Returns the details of a specific Change Request.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.ChangeRequestsApprovalFlowScheduledChangesBetaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ChangeRequestsApprovalFlowScheduledChangesBetaApi apiInstance = new ChangeRequestsApprovalFlowScheduledChangesBetaApi(defaultClient);
    Long changeRequestId = 56L; // Long | The identifier of the Change Request.
    try {
      ChangeRequestModel result = apiInstance.getChangeRequest(changeRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeRequestsApprovalFlowScheduledChangesBetaApi#getChangeRequest");
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
| **changeRequestId** | **Long**| The identifier of the Change Request. | |

### Return type

[**ChangeRequestModel**](ChangeRequestModel.md)

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

<a id="getChangeRequestProposedChanges"></a>
# **getChangeRequestProposedChanges**
> ChangeRequestProposedChangesModel getChangeRequestProposedChanges(changeRequestId, settingId)

Get Settings included in Change Request

Returns the proposed changes to the Settings included in a Change Request.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.ChangeRequestsApprovalFlowScheduledChangesBetaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ChangeRequestsApprovalFlowScheduledChangesBetaApi apiInstance = new ChangeRequestsApprovalFlowScheduledChangesBetaApi(defaultClient);
    Long changeRequestId = 56L; // Long | The identifier of the Change Request.
    Integer settingId = 56; // Integer | The optional identifier of the Setting.
    try {
      ChangeRequestProposedChangesModel result = apiInstance.getChangeRequestProposedChanges(changeRequestId, settingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeRequestsApprovalFlowScheduledChangesBetaApi#getChangeRequestProposedChanges");
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
| **changeRequestId** | **Long**| The identifier of the Change Request. | |
| **settingId** | **Integer**| The optional identifier of the Setting. | [optional] |

### Return type

[**ChangeRequestProposedChangesModel**](ChangeRequestProposedChangesModel.md)

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

<a id="getChangeRequests"></a>
# **getChangeRequests**
> ChangeRequestsModel getChangeRequests(productId, configId, environmentId, settingId, changeRequestStatusFilter, scheduleFilter, approveRequiredFilter, needsAttentionFilter, pageNumber, pageSize)

List Change Requests

Returns Change Requests of a Product with optional filtering and pagination.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.ChangeRequestsApprovalFlowScheduledChangesBetaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ChangeRequestsApprovalFlowScheduledChangesBetaApi apiInstance = new ChangeRequestsApprovalFlowScheduledChangesBetaApi(defaultClient);
    UUID productId = UUID.randomUUID(); // UUID | The identifier of the Product.
    UUID configId = UUID.randomUUID(); // UUID | Filter Change Requests by Config identifier.
    UUID environmentId = UUID.randomUUID(); // UUID | Filter Change Requests by Environment identifier.
    Integer settingId = 56; // Integer | Filter Change Requests by Setting identifier.
    List<ChangeRequestStatus> changeRequestStatusFilter = Arrays.asList(); // List<ChangeRequestStatus> | Filter Change Requests by status values.
    ChangeRequestScheduleFilter scheduleFilter = ChangeRequestScheduleFilter.fromValue("nonScheduled"); // ChangeRequestScheduleFilter | Filter Change Requests by schedule state.
    ChangeRequestApproveRequiredFilter approveRequiredFilter = ChangeRequestApproveRequiredFilter.fromValue("approveNotRequired"); // ChangeRequestApproveRequiredFilter | Filter Change Requests by approval requirement.
    NeedsAttentionFilter needsAttentionFilter = NeedsAttentionFilter.fromValue("notNeedsAttention"); // NeedsAttentionFilter | Filter Change Requests by whether they need attention.
    Integer pageNumber = 1; // Integer | Page number (min: 1).
    Integer pageSize = 25; // Integer | Page size (min: 1, max: 100).
    try {
      ChangeRequestsModel result = apiInstance.getChangeRequests(productId, configId, environmentId, settingId, changeRequestStatusFilter, scheduleFilter, approveRequiredFilter, needsAttentionFilter, pageNumber, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeRequestsApprovalFlowScheduledChangesBetaApi#getChangeRequests");
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
| **configId** | **UUID**| Filter Change Requests by Config identifier. | [optional] |
| **environmentId** | **UUID**| Filter Change Requests by Environment identifier. | [optional] |
| **settingId** | **Integer**| Filter Change Requests by Setting identifier. | [optional] |
| **changeRequestStatusFilter** | [**List&lt;ChangeRequestStatus&gt;**](ChangeRequestStatus.md)| Filter Change Requests by status values. | [optional] |
| **scheduleFilter** | [**ChangeRequestScheduleFilter**](.md)| Filter Change Requests by schedule state. | [optional] [enum: nonScheduled, scheduled] |
| **approveRequiredFilter** | [**ChangeRequestApproveRequiredFilter**](.md)| Filter Change Requests by approval requirement. | [optional] [enum: approveNotRequired, approveRequired] |
| **needsAttentionFilter** | [**NeedsAttentionFilter**](.md)| Filter Change Requests by whether they need attention. | [optional] [enum: notNeedsAttention, needsAttention] |
| **pageNumber** | **Integer**| Page number (min: 1). | [optional] [default to 1] |
| **pageSize** | **Integer**| Page size (min: 1, max: 100). | [optional] [default to 25] |

### Return type

[**ChangeRequestsModel**](ChangeRequestsModel.md)

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

<a id="removeChangeRequestApproval"></a>
# **removeChangeRequestApproval**
> ChangeRequestModel removeChangeRequestApproval(changeRequestId)

Remove Approval

Removes your existing approval from the Change Request.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.ChangeRequestsApprovalFlowScheduledChangesBetaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ChangeRequestsApprovalFlowScheduledChangesBetaApi apiInstance = new ChangeRequestsApprovalFlowScheduledChangesBetaApi(defaultClient);
    Long changeRequestId = 56L; // Long | The identifier of the Change Request.
    try {
      ChangeRequestModel result = apiInstance.removeChangeRequestApproval(changeRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeRequestsApprovalFlowScheduledChangesBetaApi#removeChangeRequestApproval");
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
| **changeRequestId** | **Long**| The identifier of the Change Request. | |

### Return type

[**ChangeRequestModel**](ChangeRequestModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When removing the approval was successful. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="resolveChangeRequestSettingConflicts"></a>
# **resolveChangeRequestSettingConflicts**
> ChangeRequestModel resolveChangeRequestSettingConflicts(changeRequestId, settingId, resolveChangeRequestSettingConflictsModel)

Resolve Setting Conflicts

Updates the proposed changes to a Setting included in the Change Request to resolve conflicts caused by concurrently published changes.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.ChangeRequestsApprovalFlowScheduledChangesBetaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ChangeRequestsApprovalFlowScheduledChangesBetaApi apiInstance = new ChangeRequestsApprovalFlowScheduledChangesBetaApi(defaultClient);
    Long changeRequestId = 56L; // Long | The identifier of the Change Request.
    Integer settingId = 56; // Integer | The identifier of the Setting.
    ResolveChangeRequestSettingConflictsModel resolveChangeRequestSettingConflictsModel = new ResolveChangeRequestSettingConflictsModel(); // ResolveChangeRequestSettingConflictsModel | 
    try {
      ChangeRequestModel result = apiInstance.resolveChangeRequestSettingConflicts(changeRequestId, settingId, resolveChangeRequestSettingConflictsModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeRequestsApprovalFlowScheduledChangesBetaApi#resolveChangeRequestSettingConflicts");
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
| **changeRequestId** | **Long**| The identifier of the Change Request. | |
| **settingId** | **Integer**| The identifier of the Setting. | |
| **resolveChangeRequestSettingConflictsModel** | [**ResolveChangeRequestSettingConflictsModel**](ResolveChangeRequestSettingConflictsModel.md)|  | |

### Return type

[**ChangeRequestModel**](ChangeRequestModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When the conflict resolution was successful. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="updateChangeRequest"></a>
# **updateChangeRequest**
> ChangeRequestModel updateChangeRequest(changeRequestId, updateChangeRequestModel)

Update Change Request

Updates the metadata of a Change Request, such as title, note, schedule, etc.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.ChangeRequestsApprovalFlowScheduledChangesBetaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ChangeRequestsApprovalFlowScheduledChangesBetaApi apiInstance = new ChangeRequestsApprovalFlowScheduledChangesBetaApi(defaultClient);
    Long changeRequestId = 56L; // Long | The identifier of the Change Request.
    UpdateChangeRequestModel updateChangeRequestModel = new UpdateChangeRequestModel(); // UpdateChangeRequestModel | 
    try {
      ChangeRequestModel result = apiInstance.updateChangeRequest(changeRequestId, updateChangeRequestModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeRequestsApprovalFlowScheduledChangesBetaApi#updateChangeRequest");
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
| **changeRequestId** | **Long**| The identifier of the Change Request. | |
| **updateChangeRequestModel** | [**UpdateChangeRequestModel**](UpdateChangeRequestModel.md)|  | |

### Return type

[**ChangeRequestModel**](ChangeRequestModel.md)

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

<a id="updateChangeRequestComment"></a>
# **updateChangeRequestComment**
> ChangeRequestCommentModel updateChangeRequestComment(commentId, updateChangeRequestCommentModel)

Update Comment

Updates an existing Change Request comment.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.ChangeRequestsApprovalFlowScheduledChangesBetaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ChangeRequestsApprovalFlowScheduledChangesBetaApi apiInstance = new ChangeRequestsApprovalFlowScheduledChangesBetaApi(defaultClient);
    Long commentId = 56L; // Long | The identifier of the Change Request comment.
    UpdateChangeRequestCommentModel updateChangeRequestCommentModel = new UpdateChangeRequestCommentModel(); // UpdateChangeRequestCommentModel | 
    try {
      ChangeRequestCommentModel result = apiInstance.updateChangeRequestComment(commentId, updateChangeRequestCommentModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeRequestsApprovalFlowScheduledChangesBetaApi#updateChangeRequestComment");
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
| **commentId** | **Long**| The identifier of the Change Request comment. | |
| **updateChangeRequestCommentModel** | [**UpdateChangeRequestCommentModel**](UpdateChangeRequestCommentModel.md)|  | |

### Return type

[**ChangeRequestCommentModel**](ChangeRequestCommentModel.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When updating the comment was successful. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="updateChangeRequestProposedChanges"></a>
# **updateChangeRequestProposedChanges**
> ChangeRequestModel updateChangeRequestProposedChanges(changeRequestId, updateChangeRequestProposedChangesModel, settingId)

Update Settings included in Change Request

Updates the proposed changes to the Settings included in a Change Request.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.ChangeRequestsApprovalFlowScheduledChangesBetaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ChangeRequestsApprovalFlowScheduledChangesBetaApi apiInstance = new ChangeRequestsApprovalFlowScheduledChangesBetaApi(defaultClient);
    Long changeRequestId = 56L; // Long | The identifier of the Change Request.
    UpdateChangeRequestProposedChangesModel updateChangeRequestProposedChangesModel = new UpdateChangeRequestProposedChangesModel(); // UpdateChangeRequestProposedChangesModel | 
    Integer settingId = 56; // Integer | The optional identifier of the Setting.
    try {
      ChangeRequestModel result = apiInstance.updateChangeRequestProposedChanges(changeRequestId, updateChangeRequestProposedChangesModel, settingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeRequestsApprovalFlowScheduledChangesBetaApi#updateChangeRequestProposedChanges");
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
| **changeRequestId** | **Long**| The identifier of the Change Request. | |
| **updateChangeRequestProposedChangesModel** | [**UpdateChangeRequestProposedChangesModel**](UpdateChangeRequestProposedChangesModel.md)|  | |
| **settingId** | **Integer**| The optional identifier of the Setting. | [optional] |

### Return type

[**ChangeRequestModel**](ChangeRequestModel.md)

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

