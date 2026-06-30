

# PredefinedVariationWithUsagesModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**value** | [**PredefinedVariationValueModel**](PredefinedVariationValueModel.md) |  |  |
|**name** | **String** | The name of the Predefined Variation, shown on the Dashboard UI. If not set, the Value will be shown. |  |
|**hint** | **String** | The name of the Predefined Variation, shown on the Dashboard UI. If not set, the Value will be shown. |  |
|**predefinedVariationId** | **UUID** | The Predefined Variation&#39;s identifier. |  |
|**usages** | [**List&lt;PredefinedVariationUsageModel&gt;**](PredefinedVariationUsageModel.md) | The Feature Flag or Setting Variation&#39;s usages in the given Environments. |  |
|**usagesInOtherEnvironments** | **Integer** | The Feature Flag or Setting Variation&#39;s usages in the Environments you don&#39;t have access to. |  |
|**changeRequestUsages** | [**List&lt;PredefinedVariationChangeRequestUsageModel&gt;**](PredefinedVariationChangeRequestUsageModel.md) | The Feature Flag or Setting Variation&#39;s usages in the given Change Requests. |  |
|**changeRequestUsagesInOtherEnvironments** | **Integer** | The Feature Flag or Setting Variation&#39;s usages in the Change Requests you don&#39;t have access to. |  |



