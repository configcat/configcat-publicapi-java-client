

# CreateChangeRequestModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title of the Change Request. |  |
|**reason** | **String** | The optional notes describing the purpose of the Change Request. This will appear in the Audit Log (in the Notes section when you expand the corresponding entry) upon applying the change request. |  [optional] |
|**applyAt** | **OffsetDateTime** | The optional UTC date and time when the scheduled Change Request should be applied automatically. |  [optional] |
|**bypassApproval** | **Boolean** | When true, bypasses required approval checks for scheduled changes. |  [optional] |
|**proposedChanges** | [**List&lt;CreateChangeRequestProposedChangeModel&gt;**](CreateChangeRequestProposedChangeModel.md) | The list of models describing the proposed changes to the Settings included in the new Change Request. |  [optional] |



