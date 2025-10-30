

# ReportTransactionBase2


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**normalizedPayee** | **String** | A normalized payee, derived from the transaction&#39;s &#x60;description&#x60; and &#x60;memo&#x60; fields |  [optional] |
|**institutionTransactionId** | **String** | The unique identifier given by the FI for each transaction |  [optional] |
|**category** | **String** | One of the values from Categories (assigned based on the payee name) |  [optional] |
|**type** | **String** | One of the values from transaction types |  [optional] |
|**securityType** | **String** | The type of investment security (VOA only) |  [optional] |
|**symbol** | **String** | Investment symbol (VOA only) |  [optional] |
|**commission** | **BigDecimal** | A commission amount |  [optional] |



