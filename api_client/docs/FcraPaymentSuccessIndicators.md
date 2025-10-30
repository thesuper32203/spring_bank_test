

# FcraPaymentSuccessIndicators

A Payment Success Indicators score response, indicating how likely a transaction is to be returned. NSF and Unauthorized return risks are provided if the score has a status of SUCCESS, or the captured errors are listed if the score has a status of FAILURE.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payRequestId** | **String** | Unique identifier of the Payments request |  |
|**status** | **String** | Current status of the score generation. Possible values are \&quot;IN PROGRESS\&quot;, \&quot;SUCCESS\&quot;, \&quot;FAILURE\&quot; |  |
|**customerId** | **String** | A customer ID. See Add Customer API for how to create a customer ID. |  |
|**accountId** | **String** | An account ID |  |
|**requestDate** | **LocalDate** | The ISO 8601 format (YYYY-MM-DD) date of the request. |  |
|**transaction** | [**PaymentSuccessIndicatorsTransaction**](PaymentSuccessIndicatorsTransaction.md) |  |  |
|**nsfReturnRisk** | [**FcraNsfReturnRisk**](FcraNsfReturnRisk.md) |  |  [optional] |
|**unauthorizedReturnRisk** | [**UnauthorizedReturnRisk**](UnauthorizedReturnRisk.md) |  |  [optional] |



