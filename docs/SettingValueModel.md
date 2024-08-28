

# SettingValueModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rolloutRules** | [**List&lt;RolloutRuleModel&gt;**](RolloutRuleModel.md) | The targeting rule collection. |  [optional] |
|**rolloutPercentageItems** | [**List&lt;RolloutPercentageItemModel&gt;**](RolloutPercentageItemModel.md) | The percentage rule collection. |  [optional] |
|**value** | **Object** | The value to serve. It must respect the setting type. |  [optional] |
|**setting** | [**SettingDataModel**](SettingDataModel.md) |  |  [optional] |
|**updatedAt** | **OffsetDateTime** | The last updated date and time when the Feature Flag or Setting. |  [optional] |
|**lastUpdaterUserEmail** | **String** | The email of the user who last updated the Feature Flag or Setting. |  [optional] |
|**lastUpdaterUserFullName** | **String** | The name of the user who last updated the Feature Flag or Setting. |  [optional] |
|**integrationLinks** | [**List&lt;IntegrationLinkModel&gt;**](IntegrationLinkModel.md) | The integration links attached to the Feature Flag or Setting. |  [optional] |
|**settingTags** | [**List&lt;SettingTagModel&gt;**](SettingTagModel.md) | The tags attached to the Feature Flag or Setting. |  [optional] |
|**config** | [**ConfigModel**](ConfigModel.md) |  |  [optional] |
|**environment** | [**EnvironmentModel**](EnvironmentModel.md) |  |  [optional] |
|**featureFlagLimitations** | [**FeatureFlagLimitations**](FeatureFlagLimitations.md) |  |  [optional] |
|**readOnly** | **Boolean** |  |  [optional] |



