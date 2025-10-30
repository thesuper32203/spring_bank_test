

# CustomerAccountPosition

Details for investment account holdings

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The ID of the investment position |  [optional] |
|**description** | **String** | The description of the holding |  [optional] |
|**symbol** | **String** | The investment position&#39;s market ticker symbol |  [optional] |
|**units** | **BigDecimal** | The number of units of the holding |  [optional] |
|**currentPrice** | **BigDecimal** | The current price of the investment holding |  [optional] |
|**securityName** | **String** | The security name for the investment holding |  [optional] |
|**transactionType** | **String** | The transaction type of the holding, such as cash, margin, and more |  [optional] |
|**marketValue** | **BigDecimal** | Market value of an investment position at the time of retrieval |  [optional] |
|**changePercent** | **BigDecimal** | The percent change in value since the previous day |  [optional] |
|**dailyChange** | **BigDecimal** | The value amount change since the previous day |  [optional] |
|**costBasis** | **BigDecimal** | The total cost of acquiring the security |  [optional] |
|**holdType** | **String** | The type of the holding |  [optional] |
|**invSecurityType** | **String** | The security type for the investment holding |  [optional] |
|**status** | **String** | The status of the holding |  [optional] |
|**currentPriceDate** | **Long** | A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**securityType** | **String** | Type of security for the investment position |  [optional] |
|**mfType** | **String** | Type of mutual fund, such as open ended |  [optional] |
|**posType** | **String** | Fund type assigned by the FI (long or short) |  [optional] |
|**totalGLDollar** | **BigDecimal** | Total gain and loss of the position at the time of aggregation in dollars |  [optional] |
|**totalGLPercent** | **BigDecimal** | Total gain and loss of the position at the time of aggregation in percentage |  [optional] |
|**optionStrikePrice** | **BigDecimal** | The strike price of the option contract |  [optional] |
|**optionType** | **String** | The type of option contract (PUT or CALL) |  [optional] |
|**optionSharesPerContract** | **BigDecimal** | The number of shares per option contract |  [optional] |
|**optionExpireDate** | **LocalDate** | Expiration date of option |  [optional] |
|**fiAssetClass** | **String** | Financial Institution (FI) defined asset class (COMMON STOCK, COMNEQTY, EQUITY/STOCK, CMA-ISA, CONVERTIBLE PREFERREDS, CORPORATE BONDS, OTHER MONEY FUNDS, ALLOCATION FUNDS, CMA-TAXABLE, FOREIGNEQUITYADRS, COMMONSTOCK, PREFERRED STOCKS, STABLE VALUE, FOREIGN EQUITY ADRS) |  [optional] |
|**assetClass** | **String** | An asset class is a grouping of comparable financial securities. These include equities (stocks), fixed income (bonds), and cash equivalent or money market instruments. (DOMESTICBOND, LARGESTOCK, INTLSTOCK, MONEYMRKT, OTHER) |  [optional] |
|**currencyRate** | **BigDecimal** | Currency rate, ratio of currency to original currency |  [optional] |
|**securityId** | **String** | The security ID of the transaction |  [optional] |
|**securityIdType** | **String** | The security type. This field is related to the &#x60;securityId&#x60; field. Possible values: * \&quot;CUSIP\&quot;  * \&quot;ISIN\&quot;  * \&quot;SEDOL\&quot;  * \&quot;SICC\&quot;  * \&quot;VALOR\&quot;  * \&quot;WKN\&quot; |  [optional] |
|**costBasisPerShare** | **BigDecimal** | The per share cost of acquiring the security |  [optional] |
|**subAccountType** | **String** | The subaccount&#39;s type, such as cash |  [optional] |
|**securityCurrency** | **String** | Symbol for the currency that the account is being converted into |  [optional] |
|**todayGLDollar** | **BigDecimal** | The current day&#39;s gain and loss of the position at the time of aggregation in dollars |  [optional] |
|**todayGLPercent** | **BigDecimal** | The current day&#39;s gain and loss of the position at the time of aggregation in percentage |  [optional] |



