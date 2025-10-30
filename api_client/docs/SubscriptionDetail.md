

# SubscriptionDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subscriptionId** | **String** | A unique UUID identifier for the subscription. |  |
|**url** | **String** | The webhook Url where the event notifications will be sent. The URL must be aligned with RFC 2396. |  [optional] |
|**events** | [**List&lt;Event&gt;**](Event.md) | List of events for the subscription. |  |
|**status** | **String** | The status of the event (e.g. active, inactive, pending, removed). |  |
|**createdDate** | **OffsetDateTime** | Subcription creation date. |  |
|**lastUpdatedDate** | **OffsetDateTime** | Subcription last updated date. |  |



