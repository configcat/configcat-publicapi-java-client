# MembersApi

All URIs are relative to *https://api.configcat.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addMemberToGroup**](MembersApi.md#addMemberToGroup) | **POST** /v1/organizations/{organizationId}/members/{userId} | Update Member Permissions |
| [**deleteInvitation**](MembersApi.md#deleteInvitation) | **DELETE** /v1/invitations/{invitationId} | Delete Invitation |
| [**deleteOrganizationMember**](MembersApi.md#deleteOrganizationMember) | **DELETE** /v1/organizations/{organizationId}/members/{userId} | Delete Member from Organization |
| [**deleteProductMember**](MembersApi.md#deleteProductMember) | **DELETE** /v1/products/{productId}/members/{userId} | Delete Member from Product |
| [**getOrganizationMembers**](MembersApi.md#getOrganizationMembers) | **GET** /v1/organizations/{organizationId}/members | List Organization Members |
| [**getOrganizationMembersV2**](MembersApi.md#getOrganizationMembersV2) | **GET** /v2/organizations/{organizationId}/members | List Organization Members |
| [**getPendingInvitations**](MembersApi.md#getPendingInvitations) | **GET** /v1/products/{productId}/invitations | List Pending Invitations in Product |
| [**getPendingInvitationsOrg**](MembersApi.md#getPendingInvitationsOrg) | **GET** /v1/organizations/{organizationId}/invitations | List Pending Invitations in Organization |
| [**getProductMembers**](MembersApi.md#getProductMembers) | **GET** /v1/products/{productId}/members | List Product Members |
| [**inviteMember**](MembersApi.md#inviteMember) | **POST** /v1/products/{productId}/members/invite | Invite Member |


<a id="addMemberToGroup"></a>
# **addMemberToGroup**
> addMemberToGroup(organizationId, userId, updateMemberPermissionsRequest)

Update Member Permissions

This endpoint updates the permissions of a Member identified by the &#x60;userId&#x60;.  This endpoint can also be used to move a Member between Permission Groups within a Product. Only a single Permission Group can be set per Product.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.MembersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    MembersApi apiInstance = new MembersApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | The identifier of the Organization.
    String userId = "userId_example"; // String | The identifier of the Member.
    UpdateMemberPermissionsRequest updateMemberPermissionsRequest = new UpdateMemberPermissionsRequest(); // UpdateMemberPermissionsRequest | 
    try {
      apiInstance.addMemberToGroup(organizationId, userId, updateMemberPermissionsRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling MembersApi#addMemberToGroup");
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
| **userId** | **String**| The identifier of the Member. | |
| **updateMemberPermissionsRequest** | [**UpdateMemberPermissionsRequest**](UpdateMemberPermissionsRequest.md)|  | |

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
| **200** | When the update was successful. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

<a id="deleteInvitation"></a>
# **deleteInvitation**
> deleteInvitation(invitationId)

Delete Invitation

This endpoint removes an Invitation identified by the &#x60;invitationId&#x60; parameter.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.MembersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    MembersApi apiInstance = new MembersApi(defaultClient);
    UUID invitationId = UUID.randomUUID(); // UUID | The identifier of the Invitation.
    try {
      apiInstance.deleteInvitation(invitationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling MembersApi#deleteInvitation");
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
| **invitationId** | **UUID**| The identifier of the Invitation. | |

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

<a id="deleteOrganizationMember"></a>
# **deleteOrganizationMember**
> deleteOrganizationMember(organizationId, userId)

Delete Member from Organization

This endpoint removes a Member identified by the &#x60;userId&#x60; from the  given Organization identified by the &#x60;organizationId&#x60; parameter.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.MembersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    MembersApi apiInstance = new MembersApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | The identifier of the Organization.
    String userId = "userId_example"; // String | The identifier of the Member.
    try {
      apiInstance.deleteOrganizationMember(organizationId, userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling MembersApi#deleteOrganizationMember");
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
| **userId** | **String**| The identifier of the Member. | |

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

<a id="deleteProductMember"></a>
# **deleteProductMember**
> deleteProductMember(productId, userId)

Delete Member from Product

This endpoint removes a Member identified by the &#x60;userId&#x60; from the  given Product identified by the &#x60;productId&#x60; parameter.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.MembersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    MembersApi apiInstance = new MembersApi(defaultClient);
    UUID productId = UUID.randomUUID(); // UUID | The identifier of the Product.
    String userId = "userId_example"; // String | The identifier of the Member.
    try {
      apiInstance.deleteProductMember(productId, userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling MembersApi#deleteProductMember");
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
| **userId** | **String**| The identifier of the Member. | |

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

<a id="getOrganizationMembers"></a>
# **getOrganizationMembers**
> List&lt;UserModel&gt; getOrganizationMembers(organizationId)

List Organization Members

This endpoint returns the list of Members that belongs  to the given Organization, identified by the &#x60;organizationId&#x60; parameter.  The results may vary based on the access level of the user who calls the endpoint:  - When it&#39;s called with Organization Admin privileges, the result will contain each member in the Organization. - When it&#39;s called without Organization Admin privileges, the result will contain each Organization Admin along with members    of those products where the caller has &#x60;Team members and permission groups&#x60; (&#x60;canManageMembers&#x60;) permission.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.MembersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    MembersApi apiInstance = new MembersApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | The identifier of the Organization.
    try {
      List<UserModel> result = apiInstance.getOrganizationMembers(organizationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MembersApi#getOrganizationMembers");
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

### Return type

[**List&lt;UserModel&gt;**](UserModel.md)

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

<a id="getOrganizationMembersV2"></a>
# **getOrganizationMembersV2**
> OrganizationMembersModel getOrganizationMembersV2(organizationId)

List Organization Members

This endpoint returns the list of Members that belongs  to the given Organization, identified by the &#x60;organizationId&#x60; parameter.  The results may vary based on the access level of the user who calls the endpoint:  - When it&#39;s called with Organization Admin privileges, the result will contain each member in the Organization. - When it&#39;s called without Organization Admin privileges, the result will contain each Organization Admin along with members    of those products where the caller has &#x60;Team members and permission groups&#x60; (&#x60;canManageMembers&#x60;) permission.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.MembersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    MembersApi apiInstance = new MembersApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | The identifier of the Organization.
    try {
      OrganizationMembersModel result = apiInstance.getOrganizationMembersV2(organizationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MembersApi#getOrganizationMembersV2");
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

### Return type

[**OrganizationMembersModel**](OrganizationMembersModel.md)

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

<a id="getPendingInvitations"></a>
# **getPendingInvitations**
> List&lt;InvitationModel&gt; getPendingInvitations(productId)

List Pending Invitations in Product

This endpoint returns the list of pending invitations within the given Product identified by the &#x60;productId&#x60; parameter.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.MembersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    MembersApi apiInstance = new MembersApi(defaultClient);
    UUID productId = UUID.randomUUID(); // UUID | The identifier of the Product.
    try {
      List<InvitationModel> result = apiInstance.getPendingInvitations(productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MembersApi#getPendingInvitations");
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

[**List&lt;InvitationModel&gt;**](InvitationModel.md)

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

<a id="getPendingInvitationsOrg"></a>
# **getPendingInvitationsOrg**
> List&lt;OrganizationInvitationModel&gt; getPendingInvitationsOrg(organizationId)

List Pending Invitations in Organization

This endpoint returns the list of pending invitations within the given Organization identified by the &#x60;organizationId&#x60; parameter.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.MembersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    MembersApi apiInstance = new MembersApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | The identifier of the Organization.
    try {
      List<OrganizationInvitationModel> result = apiInstance.getPendingInvitationsOrg(organizationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MembersApi#getPendingInvitationsOrg");
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

### Return type

[**List&lt;OrganizationInvitationModel&gt;**](OrganizationInvitationModel.md)

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

<a id="getProductMembers"></a>
# **getProductMembers**
> List&lt;MemberModel&gt; getProductMembers(productId)

List Product Members

This endpoint returns the list of Members that belongs  to the given Product, identified by the &#x60;productId&#x60; parameter.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.MembersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    MembersApi apiInstance = new MembersApi(defaultClient);
    UUID productId = UUID.randomUUID(); // UUID | The identifier of the Product.
    try {
      List<MemberModel> result = apiInstance.getProductMembers(productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MembersApi#getProductMembers");
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

[**List&lt;MemberModel&gt;**](MemberModel.md)

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

<a id="inviteMember"></a>
# **inviteMember**
> inviteMember(productId, inviteMembersRequest)

Invite Member

This endpoint invites a Member into the given Product identified by the &#x60;productId&#x60; parameter.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.MembersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    MembersApi apiInstance = new MembersApi(defaultClient);
    UUID productId = UUID.randomUUID(); // UUID | The identifier of the Product.
    InviteMembersRequest inviteMembersRequest = new InviteMembersRequest(); // InviteMembersRequest | 
    try {
      apiInstance.inviteMember(productId, inviteMembersRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling MembersApi#inviteMember");
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
| **inviteMembersRequest** | [**InviteMembersRequest**](InviteMembersRequest.md)|  | |

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
| **200** | When the invite was successful. |  -  |
| **400** | Bad request. |  -  |
| **404** | Not found. |  -  |
| **429** | Too many requests. In case of the request rate exceeds the rate limits. |  -  |

