

# PayrollVOIEIncomeRecord


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payFrequency** | **String** | The current pay frequency or how often a regular pay check is:  * &#x60;Daily&#x60;  * &#x60;Weekly&#x60;  * &#x60;Bi-Weekly&#x60;  * &#x60;Semi-Monthly&#x60;  * &#x60;Monthly&#x60;  * &#x60;Quarterly&#x60;  * &#x60;Semi-Annual&#x60;  * &#x60;Annual&#x60;  * &#x60;Every 2.6 wks&#x60;  * &#x60;Every 4 wks&#x60;  * &#x60;Every 5.2 wks&#x60;  * &#x60;Other&#x60;  * &#x60;Unknown&#x60;  |  [optional] |
|**payType** | **String** | The current pay type:  * &#x60;Salary&#x60;  * &#x60;Hourly&#x60;  * &#x60;Daily&#x60;  |  [optional] |
|**basePayRate** | **BigDecimal** | The current base or regular pay rate. Please use in conjunction with the &#x60;basePayRateUnit&#x60; field. |  [optional] |
|**basePayRateUnit** | **String** | Unit for the base pay rate:  * &#x60;Hourly&#x60;  * &#x60;Daily&#x60;  * &#x60;Weekly&#x60;  * &#x60;Bi-Weekly&#x60;  * &#x60;Semi-Monthly&#x60;  * &#x60;Monthly&#x60;  * &#x60;Quarterly&#x60;  * &#x60;Semi-Annual&#x60;  * &#x60;Annual&#x60;  * &#x60;Every 2.6 wks&#x60;  * &#x60;Every 5.2 wks&#x60;  * &#x60;Other&#x60;  |  [optional] |
|**oldestPayStatementAvailable** | **String** | The date of the oldest direct pay statement available from the payroll source, as measured by the oldest &#x60;payDate&#x60; from all the pay statements delivered. |  [optional] |
|**annualIncome** | [**List&lt;AnnualIncome&gt;**](AnnualIncome.md) | The annual pay for the current year, through prior year 2 (as available)  This is a mandatory field only for VOIE-payroll report type. |  [optional] |
|**monthlyIncome** | [**MonthlyIncome**](MonthlyIncome.md) |  |  [optional] |
|**directPayStatements** | [**List&lt;DirectPayStatements&gt;**](DirectPayStatements.md) | An array of payment histories for each available paycheck |  [optional] |



