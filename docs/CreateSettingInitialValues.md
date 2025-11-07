

# CreateSettingInitialValues


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the Feature Flag or Setting. |  |
|**hint** | **String** | A short description for the setting, shown on the Dashboard UI. |  [optional] |
|**tags** | **List&lt;Long&gt;** | The IDs of the tags which are attached to the setting. |  [optional] |
|**order** | **Integer** | The order of the Setting represented on the ConfigCat Dashboard. Determined from an ascending sequence of integers. |  [optional] |
|**key** | **String** | The key of the Feature Flag or Setting. |  |
|**settingType** | **SettingType** |  |  |
|**predefinedVariations** | [**List&lt;CreatePredefinedVariationModel&gt;**](CreatePredefinedVariationModel.md) | The Feature Flag or Setting&#39;s Variations. |  [optional] |
|**initialValues** | [**List&lt;InitialValue&gt;**](InitialValue.md) | Optional, initial value of the Feature Flag or Setting in the given Environments. Only one of the SettingIdToInitFrom or the InitialValues properties can be set. |  [optional] |
|**settingIdToInitFrom** | **Integer** | Optional, the SettingId to initialize the values and tags of the Feature Flag or Setting from. Only can be set if you have at least ReadOnly access in all the Environments. Only one of the SettingIdToInitFrom or the InitialValues properties can be set. |  [optional] |



