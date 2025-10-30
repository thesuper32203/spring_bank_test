

# ThirdPartyAccessReceipt

An object representing consent receipt

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**profile** | **Integer** | Representation of the type of consent receipt |  [optional] |
|**version** | **String** | A schema version of receipt |  [optional] |
|**receiptId** | **String** | This is officially the Consent Receipt ID, but is aliased as the Access Key ID. This is a unique identifier managed by Finicity that points to the contents of this JSON document. |  [optional] |
|**customerId** | **String** | This is recipient&#39;s customerId represented as a pseudo identifier |  [optional] |
|**partnerId** | **String** | Your Partner ID displayed in the [Developer Dashboard](https://developer.mastercard.com/account/log-in) |  [optional] |
|**products** | [**List&lt;ThirdPartyAccessProduct&gt;**](ThirdPartyAccessProduct.md) |  |  [optional] |
|**provenance** | [**ThirdPartyAccessProvenance**](ThirdPartyAccessProvenance.md) |  |  [optional] |
|**timestamp** | **OffsetDateTime** | A date-time with time zone |  [optional] |



