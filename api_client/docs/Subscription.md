

# Subscription

Request body to create or update a subscription.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **String** | The webhook Url where the event notifications will be sent. The URL must be aligned with RFC 2396. |  [optional] |
|**events** | [**List&lt;WebhookEvent&gt;**](WebhookEvent.md) | List of webhook subscription event. |  |



