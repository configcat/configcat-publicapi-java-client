

# AuditLogSettingValueV2EvaluationFormulaTargetingRuleModel

A targeting rule that specifies conditions and value(s) to return when those conditions are met.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**value** | [**ValueModel**](ValueModel.md) |  |  |
|**valuePredefinedVariationName** | **String** | Optional name of the predefined variation for the value. |  |
|**conditions** | [**List&lt;AuditLogSettingValueV2EvaluationFormulaConditionModel&gt;**](AuditLogSettingValueV2EvaluationFormulaConditionModel.md) | List of conditions that must be satisfied for this targeting rule to apply. |  |
|**percentageOptions** | [**List&lt;AuditLogSettingValueV2EvaluationFormulaPercentageOptionModel&gt;**](AuditLogSettingValueV2EvaluationFormulaPercentageOptionModel.md) | List of percentage options when percentage-based user bucketing (for A/B testing) is used in the targeting rule. |  |



