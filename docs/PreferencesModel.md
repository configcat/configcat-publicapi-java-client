

# PreferencesModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reasonRequired** | **Boolean** | Indicates that a mandatory note required for saving and publishing. |  [optional] |
|**keyGenerationMode** | [**KeyGenerationModeEnum**](#KeyGenerationModeEnum) | Determines the Feature Flag key generation mode. |  [optional] |
|**showVariationId** | **Boolean** | Indicates whether a variation ID&#39;s must be shown on the ConfigCat Dashboard. |  [optional] |
|**reasonRequiredEnvironments** | [**List&lt;ReasonRequiredEnvironmentModel&gt;**](ReasonRequiredEnvironmentModel.md) | List of Environments where mandatory note must be set before saving and publishing. |  [optional] |
|**mandatorySettingHint** | **Boolean** | Indicates whether Feature flags and Settings must have a hint. |  [optional] |



## Enum: KeyGenerationModeEnum

| Name | Value |
|---- | -----|
| CAMEL_CASE | &quot;camelCase&quot; |
| LOWER_CASE | &quot;lowerCase&quot; |
| UPPER_CASE | &quot;upperCase&quot; |
| PASCAL_CASE | &quot;pascalCase&quot; |
| KEBAB_CASE | &quot;kebabCase&quot; |



