

# ReportTransactionNewTxBased


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | A transaction ID |  |
|**amount** | **BigDecimal** | The total amount of the transaction. Transactions for deposits are positive values, withdrawals and debits are negative values. |  [optional] |
|**postedDate** | **Long** | A timestamp showing when the transaction was posted or cleared by the institution |  |
|**description** | **String** | The description of the transaction, as provided by the institution (often known as &#x60;payee&#x60;). In the event that this field is left blank by the institution, Finicity will pass a value of \&quot;No description provided by institution\&quot;. All other values are provided by the institution. |  |
|**memo** | **String** | The memo field of the transaction, as provided by the institution. The institution must provide either a description, a memo, or both. It is recommended to concatenate the two fields into a single value. |  [optional] |
|**normalizedPayee** | **String** | A normalized payee, derived from the transaction&#39;s &#x60;description&#x60; and &#x60;memo&#x60; fields |  [optional] |
|**institutionTransactionId** | **String** | The unique identifier given by the FI for each transaction |  [optional] |
|**category** | **String** | One of the values from Categories (assigned based on the payee name) |  [optional] |
|**type** | **String** | One of the values from transaction types |  [optional] |
|**securityType** | **String** | The type of investment security (VOA only) |  [optional] |
|**symbol** | **String** | Investment symbol (VOA only) |  [optional] |
|**commission** | **BigDecimal** | A commission amount |  [optional] |
|**investmentTransactionType** | **String** | Keywords in the description and memo fields were used to translate investment transactions into these types  * &#x60;cancel&#x60;  * &#x60;purchaseToClose&#x60;  * &#x60;purchaseToCover&#x60;  * &#x60;contribution&#x60;  * &#x60;optionExercise&#x60;  * &#x60;optionExpiration&#x60;  * &#x60;fee&#x60;  * &#x60;soldToClose&#x60;  * &#x60;soldToOpen&#x60;  * &#x60;split&#x60;  * &#x60;transfer&#x60;  * &#x60;returnOfCapital&#x60;  * &#x60;income&#x60;  * &#x60;purchased&#x60;  * &#x60;sold&#x60;  * &#x60;dividendReinvest&#x60;  * &#x60;dividend&#x60;  * &#x60;reinvestOfIncome&#x60;  * &#x60;interest&#x60;  * &#x60;deposit&#x60;  * &#x60;otherInfo&#x60;  |  [optional] |



