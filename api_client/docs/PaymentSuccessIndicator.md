

# PaymentSuccessIndicator


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | PSI error code for this scenario |  [optional] |
|**message** | **String** | Detailed reason about the source of the error |  [optional] |
|**customerId** | **String** | A customer ID. See Add Customer API for how to create a customer ID. |  |
|**accountId** | **String** | An account ID |  |
|**payReqId** | **String** | The unique ID that represents the response generated for that specific, customer, account, and transaction. |  |
|**settleByDate** | **LocalDate** | The expected date that the funds, from the consumer’s account, will be moved to the receiving account.  &#x60;settleByDate&#x60; in ISO 8601 date format (YYYY-MM-DD). &#x60;settleByDate&#x60; dictates the number of days the model responds with. The response can range from 3-10 days, including &#x60;day0&#x60;. Details explained below: 1. If &#x60;settleByDate&#x60; is 9 or more days out from today, the response includes 10 days of data, &#x60;day0&#x60; through &#x60;day9&#x60;. 2. If &#x60;settleByDate&#x60; is between 3 and 8 days out from today, the response includes 4-9 days of data, &#x60;day3-8&#x60;. 3. If &#x60;settleByDate&#x60; is between today and 2 days out from today, the response includes 3 days of data, &#x60;day0&#x60; through &#x60;day2&#x60;. |  |
|**settlementAmount** | **BigDecimal** | The transaction amount in USD $. |  |
|**availableBalance** | **BigDecimal** | The available balance provided, by the consumer’s financial institution, at the time of the request. |  |
|**indicatorsByDay** | [**List&lt;Indicator&gt;**](Indicator.md) | An Array of 3-10 days, providing the potentialSettlementDate, compositeScore, scoreIndicator, and reasons. |  |



