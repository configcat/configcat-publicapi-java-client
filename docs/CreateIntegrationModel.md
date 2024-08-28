

# CreateIntegrationModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**integrationType** | [**IntegrationTypeEnum**](#IntegrationTypeEnum) | Type of the Integration. |  |
|**name** | **String** | Name of the Integration. |  |
|**parameters** | **Map&lt;String, String&gt;** | Parameters of the Integration. |  |
|**environmentIds** | **List&lt;UUID&gt;** | List of Environment IDs that are connected with this Integration. If the list is empty, all of the Environments are connected. |  |
|**configIds** | **List&lt;UUID&gt;** | List of Config IDs that are connected with this Integration. If the list is empty, all of the Configs are connected. |  |



## Enum: IntegrationTypeEnum

| Name | Value |
|---- | -----|
| DATA_DOG | &quot;dataDog&quot; |
| SLACK | &quot;slack&quot; |
| AMPLITUDE | &quot;amplitude&quot; |
| MIX_PANEL | &quot;mixPanel&quot; |
| SEGMENT | &quot;segment&quot; |
| PUB_NUB | &quot;pubNub&quot; |



