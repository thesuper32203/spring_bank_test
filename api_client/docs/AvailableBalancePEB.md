

# AvailableBalancePEB


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | An account ID represented as a number |  [optional] |
|**realAccountNumberLast4** | **String** | The last 4 digits of the ACH account number |  |
|**availableBalance** | **Double** | The available balance of the account |  |
|**availableBalanceDate** | **OffsetDateTime** | A date-time with time zone |  |
|**clearedBalance** | **Double** | The cleared balance of the account. Also referred as posted balance, current balance, ledger balance |  |
|**clearedBalanceDate** | **OffsetDateTime** | A date-time with time zone |  |
|**aggregationStatusCode** | **Integer** | The status of the most recent aggregation attempt (see [Aggregation Status Codes](https://developer.mastercard.com/open-banking-us/documentation/products/manage/account-aggregation/#aggregation-status-codes)). Won&#39;t be present until you have run your first aggregation for the account. |  |
|**currency** | **String** | A currency code |  |



