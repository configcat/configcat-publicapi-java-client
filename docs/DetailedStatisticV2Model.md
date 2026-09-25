

# DetailedStatisticV2Model

Represents the detailed request and traffic usage for a single Config/Environment entry.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **OffsetDateTime** | The date for which the usage was recorded. |  |
|**productId** | **UUID** | The identifier of the Product associated with the usage. |  |
|**productName** | **String** | The name of the Product associated with the usage. |  |
|**configId** | **UUID** | The identifier of the Config associated with the usage. |  |
|**configName** | **String** | The name of the Config associated with the usage. |  |
|**environmentId** | **UUID** | The identifier of the Environment associated with the usage, if available. |  |
|**environmentName** | **String** | The name of the Environment associated with the usage. |  |
|**sdk** | **String** | The SDK type that generated the usage. |  |
|**sdkKey** | **String** | The SDK key used for the request. |  |
|**requestCount** | **Long** | The number of requests recorded for the entry. |  |
|**responseKiloBytes** | **Double** | The total response payload size in kilobytes for the entry. |  |



