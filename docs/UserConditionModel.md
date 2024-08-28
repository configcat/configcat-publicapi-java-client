

# UserConditionModel

Describes a condition that is based on user attributes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**comparisonAttribute** | **String** | The User Object attribute that the condition is based on. Can be \&quot;User ID\&quot;, \&quot;Email\&quot;, \&quot;Country\&quot; or any custom attribute. |  |
|**comparator** | [**ComparatorEnum**](#ComparatorEnum) | The comparison operator which defines the relation between the comparison attribute and the comparison value. |  |
|**comparisonValue** | [**ComparisonValueModel**](ComparisonValueModel.md) |  |  |



## Enum: ComparatorEnum

| Name | Value |
|---- | -----|
| IS_ONE_OF | &quot;isOneOf&quot; |
| IS_NOT_ONE_OF | &quot;isNotOneOf&quot; |
| CONTAINS_ANY_OF | &quot;containsAnyOf&quot; |
| DOES_NOT_CONTAIN_ANY_OF | &quot;doesNotContainAnyOf&quot; |
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
| DATE_TIME_BEFORE | &quot;dateTimeBefore&quot; |
| DATE_TIME_AFTER | &quot;dateTimeAfter&quot; |
| SENSITIVE_TEXT_EQUALS | &quot;sensitiveTextEquals&quot; |
| SENSITIVE_TEXT_DOES_NOT_EQUAL | &quot;sensitiveTextDoesNotEqual&quot; |
| SENSITIVE_TEXT_STARTS_WITH_ANY_OF | &quot;sensitiveTextStartsWithAnyOf&quot; |
| SENSITIVE_TEXT_NOT_STARTS_WITH_ANY_OF | &quot;sensitiveTextNotStartsWithAnyOf&quot; |
| SENSITIVE_TEXT_ENDS_WITH_ANY_OF | &quot;sensitiveTextEndsWithAnyOf&quot; |
| SENSITIVE_TEXT_NOT_ENDS_WITH_ANY_OF | &quot;sensitiveTextNotEndsWithAnyOf&quot; |
| SENSITIVE_ARRAY_CONTAINS_ANY_OF | &quot;sensitiveArrayContainsAnyOf&quot; |
| SENSITIVE_ARRAY_DOES_NOT_CONTAIN_ANY_OF | &quot;sensitiveArrayDoesNotContainAnyOf&quot; |
| TEXT_EQUALS | &quot;textEquals&quot; |
| TEXT_DOES_NOT_EQUAL | &quot;textDoesNotEqual&quot; |
| TEXT_STARTS_WITH_ANY_OF | &quot;textStartsWithAnyOf&quot; |
| TEXT_NOT_STARTS_WITH_ANY_OF | &quot;textNotStartsWithAnyOf&quot; |
| TEXT_ENDS_WITH_ANY_OF | &quot;textEndsWithAnyOf&quot; |
| TEXT_NOT_ENDS_WITH_ANY_OF | &quot;textNotEndsWithAnyOf&quot; |
| ARRAY_CONTAINS_ANY_OF | &quot;arrayContainsAnyOf&quot; |
| ARRAY_DOES_NOT_CONTAIN_ANY_OF | &quot;arrayDoesNotContainAnyOf&quot; |



