

# CashFlowTransactionAnalyticsAttributes

Transaction Analytics Attributes

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activityDepositsCreditsForTheReportTimePeriod** | [**List&lt;CashFlowActivityDepositsCredits&gt;**](CashFlowActivityDepositsCredits.md) | List of all deposit transactions posted to the account during the report period |  |
|**activityWithdrawalsDebitsForTheReportTimePeriod** | [**List&lt;CashFlowActivityWithdrawalsDebits&gt;**](CashFlowActivityWithdrawalsDebits.md) | List of all withdrawal transactions posted to the account during the report period |  |
|**averageTransactionValueByMonthForTheReportTimePeriod** | [**List&lt;ObbDateRangeAndAmount&gt;**](ObbDateRangeAndAmount.md) | Average value of transactions during periods in the report. Values may be positive or negative |  |
|**historicWeeksWithZeroTransactions** | [**CashFlowNumWeeksZeros**](CashFlowNumWeeksZeros.md) |  |  [optional] |
|**lastTransactionDate** | [**List&lt;CashFlowTransactionAnalyticsAttributesLastTransactionDateInner&gt;**](CashFlowTransactionAnalyticsAttributesLastTransactionDateInner.md) | Latest posted transaction(s) to the account. May be more than one if they share the same timestamp |  [optional] |
|**netCashFlowByMonthForTheReportTimePeriod** | [**List&lt;ObbDateRangeAndAmount&gt;**](ObbDateRangeAndAmount.md) | Net cash flow for each month during the report period |  [optional] |
|**netCashFlowForTheReportTimePeriod** | **BigDecimal** | Net cash flow during the report period (may be positive or negative) |  [optional] |



