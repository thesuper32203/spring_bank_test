

# BalanceAndCashFlowAnalyticsReportConstraints

Request parameters from the partner to control the customer accounts included in the report, and the length of time to report on.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountIds** | **List&lt;Long&gt;** | The list of account IDs to include in the report. If omitted, all accounts on record for the customer will be used. |  [optional] |
|**lengthOfReport** | **Integer** | Number of days to search for transactions. Must be one of 30, 90, 180, 270, 365, or 730. If omitted, defaults to 2 years from current time at which the request was received (730 days). |  [optional] |



