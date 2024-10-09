

# PermissionGroupModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**permissionGroupId** | **Long** | Identifier of the Permission Group. |  [optional] |
|**name** | **String** | Name of the Permission Group. |  [optional] |
|**canManageMembers** | **Boolean** | Group members can manage team members. |  [optional] |
|**canCreateOrUpdateConfig** | **Boolean** | Group members can create/update Configs. |  [optional] |
|**canDeleteConfig** | **Boolean** | Group members can delete Configs. |  [optional] |
|**canCreateOrUpdateEnvironment** | **Boolean** | Group members can create/update Environments. |  [optional] |
|**canDeleteEnvironment** | **Boolean** | Group members can delete Environments. |  [optional] |
|**canCreateOrUpdateSetting** | **Boolean** | Group members can create/update Feature Flags and Settings. |  [optional] |
|**canTagSetting** | **Boolean** | Group members can attach/detach Tags to Feature Flags and Settings. |  [optional] |
|**canDeleteSetting** | **Boolean** | Group members can delete Feature Flags and Settings. |  [optional] |
|**canCreateOrUpdateTag** | **Boolean** | Group members can create/update Tags. |  [optional] |
|**canDeleteTag** | **Boolean** | Group members can delete Tags. |  [optional] |
|**canManageWebhook** | **Boolean** | Group members can create/update/delete Webhooks. |  [optional] |
|**canUseExportImport** | **Boolean** | Group members can use the export/import feature. |  [optional] |
|**canManageProductPreferences** | **Boolean** | Group members can update Product preferences. |  [optional] |
|**canManageIntegrations** | **Boolean** | Group members can add and configure integrations. |  [optional] |
|**canViewSdkKey** | **Boolean** | Group members has access to SDK keys. |  [optional] |
|**canRotateSdkKey** | **Boolean** | Group members can rotate SDK keys. |  [optional] |
|**canCreateOrUpdateSegments** | **Boolean** | Group members can create/update Segments. |  [optional] |
|**canDeleteSegments** | **Boolean** | Group members can delete Segments. |  [optional] |
|**canViewProductAuditLog** | **Boolean** | Group members has access to audit logs. |  [optional] |
|**canViewProductStatistics** | **Boolean** | Group members has access to product statistics. |  [optional] |
|**canDisable2FA** | **Boolean** | Group members can disable two-factor authentication for other members. |  [optional] |
|**accessType** | **AccessType** |  |  [optional] |
|**newEnvironmentAccessType** | **EnvironmentAccessType** |  |  [optional] |
|**environmentAccesses** | [**List&lt;EnvironmentAccessModel&gt;**](EnvironmentAccessModel.md) | List of environment specific permissions. |  [optional] |
|**product** | [**ProductModel**](ProductModel.md) |  |  [optional] |



