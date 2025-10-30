

# PostInstitutionsInstitutionIdOauthUrlsRequest

Used to request an oauth url for a given a given institution and customer.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**redirectURI** | **URI** | The &#x60;redirectURI&#x60; will be called when the oauth session has completed. |  |
|**customerId** | **String** | A customer ID. See Add Customer API for how to create a customer ID. |  |
|**configurationId** | **UUID** | Unique identifier of the configuration object |  [optional] |
|**serviceAgreement** | [**ServiceAgreement**](ServiceAgreement.md) |  |  |



