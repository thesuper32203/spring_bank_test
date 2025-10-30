

# VOIEPayStatement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payPeriod** | **String** | The pay period of the pay statement |  [optional] |
|**billable** | **Boolean** | Designates whether the pay statement is billable |  [optional] |
|**assetId** | **String** | The asset ID of the stored pay statement |  [optional] |
|**payDate** | **Long** | The listed pay date for the pay statement |  [optional] |
|**startDate** | **Long** | The beginning of the pay period |  [optional] |
|**endDate** | **Long** | The end of the pay period |  [optional] |
|**netPayCurrent** | **BigDecimal** | The total pay after deductions for the employee for the current pay period |  [optional] |
|**netPayYTD** | **BigDecimal** | The total accumulation of pay after deductions for the employee for the current pay year |  [optional] |
|**grossPayCurrent** | **BigDecimal** | The total pay before deductions for the employee for the current pay period |  [optional] |
|**grossPayYTD** | **BigDecimal** | The total accumulation of pay before deductions for the employee for the current pay year |  [optional] |
|**payrollProvider** | **String** | The company that provides the pay stub. |  [optional] |
|**matchType** | **String** | The statement match category. Possible values:    * \&quot;NET_PAY_MATCH\&quot;     * \&quot;SPLIT_INTERVIEW_AMOUNT_SUM_TO_NET_PAY_MATCH\&quot;     * \&quot;SPLIT_DIRECT_DEPOSIT_SUM_TO_NET_PAY_MATCH\&quot;     * \&quot;SPLIT_LESS_THAN_NET_PAY_SUM_TO_NET_PAY_MATCH\&quot;     * \&quot;PARTIAL\&quot;     * \&quot;TRANSACTION_DATE_RANGE_INVALID\&quot;     * \&quot;NO_MATCH\&quot; |  [optional] |
|**employer** | [**Employer**](Employer.md) |  |  [optional] |
|**employee** | [**Employee**](Employee.md) |  |  [optional] |
|**payStat** | [**List&lt;PayStat&gt;**](PayStat.md) | Information pertaining to the earnings on the pay statement |  [optional] |
|**deductions** | [**List&lt;Deduction&gt;**](Deduction.md) | Information pertaining to deductions on the pay statement |  [optional] |
|**directDeposits** | [**List&lt;DirectDeposit&gt;**](DirectDeposit.md) | Information pertaining to direct deposits on the pay statement |  [optional] |



