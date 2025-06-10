

# SettingValueModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**setting** | [**SettingDataModel**](SettingDataModel.md) |  |  |
|**updatedAt** | **OffsetDateTime** | The last updated date and time when the Feature Flag or Setting. |  |
|**lastUpdaterUserEmail** | **String** | The email of the user who last updated the Feature Flag or Setting. |  |
|**lastUpdaterUserFullName** | **String** | The name of the user who last updated the Feature Flag or Setting. |  |
|**integrationLinks** | [**List&lt;IntegrationLinkModel&gt;**](IntegrationLinkModel.md) | The integration links attached to the Feature Flag or Setting. |  |
|**settingTags** | [**List&lt;SettingTagModel&gt;**](SettingTagModel.md) | The tags attached to the Feature Flag or Setting. |  |
|**rolloutRules** | [**List&lt;RolloutRuleModel&gt;**](RolloutRuleModel.md) | The targeting rule collection. |  |
|**rolloutPercentageItems** | [**List&lt;RolloutPercentageItemModel&gt;**](RolloutPercentageItemModel.md) | The percentage rule collection. |  |
|**value** | [**SettingValueType**](SettingValueType.md) | The value to serve. It must respect the setting type. In some generated clients for strictly typed languages you may use double/float properties to handle integer values. |  |
|**config** | [**ConfigModel**](ConfigModel.md) |  |  |
|**environment** | [**EnvironmentModel**](EnvironmentModel.md) |  |  |
|**featureFlagLimitations** | [**FeatureFlagLimitations**](FeatureFlagLimitations.md) |  |  |
|**readOnly** | **Boolean** |  |  |



