

# PEBAccountDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | An account ID |  |
|**realAccountNumberLast4** | **String** | The last 4 digits of the ACH account number |  [optional] |
|**institutionId** | **String** | The ID of a financial institution |  |
|**institutionName** | **String** | The name of the institution |  |
|**institutionLoginId** | **Long** | An institution login ID (from the account record), represented as a number |  |
|**accountDetails** | [**AccountSimpleDetails**](AccountSimpleDetails.md) |  |  [optional] |
|**balanceDetails** | [**AvailableBalancePEB**](AvailableBalancePEB.md) |  |  [optional] |
|**accountIdentity** | [**AccountOwnerHolders**](AccountOwnerHolders.md) |  |  [optional] |
|**paymentInstruction** | [**PaymentInstructionPEB**](PaymentInstructionPEB.md) |  |  [optional] |
|**errors** | [**List&lt;FieldError&gt;**](FieldError.md) | Lists of errors while getting the data |  [optional] |



