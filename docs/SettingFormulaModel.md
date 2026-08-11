

# SettingFormulaModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lastVersionId** | **UUID** | The version identifier of the last change made to the Feature Flag or Setting in the Environment. It can be used to make sure concurrent updates are not overwriting each other. If the version identifier does not match the current version, the update will be rejected with a 409 Conflict response. |  |
|**defaultValue** | [**ValueModel**](ValueModel.md) |  |  |
|**targetingRules** | [**List&lt;TargetingRuleModel&gt;**](TargetingRuleModel.md) | The targeting rules of the Feature Flag or Setting. |  |
|**setting** | [**SettingDataV2Model**](SettingDataV2Model.md) |  |  |
|**updatedAt** | **OffsetDateTime** | The last updated date and time when the Feature Flag or Setting. |  |
|**percentageEvaluationAttribute** | **String** | The user attribute used for percentage evaluation. If not set, it defaults to the &#x60;Identifier&#x60; user object attribute. |  |
|**lastUpdaterUserEmail** | **String** | The email of the user who last updated the Feature Flag or Setting. |  |
|**lastUpdaterUserFullName** | **String** | The name of the user who last updated the Feature Flag or Setting. |  |
|**integrationLinks** | [**List&lt;IntegrationLinkModel&gt;**](IntegrationLinkModel.md) | The integration links attached to the Feature Flag or Setting. |  |
|**settingTags** | [**List&lt;SettingTagModel&gt;**](SettingTagModel.md) | The tags attached to the Feature Flag or Setting. |  |
|**settingIdsWherePrerequisite** | **List&lt;Integer&gt;** | List of Feature Flag and Setting IDs where the actual Feature Flag or Setting is prerequisite. |  |
|**changeRequestCount** | **Integer** | The number of change requests for the Feature Flag or Setting. |  |
|**config** | [**ConfigModel**](ConfigModel.md) |  |  |
|**environment** | [**EnvironmentModel**](EnvironmentModel.md) |  |  |
|**readOnly** | **Boolean** | Indicates whether you have Read-only access to the Environment. |  |
|**featureFlagLimitations** | [**FeatureFlagLimitations**](FeatureFlagLimitations.md) |  |  |
|**approveRequired** | **Boolean** | Indicates that a mandatory approval is required for saving and publishing. |  |
|**canBypassApproval** | **Boolean** | Indicates whether the user can bypass the approval flow. |  |
|**reasonRequired** | **Boolean** | Indicates that a mandatory note required for saving and publishing. |  |



