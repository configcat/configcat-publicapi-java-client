# configcat-publicapi-java-client

ConfigCat Public Management API
- API version: v1
  - Build date: 2025-06-10T21:25:35.532049258Z[Etc/UTC]
  - Generator version: 7.7.0

The purpose of this API is to access the ConfigCat platform programmatically.
You can **Create**, **Read**, **Update** and **Delete** any entities like **Feature Flags, Configs, Environments** or **Products** within ConfigCat.

**Base API URL**: https://api.configcat.com

If you prefer the swagger documentation, you can find it here: [Swagger UI](https://api.configcat.com/swagger).

The API is based on HTTP REST, uses resource-oriented URLs, status codes and supports JSON 
format. 

**Important:** Do not use this API for accessing and evaluating feature flag values. Use the [SDKs](https://configcat.com/docs/sdk-reference/overview) or the [ConfigCat Proxy](https://configcat.com/docs/advanced/proxy/proxy-overview/) instead.

# OpenAPI Specification

The complete specification is publicly available in the following formats: 
- [OpenAPI v3](https://api.configcat.com/docs/v1/swagger.json)
- [Swagger v2](https://api.configcat.com/docs/v1/swagger.v2.json)

You can use it to generate client libraries in various languages with [OpenAPI Generator](https://github.com/OpenAPITools/openapi-generator) or
[Swagger Codegen](https://swagger.io/tools/swagger-codegen/) to interact with this API.

# Authentication
This API uses the [Basic HTTP Authentication Scheme](https://en.wikipedia.org/wiki/Basic_access_authentication). 

<!-- ReDoc-Inject: <security-definitions> -->

# Throttling and rate limits
All the rate limited API calls are returning information about the current rate limit period in the following HTTP headers:

| Header | Description |
| :- | :- |
| X-Rate-Limit-Remaining | The maximum number of requests remaining in the current rate limit period. |
| X-Rate-Limit-Reset     | The time when the current rate limit period resets.        |

When the rate limit is exceeded by a request, the API returns with a `HTTP 429 - Too many requests` status along with a `Retry-After` HTTP header.


  For more information, please visit [https://configcat.com](https://configcat.com)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.configcat</groupId>
  <artifactId>configcat-publicapi-java-client</artifactId>
  <version>v1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'configcat-publicapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'configcat-publicapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.configcat:configcat-publicapi-java-client:v1"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/configcat-publicapi-java-client-v1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.configcat.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuditLogsApi* | [**getAuditlogs**](docs/AuditLogsApi.md#getAuditlogs) | **GET** /v1/products/{productId}/auditlogs | List Audit log items for Product
*AuditLogsApi* | [**getDeletedSettings**](docs/AuditLogsApi.md#getDeletedSettings) | **GET** /v1/configs/{configId}/deleted-settings | List Deleted Settings
*AuditLogsApi* | [**getOrganizationAuditlogs**](docs/AuditLogsApi.md#getOrganizationAuditlogs) | **GET** /v1/organizations/{organizationId}/auditlogs | List Audit log items for Organization
*CodeReferencesApi* | [**v1CodeReferencesDeleteReportsPost**](docs/CodeReferencesApi.md#v1CodeReferencesDeleteReportsPost) | **POST** /v1/code-references/delete-reports | Delete Reference reports
*CodeReferencesApi* | [**v1CodeReferencesPost**](docs/CodeReferencesApi.md#v1CodeReferencesPost) | **POST** /v1/code-references | Upload References
*CodeReferencesApi* | [**v1SettingsSettingIdCodeReferencesGet**](docs/CodeReferencesApi.md#v1SettingsSettingIdCodeReferencesGet) | **GET** /v1/settings/{settingId}/code-references | Get References for Feature Flag or Setting
*ConfigsApi* | [**createConfig**](docs/ConfigsApi.md#createConfig) | **POST** /v1/products/{productId}/configs | Create Config
*ConfigsApi* | [**deleteConfig**](docs/ConfigsApi.md#deleteConfig) | **DELETE** /v1/configs/{configId} | Delete Config
*ConfigsApi* | [**getConfig**](docs/ConfigsApi.md#getConfig) | **GET** /v1/configs/{configId} | Get Config
*ConfigsApi* | [**getConfigs**](docs/ConfigsApi.md#getConfigs) | **GET** /v1/products/{productId}/configs | List Configs
*ConfigsApi* | [**updateConfig**](docs/ConfigsApi.md#updateConfig) | **PUT** /v1/configs/{configId} | Update Config
*EnvironmentsApi* | [**createEnvironment**](docs/EnvironmentsApi.md#createEnvironment) | **POST** /v1/products/{productId}/environments | Create Environment
*EnvironmentsApi* | [**deleteEnvironment**](docs/EnvironmentsApi.md#deleteEnvironment) | **DELETE** /v1/environments/{environmentId} | Delete Environment
*EnvironmentsApi* | [**getEnvironment**](docs/EnvironmentsApi.md#getEnvironment) | **GET** /v1/environments/{environmentId} | Get Environment
*EnvironmentsApi* | [**getEnvironments**](docs/EnvironmentsApi.md#getEnvironments) | **GET** /v1/products/{productId}/environments | List Environments
*EnvironmentsApi* | [**updateEnvironment**](docs/EnvironmentsApi.md#updateEnvironment) | **PUT** /v1/environments/{environmentId} | Update Environment
*FeatureFlagSettingValuesApi* | [**getSettingValue**](docs/FeatureFlagSettingValuesApi.md#getSettingValue) | **GET** /v1/environments/{environmentId}/settings/{settingId}/value | Get value
*FeatureFlagSettingValuesApi* | [**getSettingValues**](docs/FeatureFlagSettingValuesApi.md#getSettingValues) | **GET** /v1/configs/{configId}/environments/{environmentId}/values | Get values
*FeatureFlagSettingValuesApi* | [**postSettingValues**](docs/FeatureFlagSettingValuesApi.md#postSettingValues) | **POST** /v1/configs/{configId}/environments/{environmentId}/values | Post values
*FeatureFlagSettingValuesApi* | [**replaceSettingValue**](docs/FeatureFlagSettingValuesApi.md#replaceSettingValue) | **PUT** /v1/environments/{environmentId}/settings/{settingId}/value | Replace value
*FeatureFlagSettingValuesApi* | [**updateSettingValue**](docs/FeatureFlagSettingValuesApi.md#updateSettingValue) | **PATCH** /v1/environments/{environmentId}/settings/{settingId}/value | Update value
*FeatureFlagSettingValuesUsingSdkKeyApi* | [**getSettingValueBySdkkey**](docs/FeatureFlagSettingValuesUsingSdkKeyApi.md#getSettingValueBySdkkey) | **GET** /v1/settings/{settingKeyOrId}/value | Get value
*FeatureFlagSettingValuesUsingSdkKeyApi* | [**replaceSettingValueBySdkkey**](docs/FeatureFlagSettingValuesUsingSdkKeyApi.md#replaceSettingValueBySdkkey) | **PUT** /v1/settings/{settingKeyOrId}/value | Replace value
*FeatureFlagSettingValuesUsingSdkKeyApi* | [**updateSettingValueBySdkkey**](docs/FeatureFlagSettingValuesUsingSdkKeyApi.md#updateSettingValueBySdkkey) | **PATCH** /v1/settings/{settingKeyOrId}/value | Update value
*FeatureFlagSettingValuesUsingSdkKeyV2Api* | [**getSettingValueBySdkkeyV2**](docs/FeatureFlagSettingValuesUsingSdkKeyV2Api.md#getSettingValueBySdkkeyV2) | **GET** /v2/settings/{settingKeyOrId}/value | Get value
*FeatureFlagSettingValuesUsingSdkKeyV2Api* | [**replaceSettingValueBySdkkeyV2**](docs/FeatureFlagSettingValuesUsingSdkKeyV2Api.md#replaceSettingValueBySdkkeyV2) | **PUT** /v2/settings/{settingKeyOrId}/value | Replace value
*FeatureFlagSettingValuesUsingSdkKeyV2Api* | [**updateSettingValueBySdkkeyV2**](docs/FeatureFlagSettingValuesUsingSdkKeyV2Api.md#updateSettingValueBySdkkeyV2) | **PATCH** /v2/settings/{settingKeyOrId}/value | Update value
*FeatureFlagSettingValuesV2Api* | [**getSettingValueV2**](docs/FeatureFlagSettingValuesV2Api.md#getSettingValueV2) | **GET** /v2/environments/{environmentId}/settings/{settingId}/value | Get value
*FeatureFlagSettingValuesV2Api* | [**getSettingValuesV2**](docs/FeatureFlagSettingValuesV2Api.md#getSettingValuesV2) | **GET** /v2/configs/{configId}/environments/{environmentId}/values | Get values
*FeatureFlagSettingValuesV2Api* | [**postSettingValuesV2**](docs/FeatureFlagSettingValuesV2Api.md#postSettingValuesV2) | **POST** /v2/configs/{configId}/environments/{environmentId}/values | Post values
*FeatureFlagSettingValuesV2Api* | [**replaceSettingValueV2**](docs/FeatureFlagSettingValuesV2Api.md#replaceSettingValueV2) | **PUT** /v2/environments/{environmentId}/settings/{settingId}/value | Replace value
*FeatureFlagSettingValuesV2Api* | [**updateSettingValueV2**](docs/FeatureFlagSettingValuesV2Api.md#updateSettingValueV2) | **PATCH** /v2/environments/{environmentId}/settings/{settingId}/value | Update value
*FeatureFlagsSettingsApi* | [**createSetting**](docs/FeatureFlagsSettingsApi.md#createSetting) | **POST** /v1/configs/{configId}/settings | Create Flag
*FeatureFlagsSettingsApi* | [**deleteSetting**](docs/FeatureFlagsSettingsApi.md#deleteSetting) | **DELETE** /v1/settings/{settingId} | Delete Flag
*FeatureFlagsSettingsApi* | [**getSetting**](docs/FeatureFlagsSettingsApi.md#getSetting) | **GET** /v1/settings/{settingId} | Get Flag
*FeatureFlagsSettingsApi* | [**getSettings**](docs/FeatureFlagsSettingsApi.md#getSettings) | **GET** /v1/configs/{configId}/settings | List Flags
*FeatureFlagsSettingsApi* | [**replaceSetting**](docs/FeatureFlagsSettingsApi.md#replaceSetting) | **PUT** /v1/settings/{settingId} | Replace Flag
*FeatureFlagsSettingsApi* | [**updateSetting**](docs/FeatureFlagsSettingsApi.md#updateSetting) | **PATCH** /v1/settings/{settingId} | Update Flag
*IntegrationLinksApi* | [**addOrUpdateIntegrationLink**](docs/IntegrationLinksApi.md#addOrUpdateIntegrationLink) | **POST** /v1/environments/{environmentId}/settings/{settingId}/integrationLinks/{integrationLinkType}/{key} | Add or update Integration link
*IntegrationLinksApi* | [**deleteIntegrationLink**](docs/IntegrationLinksApi.md#deleteIntegrationLink) | **DELETE** /v1/environments/{environmentId}/settings/{settingId}/integrationLinks/{integrationLinkType}/{key} | Delete Integration link
*IntegrationLinksApi* | [**getIntegrationLinkDetails**](docs/IntegrationLinksApi.md#getIntegrationLinkDetails) | **GET** /v1/integrationLink/{integrationLinkType}/{key}/details | Get Integration link
*IntegrationLinksApi* | [**jiraAddOrUpdateIntegrationLink**](docs/IntegrationLinksApi.md#jiraAddOrUpdateIntegrationLink) | **POST** /v1/jira/environments/{environmentId}/settings/{settingId}/integrationLinks/{key} | 
*IntegrationLinksApi* | [**jiraConnect**](docs/IntegrationLinksApi.md#jiraConnect) | **POST** /v1/jira/connect | 
*IntegrationsApi* | [**createIntegration**](docs/IntegrationsApi.md#createIntegration) | **POST** /v1/products/{productId}/integrations | Create Integration
*IntegrationsApi* | [**deleteIntegration**](docs/IntegrationsApi.md#deleteIntegration) | **DELETE** /v1/integrations/{integrationId} | Delete Integration
*IntegrationsApi* | [**getIntegration**](docs/IntegrationsApi.md#getIntegration) | **GET** /v1/integrations/{integrationId} | Get Integration
*IntegrationsApi* | [**getIntegrations**](docs/IntegrationsApi.md#getIntegrations) | **GET** /v1/products/{productId}/integrations | List Integrations
*IntegrationsApi* | [**updateIntegration**](docs/IntegrationsApi.md#updateIntegration) | **PUT** /v1/integrations/{integrationId} | Update Integration
*MeApi* | [**getMe**](docs/MeApi.md#getMe) | **GET** /v1/me | Get authenticated user details
*MembersApi* | [**addMemberToGroup**](docs/MembersApi.md#addMemberToGroup) | **POST** /v1/organizations/{organizationId}/members/{userId} | Update Member Permissions
*MembersApi* | [**deleteInvitation**](docs/MembersApi.md#deleteInvitation) | **DELETE** /v1/invitations/{invitationId} | Delete Invitation
*MembersApi* | [**deleteOrganizationMember**](docs/MembersApi.md#deleteOrganizationMember) | **DELETE** /v1/organizations/{organizationId}/members/{userId} | Delete Member from Organization
*MembersApi* | [**deleteProductMember**](docs/MembersApi.md#deleteProductMember) | **DELETE** /v1/products/{productId}/members/{userId} | Delete Member from Product
*MembersApi* | [**getOrganizationMembers**](docs/MembersApi.md#getOrganizationMembers) | **GET** /v1/organizations/{organizationId}/members | List Organization Members
*MembersApi* | [**getOrganizationMembersV2**](docs/MembersApi.md#getOrganizationMembersV2) | **GET** /v2/organizations/{organizationId}/members | List Organization Members
*MembersApi* | [**getPendingInvitations**](docs/MembersApi.md#getPendingInvitations) | **GET** /v1/products/{productId}/invitations | List Pending Invitations in Product
*MembersApi* | [**getPendingInvitationsOrg**](docs/MembersApi.md#getPendingInvitationsOrg) | **GET** /v1/organizations/{organizationId}/invitations | List Pending Invitations in Organization
*MembersApi* | [**getProductMembers**](docs/MembersApi.md#getProductMembers) | **GET** /v1/products/{productId}/members | List Product Members
*MembersApi* | [**inviteMember**](docs/MembersApi.md#inviteMember) | **POST** /v1/products/{productId}/members/invite | Invite Member
*OrganizationsApi* | [**getOrganizations**](docs/OrganizationsApi.md#getOrganizations) | **GET** /v1/organizations | List Organizations
*PermissionGroupsApi* | [**createPermissionGroup**](docs/PermissionGroupsApi.md#createPermissionGroup) | **POST** /v1/products/{productId}/permissions | Create Permission Group
*PermissionGroupsApi* | [**deletePermissionGroup**](docs/PermissionGroupsApi.md#deletePermissionGroup) | **DELETE** /v1/permissions/{permissionGroupId} | Delete Permission Group
*PermissionGroupsApi* | [**getPermissionGroup**](docs/PermissionGroupsApi.md#getPermissionGroup) | **GET** /v1/permissions/{permissionGroupId} | Get Permission Group
*PermissionGroupsApi* | [**getPermissionGroups**](docs/PermissionGroupsApi.md#getPermissionGroups) | **GET** /v1/products/{productId}/permissions | List Permission Groups
*PermissionGroupsApi* | [**updatePermissionGroup**](docs/PermissionGroupsApi.md#updatePermissionGroup) | **PUT** /v1/permissions/{permissionGroupId} | Update Permission Group
*ProductsApi* | [**createProduct**](docs/ProductsApi.md#createProduct) | **POST** /v1/organizations/{organizationId}/products | Create Product
*ProductsApi* | [**deleteProduct**](docs/ProductsApi.md#deleteProduct) | **DELETE** /v1/products/{productId} | Delete Product
*ProductsApi* | [**getProduct**](docs/ProductsApi.md#getProduct) | **GET** /v1/products/{productId} | Get Product
*ProductsApi* | [**getProductPreferences**](docs/ProductsApi.md#getProductPreferences) | **GET** /v1/products/{productId}/preferences | Get Product Preferences
*ProductsApi* | [**getProducts**](docs/ProductsApi.md#getProducts) | **GET** /v1/products | List Products
*ProductsApi* | [**updateProduct**](docs/ProductsApi.md#updateProduct) | **PUT** /v1/products/{productId} | Update Product
*ProductsApi* | [**updateProductPreferences**](docs/ProductsApi.md#updateProductPreferences) | **POST** /v1/products/{productId}/preferences | Update Product Preferences
*SdkKeysApi* | [**getSdkKeys**](docs/SdkKeysApi.md#getSdkKeys) | **GET** /v1/configs/{configId}/environments/{environmentId} | Get SDK Key
*SegmentsApi* | [**createSegment**](docs/SegmentsApi.md#createSegment) | **POST** /v1/products/{productId}/segments | Create Segment
*SegmentsApi* | [**deleteSegment**](docs/SegmentsApi.md#deleteSegment) | **DELETE** /v1/segments/{segmentId} | Delete Segment
*SegmentsApi* | [**getSegment**](docs/SegmentsApi.md#getSegment) | **GET** /v1/segments/{segmentId} | Get Segment
*SegmentsApi* | [**getSegments**](docs/SegmentsApi.md#getSegments) | **GET** /v1/products/{productId}/segments | List Segments
*SegmentsApi* | [**updateSegment**](docs/SegmentsApi.md#updateSegment) | **PUT** /v1/segments/{segmentId} | Update Segment
*TagsApi* | [**createTag**](docs/TagsApi.md#createTag) | **POST** /v1/products/{productId}/tags | Create Tag
*TagsApi* | [**deleteTag**](docs/TagsApi.md#deleteTag) | **DELETE** /v1/tags/{tagId} | Delete Tag
*TagsApi* | [**getSettingsByTag**](docs/TagsApi.md#getSettingsByTag) | **GET** /v1/tags/{tagId}/settings | List Settings by Tag
*TagsApi* | [**getTag**](docs/TagsApi.md#getTag) | **GET** /v1/tags/{tagId} | Get Tag
*TagsApi* | [**getTags**](docs/TagsApi.md#getTags) | **GET** /v1/products/{productId}/tags | List Tags
*TagsApi* | [**updateTag**](docs/TagsApi.md#updateTag) | **PUT** /v1/tags/{tagId} | Update Tag
*WebhooksApi* | [**createWebhook**](docs/WebhooksApi.md#createWebhook) | **POST** /v1/configs/{configId}/environments/{environmentId}/webhooks | Create Webhook
*WebhooksApi* | [**deleteWebhook**](docs/WebhooksApi.md#deleteWebhook) | **DELETE** /v1/webhooks/{webhookId} | Delete Webhook
*WebhooksApi* | [**getWebhook**](docs/WebhooksApi.md#getWebhook) | **GET** /v1/webhooks/{webhookId} | Get Webhook
*WebhooksApi* | [**getWebhookSigningKeys**](docs/WebhooksApi.md#getWebhookSigningKeys) | **GET** /v1/webhooks/{webhookId}/keys | Get Webhook Signing Keys
*WebhooksApi* | [**getWebhooks**](docs/WebhooksApi.md#getWebhooks) | **GET** /v1/products/{productId}/webhooks | List Webhooks
*WebhooksApi* | [**replaceWebhook**](docs/WebhooksApi.md#replaceWebhook) | **PUT** /v1/webhooks/{webhookId} | Replace Webhook
*WebhooksApi* | [**updateWebhook**](docs/WebhooksApi.md#updateWebhook) | **PATCH** /v1/webhooks/{webhookId} | Update Webhook
*ZombieStaleFlagsApi* | [**getStaleflags**](docs/ZombieStaleFlagsApi.md#getStaleflags) | **GET** /v1/products/{productId}/staleflags | List Zombie (stale) flags for Product


## Documentation for Models

 - [AccessType](docs/AccessType.md)
 - [AddOrUpdateIntegrationLinkModel](docs/AddOrUpdateIntegrationLinkModel.md)
 - [AddOrUpdateJiraIntegrationLinkModel](docs/AddOrUpdateJiraIntegrationLinkModel.md)
 - [AuditLogItemModel](docs/AuditLogItemModel.md)
 - [AuditLogType](docs/AuditLogType.md)
 - [CodeReferenceModel](docs/CodeReferenceModel.md)
 - [CodeReferenceRequest](docs/CodeReferenceRequest.md)
 - [ComparisonValueListModel](docs/ComparisonValueListModel.md)
 - [ComparisonValueModel](docs/ComparisonValueModel.md)
 - [ConditionModel](docs/ConditionModel.md)
 - [ConfigModel](docs/ConfigModel.md)
 - [ConfigSettingFormulaModel](docs/ConfigSettingFormulaModel.md)
 - [ConfigSettingFormulasModel](docs/ConfigSettingFormulasModel.md)
 - [ConfigSettingValueModel](docs/ConfigSettingValueModel.md)
 - [ConfigSettingValuesModel](docs/ConfigSettingValuesModel.md)
 - [ConnectRequest](docs/ConnectRequest.md)
 - [CreateConfigRequest](docs/CreateConfigRequest.md)
 - [CreateEnvironmentModel](docs/CreateEnvironmentModel.md)
 - [CreateIntegrationModel](docs/CreateIntegrationModel.md)
 - [CreateOrUpdateEnvironmentAccessModel](docs/CreateOrUpdateEnvironmentAccessModel.md)
 - [CreatePermissionGroupRequest](docs/CreatePermissionGroupRequest.md)
 - [CreateProductRequest](docs/CreateProductRequest.md)
 - [CreateSegmentModel](docs/CreateSegmentModel.md)
 - [CreateSettingInitialValues](docs/CreateSettingInitialValues.md)
 - [CreateTagModel](docs/CreateTagModel.md)
 - [DeleteIntegrationLinkModel](docs/DeleteIntegrationLinkModel.md)
 - [DeleteRepositoryReportsRequest](docs/DeleteRepositoryReportsRequest.md)
 - [DeletedSettingModel](docs/DeletedSettingModel.md)
 - [EnvironmentAccessModel](docs/EnvironmentAccessModel.md)
 - [EnvironmentAccessType](docs/EnvironmentAccessType.md)
 - [EnvironmentModel](docs/EnvironmentModel.md)
 - [EvaluationVersion](docs/EvaluationVersion.md)
 - [FeatureFlagLimitations](docs/FeatureFlagLimitations.md)
 - [FlagReference](docs/FlagReference.md)
 - [InitialValue](docs/InitialValue.md)
 - [IntegrationLinkDetail](docs/IntegrationLinkDetail.md)
 - [IntegrationLinkDetailsModel](docs/IntegrationLinkDetailsModel.md)
 - [IntegrationLinkModel](docs/IntegrationLinkModel.md)
 - [IntegrationLinkType](docs/IntegrationLinkType.md)
 - [IntegrationModel](docs/IntegrationModel.md)
 - [IntegrationType](docs/IntegrationType.md)
 - [IntegrationsModel](docs/IntegrationsModel.md)
 - [InvitationModel](docs/InvitationModel.md)
 - [InviteMembersRequest](docs/InviteMembersRequest.md)
 - [JsonPatchOperation](docs/JsonPatchOperation.md)
 - [KeyGenerationMode](docs/KeyGenerationMode.md)
 - [MeModel](docs/MeModel.md)
 - [MemberModel](docs/MemberModel.md)
 - [ModifyIntegrationRequest](docs/ModifyIntegrationRequest.md)
 - [OperationType](docs/OperationType.md)
 - [OrganizationAdminModel](docs/OrganizationAdminModel.md)
 - [OrganizationInvitationModel](docs/OrganizationInvitationModel.md)
 - [OrganizationMemberModel](docs/OrganizationMemberModel.md)
 - [OrganizationMembersModel](docs/OrganizationMembersModel.md)
 - [OrganizationModel](docs/OrganizationModel.md)
 - [OrganizationPermissionGroupModel](docs/OrganizationPermissionGroupModel.md)
 - [OrganizationPermissionModel](docs/OrganizationPermissionModel.md)
 - [OrganizationProductModel](docs/OrganizationProductModel.md)
 - [PercentageOptionModel](docs/PercentageOptionModel.md)
 - [PermissionGroupModel](docs/PermissionGroupModel.md)
 - [PreferencesModel](docs/PreferencesModel.md)
 - [PrerequisiteComparator](docs/PrerequisiteComparator.md)
 - [PrerequisiteFlagConditionModel](docs/PrerequisiteFlagConditionModel.md)
 - [ProductModel](docs/ProductModel.md)
 - [ReasonRequiredEnvironmentModel](docs/ReasonRequiredEnvironmentModel.md)
 - [ReferenceLineModel](docs/ReferenceLineModel.md)
 - [ReferenceLineRequest](docs/ReferenceLineRequest.md)
 - [ReferenceLinesModel](docs/ReferenceLinesModel.md)
 - [ReferenceLinesRequest](docs/ReferenceLinesRequest.md)
 - [ReplaceSettingModel](docs/ReplaceSettingModel.md)
 - [RolloutPercentageItemModel](docs/RolloutPercentageItemModel.md)
 - [RolloutRuleComparator](docs/RolloutRuleComparator.md)
 - [RolloutRuleModel](docs/RolloutRuleModel.md)
 - [SdkKeysModel](docs/SdkKeysModel.md)
 - [SegmentComparator](docs/SegmentComparator.md)
 - [SegmentConditionModel](docs/SegmentConditionModel.md)
 - [SegmentListModel](docs/SegmentListModel.md)
 - [SegmentModel](docs/SegmentModel.md)
 - [SettingDataModel](docs/SettingDataModel.md)
 - [SettingFormulaModel](docs/SettingFormulaModel.md)
 - [SettingModel](docs/SettingModel.md)
 - [SettingTagModel](docs/SettingTagModel.md)
 - [SettingType](docs/SettingType.md)
 - [SettingValueModel](docs/SettingValueModel.md)
 - [SettingValueType](docs/SettingValueType.md)
 - [StaleFlagConfigModel](docs/StaleFlagConfigModel.md)
 - [StaleFlagEnvironmentModel](docs/StaleFlagEnvironmentModel.md)
 - [StaleFlagProductModel](docs/StaleFlagProductModel.md)
 - [StaleFlagReminderScope](docs/StaleFlagReminderScope.md)
 - [StaleFlagSettingModel](docs/StaleFlagSettingModel.md)
 - [StaleFlagSettingTagModel](docs/StaleFlagSettingTagModel.md)
 - [StaleFlagSettingValueModel](docs/StaleFlagSettingValueModel.md)
 - [StaleFlagStaleInEnvironmentsType](docs/StaleFlagStaleInEnvironmentsType.md)
 - [TagModel](docs/TagModel.md)
 - [TargetingRuleModel](docs/TargetingRuleModel.md)
 - [UpdateComparisonValueListModel](docs/UpdateComparisonValueListModel.md)
 - [UpdateComparisonValueModel](docs/UpdateComparisonValueModel.md)
 - [UpdateConditionModel](docs/UpdateConditionModel.md)
 - [UpdateConfigRequest](docs/UpdateConfigRequest.md)
 - [UpdateEnvironmentModel](docs/UpdateEnvironmentModel.md)
 - [UpdateEvaluationFormulaModel](docs/UpdateEvaluationFormulaModel.md)
 - [UpdateEvaluationFormulaWithIdModel](docs/UpdateEvaluationFormulaWithIdModel.md)
 - [UpdateEvaluationFormulasModel](docs/UpdateEvaluationFormulasModel.md)
 - [UpdateMemberPermissionsRequest](docs/UpdateMemberPermissionsRequest.md)
 - [UpdatePercentageOptionModel](docs/UpdatePercentageOptionModel.md)
 - [UpdatePermissionGroupRequest](docs/UpdatePermissionGroupRequest.md)
 - [UpdatePreferencesRequest](docs/UpdatePreferencesRequest.md)
 - [UpdatePrerequisiteFlagConditionModel](docs/UpdatePrerequisiteFlagConditionModel.md)
 - [UpdateProductRequest](docs/UpdateProductRequest.md)
 - [UpdateReasonRequiredEnvironmentModel](docs/UpdateReasonRequiredEnvironmentModel.md)
 - [UpdateRolloutPercentageItemModel](docs/UpdateRolloutPercentageItemModel.md)
 - [UpdateRolloutRuleModel](docs/UpdateRolloutRuleModel.md)
 - [UpdateSegmentConditionModel](docs/UpdateSegmentConditionModel.md)
 - [UpdateSegmentModel](docs/UpdateSegmentModel.md)
 - [UpdateSettingValueModel](docs/UpdateSettingValueModel.md)
 - [UpdateSettingValueWithSettingIdModel](docs/UpdateSettingValueWithSettingIdModel.md)
 - [UpdateSettingValuesWithIdModel](docs/UpdateSettingValuesWithIdModel.md)
 - [UpdateTagModel](docs/UpdateTagModel.md)
 - [UpdateTargetingRuleModel](docs/UpdateTargetingRuleModel.md)
 - [UpdateUserConditionModel](docs/UpdateUserConditionModel.md)
 - [UpdateValueModel](docs/UpdateValueModel.md)
 - [UserComparator](docs/UserComparator.md)
 - [UserConditionModel](docs/UserConditionModel.md)
 - [UserModel](docs/UserModel.md)
 - [ValueModel](docs/ValueModel.md)
 - [WebHookHttpMethod](docs/WebHookHttpMethod.md)
 - [WebHookRequestModel](docs/WebHookRequestModel.md)
 - [WebhookConfig](docs/WebhookConfig.md)
 - [WebhookEnvironment](docs/WebhookEnvironment.md)
 - [WebhookHeaderModel](docs/WebhookHeaderModel.md)
 - [WebhookHeaderResponseModel](docs/WebhookHeaderResponseModel.md)
 - [WebhookResponseModel](docs/WebhookResponseModel.md)
 - [WebhookSigningKeysModel](docs/WebhookSigningKeysModel.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="Basic"></a>
### Basic

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@configcat.com

