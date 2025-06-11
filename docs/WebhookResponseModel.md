

# WebhookResponseModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**webhookId** | **Integer** | The identifier of the Webhook. |  |
|**url** | **String** | The URL of the Webhook. |  |
|**httpMethod** | **WebHookHttpMethod** |  |  |
|**content** | **String** | The HTTP body content. |  |
|**webHookHeaders** | [**List&lt;WebhookHeaderResponseModel&gt;**](WebhookHeaderResponseModel.md) | List of HTTP headers that the Webhook must send. |  |
|**config** | [**WebhookConfig**](WebhookConfig.md) |  |  |
|**environment** | [**WebhookEnvironment**](WebhookEnvironment.md) |  |  |



