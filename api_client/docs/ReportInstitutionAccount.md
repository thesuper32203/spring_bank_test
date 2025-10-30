

# ReportInstitutionAccount

An account record

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The ID of the account |  |
|**ownerName** | **String** | The name(s) of the account owner(s). If the owner information is not available, this field will not appear in the report. If the account has multiple owners then all owners will be listed separated by |. |  [optional] |
|**ownerAddress** | **String** | The mailing address of the account owner(s). If the owner information is not available, this field will not appear in the report. If the account has multiple owners then the address of the primary owner will be listed. |  [optional] |
|**ownerAsOfDate** | **Long** | The ownerAsOfDate field is populated if the account owner information was retrieved from a prior report and will show the created date of that report. Reports always try and aggregate fresh account owner information and only rarely aren&#39;t able to aggregate it. If account owner information is not able to be aggregated, but it was available from a prior report that had that same account, the information from that prior report will be used and this field will be populated. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/errors/error-list/#handling-epoch-dates-and-times). |  [optional] |
|**name** | **String** | The account name from the institution |  |
|**number** | **String** | The account number from the institution (all digits except the last four are obfuscated) |  |
|**type** | **String** | The list of supported account types. * &#x60;checking&#x60; * &#x60;savings&#x60; * &#x60;moneyMarket&#x60; * &#x60;cd&#x60; * &#x60;investment&#x60; * &#x60;investmentTaxDeferred&#x60; * &#x60;employeeStockPurchasePlan&#x60; * &#x60;ira&#x60; * &#x60;401k&#x60; * &#x60;roth&#x60; * &#x60;403b&#x60; * &#x60;529&#x60; * &#x60;rollover&#x60; * &#x60;ugma&#x60; * &#x60;utma&#x60; * &#x60;keogh&#x60; * &#x60;457&#x60; * &#x60;401a&#x60; * &#x60;unknown&#x60; * &#x60;mortgage&#x60; * &#x60;loan&#x60; * &#x60;creditCard&#x60; * &#x60;lineOfCredit&#x60; * &#x60;payroll&#x60; * &#x60;studentLoan&#x60; * &#x60;brokerageAccount&#x60; * &#x60;educationSavings&#x60; * &#x60;healthSavingsAccount&#x60; * &#x60;nonTaxableBrokerageAccount&#x60; * &#x60;pension&#x60; * &#x60;profitSharingPlan&#x60; * &#x60;roth401k&#x60; * &#x60;sepIRA&#x60; * &#x60;simpleIRA&#x60; * &#x60;thriftSavingsPlan&#x60; * &#x60;variableAnnuity&#x60; |  |
|**currency** | **String** | A currency code for account |  |
|**aggregationStatusCode** | **Integer** | The status of the most recent aggregation attempt |  |
|**currentBalance** | **BigDecimal** | Current balance of the account |  [optional] |
|**availableBalance** | **BigDecimal** | The available balance for the account |  [optional] |
|**balanceDate** | **Long** | A timestamp showing when the balance was captured by the FI |  [optional] |
|**transactions** | [**List&lt;ReportTransactionNewTxBased&gt;**](ReportTransactionNewTxBased.md) | a list of transaction records |  |
|**details** | [**AccountDetailsTxBased**](AccountDetailsTxBased.md) |  |  [optional] |
|**analytics** | [**AccountAnalytics**](AccountAnalytics.md) |  |  [optional] |
|**cashFlowBalance** | [**CashFlowCashFlowBalance**](CashFlowCashFlowBalance.md) |  |  [optional] |
|**cashFlowCredit** | [**CashFlowCashFlowCredit**](CashFlowCashFlowCredit.md) |  |  [optional] |
|**cashFlowDebit** | [**CashFlowCashFlowDebit**](CashFlowCashFlowDebit.md) |  |  [optional] |
|**cashFlowCharacteristic** | [**CashFlowCashFlowCharacteristic**](CashFlowCashFlowCharacteristic.md) |  |  [optional] |
|**balance** | **BigDecimal** | The cleared balance of the account as-of &#x60;balanceDate&#x60; |  [optional] |
|**averageMonthlyBalance** | **BigDecimal** | The average monthly balance of this account |  [optional] |
|**totNumberInsufficientFundsFeeDebitTxAccount** | **Long** | The count for the total number of insufficient funds transactions, based on the &#x60;fromDate&#x60; of the report. |  [optional] |
|**totNumberInsufficientFundsFeeDebitTxOver6MonthsAccount** | **Integer** | The total number of  insufficient funds fees for the account over six months |  [optional] |
|**totNumberDaysSinceMostRecentInsufficientFundsFeeDebitTxAccount** | **Long** | The number of days since the most recent insufficient funds transaction, based on the &#x60;fromDate&#x60; of the report. |  [optional] |
|**asset** | [**PrequalificationReportAssetSummary**](PrequalificationReportAssetSummary.md) |  |  [optional] |
|**oldestTransactionDate** | **Long** | The oldest transaction date of this account. |  [optional] |
|**transactionsCount** | **Long** | A number detailing the total number of transactions for a given account. |  [optional] |
|**totNumberInsufficientFundsFeeDebitTxOver2MonthsAccount** | **Long** | The count for the total number of insufficient funds transactions for the last two months, based on the &#x60;fromDate&#x60; of the report. |  [optional] |
|**position** | [**ReportAccountPosition**](ReportAccountPosition.md) |  |  [optional] |
|**incomeStreams** | [**List&lt;VOIETXVerifyReportIncomeStream&gt;**](VOIETXVerifyReportIncomeStream.md) | A list of income stream records |  [optional] |
|**beginningBalance** | **BigDecimal** | Beginning balance of account per the time period in the report |  [optional] |
|**miscDeposits** | [**List&lt;ReportTransaction&gt;**](ReportTransaction.md) | A list of miscellaneous deposits |  [optional] |



