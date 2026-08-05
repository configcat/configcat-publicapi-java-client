

# ChangeRequestActivityModel

Model representing an activity/event in a Change Request's history.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**changeRequestActivityId** | **Long** | Identifier of the Change Request activity. |  |
|**changeRequestActivityType** | **ChangeRequestActivityType** |  |  |
|**date** | **OffsetDateTime** | The UTC date and time when the activity occurred. |  |
|**userId** | **String** | Identifier of the user who triggered the activity. |  |
|**userFullName** | **String** | Full name of the user who triggered the activity. |  |
|**userEmail** | **String** | Email of the user who triggered the activity. |  |
|**details** | **String** | Detailed description of the activity. |  |
|**error** | **String** | Optional error message if the activity failed. |  |



