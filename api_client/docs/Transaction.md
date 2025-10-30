

# Transaction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | A transaction ID |  |
|**amount** | **BigDecimal** | The total amount of the transaction. Transactions for deposits are positive values, withdrawals and debits are negative values. |  |
|**accountId** | **Long** | An account ID represented as a number |  |
|**customerId** | **Long** | A customer ID represented as a number. See Add Customer API for how to create a customer ID. |  |
|**status** | **String** | One of \&quot;active\&quot;, \&quot;pending\&quot;, or \&quot;shadow\&quot; (see [Transaction Status](https://developer.mastercard.com/open-banking-us/documentation/products/manage/transaction-data/#transaction-status)) |  |
|**description** | **String** | The description value is from the financial institution (FI), often known as the payee. The value \&quot;No description provided by institution\&quot; is returned when the FI doesn&#39;t provide one |  |
|**memo** | **String** | The institution must provide either a description, a memo, or both. We recommended concatenating the two fields into a single value. |  [optional] |
|**type** | **String** | If provided by the institution, the following values may be returned in the field of a record: * \&quot;atm\&quot;  * \&quot;cash\&quot;  * \&quot;check\&quot;  * \&quot;credit\&quot;  * \&quot;debit\&quot;  * \&quot;deposit\&quot;  * \&quot;directDebit\&quot;  * \&quot;directDeposit\&quot;  * \&quot;dividend\&quot;  * \&quot;fee\&quot;  * \&quot;interest\&quot;  * \&quot;other\&quot;  * \&quot;payment\&quot;  * \&quot;pointOfSale\&quot;  * \&quot;repeatPayment\&quot;  * \&quot;serviceCharge\&quot;  * \&quot;transfer\&quot; |  [optional] |
|**transactionDate** | **Long** | A date in Unix epoch time (in seconds). Represents the timestamp of the transaction when it occurred. See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**postedDate** | **Long** | A date in Unix epoch time (in seconds). Represents the timestamp of the transaction when it was posted or cleared by the institution. This value isn&#39;t required for student loan transaction data. See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**createdDate** | **Long** | A date in Unix epoch time (in seconds). Represents the timestamp of the transaction when it was added to our platform. See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  |
|**firstEffectiveDate** | **Long** | A date in Unix epoch time (in seconds). Represents the first timestamp of the transaction recorded in the &#x60;effectiveDate&#x60; field. See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**effectiveDate** | **Long** | A date in Unix epoch time (in seconds). Represents the timestamp of the transaction when it became effective on an account by an institution. See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**optionExpireDate** | **Long** | A date in Unix epoch time (in seconds). Represents the timestamp of the transaction expiration date when it became expires on an account by an institution. See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**checkNum** | **String** | The check number of the transaction |  [optional] |
|**escrowAmount** | **BigDecimal** | The portion of the transaction allocated to escrow |  [optional] |
|**feeAmount** | **BigDecimal** | The portion of the overall transaction amount applied to fees |  [optional] |
|**suspenseAmount** | **BigDecimal** | Temporarily hold funds if you overpay or underpay your monthly payment |  [optional] |
|**interestAmount** | **BigDecimal** | The portion of the transaction allocated to interest |  [optional] |
|**principalAmount** | **BigDecimal** | The portion of the transaction allocated to principal |  [optional] |
|**optionStrikePrice** | **BigDecimal** | The strike price of the option contract |  [optional] |
|**unitQuantity** | **BigDecimal** | The number of units (individual shares) in the transaction |  [optional] |
|**unitPrice** | **BigDecimal** | Share price for the investment unit: stocks, mutual funds, ETFs |  [optional] |
|**categorization** | [**Categorization**](Categorization.md) |  |  [optional] |
|**runningBalanceAmount** | **BigDecimal** | The ending balance after the transaction was posted |  [optional] |
|**subaccountSecurityType** | **String** | The type of sub account the funds came from |  [optional] |
|**commissionAmount** | **Integer** | Transaction commission |  [optional] |
|**ticker** | **String** | Ticker symbol for the investment related to the transaction |  [optional] |
|**investmentTransactionType** | **String** | Keywords in the &#x60;description&#x60; and &#x60;memo&#x60; fields were used to translate investment transactions into these types.  Possible values: * \&quot;cancel\&quot;  * \&quot;purchaseToClose\&quot;  * \&quot;purchaseToCover\&quot;  * \&quot;contribution\&quot;  * \&quot;optionExercise\&quot;  * \&quot;optionExpiration\&quot;  * \&quot;fee\&quot;  * \&quot;soldToClose\&quot;  * \&quot;soldToOpen\&quot;  * \&quot;split\&quot;  * \&quot;transfer\&quot;  * \&quot;returnOfCapital\&quot;  * \&quot;income\&quot;  * \&quot;purchased\&quot;  * \&quot;sold\&quot;  * \&quot;dividendReinvest\&quot;  * \&quot;tax\&quot;  * \&quot;dividend\&quot;  * \&quot;reinvestOfIncome\&quot;  * \&quot;interest\&quot;  * \&quot;deposit\&quot;  * \&quot;otherInfo\&quot; |  [optional] |
|**taxesAmount** | **Integer** | Taxes applicable to the investment trade |  [optional] |
|**currencySymbol** | **String** | If the foreign amount value is present then this is the currency code of that foreign amount |  [optional] |
|**incomeType** | **String** | Capital gains applied in short, long, or miscellaneous terms for tax purposes |  [optional] |
|**splitDenominator** | **BigDecimal** | Denominator of the stock split for the transaction |  [optional] |
|**splitNumerator** | **BigDecimal** | Numerator of the stock split for the transaction |  [optional] |
|**sharesPerContract** | **BigDecimal** | Shares per contract of the underlying stock option |  [optional] |
|**subAccountFund** | **String** | The sub account where the funds came from |  [optional] |
|**securityId** | **String** | The security ID of the transaction |  [optional] |
|**securityIdType** | **String** | The security type. This field is related to the &#x60;securityId&#x60; field. Possible values: * \&quot;CUSIP\&quot;  * \&quot;ISIN\&quot;  * \&quot;SEDOL\&quot;  * \&quot;SICC\&quot;  * \&quot;VALOR\&quot;  * \&quot;WKN\&quot; |  [optional] |



