

# EnvironmentAccessModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**environmentId** | **UUID** | Identifier of the Environment. |  [optional] |
|**name** | **String** | Name of the Environment. |  [optional] |
|**color** | **String** | Color of the Environment. |  [optional] |
|**description** | **String** | Description of the Environment. |  [optional] |
|**order** | **Integer** | The order of the Environment represented on the ConfigCat Dashboard. |  [optional] |
|**reasonRequired** | **Boolean** | Determines whether a mandatory reason must be given every time when the Feature Flags or Settings in the given Environment are saved. |  [optional] |
|**environmentAccessType** | [**EnvironmentAccessTypeEnum**](#EnvironmentAccessTypeEnum) | Represent the environment specific Feature Management permission. |  [optional] |



## Enum: EnvironmentAccessTypeEnum

| Name | Value |
|---- | -----|
| FULL | &quot;full&quot; |
| READ_ONLY | &quot;readOnly&quot; |
| NONE | &quot;none&quot; |



