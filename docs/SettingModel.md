

# SettingModel

Metadata of a Feature Flag or Setting.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**settingId** | **Integer** | Identifier of the Feature Flag or Setting. |  [optional] |
|**key** | **String** | Key of the Feature Flag or Setting. |  [optional] |
|**name** | **String** | Name of the Feature Flag or Setting. |  [optional] |
|**hint** | **String** | Description of the Feature Flag or Setting. |  [optional] |
|**order** | **Integer** | The order of the Feature Flag or Setting represented on the ConfigCat Dashboard. |  [optional] |
|**settingType** | **SettingType** |  |  [optional] |
|**configId** | **UUID** | Identifier of the Feature Flag&#39;s Config. |  [optional] |
|**configName** | **String** | Name of the Feature Flag&#39;s Config. |  [optional] |
|**createdAt** | **OffsetDateTime** | The creation time of the Feature Flag or Setting. |  [optional] |
|**tags** | [**List&lt;TagModel&gt;**](TagModel.md) | The tags attached to the Feature Flag or Setting. |  [optional] |



