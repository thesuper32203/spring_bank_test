

# PaymentEnablementBundle


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerId** | **String** | A customer ID. See Add Customer API for how to create a customer ID. |  |
|**errorCount** | **Integer** | The number of errors or failures that have occurred while processing the API request. If all the requested parameters are returned successfully then this value will be 0. Any value other than zero indicates failures. |  |
|**accountCount** | **Integer** | Total number of accounts returned. |  [optional] |
|**accountIdentitySuccessCount** | **Integer** | Total number of successful sections returned when requesting accountIdentity. If not provided, value will be 0. |  [optional] |
|**balanceDetailsSuccessCount** | **Integer** | Total number of successful sections returned when requesting balanceDetails. If not provided, value will be 0. |  [optional] |
|**paymentInstructionSuccessCount** | **Integer** | Total number of successful sections returned when requesting paymentInstruction. If not provided, value will be 0. |  [optional] |
|**accounts** | [**List&lt;PEBAccountDetails&gt;**](PEBAccountDetails.md) | List of Account Details |  |



