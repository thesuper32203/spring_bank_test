

# PayStat


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The normalized category of the earnings with a number appended. The number is the will be the iterating number of the type&#39;s occurrence starting at one. |  [optional] |
|**type** | **String** | The categorization based on the earning line&#39;s description. Possible values: * \&quot;bereavement\&quot;  * \&quot;bonus\&quot;  * \&quot;commission\&quot;  * \&quot;holiday\&quot;  * \&quot;jury duty\&quot;  * \&quot;overtime\&quot;  * \&quot;pension\&quot;  * \&quot;pto\&quot;  * \&quot;regular\&quot;  * \&quot;sick\&quot;  * \&quot;tips\&quot;  * \&quot;unknown\&quot;  * \&quot;vacation\&quot;  * \&quot;reimbursement\&quot;  * \&quot;stock\&quot;  * \&quot;benefit\&quot; |  [optional] |
|**description** | **String** | The earnings line&#39;s pay type description |  [optional] |
|**rate** | **BigDecimal** | The rate for the earning line paid out to the employee for the specified pay period. |  [optional] |
|**units** | **BigDecimal** | The units for the earning line paid out to the employee for the specified pay period. |  [optional] |
|**amountCurrent** | **BigDecimal** | The amount for the earning line paid out to the employee for the specified pay period. |  [optional] |
|**amountYTD** | **BigDecimal** | The amount for the earning line being paid out to the employee for the current pay year. |  [optional] |



