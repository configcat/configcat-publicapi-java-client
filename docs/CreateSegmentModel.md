

# CreateSegmentModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the Segment. |  |
|**description** | **String** | Description of the Segment. |  [optional] |
|**comparisonAttribute** | **String** | The user&#39;s attribute the evaluation process must take into account. |  |
|**comparator** | [**ComparatorEnum**](#ComparatorEnum) |  |  |
|**comparisonValue** | **String** | The value to compare with the given user attribute&#39;s value. |  |



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



