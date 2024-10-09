

# WebhookModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**webhookId** | **Integer** | The identifier of the Webhook. |  [optional] |
|**url** | **String** | The URL of the Webhook. |  [optional] |
|**httpMethod** | **WebHookHttpMethod** |  |  [optional] |
|**content** | **String** | The HTTP body content. |  [optional] |
|**webHookHeaders** | [**List&lt;WebhookHeaderModel&gt;**](WebhookHeaderModel.md) | List of HTTP headers that the Webhook must send. |  [optional] |
|**config** | [**WebhookConfig**](WebhookConfig.md) |  |  [optional] |
|**environment** | [**WebhookEnvironment**](WebhookEnvironment.md) |  |  [optional] |



