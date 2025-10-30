

# AvailableBalance


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | A customer ID represented as a number. See Add Customer API for how to create a customer ID. |  |
|**realAccountNumberLast4** | **String** | The last 4 digits of the ACH account number |  |
|**availableBalance** | **BigDecimal** | The available balance of the account |  |
|**availableBalanceDate** | **Long** | A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  |
|**clearedBalance** | **BigDecimal** | The cleared balance of the account. Also referred as posted balance, current balance, ledger balance |  |
|**clearedBalanceDate** | **Long** | A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  |
|**aggregationStatusCode** | **Integer** | The status of the most recent aggregation attempt (see [Aggregation Status Codes](https://developer.mastercard.com/open-banking-us/documentation/products/manage/account-aggregation/#aggregation-status-codes)). Won&#39;t be present until you have run your first aggregation for the account. |  |
|**currency** | **String** | A currency code |  |



