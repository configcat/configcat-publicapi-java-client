

# UpdateRolloutRuleModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**comparisonAttribute** | **String** | The user attribute to compare. |  [optional] |
|**comparator** | **RolloutRuleComparator** |  |  [optional] |
|**comparisonValue** | **String** | The value to compare against. |  [optional] |
|**value** | [**SettingValueType**](SettingValueType.md) | The value to serve when the comparison matches. It must respect the setting type. In some generated clients for strictly typed languages you may use double/float properties to handle integer values. |  |
|**segmentComparator** | **SegmentComparator** |  |  [optional] |
|**segmentId** | **UUID** | The segment to compare against. |  [optional] |



