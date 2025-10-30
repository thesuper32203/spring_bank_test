

# FcraNsfReturnRiskResult

The successful result of the execution of the nsf return risk

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**disputeStatement** | **String** | A message mentioning if/what type of dispute exists for the customer\&quot; |  [optional] |
|**availableBalance** | **BigDecimal** | The available balance provided, by the consumer’s financial institution, at the time of the request. |  |
|**dailyResults** | [**List&lt;NsfIndicator&gt;**](NsfIndicator.md) | An Array of 3-10 days, providing the potentialSettlementDate, score, indicator, and reasons. |  |



