

# RolloutRuleModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**comparisonAttribute** | **String** | The user attribute to compare. |  [optional] |
|**comparator** | [**ComparatorEnum**](#ComparatorEnum) |  |  [optional] |
|**comparisonValue** | **String** | The value to compare against. |  [optional] |
|**value** | **Object** | The value to serve when the comparison matches. It must respect the setting type. |  [optional] |
|**segmentComparator** | [**SegmentComparatorEnum**](#SegmentComparatorEnum) | The segment comparison operator. |  [optional] |
|**segmentId** | **UUID** | The segment to compare against. |  [optional] |



## Enum: ComparatorEnum

| Name | Value |
|---- | -----|
| IS_ONE_OF | &quot;isOneOf&quot; |
| IS_NOT_ONE_OF | &quot;isNotOneOf&quot; |
| CONTAINS | &quot;contains&quot; |
| DOES_NOT_CONTAIN | &quot;doesNotContain&quot; |
| SEM_VER_IS_ONE_OF | &quot;semVerIsOneOf&quot; |
| SEM_VER_IS_NOT_ONE_OF | &quot;semVerIsNotOneOf&quot; |
| SEM_VER_LESS | &quot;semVerLess&quot; |
| SEM_VER_LESS_OR_EQUALS | &quot;semVerLessOrEquals&quot; |
| SEM_VER_GREATER | &quot;semVerGreater&quot; |
| SEM_VER_GREATER_OR_EQUALS | &quot;semVerGreaterOrEquals&quot; |
| NUMBER_EQUALS | &quot;numberEquals&quot; |
| NUMBER_DOES_NOT_EQUAL | &quot;numberDoesNotEqual&quot; |
| NUMBER_LESS | &quot;numberLess&quot; |
| NUMBER_LESS_OR_EQUALS | &quot;numberLessOrEquals&quot; |
| NUMBER_GREATER | &quot;numberGreater&quot; |
| NUMBER_GREATER_OR_EQUALS | &quot;numberGreaterOrEquals&quot; |
| SENSITIVE_IS_ONE_OF | &quot;sensitiveIsOneOf&quot; |
| SENSITIVE_IS_NOT_ONE_OF | &quot;sensitiveIsNotOneOf&quot; |



## Enum: SegmentComparatorEnum

| Name | Value |
|---- | -----|
| IS_IN | &quot;isIn&quot; |
| IS_NOT_IN | &quot;isNotIn&quot; |



