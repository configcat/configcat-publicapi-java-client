

# SettingDataModel

Metadata of a Feature Flag or Setting.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**settingId** | **Integer** | Identifier of the Feature Flag or Setting. |  [optional] |
|**key** | **String** | Key of the Feature Flag or Setting. |  [optional] |
|**name** | **String** | Name of the Feature Flag or Setting. |  [optional] |
|**hint** | **String** | Description of the Feature Flag or Setting. |  [optional] |
|**settingType** | [**SettingTypeEnum**](#SettingTypeEnum) | The type of the Feature Flag or Setting. |  [optional] |
|**order** | **Integer** | The order of the Feature Flag or Setting represented on the ConfigCat Dashboard. |  [optional] |
|**createdAt** | **OffsetDateTime** | The creation time of the Feature Flag or Setting. |  [optional] |
|**creatorEmail** | **String** | The user&#39;s email address who created the Feature Flag or Setting. |  [optional] |
|**creatorFullName** | **String** | The user&#39;s name who created the Feature Flag or Setting. |  [optional] |
|**isWatching** | **Boolean** |  |  [optional] |



## Enum: SettingTypeEnum

| Name | Value |
|---- | -----|
| BOOLEAN | &quot;boolean&quot; |
| STRING | &quot;string&quot; |
| INT | &quot;int&quot; |
| DOUBLE | &quot;double&quot; |



