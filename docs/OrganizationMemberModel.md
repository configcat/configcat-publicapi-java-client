

# OrganizationMemberModel

Describes an Organization Member.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **String** | Identifier of the Organization Admin. |  |
|**fullName** | **String** | Name of the Organization Admin. |  |
|**email** | **String** | Email of the OrganizationAdmin. |  |
|**twoFactorEnabled** | **Boolean** | Determines whether 2FA is enabled for the Organization Admin. |  |
|**permissions** | [**List&lt;OrganizationPermissionModel&gt;**](OrganizationPermissionModel.md) | The permissions of the Member. |  |



