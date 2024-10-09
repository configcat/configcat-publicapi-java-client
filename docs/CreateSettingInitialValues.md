

# CreateSettingInitialValues


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hint** | **String** | A short description for the setting, shown on the Dashboard UI. |  [optional] |
|**tags** | **List&lt;Long&gt;** | The IDs of the tags which are attached to the setting. |  [optional] |
|**order** | **Integer** | The order of the Setting represented on the ConfigCat Dashboard.  Determined from an ascending sequence of integers. |  [optional] |
|**key** | **String** | The key of the Feature Flag or Setting. |  |
|**name** | **String** | The name of the Feature Flag or Setting. |  |
|**settingType** | **SettingType** |  |  |
|**initialValues** | [**List&lt;InitialValue&gt;**](InitialValue.md) | Optional, initial value of the Feature Flag or Setting in the given Environments. |  [optional] |



