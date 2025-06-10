

# CodeReferenceModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**branch** | **String** | The source control branch on where the scan was performed. (Source of the branch selector on the ConfigCat Dashboard) |  |
|**references** | [**List&lt;ReferenceLinesModel&gt;**](ReferenceLinesModel.md) | The actual references to the given Feature Flag or Setting. |  |
|**commitUrl** | **String** | The related commit&#39;s URL. |  |
|**commitHash** | **String** | The related commit&#39;s hash. |  |
|**syncedAt** | **OffsetDateTime** | The date and time when the reference report was uploaded. |  |
|**repository** | **String** | The source control repository that contains the scanned code. |  |
|**codeReferenceId** | **UUID** | The identifier of the reference report. |  |
|**uploader** | **String** | The code reference scanning tool&#39;s name. |  |



