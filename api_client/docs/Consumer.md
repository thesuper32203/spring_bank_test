

# Consumer

A Mastercard Open Finance consumer record

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A consumer ID. See Create Consumer API for how to create a consumer ID. |  |
|**firstName** | **String** | The first name of the account holder |  |
|**lastName** | **String** | The last name of the account holder |  |
|**customerId** | **Long** | A customer ID represented as a number. See Add Customer API for how to create a customer ID. |  |
|**address** | **String** | A street address |  |
|**city** | **String** | City |  |
|**state** | **String** | State |  |
|**zip** | **String** | A ZIP code |  |
|**phone** | **String** | A phone number (max length 15). |  |
|**ssn** | **String** | Last 4 digits of a SSN |  |
|**birthday** | [**Birthday**](Birthday.md) |  |  |
|**email** | **String** | An email address |  |
|**createdDate** | **Long** | A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  |
|**suffix** | **String** | A generational or academic suffix |  [optional] |
|**endUser** | [**ConsumerEndUser**](ConsumerEndUser.md) |  |  [optional] |



