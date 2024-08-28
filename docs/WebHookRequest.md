

# WebHookRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **String** | The URL of the Webhook. |  |
|**content** | **String** | The HTTP body content. |  [optional] |
|**httpMethod** | [**HttpMethodEnum**](#HttpMethodEnum) | The HTTP method of the remote endpoint. |  [optional] |
|**webHookHeaders** | [**List&lt;WebhookHeaderModel&gt;**](WebhookHeaderModel.md) | List of HTTP headers. |  [optional] |



## Enum: HttpMethodEnum

| Name | Value |
|---- | -----|
| GET | &quot;get&quot; |
| POST | &quot;post&quot; |



