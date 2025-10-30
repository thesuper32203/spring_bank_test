

# BaseReportAckConstraints


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**analyticsReportData** | [**AnalyticsReportData**](AnalyticsReportData.md) |  |  [optional] |
|**accountIds** | **List&lt;String&gt;** | An array of account IDs to be included in the report (all accounts will be included if not set) |  [optional] |
|**reportCustomFields** | [**List&lt;ReportCustomField&gt;**](ReportCustomField.md) | The &#x60;reportCustomFields&#x60; parameter is used when experiences are associated with a credit decisioning report.  Designate up to 5 custom fields that you&#39;d like associated with the report when it&#39;s generated. Every custom field consists of three variables: &#x60;label&#x60;, &#x60;value&#x60;, and &#x60;shown&#x60;. The &#x60;shown&#x60; variable is \&quot;true\&quot; or \&quot;false\&quot;. * \&quot;true\&quot;: (default) display the custom field in the PDF report * \&quot;false\&quot;: don&#39;t display the custom field in the PDF report  For an experience that generates multiple reports, the &#x60;reportCustomFields&#x60; parameter gets passed to all reports.  All custom fields display in the Reseller Billing API. |  [optional] |
|**fromDate** | **Long** | A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**showNsf** | **Boolean** | Include the non-sufficient funds (NSF) summary JSON and the NSF summary PDF section in the report. Data included: * Account  * Total number of NSF funds  * Days since the most recent NFS funds fee |  [optional] |
|**incomeStreamConfidenceMinimum** | **Integer** | Include income streams in the report, based on the income stream&#39;s confidence score. For example, Use the value 50 to include only income streams with a confidence score of 50 or higher. |  [optional] |
|**voieWithInterviewData** | [**VOIEWithInterviewData**](VOIEWithInterviewData.md) |  |  |
|**voieWithStatementData** | [**VOIEWithStatementData**](VOIEWithStatementData.md) |  |  |
|**statementReportData** | [**StatementData**](StatementData.md) |  |  |
|**toDate** | **Long** | A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**includePending** | **Boolean** | If pending transactions must be included |  [optional] |
|**findTransaction** | [**List&lt;FindTransactionConstraintsInner&gt;**](FindTransactionConstraintsInner.md) | An array of parameters used to return transactions matching the given criteria. The presence of multiple parameters will be treated as an **AND**  function. |  [optional] |
|**incomeFromDate** | **Long** | A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/).  By default, the income history is set to 24 months, however, a partner can change the transaction history by setting the &#x60;incomeFromDate&#x60; parameter. |  [optional] |
|**voaiPdfDepositView** | **Boolean** | Provide an alternate PDF view of deposit transactions group by income stream in PDF. |  [optional] |
|**payrollData** | [**PayrollDataOut**](PayrollDataOut.md) |  |  |
|**payStatementsFromDate** | **Long** | A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**reportId** | **String** | A report ID |  [optional] |
|**paystatementReport** | [**PayStatementData**](PayStatementData.md) |  |  |



