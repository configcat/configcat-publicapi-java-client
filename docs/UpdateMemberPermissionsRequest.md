

# UpdateMemberPermissionsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**permissionGroupIds** | **List&lt;Long&gt;** | List of Permission Group identifiers to where the Member should be added. |  [optional] |
|**isAdmin** | **Boolean** | Indicates that the member must be Organization Admin. |  [optional] |
|**isBillingManager** | **Boolean** | Indicates that the member must be Billing Manager. |  [optional] |
|**removeFromPermissionGroupsWhereIdNotSet** | **Boolean** | When &#x60;true&#x60;, the member will be removed from those Permission Groups that are not listed in the &#x60;permissionGroupIds&#x60; field. |  [optional] |



