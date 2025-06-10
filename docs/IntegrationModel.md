

# IntegrationModel

Details of the Integration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**product** | [**ProductModel**](ProductModel.md) |  |  |
|**integrationId** | **UUID** | Identifier of the Integration. |  |
|**name** | **String** | Name of the Integration. |  |
|**integrationType** | **IntegrationType** |  |  |
|**parameters** | **Map&lt;String, String&gt;** | Parameters of the Integration. |  |
|**environmentIds** | **List&lt;UUID&gt;** | List of Environment IDs that are connected with this Integration. If the list is empty, all of the Environments are connected. |  |
|**configIds** | **List&lt;UUID&gt;** | List of Config IDs that are connected with this Integration. If the list is empty, all of the Configs are connected. |  |



