

# ThirdPartyAccessProduct

Product for which access token to be generated

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**product** | **String** | Third party access token can be generated for the following product types:   * \&quot;moneyTransferDetails\&quot;: Retrieve account details for money transfer * \&quot;availableBalance\&quot;: Retrieves the latest cached available and cleared     account balances for an account. * \&quot;availableBalanceLive\&quot;: Retrieves the available and cleared account balances live from the financial institution * \&quot;accountOwner\&quot;: Retrieves names and addresses of the account owner from a financial institution. * \&quot;paymentIndicator\&quot;: Get the Payment Success Indicator response, scoring the likelihood of payment settlement |  |
|**payorId** | **String** | The Finicity Partner ID who should be billed when the Requester requests data from Finicity. If no value specified, then the Recipient will be billed. |  [optional] |
|**maxCalls** | **Integer** | Max number of calls to the consented product (consented API) |  [optional] |
|**accountId** | **String** | An account ID |  |
|**accessPeriod** | [**ThirdPartyAccessPeriod**](ThirdPartyAccessPeriod.md) |  |  |



