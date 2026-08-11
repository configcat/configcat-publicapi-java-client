

# AuditLogSettingValueV2EvaluationFormulaConditionModel

A condition that needs to be evaluated to determine if a targeting rule applies to a user. Conditions can be based on user attributes, segments, or prerequisite settings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conditionType** | **ConditionType** |  |  |
|**comparisonAttribute** | **String** | The name of the user attribute to compare. (For User Conditions.) |  |
|**userComparator** | **UserComparator** |  |  |
|**comparisonValue** | [**ComparisonValueModel**](ComparisonValueModel.md) |  |  |
|**segmentComparator** | **SegmentComparator** |  |  |
|**segmentId** | **UUID** | The ID of the segment referenced in this condition. (For Segment Conditions.) |  |
|**segmentName** | **String** | The name of the segment referenced in this condition. (For Segment Conditions.) |  |
|**prerequisiteComparator** | **PrerequisiteComparator** |  |  |
|**prerequisiteSettingId** | **Integer** | The ID of the prerequisite setting referenced. (For Flag Conditions.) |  |
|**prerequisiteSettingKey** | **String** | The key identifier of the prerequisite setting. (For Flag Conditions.) |  |
|**prerequisiteComparisonValue** | [**ValueModel**](ValueModel.md) |  |  |
|**prerequisiteComparisonValuePredefinedVariationName** | **String** | Optional name of the predefined variation for the prerequisite comparison value. (For Flag Conditions.) |  |



