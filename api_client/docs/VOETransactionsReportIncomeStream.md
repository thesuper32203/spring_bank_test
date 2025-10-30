

# VOETransactionsReportIncomeStream


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Income stream ID |  |
|**name** | **String** | A human-readable name based on the &#x60;normalizedPayee&#x60; name of the transactions for this income stream |  |
|**status** | **String** | Possible values: \&quot;ACTIVE\&quot;, \&quot;INACTIVE\&quot; |  |
|**estimateInclusion** | **String** | Possible values: \&quot;HIGH\&quot;, \&quot;MODERATE\&quot;, \&quot;LOW\&quot;, \&quot;NO\&quot; |  |
|**confidence** | **Integer** | Level of confidence that the deposit stream represents income (example: 85%) |  |
|**cadence** | [**CadenceDetails**](CadenceDetails.md) |  |  |
|**daysSinceLastTransaction** | **Integer** | The number of days since the last credit transaction for the particular income stream |  |
|**nextExpectedTransactionDate** | **Long** | The next expected credit transaction date for the particular income stream, based on the cadence |  |
|**incomeStreamMonths** | **Integer** | The number of months the income transactions are observed |  [optional] |
|**transactions** | [**List&lt;ReportTransaction&gt;**](ReportTransaction.md) | A list of transaction records |  |



