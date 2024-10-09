

# IntegrationModel

Details of the Integration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**product** | [**ProductModel**](ProductModel.md) |  |  [optional] |
|**integrationId** | **UUID** | Identifier of the Integration. |  [optional] |
|**name** | **String** | Name of the Integration. |  [optional] |
|**integrationType** | **IntegrationType** |  |  [optional] |
|**parameters** | **Map&lt;String, String&gt;** | Parameters of the Integration. |  [optional] |
|**environmentIds** | **List&lt;UUID&gt;** | List of Environment IDs that are connected with this Integration. If the list is empty, all of the Environments are connected. |  [optional] |
|**configIds** | **List&lt;UUID&gt;** | List of Config IDs that are connected with this Integration. If the list is empty, all of the Configs are connected. |  [optional] |



