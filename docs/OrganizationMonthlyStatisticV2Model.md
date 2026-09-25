

# OrganizationMonthlyStatisticV2Model

Represents the aggregated monthly usage statistics for an Organization.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **OffsetDateTime** | The date for which the aggregate statistics are reported. |  |
|**millionRequestCount** | **Double** | The total request volume in millions for the period. |  |
|**responseMegaBytes** | **Double** | The total network traffic in megabytes for the period. |  |
|**overLimit** | **Boolean** | Indicates whether the request quota was exceeded. |  |
|**overNetworkTrafficLimit** | **Boolean** | Indicates whether the network traffic quota was exceeded. |  |
|**millionRequestLimitPerMonth** | **Integer** | The monthly request quota limit in millions. |  |
|**networkTrafficGigaByteLimitPerMonth** | **Integer** | The monthly network traffic quota limit in gigabytes. |  |
|**publicApiCallCount** | **Long** | The number of Public API calls recorded for the period. |  |



