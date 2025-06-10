

# ConfigSettingFormulaModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lastVersionId** | **UUID** |  |  |
|**defaultValue** | [**ValueModel**](ValueModel.md) |  |  |
|**targetingRules** | [**List&lt;TargetingRuleModel&gt;**](TargetingRuleModel.md) | The targeting rules of the Feature Flag or Setting. |  |
|**setting** | [**SettingDataModel**](SettingDataModel.md) |  |  |
|**updatedAt** | **OffsetDateTime** | The last updated date and time when the Feature Flag or Setting. |  |
|**percentageEvaluationAttribute** | **String** | The user attribute used for percentage evaluation. If not set, it defaults to the &#x60;Identifier&#x60; user object attribute. |  |
|**lastUpdaterUserEmail** | **String** | The email of the user who last updated the Feature Flag or Setting. |  |
|**lastUpdaterUserFullName** | **String** | The name of the user who last updated the Feature Flag or Setting. |  |
|**integrationLinks** | [**List&lt;IntegrationLinkModel&gt;**](IntegrationLinkModel.md) | The integration links attached to the Feature Flag or Setting. |  |
|**settingTags** | [**List&lt;SettingTagModel&gt;**](SettingTagModel.md) | The tags attached to the Feature Flag or Setting. |  |
|**settingIdsWherePrerequisite** | **List&lt;Integer&gt;** | List of Feature Flag and Setting IDs where the actual Feature Flag or Setting is prerequisite. |  |



