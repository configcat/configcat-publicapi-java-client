

# PrerequisiteFlagConditionModel

Describes a condition that is based on a prerequisite flag.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**prerequisiteSettingId** | **Integer** | The prerequisite flag&#39;s identifier. |  |
|**comparator** | [**ComparatorEnum**](#ComparatorEnum) | Prerequisite flag comparison operator used during the evaluation process. |  |
|**prerequisiteComparisonValue** | [**ValueModel**](ValueModel.md) |  |  |



## Enum: ComparatorEnum

| Name | Value |
|---- | -----|
| EQUALS | &quot;equals&quot; |
| DOES_NOT_EQUAL | &quot;doesNotEqual&quot; |



