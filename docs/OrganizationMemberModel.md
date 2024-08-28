

# OrganizationMemberModel

Describes an Organization Member.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **String** | Identifier of the Organization Admin. |  [optional] |
|**fullName** | **String** | Name of the Organization Admin. |  [optional] |
|**email** | **String** | Email of the OrganizationAdmin. |  [optional] |
|**twoFactorEnabled** | **Boolean** | Determines whether 2FA is enabled for the Organization Admin. |  [optional] |
|**permissions** | [**List&lt;OrganizationPermissionModel&gt;**](OrganizationPermissionModel.md) | The permissions of the Member. |  [optional] |



