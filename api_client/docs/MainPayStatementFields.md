

# MainPayStatementFields


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payDate** | **Long** | Pay date for the pay period |  |
|**startDate** | **Long** | Start date for the pay period |  [optional] |
|**endDate** | **Long** | End date for the pay period |  [optional] |
|**payPeriodHours** | **BigDecimal** | Sum of all hours worked each week for the pay period |  [optional] |
|**payFrequency** | **String** | The current pay frequency, or how often a regular pay check is distributed:  * &#x60;Daily&#x60;  * &#x60;Weekly&#x60;  * &#x60;Bi-Weekly&#x60;  * &#x60;Semi-Monthly&#x60;  * &#x60;Monthly&#x60;  * &#x60;Quarterly&#x60;  * &#x60;Semi-Annual&#x60;  * &#x60;Annual&#x60;  * &#x60;Every 2.6 wks&#x60;  * &#x60;Every 4 wks&#x60;  * &#x60;Every 5.2 wks&#x60;  * &#x60;Other&#x60;  |  [optional] |
|**payType** | **String** | Current pay type:  * &#x60;Salary&#x60;  * &#x60;Hourly&#x60;  * &#x60;Daily&#x60;  |  [optional] |
|**grossPayAmount** | **BigDecimal** | Gross pay amount for the pay period |  |
|**grossPayAmountYTD** | **BigDecimal** | Year to date (YTD) gross pay amount at the time of payment |  [optional] |
|**netPayAmount** | **BigDecimal** | Net pay amount for a pay period |  [optional] |
|**netPayAmountYTD** | **BigDecimal** | Year to date (YTD) net pay amount at the time of payment |  [optional] |



