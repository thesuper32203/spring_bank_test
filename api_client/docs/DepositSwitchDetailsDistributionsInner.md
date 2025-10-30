

# DepositSwitchDetailsDistributionsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | The type of distribution for the account.  Possible values include &#x60;total&#x60;, &#x60;percent&#x60;, or &#x60;fixed&#x60;. |  |
|**allocatedValue** | **BigDecimal** | The amount being distributed to the account. When distribution type is &#x60;percent&#x60;, this number represents a percentage of the total pay. When distribution type is &#x60;fixed&#x60;, this number represents a fixed dollar amount. This value is not set when distribution type is &#x60;total&#x60;. |  [optional] |
|**bankIdentifier** | **String** | The bank routing number |  |
|**accountNumberEndsWith** | **String** | The trailing portion of customer&#39;s bank account number |  |



