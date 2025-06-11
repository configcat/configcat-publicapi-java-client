

# PermissionGroupModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**permissionGroupId** | **Long** | Identifier of the Permission Group. |  |
|**name** | **String** | Name of the Permission Group. |  |
|**canManageMembers** | **Boolean** | Group members can manage team members. |  |
|**canCreateOrUpdateConfig** | **Boolean** | Group members can create/update Configs. |  |
|**canDeleteConfig** | **Boolean** | Group members can delete Configs. |  |
|**canCreateOrUpdateEnvironment** | **Boolean** | Group members can create/update Environments. |  |
|**canDeleteEnvironment** | **Boolean** | Group members can delete Environments. |  |
|**canCreateOrUpdateSetting** | **Boolean** | Group members can create/update Feature Flags and Settings. |  |
|**canTagSetting** | **Boolean** | Group members can attach/detach Tags to Feature Flags and Settings. |  |
|**canDeleteSetting** | **Boolean** | Group members can delete Feature Flags and Settings. |  |
|**canCreateOrUpdateTag** | **Boolean** | Group members can create/update Tags. |  |
|**canDeleteTag** | **Boolean** | Group members can delete Tags. |  |
|**canManageWebhook** | **Boolean** | Group members can create/update/delete Webhooks. |  |
|**canUseExportImport** | **Boolean** | Group members can use the export/import feature. |  |
|**canManageProductPreferences** | **Boolean** | Group members can update Product preferences. |  |
|**canManageIntegrations** | **Boolean** | Group members can add and configure integrations. |  |
|**canViewSdkKey** | **Boolean** | Group members has access to SDK keys. |  |
|**canRotateSdkKey** | **Boolean** | Group members can rotate SDK keys. |  |
|**canCreateOrUpdateSegments** | **Boolean** | Group members can create/update Segments. |  |
|**canDeleteSegments** | **Boolean** | Group members can delete Segments. |  |
|**canViewProductAuditLog** | **Boolean** | Group members has access to audit logs. |  |
|**canViewProductStatistics** | **Boolean** | Group members has access to product statistics. |  |
|**canDisable2FA** | **Boolean** | Group members can disable two-factor authentication for other members. |  |
|**accessType** | **AccessType** |  |  |
|**newEnvironmentAccessType** | **EnvironmentAccessType** |  |  |
|**environmentAccesses** | [**List&lt;EnvironmentAccessModel&gt;**](EnvironmentAccessModel.md) | List of environment specific permissions. |  |
|**product** | [**ProductModel**](ProductModel.md) |  |  |



