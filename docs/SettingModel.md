

# SettingModel

Metadata of a Feature Flag or Setting.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**settingId** | **Integer** | Identifier of the Feature Flag or Setting. |  |
|**key** | **String** | Key of the Feature Flag or Setting. |  |
|**name** | **String** | Name of the Feature Flag or Setting. |  |
|**hint** | **String** | Description of the Feature Flag or Setting. |  |
|**order** | **Integer** | The order of the Feature Flag or Setting represented on the ConfigCat Dashboard. |  |
|**settingType** | **SettingType** |  |  |
|**configId** | **UUID** | Identifier of the Feature Flag&#39;s Config. |  |
|**configName** | **String** | Name of the Feature Flag&#39;s Config. |  |
|**createdAt** | **OffsetDateTime** | The creation time of the Feature Flag or Setting. |  |
|**tags** | [**List&lt;TagModel&gt;**](TagModel.md) | The tags attached to the Feature Flag or Setting. |  |
|**predefinedVariations** | [**List&lt;PredefinedVariationModel&gt;**](PredefinedVariationModel.md) | The Feature Flag or Setting&#39;s Variations. |  |



