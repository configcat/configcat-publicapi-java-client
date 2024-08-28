

# CodeReferenceModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**branch** | **String** | The source control branch on where the scan was performed. (Source of the branch selector on the ConfigCat Dashboard) |  [optional] |
|**references** | [**List&lt;ReferenceLines&gt;**](ReferenceLines.md) | The actual references to the given Feature Flag or Setting. |  [optional] |
|**commitUrl** | **String** | The related commit&#39;s URL. |  [optional] |
|**commitHash** | **String** | The related commit&#39;s hash. |  [optional] |
|**syncedAt** | **OffsetDateTime** | The date and time when the reference report was uploaded. |  [optional] |
|**repository** | **String** | The source control repository that contains the scanned code. |  [optional] |
|**codeReferenceId** | **UUID** | The identifier of the reference report. |  [optional] |
|**uploader** | **String** | The code reference scanning tool&#39;s name. |  [optional] |



