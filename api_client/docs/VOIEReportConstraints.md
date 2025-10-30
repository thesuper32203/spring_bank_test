

# VOIEReportConstraints

The request details from the report generation that were used to generate the report

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**voieWithStatementData** | [**VOIEWithStatementData**](VOIEWithStatementData.md) |  |  |
|**reportCustomFields** | [**List&lt;ReportCustomField&gt;**](ReportCustomField.md) | The &#x60;reportCustomFields&#x60; parameter is used when experiences are associated with a credit decisioning report.  Designate up to 5 custom fields that you&#39;d like associated with the report when it&#39;s generated. Every custom field consists of three variables: &#x60;label&#x60;, &#x60;value&#x60;, and &#x60;shown&#x60;. The &#x60;shown&#x60; variable is \&quot;true\&quot; or \&quot;false\&quot;. * \&quot;true\&quot;: (default) display the custom field in the PDF report * \&quot;false\&quot;: don&#39;t display the custom field in the PDF report  For an experience that generates multiple reports, the &#x60;reportCustomFields&#x60; parameter gets passed to all reports.  All custom fields display in the Reseller Billing API. |  [optional] |



