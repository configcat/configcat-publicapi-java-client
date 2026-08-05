

# ChangeRequestModel

Detailed Change Request model with all information including proposed changes, comments, and approvals.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**changeRequestId** | **Long** | Identifier of the Change Request. |  |
|**configId** | **UUID** | Identifier of the Config. |  |
|**environmentId** | **UUID** | Identifier of the Environment. |  |
|**changeRequestStatus** | **ChangeRequestStatus** |  |  |
|**needsAttention** | **Boolean** | Indicates whether the Change Request needs attention. |  |
|**title** | **String** | Title of the Change Request. |  |
|**reason** | **String** | Optional notes describing the purpose of the Change Request. |  |
|**applyAt** | **OffsetDateTime** | Optional UTC date and time when the Change Request should be applied automatically. |  |
|**createdAt** | **OffsetDateTime** | The UTC date and time when the Change Request was created. |  |
|**creatorUserEmail** | **String** | Email of the user who created the Change Request. |  |
|**creatorUserFullName** | **String** | Full name of the user who created the Change Request. |  |
|**creatorUserId** | **String** | Identifier of the creator user. |  |
|**settingValues** | [**List&lt;ChangeRequestProposedChangeModel&gt;**](ChangeRequestProposedChangeModel.md) | List of proposed setting values in the Change Request. |  |
|**comments** | [**List&lt;ChangeRequestCommentModel&gt;**](ChangeRequestCommentModel.md) | List of comments on the Change Request. |  |
|**approved** | **Boolean** | Indicates whether the Change Request has been approved. |  |
|**approvals** | [**List&lt;ChangeRequestApprovalModel&gt;**](ChangeRequestApprovalModel.md) | List of approvals for the Change Request. |  |
|**activities** | [**List&lt;ChangeRequestActivityModel&gt;**](ChangeRequestActivityModel.md) | List of activities (history) on the Change Request. |  |
|**changeRequestIssues** | [**List&lt;ChangeRequestIssueModel&gt;**](ChangeRequestIssueModel.md) | List of issues encountered with the Change Request. |  |
|**appliedAt** | **OffsetDateTime** | Optional UTC date and time when the Change Request was applied. |  |
|**appliedByUserId** | **String** | Identifier of the user who applied the Change Request. |  |
|**appliedByUserEmail** | **String** | Email of the user who applied the Change Request. |  |
|**appliedByUserFullName** | **String** | Full name of the user who applied the Change Request. |  |
|**closedAt** | **OffsetDateTime** | Optional UTC date and time when the Change Request was closed. |  |
|**closedByUserId** | **String** | Identifier of the user who closed the Change Request. |  |
|**closedByUserEmail** | **String** | Email of the user who closed the Change Request. |  |
|**closedByUserFullName** | **String** | Full name of the user who closed the Change Request. |  |
|**bypassApproval** | **Boolean** | Indicates whether approval flow is bypassed. |  |



