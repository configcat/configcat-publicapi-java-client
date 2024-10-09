# AuditLogsApi

All URIs are relative to *https://api.configcat.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAuditlogs**](AuditLogsApi.md#getAuditlogs) | **GET** /v1/products/{productId}/auditlogs | List Audit log items for Product |
| [**getDeletedSettings**](AuditLogsApi.md#getDeletedSettings) | **GET** /v1/configs/{configId}/deleted-settings | List Deleted Settings |
| [**getOrganizationAuditlogs**](AuditLogsApi.md#getOrganizationAuditlogs) | **GET** /v1/organizations/{organizationId}/auditlogs | List Audit log items for Organization |


<a id="getAuditlogs"></a>
# **getAuditlogs**
> List&lt;AuditLogItemModel&gt; getAuditlogs(productId, configId, environmentId, auditLogType, fromUtcDateTime, toUtcDateTime)

List Audit log items for Product

This endpoint returns the list of Audit log items for a given Product  and the result can be optionally filtered by Config and/or Environment.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.AuditLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    AuditLogsApi apiInstance = new AuditLogsApi(defaultClient);
    UUID productId = UUID.randomUUID(); // UUID | The identifier of the Product.
    UUID configId = UUID.randomUUID(); // UUID | The identifier of the Config.
    UUID environmentId = UUID.randomUUID(); // UUID | The identifier of the Environment.
    AuditLogType auditLogType = AuditLogType.fromValue("productCreated"); // AuditLogType | Filter Audit logs by Audit log type.
    OffsetDateTime fromUtcDateTime = OffsetDateTime.now(); // OffsetDateTime | Filter Audit logs by starting UTC date.
    OffsetDateTime toUtcDateTime = OffsetDateTime.now(); // OffsetDateTime | Filter Audit logs by ending UTC date.
    try {
      List<AuditLogItemModel> result = apiInstance.getAuditlogs(productId, configId, environmentId, auditLogType, fromUtcDateTime, toUtcDateTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditLogsApi#getAuditlogs");
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
| **configId** | **UUID**| The identifier of the Config. | [optional] |
| **environmentId** | **UUID**| The identifier of the Environment. | [optional] |
| **auditLogType** | [**AuditLogType**](.md)| Filter Audit logs by Audit log type. | [optional] [enum: productCreated, productChanged, productOwnershipTransferred, productDeleted, productsReordered, teamMemberInvited, teamMemberInvitationRevoked, teamMemberJoined, teamMemberPermissionGroupChanged, teamMemberRemoved, teamMemberLeft, teamMemberInvitationChanged, teamMemberInvitationResent, teamMemberInvitationRejected, configCreated, configChanged, configDeleted, configsReordered, environmentCreated, environmentChanged, environmentDeleted, environmentsReordered, settingCreated, settingChanged, settingDeleted, settingsReordered, settingValueChanged, webHookCreated, webHookChanged, webHookDeleted, permissionGroupCreated, permissionGroupChanged, permissionGroupDeleted, permissionGroupDefault, apiKeyAdded, apiKeyRemoved, integrationAdded, integrationChanged, integrationRemoved, apiKeyConnected, integrationLinkAdded, integrationLinkRemoved, organizationAdded, organizationRemoved, organizationChanged, organizationSubscriptionTypeChanged, organizationAdminChanged, organizationAdminLeft, twoFactorDisabledForMember, tagAdded, tagChanged, tagRemoved, settingTagAdded, settingTagRemoved, publicApiAccessTokenAdded, publicApiAccessTokenRemoved, domainAdded, domainVerified, domainRemoved, domainSamlConfigured, domainSamlDeleted, autoProvisioningConfigurationChanged, samlIdpConfigurationAdded, samlIdpConfigurationRemoved, samlIdpConfigurationUpdated, organizationMemberJoined, organizationMemberProductJoinRequested, organizationMemberProductJoinRequestRejected, organizationMemberProductJoinRequestApproved, organizationMemberRemoved, codeReferencesUploaded, codeReferenceDeleted, codeReferenceStaleBranchDeleted, segmentCreated, segmentChanged, segmentDeleted, webhookSigningKeyDeleted, webhookSigningKeyCreated] |
| **fromUtcDateTime** | **OffsetDateTime**| Filter Audit logs by starting UTC date. | [optional] |
| **toUtcDateTime** | **OffsetDateTime**| Filter Audit logs by ending UTC date. | [optional] |

### Return type

[**List&lt;AuditLogItemModel&gt;**](AuditLogItemModel.md)

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

<a id="getDeletedSettings"></a>
# **getDeletedSettings**
> List&lt;SettingModel&gt; getDeletedSettings(configId)

List Deleted Settings

This endpoint returns the list of Feature Flags and Settings that were deleted from the given Config.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.AuditLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    AuditLogsApi apiInstance = new AuditLogsApi(defaultClient);
    UUID configId = UUID.randomUUID(); // UUID | The identifier of the Config.
    try {
      List<SettingModel> result = apiInstance.getDeletedSettings(configId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditLogsApi#getDeletedSettings");
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

### Return type

[**List&lt;SettingModel&gt;**](SettingModel.md)

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

<a id="getOrganizationAuditlogs"></a>
# **getOrganizationAuditlogs**
> List&lt;AuditLogItemModel&gt; getOrganizationAuditlogs(organizationId, productId, configId, environmentId, auditLogType, fromUtcDateTime, toUtcDateTime)

List Audit log items for Organization

This endpoint returns the list of Audit log items for a given Organization  and the result can be optionally filtered by Product and/or Config and/or Environment.

### Example
```java
// Import classes:
import com.configcat.publicapi.java.client.ApiClient;
import com.configcat.publicapi.java.client.ApiException;
import com.configcat.publicapi.java.client.Configuration;
import com.configcat.publicapi.java.client.auth.*;
import com.configcat.publicapi.java.client.models.*;
import com.configcat.publicapi.java.client.api.AuditLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.configcat.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    AuditLogsApi apiInstance = new AuditLogsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | The identifier of the Organization.
    UUID productId = UUID.randomUUID(); // UUID | The identifier of the Product.
    UUID configId = UUID.randomUUID(); // UUID | The identifier of the Config.
    UUID environmentId = UUID.randomUUID(); // UUID | The identifier of the Environment.
    AuditLogType auditLogType = AuditLogType.fromValue("productCreated"); // AuditLogType | Filter Audit logs by Audit log type.
    OffsetDateTime fromUtcDateTime = OffsetDateTime.now(); // OffsetDateTime | Filter Audit logs by starting UTC date.
    OffsetDateTime toUtcDateTime = OffsetDateTime.now(); // OffsetDateTime | Filter Audit logs by ending UTC date.
    try {
      List<AuditLogItemModel> result = apiInstance.getOrganizationAuditlogs(organizationId, productId, configId, environmentId, auditLogType, fromUtcDateTime, toUtcDateTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditLogsApi#getOrganizationAuditlogs");
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
| **productId** | **UUID**| The identifier of the Product. | [optional] |
| **configId** | **UUID**| The identifier of the Config. | [optional] |
| **environmentId** | **UUID**| The identifier of the Environment. | [optional] |
| **auditLogType** | [**AuditLogType**](.md)| Filter Audit logs by Audit log type. | [optional] [enum: productCreated, productChanged, productOwnershipTransferred, productDeleted, productsReordered, teamMemberInvited, teamMemberInvitationRevoked, teamMemberJoined, teamMemberPermissionGroupChanged, teamMemberRemoved, teamMemberLeft, teamMemberInvitationChanged, teamMemberInvitationResent, teamMemberInvitationRejected, configCreated, configChanged, configDeleted, configsReordered, environmentCreated, environmentChanged, environmentDeleted, environmentsReordered, settingCreated, settingChanged, settingDeleted, settingsReordered, settingValueChanged, webHookCreated, webHookChanged, webHookDeleted, permissionGroupCreated, permissionGroupChanged, permissionGroupDeleted, permissionGroupDefault, apiKeyAdded, apiKeyRemoved, integrationAdded, integrationChanged, integrationRemoved, apiKeyConnected, integrationLinkAdded, integrationLinkRemoved, organizationAdded, organizationRemoved, organizationChanged, organizationSubscriptionTypeChanged, organizationAdminChanged, organizationAdminLeft, twoFactorDisabledForMember, tagAdded, tagChanged, tagRemoved, settingTagAdded, settingTagRemoved, publicApiAccessTokenAdded, publicApiAccessTokenRemoved, domainAdded, domainVerified, domainRemoved, domainSamlConfigured, domainSamlDeleted, autoProvisioningConfigurationChanged, samlIdpConfigurationAdded, samlIdpConfigurationRemoved, samlIdpConfigurationUpdated, organizationMemberJoined, organizationMemberProductJoinRequested, organizationMemberProductJoinRequestRejected, organizationMemberProductJoinRequestApproved, organizationMemberRemoved, codeReferencesUploaded, codeReferenceDeleted, codeReferenceStaleBranchDeleted, segmentCreated, segmentChanged, segmentDeleted, webhookSigningKeyDeleted, webhookSigningKeyCreated] |
| **fromUtcDateTime** | **OffsetDateTime**| Filter Audit logs by starting UTC date. | [optional] |
| **toUtcDateTime** | **OffsetDateTime**| Filter Audit logs by ending UTC date. | [optional] |

### Return type

[**List&lt;AuditLogItemModel&gt;**](AuditLogItemModel.md)

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

