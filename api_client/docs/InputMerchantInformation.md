

# InputMerchantInformation

InputMerchantInformation is an object containing merchant details in the request body.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantDescriptor** | **String** | This is a concatenated combination of DE43 merchant name, DE43 merchant city and DE43 merchant state. Spaces should be excluded when concatenating these fields. If merchant state is not provided by the acquirer, use merchant name and city only. If the acquirer provides a country code instead of a state, use a combination of merchant name, city, and country. |  [optional] |
|**name** | **String** | Name of the merchant. |  [optional] |
|**line1** | **String** | Line 1 of the transaction address. |  [optional] |
|**city** | **String** | City of the transaction. |  [optional] |
|**state** | **String** | State of the transaction. |  [optional] |
|**postalCode** | **String** | PostalCode of the transaction. |  [optional] |
|**country** | **String** | Country of the transaction. |  [optional] |
|**phoneNumber** | **String** | The phone number of the merchant |  [optional] |
|**website** | **String** | Website of the involved entity. |  [optional] |
|**merchantCategoryCode** | **String** | This code represents the category that a merchant location may be under and is supported by most payment providers. |  [optional] |
|**merchantCategoryName** | **String** | This is the name of the Merchant Category that accompanies the MCC Code which identifies the category a merchant falls under. |  [optional] |



