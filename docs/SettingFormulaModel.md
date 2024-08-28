

# SettingFormulaModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lastVersionId** | **UUID** |  |  [optional] |
|**defaultValue** | [**ValueModel**](ValueModel.md) |  |  [optional] |
|**targetingRules** | [**List&lt;TargetingRuleModel&gt;**](TargetingRuleModel.md) | The targeting rules of the Feature Flag or Setting. |  [optional] |
|**setting** | [**SettingDataModel**](SettingDataModel.md) |  |  [optional] |
|**updatedAt** | **OffsetDateTime** | The last updated date and time when the Feature Flag or Setting. |  [optional] |
|**percentageEvaluationAttribute** | **String** | The user attribute used for percentage evaluation. If not set, it defaults to the &#x60;Identifier&#x60; user object attribute. |  [optional] |
|**lastUpdaterUserEmail** | **String** | The email of the user who last updated the Feature Flag or Setting. |  [optional] |
|**lastUpdaterUserFullName** | **String** | The name of the user who last updated the Feature Flag or Setting. |  [optional] |
|**integrationLinks** | [**List&lt;IntegrationLinkModel&gt;**](IntegrationLinkModel.md) | The integration links attached to the Feature Flag or Setting. |  [optional] |
|**settingTags** | [**List&lt;SettingTagModel&gt;**](SettingTagModel.md) | The tags attached to the Feature Flag or Setting. |  [optional] |
|**settingIdsWherePrerequisite** | **List&lt;Integer&gt;** | List of Feature Flag and Setting IDs where the actual Feature Flag or Setting is prerequisite. |  [optional] |
|**config** | [**ConfigModel**](ConfigModel.md) |  |  [optional] |
|**environment** | [**EnvironmentModel**](EnvironmentModel.md) |  |  [optional] |
|**readOnly** | **Boolean** |  |  [optional] |
|**featureFlagLimitations** | [**FeatureFlagLimitations**](FeatureFlagLimitations.md) |  |  [optional] |



