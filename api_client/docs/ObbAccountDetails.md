

# ObbAccountDetails

Details of the account and financial institution

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountNumberDisplay** | **String** | The account number from a financial institution in truncated format |  [optional] |
|**accountOwner** | [**ObbAccountOwner**](ObbAccountOwner.md) |  |  |
|**aggregationAttemptDate** | **String** | A timestamp showing the last aggregation attempt. This will not be present until you have run your first aggregation for the account. |  [optional] |
|**aggregationStatusCode** | **Integer** | The status of the most recent aggregation attempt. This will not be present until you have run your first aggregation for the account |  [optional] |
|**aggregationSuccessDate** | **String** | A timestamp showing the last successful aggregation of the account. This will not be present until you have run your first aggregation for the account. |  [optional] |
|**currency** | **String** | The currency of the account |  [optional] |
|**currentBalance** | **BigDecimal** | Current reported balance of the account |  [optional] |
|**id** | **Long** | An account ID represented as a number |  |
|**institution** | [**ObbInstitution**](ObbInstitution.md) |  |  |
|**institutionLoginId** | **Long** | An institution login ID (from the account record), represented as a number |  [optional] |
|**name** | **String** | The account name from the institution |  [optional] |
|**realAccountNumberLast4** | **Integer** | The last 4 digits of the ACH account number |  [optional] |
|**status** | **String** | pending during account discovery, always active following successful account activation |  [optional] |
|**type** | **String** | Account type, e.g. checking/saving |  [optional] |



