

# SegmentModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**product** | [**ProductModel**](ProductModel.md) |  |  [optional] |
|**segmentId** | **UUID** | Identifier of the Segment. |  [optional] |
|**name** | **String** | Name of the Segment. |  [optional] |
|**description** | **String** | Description of the Segment. |  [optional] |
|**creatorEmail** | **String** | The email of the user who created the Segment. |  [optional] |
|**creatorFullName** | **String** | The name of the user who created the Segment. |  [optional] |
|**createdAt** | **OffsetDateTime** | The date and time when the Segment was created. |  [optional] |
|**lastUpdaterEmail** | **String** | The email of the user who last updated the Segment. |  [optional] |
|**lastUpdaterFullName** | **String** | The name of the user who last updated the Segment. |  [optional] |
|**updatedAt** | **OffsetDateTime** | The date and time when the Segment was last updated. |  [optional] |
|**comparisonAttribute** | **String** | The user&#39;s attribute the evaluation process must take into account. |  [optional] |
|**comparator** | **RolloutRuleComparator** |  |  [optional] |
|**comparisonValue** | **String** | The value to compare with the given user attribute&#39;s value. |  [optional] |



