

# JsonPatchOperation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**op** | [**OpEnum**](#OpEnum) | The JSON Patch operation. (https://jsonpatch.com) |  |
|**path** | **String** | The source path. |  |
|**from** | **String** | The target path. |  [optional] |
|**value** | **Object** | The discrete value. |  [optional] |



## Enum: OpEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| ADD | &quot;add&quot; |
| REMOVE | &quot;remove&quot; |
| REPLACE | &quot;replace&quot; |
| MOVE | &quot;move&quot; |
| COPY | &quot;copy&quot; |
| TEST | &quot;test&quot; |



