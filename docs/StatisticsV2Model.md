

# StatisticsV2Model

Represents the monthly usage and quota statistics for an Organization.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hasConnectedApplication** | **Boolean** | Indicates whether the Organization has a connected application. |  |
|**millionRequestLimitPerMonth** | **Integer** | The monthly request quota limit in millions. |  |
|**networkTrafficGigaByteLimitPerMonth** | **Integer** | The monthly network traffic quota limit in gigabytes. |  |
|**organizationStatistics** | [**List&lt;OrganizationMonthlyStatisticV2Model&gt;**](OrganizationMonthlyStatisticV2Model.md) | The aggregated monthly statistics for the Organization. |  |
|**productStatistics** | [**List&lt;ProductMonthlyStatisticV2Model&gt;**](ProductMonthlyStatisticV2Model.md) | The aggregated monthly statistics for Products within the scope. |  |
|**detailedStatistics** | [**List&lt;DetailedStatisticV2Model&gt;**](DetailedStatisticV2Model.md) | The detailed per-day, per-Config, per-Environment usage statistics. |  |



