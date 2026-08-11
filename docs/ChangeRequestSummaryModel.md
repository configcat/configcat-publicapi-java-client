

# ChangeRequestSummaryModel

Summary of a Change Request with essential information for list views.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**changeRequestId** | **Long** | Identifier of the Change Request. |  |
|**changeRequestStatus** | **ChangeRequestStatus** |  |  |
|**needsAttention** | **Boolean** | Indicates whether the Change Request needs attention. |  |
|**title** | **String** | Title of the Change Request. |  |
|**reason** | **String** | Optional notes describing the purpose of the Change Request. |  |
|**applyAt** | **OffsetDateTime** | Optional UTC date and time when the Change Request should be applied automatically. |  |
|**createdAt** | **OffsetDateTime** | The UTC date and time when the Change Request was created. |  |
|**creatorUserEmail** | **String** | Email of the user who created the Change Request. |  |
|**creatorUserFullName** | **String** | Full name of the user who created the Change Request. |  |
|**creatorUserId** | **String** | Identifier of the creator user. |  |
|**affectedSettingKeys** | **List&lt;String&gt;** | List of the keys of Settings affected by this Change Request. |  |
|**commentCount** | **Integer** | Number of comments on the Change Request. |  |
|**approved** | **Boolean** | Indicates whether the Change Request has been approved. |  |
|**conflictCount** | **Integer** | Number of conflicting settings in the Change Request. |  |
|**bypassApproval** | **Boolean** | Indicates whether approval flow is bypassed. |  |
|**appliedAt** | **OffsetDateTime** | Optional UTC date and time when the Change Request was applied. |  |
|**appliedByUserId** | **String** | Identifier of the user who applied the Change Request. |  |
|**appliedByUserEmail** | **String** | Email of the user who applied the Change Request. |  |
|**appliedByUserFullName** | **String** | Full name of the user who applied the Change Request. |  |
|**closedAt** | **OffsetDateTime** | Optional UTC date and time when the Change Request was closed. |  |
|**closedByUserId** | **String** | Identifier of the user who closed the Change Request. |  |
|**closedByUserEmail** | **String** | Email of the user who closed the Change Request. |  |
|**closedByUserFullName** | **String** | Full name of the user who closed the Change Request. |  |



