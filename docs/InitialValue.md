

# InitialValue


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**environmentId** | **UUID** | The ID of the Environment where the initial value must be set. |  [optional] |
|**value** | [**SettingValueType**](SettingValueType.md) | The initial value in the given Environment. It must respect the setting type. In some generated clients for strictly typed languages, you may use double/float properties to handle integer values. In case of a Feature Flag with predefined variations, the value must match one of the predefined variations&#39; value. |  |



