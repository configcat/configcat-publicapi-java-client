

# ChangeRequestProposedChangeModel

Model representing proposed changes to a Setting included in a Change Request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**settingId** | **Integer** | Identifier of the Setting to change. |  |
|**settingKey** | **String** | Key identifier of the Setting. |  |
|**settingName** | **String** | Display name of the Setting. |  |
|**settingHint** | **String** | Optional hint or description for the Setting. |  |
|**settingType** | **SettingType** |  |  |
|**hasConflict** | **Boolean** | Indicates whether the proposed changes to the Setting are in conflict with concurrently published changes. |  |
|**originalEvaluationFormula** | [**AuditLogSettingValueV2EvaluationFormula**](AuditLogSettingValueV2EvaluationFormula.md) |  |  |
|**proposedEvaluationFormula** | [**AuditLogSettingValueV2EvaluationFormula**](AuditLogSettingValueV2EvaluationFormula.md) |  |  |



