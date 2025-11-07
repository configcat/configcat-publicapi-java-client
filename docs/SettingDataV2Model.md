

# SettingDataV2Model

Metadata of a Feature Flag or Setting.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**settingId** | **Integer** | Identifier of the Feature Flag or Setting. |  |
|**key** | **String** | Key of the Feature Flag or Setting. |  |
|**name** | **String** | Name of the Feature Flag or Setting. |  |
|**hint** | **String** | Description of the Feature Flag or Setting. |  |
|**settingType** | **SettingType** |  |  |
|**order** | **Integer** | The order of the Feature Flag or Setting represented on the ConfigCat Dashboard. |  |
|**createdAt** | **OffsetDateTime** | The creation time of the Feature Flag or Setting. |  |
|**creatorEmail** | **String** | The user&#39;s email address who created the Feature Flag or Setting. |  |
|**creatorFullName** | **String** | The user&#39;s name who created the Feature Flag or Setting. |  |
|**predefinedVariations** | [**List&lt;PredefinedVariationModel&gt;**](PredefinedVariationModel.md) | A collection of Variations for a Feature Flag or Setting. |  |
|**isWatching** | **Boolean** |  |  |



