

# SegmentModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**product** | [**ProductModel**](ProductModel.md) |  |  |
|**segmentId** | **UUID** | Identifier of the Segment. |  |
|**name** | **String** | Name of the Segment. |  |
|**description** | **String** | Description of the Segment. |  |
|**creatorEmail** | **String** | The email of the user who created the Segment. |  |
|**creatorFullName** | **String** | The name of the user who created the Segment. |  |
|**createdAt** | **OffsetDateTime** | The date and time when the Segment was created. |  |
|**lastUpdaterEmail** | **String** | The email of the user who last updated the Segment. |  |
|**lastUpdaterFullName** | **String** | The name of the user who last updated the Segment. |  |
|**updatedAt** | **OffsetDateTime** | The date and time when the Segment was last updated. |  |
|**comparisonAttribute** | **String** | The user&#39;s attribute the evaluation process must take into account. |  |
|**comparator** | **RolloutRuleComparator** |  |  |
|**comparisonValue** | **String** | The value to compare with the given user attribute&#39;s value. |  |



