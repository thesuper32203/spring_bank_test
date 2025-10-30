

# Error

A single error.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**source** | **String** | The application that generated this error |  [optional] |
|**reasonCode** | **String** | A unique constant identifying the error case encountered during transaction processing |  [optional] |
|**description** | **String** | Description of the ReasonCode field with additional details. |  [optional] |
|**recoverable** | **Boolean** | Indicates whether this error will always be returned for this request, or retrying could change the outcome |  [optional] |
|**details** | **String** | Details for backwards compatibility. |  [optional] |



