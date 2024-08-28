

# ConfigModel

Details of the Config.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**product** | [**ProductModel**](ProductModel.md) |  |  [optional] |
|**configId** | **UUID** | Identifier of the Config. |  [optional] |
|**name** | **String** | Name of the Config. |  [optional] |
|**description** | **String** | Description of the Config. |  [optional] |
|**order** | **Integer** | The order of the Config represented on the ConfigCat Dashboard. |  [optional] |
|**migratedConfigId** | **UUID** |  |  [optional] |
|**evaluationVersion** | [**EvaluationVersionEnum**](#EvaluationVersionEnum) | Determines the evaluation version of a Config.  Using &#x60;v2&#x60; enables the new features of Config V2 (https://configcat.com/docs/advanced/config-v2). |  [optional] |



## Enum: EvaluationVersionEnum

| Name | Value |
|---- | -----|
| V1 | &quot;v1&quot; |
| V2 | &quot;v2&quot; |



