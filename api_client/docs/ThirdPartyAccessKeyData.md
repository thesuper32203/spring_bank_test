

# ThirdPartyAccessKeyData

An object representing the third party access key request  * `customerId`: This is recipient's customer identifier * `partnerId`: This is recipient partner identifier * `thirdPartyPartnerId`: This is requester's partner identifier * `products`: Array of values representing the Mastercard Open Finance APIs for which access needs to be generated.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerId** | **String** | A customer ID. See Add Customer API for how to create a customer ID. |  |
|**partnerId** | **String** | Your Partner ID displayed in the [Developer Dashboard](https://developer.mastercard.com/account/log-in) |  |
|**thirdPartyPartnerId** | **String** | Your Partner ID displayed in the [Developer Dashboard](https://developer.mastercard.com/account/log-in) |  |
|**provenance** | [**ThirdPartyAccessProvenance**](ThirdPartyAccessProvenance.md) |  |  [optional] |
|**products** | [**List&lt;ThirdPartyAccessProduct&gt;**](ThirdPartyAccessProduct.md) |  |  |



