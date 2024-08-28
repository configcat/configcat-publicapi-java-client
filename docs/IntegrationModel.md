

# IntegrationModel

Details of the Integration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**product** | [**ProductModel**](ProductModel.md) |  |  [optional] |
|**integrationId** | **UUID** | Identifier of the Integration. |  [optional] |
|**name** | **String** | Name of the Integration. |  [optional] |
|**integrationType** | [**IntegrationTypeEnum**](#IntegrationTypeEnum) | Type of the Integration. |  [optional] |
|**parameters** | **Map&lt;String, String&gt;** | Parameters of the Integration. |  [optional] |
|**environmentIds** | **List&lt;UUID&gt;** | List of Environment IDs that are connected with this Integration. If the list is empty, all of the Environments are connected. |  [optional] |
|**configIds** | **List&lt;UUID&gt;** | List of Config IDs that are connected with this Integration. If the list is empty, all of the Configs are connected. |  [optional] |



## Enum: IntegrationTypeEnum

| Name | Value |
|---- | -----|
| DATA_DOG | &quot;dataDog&quot; |
| SLACK | &quot;slack&quot; |
| AMPLITUDE | &quot;amplitude&quot; |
| MIX_PANEL | &quot;mixPanel&quot; |
| SEGMENT | &quot;segment&quot; |
| PUB_NUB | &quot;pubNub&quot; |



