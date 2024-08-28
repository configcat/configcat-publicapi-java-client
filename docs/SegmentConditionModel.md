

# SegmentConditionModel

Describes a condition that is based on a segment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**segmentId** | **UUID** | The segment&#39;s identifier. |  |
|**comparator** | [**ComparatorEnum**](#ComparatorEnum) | The segment comparison operator used during the evaluation process. |  |



## Enum: ComparatorEnum

| Name | Value |
|---- | -----|
| IS_IN | &quot;isIn&quot; |
| IS_NOT_IN | &quot;isNotIn&quot; |



