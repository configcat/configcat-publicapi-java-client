

# AuditLogItemModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**auditLogId** | **Long** |  |  [optional] |
|**auditLogDateTime** | **OffsetDateTime** |  |  [optional] |
|**auditLogTypeEnum** | [**AuditLogTypeEnumEnum**](#AuditLogTypeEnumEnum) |  |  [optional] |
|**changeSetId** | **UUID** |  |  [optional] |
|**truncated** | **Boolean** |  |  [optional] |
|**auditLogType** | **String** |  |  [optional] |
|**userEmail** | **String** |  |  [optional] |
|**userName** | **String** |  |  [optional] |
|**where** | **String** |  |  [optional] |
|**why** | **String** |  |  [optional] |
|**actionTarget** | **String** |  |  [optional] |
|**details** | **String** |  |  [optional] |



## Enum: AuditLogTypeEnumEnum

| Name | Value |
|---- | -----|
| PRODUCT_CREATED | &quot;productCreated&quot; |
| PRODUCT_CHANGED | &quot;productChanged&quot; |
| PRODUCT_OWNERSHIP_TRANSFERRED | &quot;productOwnershipTransferred&quot; |
| PRODUCT_DELETED | &quot;productDeleted&quot; |
| PRODUCTS_REORDERED | &quot;productsReordered&quot; |
| TEAM_MEMBER_INVITED | &quot;teamMemberInvited&quot; |
| TEAM_MEMBER_INVITATION_REVOKED | &quot;teamMemberInvitationRevoked&quot; |
| TEAM_MEMBER_JOINED | &quot;teamMemberJoined&quot; |
| TEAM_MEMBER_PERMISSION_GROUP_CHANGED | &quot;teamMemberPermissionGroupChanged&quot; |
| TEAM_MEMBER_REMOVED | &quot;teamMemberRemoved&quot; |
| TEAM_MEMBER_LEFT | &quot;teamMemberLeft&quot; |
| TEAM_MEMBER_INVITATION_CHANGED | &quot;teamMemberInvitationChanged&quot; |
| TEAM_MEMBER_INVITATION_RESENT | &quot;teamMemberInvitationResent&quot; |
| TEAM_MEMBER_INVITATION_REJECTED | &quot;teamMemberInvitationRejected&quot; |
| CONFIG_CREATED | &quot;configCreated&quot; |
| CONFIG_CHANGED | &quot;configChanged&quot; |
| CONFIG_DELETED | &quot;configDeleted&quot; |
| CONFIGS_REORDERED | &quot;configsReordered&quot; |
| ENVIRONMENT_CREATED | &quot;environmentCreated&quot; |
| ENVIRONMENT_CHANGED | &quot;environmentChanged&quot; |
| ENVIRONMENT_DELETED | &quot;environmentDeleted&quot; |
| ENVIRONMENTS_REORDERED | &quot;environmentsReordered&quot; |
| SETTING_CREATED | &quot;settingCreated&quot; |
| SETTING_CHANGED | &quot;settingChanged&quot; |
| SETTING_DELETED | &quot;settingDeleted&quot; |
| SETTINGS_REORDERED | &quot;settingsReordered&quot; |
| SETTING_VALUE_CHANGED | &quot;settingValueChanged&quot; |
| WEB_HOOK_CREATED | &quot;webHookCreated&quot; |
| WEB_HOOK_CHANGED | &quot;webHookChanged&quot; |
| WEB_HOOK_DELETED | &quot;webHookDeleted&quot; |
| PERMISSION_GROUP_CREATED | &quot;permissionGroupCreated&quot; |
| PERMISSION_GROUP_CHANGED | &quot;permissionGroupChanged&quot; |
| PERMISSION_GROUP_DELETED | &quot;permissionGroupDeleted&quot; |
| PERMISSION_GROUP_DEFAULT | &quot;permissionGroupDefault&quot; |
| API_KEY_ADDED | &quot;apiKeyAdded&quot; |
| API_KEY_REMOVED | &quot;apiKeyRemoved&quot; |
| INTEGRATION_ADDED | &quot;integrationAdded&quot; |
| INTEGRATION_CHANGED | &quot;integrationChanged&quot; |
| INTEGRATION_REMOVED | &quot;integrationRemoved&quot; |
| API_KEY_CONNECTED | &quot;apiKeyConnected&quot; |
| INTEGRATION_LINK_ADDED | &quot;integrationLinkAdded&quot; |
| INTEGRATION_LINK_REMOVED | &quot;integrationLinkRemoved&quot; |
| ORGANIZATION_ADDED | &quot;organizationAdded&quot; |
| ORGANIZATION_REMOVED | &quot;organizationRemoved&quot; |
| ORGANIZATION_CHANGED | &quot;organizationChanged&quot; |
| ORGANIZATION_SUBSCRIPTION_TYPE_CHANGED | &quot;organizationSubscriptionTypeChanged&quot; |
| ORGANIZATION_ADMIN_CHANGED | &quot;organizationAdminChanged&quot; |
| ORGANIZATION_ADMIN_LEFT | &quot;organizationAdminLeft&quot; |
| ORGANIZATION_ADMIN_DISABLED2_FA | &quot;organizationAdminDisabled2FA&quot; |
| TAG_ADDED | &quot;tagAdded&quot; |
| TAG_CHANGED | &quot;tagChanged&quot; |
| TAG_REMOVED | &quot;tagRemoved&quot; |
| SETTING_TAG_ADDED | &quot;settingTagAdded&quot; |
| SETTING_TAG_REMOVED | &quot;settingTagRemoved&quot; |
| PUBLIC_API_ACCESS_TOKEN_ADDED | &quot;publicApiAccessTokenAdded&quot; |
| PUBLIC_API_ACCESS_TOKEN_REMOVED | &quot;publicApiAccessTokenRemoved&quot; |
| DOMAIN_ADDED | &quot;domainAdded&quot; |
| DOMAIN_VERIFIED | &quot;domainVerified&quot; |
| DOMAIN_REMOVED | &quot;domainRemoved&quot; |
| DOMAIN_SAML_CONFIGURED | &quot;domainSamlConfigured&quot; |
| DOMAIN_SAML_DELETED | &quot;domainSamlDeleted&quot; |
| AUTO_PROVISIONING_CONFIGURATION_CHANGED | &quot;autoProvisioningConfigurationChanged&quot; |
| SAML_IDP_CONFIGURATION_ADDED | &quot;samlIdpConfigurationAdded&quot; |
| SAML_IDP_CONFIGURATION_REMOVED | &quot;samlIdpConfigurationRemoved&quot; |
| SAML_IDP_CONFIGURATION_UPDATED | &quot;samlIdpConfigurationUpdated&quot; |
| ORGANIZATION_MEMBER_JOINED | &quot;organizationMemberJoined&quot; |
| ORGANIZATION_MEMBER_PRODUCT_JOIN_REQUESTED | &quot;organizationMemberProductJoinRequested&quot; |
| ORGANIZATION_MEMBER_PRODUCT_JOIN_REQUEST_REJECTED | &quot;organizationMemberProductJoinRequestRejected&quot; |
| ORGANIZATION_MEMBER_PRODUCT_JOIN_REQUEST_APPROVED | &quot;organizationMemberProductJoinRequestApproved&quot; |
| CODE_REFERENCES_UPLOADED | &quot;codeReferencesUploaded&quot; |
| CODE_REFERENCE_DELETED | &quot;codeReferenceDeleted&quot; |
| CODE_REFERENCE_STALE_BRANCH_DELETED | &quot;codeReferenceStaleBranchDeleted&quot; |
| SEGMENT_CREATED | &quot;segmentCreated&quot; |
| SEGMENT_CHANGED | &quot;segmentChanged&quot; |
| SEGMENT_DELETED | &quot;segmentDeleted&quot; |
| WEBHOOK_SIGNING_KEY_DELETED | &quot;webhookSigningKeyDeleted&quot; |
| WEBHOOK_SIGNING_KEY_CREATED | &quot;webhookSigningKeyCreated&quot; |



