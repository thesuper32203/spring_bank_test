

# VOIEPaystubWithStatementPayStatement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payPeriod** | **String** | The pay period of the pay statement |  [optional] |
|**billable** | **Boolean** | This will display true if the pay statement is billable. If a pay statement has been digitized previously, this will display as false as it will not be billable. |  |
|**assetId** | **String** | The asset ID of the stored pay statement |  |
|**payDate** | **Long** | The listed pay date for the pay statement |  [optional] |
|**startDate** | **Long** | The beginning of the pay period |  [optional] |
|**endDate** | **Long** | The end of the pay period |  [optional] |
|**netPayCurrent** | **BigDecimal** | The total pay after deductions for the employee for the current pay period |  [optional] |
|**netPayYTD** | **BigDecimal** | The total accumulation of pay after deductions for the employee for the current pay year |  [optional] |
|**grossPayCurrent** | **BigDecimal** | The total pay before deductions for the employee for the current pay period |  [optional] |
|**grossPayYTD** | **BigDecimal** | The total accumulation of pay before deductions for the employee for the current pay year |  [optional] |
|**payrollProvider** | **String** | The payroll provider extracted from the pay statement |  [optional] |
|**employer** | [**Employer**](Employer.md) |  |  |
|**employee** | [**Employee**](Employee.md) |  |  |
|**payStat** | [**List&lt;PayStat&gt;**](PayStat.md) | Information pertaining to the earnings on the pay statement |  |
|**directDeposits** | [**List&lt;DirectDeposit&gt;**](DirectDeposit.md) | Information pertaining to the direct deposits on the pay statement |  [optional] |
|**institutions** | **List&lt;String&gt;** | Not populated for the voieWithStatement style of paystub report. For the VOIE - Paystub (with TXVerify) reports this would include details of the financial institution accounts and income streams with matching transactions to the pay statement. |  |
|**errorCode** | **Integer** | Error code for the asset |  [optional] |
|**errorMessage** | **String** | Error message for the asset |  [optional] |
|**monthlyIncome** | [**PaystubTxVerifyMonthlyIncomeRecord**](PaystubTxVerifyMonthlyIncomeRecord.md) |  |  |



