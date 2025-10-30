# WebhookSubscriptionApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**changeWebhookSubscriptionEventStatus**](WebhookSubscriptionApi.md#changeWebhookSubscriptionEventStatus) | **PUT** /notification-subscriptions/webhooks/{subscription_id}/events/{webhook_event_id}/status | Enable or disable Webhook Subscription Event |
| [**changeWebhookSubscriptionStatus**](WebhookSubscriptionApi.md#changeWebhookSubscriptionStatus) | **PUT** /notification-subscriptions/webhooks/{subscription_id}/status | Enable or disable all the webhook event under a given webhook subscription |
| [**createWebhookSubscription**](WebhookSubscriptionApi.md#createWebhookSubscription) | **POST** /notification-subscriptions/webhooks | Create Webhook Subscription |
| [**deleteWebhookSubscription**](WebhookSubscriptionApi.md#deleteWebhookSubscription) | **DELETE** /notification-subscriptions/webhooks/{subscription_id} | Delete Webhook Subscription |
| [**deleteWebhookSubscriptionEvent**](WebhookSubscriptionApi.md#deleteWebhookSubscriptionEvent) | **DELETE** /notification-subscriptions/webhooks/{subscription_id}/events/{webhook_event_id} | Delete Webhook Subscription Event |
| [**getWebhookSubscriptionById**](WebhookSubscriptionApi.md#getWebhookSubscriptionById) | **GET** /notification-subscriptions/webhooks/{subscription_id} | Get Webhook Subscription Details |
| [**listAvailableWebhookSubscriptionEvents**](WebhookSubscriptionApi.md#listAvailableWebhookSubscriptionEvents) | **GET** /notification-subscriptions/webhooks/events | List Available Webhook Subscription Events |
| [**listWebhookSubscriptions**](WebhookSubscriptionApi.md#listWebhookSubscriptions) | **GET** /notification-subscriptions/webhooks | List Webhook Subscriptions |
| [**testWebhookSubscription**](WebhookSubscriptionApi.md#testWebhookSubscription) | **GET** /notification-subscriptions/webhooks/{subscription_id}/test-subscriptions | Test Webhook Subscription Based on Subscription id |
| [**testWebhookSubscriptionBasedOnEventId**](WebhookSubscriptionApi.md#testWebhookSubscriptionBasedOnEventId) | **GET** /notification-subscriptions/webhooks/{subscription_id}/events/{webhook_event_id}/test-subscriptions | Test Webhook Subscription Based on Subscription id &amp; Webhook event id. |
| [**updateWebhookSubscription**](WebhookSubscriptionApi.md#updateWebhookSubscription) | **PUT** /notification-subscriptions/webhooks/{subscription_id} | Update Webhook Subscription |
| [**updateWebhookSubscriptionEvent**](WebhookSubscriptionApi.md#updateWebhookSubscriptionEvent) | **PUT** /notification-subscriptions/webhooks/{subscription_id}/events/{webhook_event_id} | Update Webhook Subscription Event |


<a id="changeWebhookSubscriptionEventStatus"></a>
# **changeWebhookSubscriptionEventStatus**
> EventStatusUpdate changeWebhookSubscriptionEventStatus(subscriptionId, webhookEventId, eventStatusUpdate, xExternalRequestId)

Enable or disable Webhook Subscription Event

Enables or disables a specific webhook event within a subscription identified by subscription ID and webhook event ID. Update the event&#39;s status to either active or inactive.   _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebhookSubscriptionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.finicity.com");
    
    // Configure API key authorization: FinicityAppToken
    ApiKeyAuth FinicityAppToken = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppToken");
    FinicityAppToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //FinicityAppToken.setApiKeyPrefix("Token");

    // Configure API key authorization: FinicityAppKey
    ApiKeyAuth FinicityAppKey = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppKey");
    FinicityAppKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //FinicityAppKey.setApiKeyPrefix("Token");

    WebhookSubscriptionApi apiInstance = new WebhookSubscriptionApi(defaultClient);
    String subscriptionId = "661f3c48-f596-423b-81f5-d275d4dd1345"; // String | A unique UUID identifier of a webhook subscription.
    String webhookEventId = "661f3c48-f596-423b-81f5-d275d4dd1346"; // String | A unique UUID identifier of a webhook event.
    EventStatusUpdate eventStatusUpdate = new EventStatusUpdate(); // EventStatusUpdate | Request body to an event active or inactive.
    String xExternalRequestId = "f6250b41-8632-4fe1-9353-899f419ae67b"; // String | A unique identifier for the request.
    try {
      EventStatusUpdate result = apiInstance.changeWebhookSubscriptionEventStatus(subscriptionId, webhookEventId, eventStatusUpdate, xExternalRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookSubscriptionApi#changeWebhookSubscriptionEventStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **subscriptionId** | **String**| A unique UUID identifier of a webhook subscription. | |
| **webhookEventId** | **String**| A unique UUID identifier of a webhook event. | |
| **eventStatusUpdate** | [**EventStatusUpdate**](EventStatusUpdate.md)| Request body to an event active or inactive. | |
| **xExternalRequestId** | **String**| A unique identifier for the request. | [optional] |

### Return type

[**EventStatusUpdate**](EventStatusUpdate.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Event updated successfully |  -  |
| **400** | Bad Request |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;App-Key\&quot; or \&quot;App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

<a id="changeWebhookSubscriptionStatus"></a>
# **changeWebhookSubscriptionStatus**
> EventStatusUpdate changeWebhookSubscriptionStatus(subscriptionId, eventStatusUpdate, xExternalRequestId)

Enable or disable all the webhook event under a given webhook subscription

Enables or disables all webhook subscription event for partner. Update the  status to either active or inactive. _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebhookSubscriptionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.finicity.com");
    
    // Configure API key authorization: FinicityAppToken
    ApiKeyAuth FinicityAppToken = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppToken");
    FinicityAppToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //FinicityAppToken.setApiKeyPrefix("Token");

    // Configure API key authorization: FinicityAppKey
    ApiKeyAuth FinicityAppKey = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppKey");
    FinicityAppKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //FinicityAppKey.setApiKeyPrefix("Token");

    WebhookSubscriptionApi apiInstance = new WebhookSubscriptionApi(defaultClient);
    String subscriptionId = "661f3c48-f596-423b-81f5-d275d4dd1345"; // String | A unique UUID identifier of a webhook subscription.
    EventStatusUpdate eventStatusUpdate = new EventStatusUpdate(); // EventStatusUpdate | Request body to an event active or inactive.
    String xExternalRequestId = "f6250b41-8632-4fe1-9353-899f419ae67b"; // String | A unique identifier for the request.
    try {
      EventStatusUpdate result = apiInstance.changeWebhookSubscriptionStatus(subscriptionId, eventStatusUpdate, xExternalRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookSubscriptionApi#changeWebhookSubscriptionStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **subscriptionId** | **String**| A unique UUID identifier of a webhook subscription. | |
| **eventStatusUpdate** | [**EventStatusUpdate**](EventStatusUpdate.md)| Request body to an event active or inactive. | |
| **xExternalRequestId** | **String**| A unique identifier for the request. | [optional] |

### Return type

[**EventStatusUpdate**](EventStatusUpdate.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Event updated successfully |  -  |
| **400** | Bad Request |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;App-Key\&quot; or \&quot;App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

<a id="createWebhookSubscription"></a>
# **createWebhookSubscription**
> SubscriptionDetail createWebhookSubscription(subscription, xExternalRequestId)

Create Webhook Subscription

Creates a new webhook subscription for receiving event notifications. You can specify the URL for receiving notifications and select the events to subscribe to, including any conditions for filtering. Each partner can have multiple subscriptions, and each subscription can cover multiple events. The API supports URL overrides at the event level, ensuring that each subscription is tailored to specific events and their respective requirements.   _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebhookSubscriptionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.finicity.com");
    
    // Configure API key authorization: FinicityAppToken
    ApiKeyAuth FinicityAppToken = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppToken");
    FinicityAppToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //FinicityAppToken.setApiKeyPrefix("Token");

    // Configure API key authorization: FinicityAppKey
    ApiKeyAuth FinicityAppKey = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppKey");
    FinicityAppKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //FinicityAppKey.setApiKeyPrefix("Token");

    WebhookSubscriptionApi apiInstance = new WebhookSubscriptionApi(defaultClient);
    Subscription subscription = new Subscription(); // Subscription | Request body for creating event subscription.
    String xExternalRequestId = "f6250b41-8632-4fe1-9353-899f419ae67b"; // String | A unique identifier for the request.
    try {
      SubscriptionDetail result = apiInstance.createWebhookSubscription(subscription, xExternalRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookSubscriptionApi#createWebhookSubscription");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **subscription** | [**Subscription**](Subscription.md)| Request body for creating event subscription. | |
| **xExternalRequestId** | **String**| A unique identifier for the request. | [optional] |

### Return type

[**SubscriptionDetail**](SubscriptionDetail.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Subscription created successfully |  -  |
| **400** | Bad Request |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;App-Key\&quot; or \&quot;App-Token\&quot;. |  -  |

<a id="deleteWebhookSubscription"></a>
# **deleteWebhookSubscription**
> deleteWebhookSubscription(subscriptionId, xExternalRequestId)

Delete Webhook Subscription

Deletes a subscription specified by its ID. Once deleted, the subscription and its associated events will no longer be active or receive notifications   _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebhookSubscriptionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.finicity.com");
    
    // Configure API key authorization: FinicityAppToken
    ApiKeyAuth FinicityAppToken = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppToken");
    FinicityAppToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //FinicityAppToken.setApiKeyPrefix("Token");

    // Configure API key authorization: FinicityAppKey
    ApiKeyAuth FinicityAppKey = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppKey");
    FinicityAppKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //FinicityAppKey.setApiKeyPrefix("Token");

    WebhookSubscriptionApi apiInstance = new WebhookSubscriptionApi(defaultClient);
    String subscriptionId = "661f3c48-f596-423b-81f5-d275d4dd1345"; // String | A unique UUID identifier of a webhook subscription.
    String xExternalRequestId = "f6250b41-8632-4fe1-9353-899f419ae67b"; // String | A unique identifier for the request.
    try {
      apiInstance.deleteWebhookSubscription(subscriptionId, xExternalRequestId);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookSubscriptionApi#deleteWebhookSubscription");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **subscriptionId** | **String**| A unique UUID identifier of a webhook subscription. | |
| **xExternalRequestId** | **String**| A unique identifier for the request. | [optional] |

### Return type

null (empty response body)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Subscription deleted successfully |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;App-Key\&quot; or \&quot;App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

<a id="deleteWebhookSubscriptionEvent"></a>
# **deleteWebhookSubscriptionEvent**
> deleteWebhookSubscriptionEvent(subscriptionId, webhookEventId, xExternalRequestId)

Delete Webhook Subscription Event

Deletes a specific webhook event from a subscription identified by subscription Id and webhook Event Id.   _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebhookSubscriptionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.finicity.com");
    
    // Configure API key authorization: FinicityAppToken
    ApiKeyAuth FinicityAppToken = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppToken");
    FinicityAppToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //FinicityAppToken.setApiKeyPrefix("Token");

    // Configure API key authorization: FinicityAppKey
    ApiKeyAuth FinicityAppKey = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppKey");
    FinicityAppKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //FinicityAppKey.setApiKeyPrefix("Token");

    WebhookSubscriptionApi apiInstance = new WebhookSubscriptionApi(defaultClient);
    String subscriptionId = "661f3c48-f596-423b-81f5-d275d4dd1345"; // String | A unique UUID identifier of a webhook subscription.
    String webhookEventId = "661f3c48-f596-423b-81f5-d275d4dd1346"; // String | A unique UUID identifier of a webhook event.
    String xExternalRequestId = "f6250b41-8632-4fe1-9353-899f419ae67b"; // String | A unique identifier for the request.
    try {
      apiInstance.deleteWebhookSubscriptionEvent(subscriptionId, webhookEventId, xExternalRequestId);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookSubscriptionApi#deleteWebhookSubscriptionEvent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **subscriptionId** | **String**| A unique UUID identifier of a webhook subscription. | |
| **webhookEventId** | **String**| A unique UUID identifier of a webhook event. | |
| **xExternalRequestId** | **String**| A unique identifier for the request. | [optional] |

### Return type

null (empty response body)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Event deleted successfully |  -  |
| **400** | Bad Request |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;App-Key\&quot; or \&quot;App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

<a id="getWebhookSubscriptionById"></a>
# **getWebhookSubscriptionById**
> SubscriptionDetail getWebhookSubscriptionById(subscriptionId, xExternalRequestId)

Get Webhook Subscription Details

Retrieves detailed information about a specific webhook subscription using the provided subscription ID. The response includes subscription details such as the events, conditions, and current status.   _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebhookSubscriptionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.finicity.com");
    
    // Configure API key authorization: FinicityAppToken
    ApiKeyAuth FinicityAppToken = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppToken");
    FinicityAppToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //FinicityAppToken.setApiKeyPrefix("Token");

    // Configure API key authorization: FinicityAppKey
    ApiKeyAuth FinicityAppKey = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppKey");
    FinicityAppKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //FinicityAppKey.setApiKeyPrefix("Token");

    WebhookSubscriptionApi apiInstance = new WebhookSubscriptionApi(defaultClient);
    String subscriptionId = "661f3c48-f596-423b-81f5-d275d4dd1345"; // String | A unique UUID identifier of a webhook subscription.
    String xExternalRequestId = "f6250b41-8632-4fe1-9353-899f419ae67b"; // String | A unique identifier for the request.
    try {
      SubscriptionDetail result = apiInstance.getWebhookSubscriptionById(subscriptionId, xExternalRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookSubscriptionApi#getWebhookSubscriptionById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **subscriptionId** | **String**| A unique UUID identifier of a webhook subscription. | |
| **xExternalRequestId** | **String**| A unique identifier for the request. | [optional] |

### Return type

[**SubscriptionDetail**](SubscriptionDetail.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Subscription detail by ID |  -  |
| **400** | Bad Request |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;App-Key\&quot; or \&quot;App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

<a id="listAvailableWebhookSubscriptionEvents"></a>
# **listAvailableWebhookSubscriptionEvents**
> ListAvailableWebhookSubscriptionEvents200Response listAvailableWebhookSubscriptionEvents(xExternalRequestId)

List Available Webhook Subscription Events

Allows partners to retrieve a list of all event subscriptions supported by the Open Finance system.  This endpoint provides information about each subscription, including the webhook URL and associated events, enabling partners to understand all available subscription options.   _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebhookSubscriptionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.finicity.com");
    
    // Configure API key authorization: FinicityAppToken
    ApiKeyAuth FinicityAppToken = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppToken");
    FinicityAppToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //FinicityAppToken.setApiKeyPrefix("Token");

    // Configure API key authorization: FinicityAppKey
    ApiKeyAuth FinicityAppKey = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppKey");
    FinicityAppKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //FinicityAppKey.setApiKeyPrefix("Token");

    WebhookSubscriptionApi apiInstance = new WebhookSubscriptionApi(defaultClient);
    String xExternalRequestId = "f6250b41-8632-4fe1-9353-899f419ae67b"; // String | A unique identifier for the request.
    try {
      ListAvailableWebhookSubscriptionEvents200Response result = apiInstance.listAvailableWebhookSubscriptionEvents(xExternalRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookSubscriptionApi#listAvailableWebhookSubscriptionEvents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xExternalRequestId** | **String**| A unique identifier for the request. | [optional] |

### Return type

[**ListAvailableWebhookSubscriptionEvents200Response**](ListAvailableWebhookSubscriptionEvents200Response.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of all available events. |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;App-Key\&quot; or \&quot;App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

<a id="listWebhookSubscriptions"></a>
# **listWebhookSubscriptions**
> Subscriptions listWebhookSubscriptions(xExternalRequestId, offset, limit)

List Webhook Subscriptions

Retrieves a list of all webhook subscriptions. The response includes details of each subscription, such as the subscription ID, URL, events, and their conditions. This API provides an overview of all active and inactive subscriptions.   _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebhookSubscriptionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.finicity.com");
    
    // Configure API key authorization: FinicityAppToken
    ApiKeyAuth FinicityAppToken = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppToken");
    FinicityAppToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //FinicityAppToken.setApiKeyPrefix("Token");

    // Configure API key authorization: FinicityAppKey
    ApiKeyAuth FinicityAppKey = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppKey");
    FinicityAppKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //FinicityAppKey.setApiKeyPrefix("Token");

    WebhookSubscriptionApi apiInstance = new WebhookSubscriptionApi(defaultClient);
    String xExternalRequestId = "f6250b41-8632-4fe1-9353-899f419ae67b"; // String | A unique identifier for the request.
    Integer offset = 1; // Integer | Index of the page of results to return.
    Integer limit = 10; // Integer | Maximum number of results per page.
    try {
      Subscriptions result = apiInstance.listWebhookSubscriptions(xExternalRequestId, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookSubscriptionApi#listWebhookSubscriptions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xExternalRequestId** | **String**| A unique identifier for the request. | [optional] |
| **offset** | **Integer**| Index of the page of results to return. | [optional] [default to 1] |
| **limit** | **Integer**| Maximum number of results per page. | [optional] [default to 10] |

### Return type

[**Subscriptions**](Subscriptions.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of all subscriptions with pagination and availability details. |  -  |
| **400** | Bad Request |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;App-Key\&quot; or \&quot;App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

<a id="testWebhookSubscription"></a>
# **testWebhookSubscription**
> testWebhookSubscription(subscriptionId, xExternalRequestId)

Test Webhook Subscription Based on Subscription id

Test all the webhook event under the given webhook subscription using subscription_id. _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebhookSubscriptionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.finicity.com");
    
    // Configure API key authorization: FinicityAppToken
    ApiKeyAuth FinicityAppToken = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppToken");
    FinicityAppToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //FinicityAppToken.setApiKeyPrefix("Token");

    // Configure API key authorization: FinicityAppKey
    ApiKeyAuth FinicityAppKey = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppKey");
    FinicityAppKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //FinicityAppKey.setApiKeyPrefix("Token");

    WebhookSubscriptionApi apiInstance = new WebhookSubscriptionApi(defaultClient);
    String subscriptionId = "661f3c48-f596-423b-81f5-d275d4dd1345"; // String | A unique UUID identifier of a webhook subscription.
    String xExternalRequestId = "f6250b41-8632-4fe1-9353-899f419ae67b"; // String | A unique identifier for the request.
    try {
      apiInstance.testWebhookSubscription(subscriptionId, xExternalRequestId);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookSubscriptionApi#testWebhookSubscription");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **subscriptionId** | **String**| A unique UUID identifier of a webhook subscription. | |
| **xExternalRequestId** | **String**| A unique identifier for the request. | [optional] |

### Return type

null (empty response body)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | test subscription submitted successfully. |  -  |
| **400** | Bad Request |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;App-Key\&quot; or \&quot;App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

<a id="testWebhookSubscriptionBasedOnEventId"></a>
# **testWebhookSubscriptionBasedOnEventId**
> testWebhookSubscriptionBasedOnEventId(subscriptionId, webhookEventId, xExternalRequestId)

Test Webhook Subscription Based on Subscription id &amp; Webhook event id.

Test the webhook event under the given webhook subscription using subscription_id &amp; webhook event id. _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebhookSubscriptionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.finicity.com");
    
    // Configure API key authorization: FinicityAppToken
    ApiKeyAuth FinicityAppToken = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppToken");
    FinicityAppToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //FinicityAppToken.setApiKeyPrefix("Token");

    // Configure API key authorization: FinicityAppKey
    ApiKeyAuth FinicityAppKey = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppKey");
    FinicityAppKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //FinicityAppKey.setApiKeyPrefix("Token");

    WebhookSubscriptionApi apiInstance = new WebhookSubscriptionApi(defaultClient);
    String subscriptionId = "661f3c48-f596-423b-81f5-d275d4dd1345"; // String | A unique UUID identifier of a webhook subscription.
    String webhookEventId = "661f3c48-f596-423b-81f5-d275d4dd1346"; // String | A unique UUID identifier of a webhook event.
    String xExternalRequestId = "f6250b41-8632-4fe1-9353-899f419ae67b"; // String | A unique identifier for the request.
    try {
      apiInstance.testWebhookSubscriptionBasedOnEventId(subscriptionId, webhookEventId, xExternalRequestId);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookSubscriptionApi#testWebhookSubscriptionBasedOnEventId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **subscriptionId** | **String**| A unique UUID identifier of a webhook subscription. | |
| **webhookEventId** | **String**| A unique UUID identifier of a webhook event. | |
| **xExternalRequestId** | **String**| A unique identifier for the request. | [optional] |

### Return type

null (empty response body)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | test subscription submitted successfully. |  -  |
| **400** | Bad Request |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;App-Key\&quot; or \&quot;App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

<a id="updateWebhookSubscription"></a>
# **updateWebhookSubscription**
> SubscriptionDetail updateWebhookSubscription(subscriptionId, subscription, xExternalRequestId)

Update Webhook Subscription

Updates an existing webhook subscription with the specified subscription ID. You can modify the subscription URL and the events associated with it.   _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebhookSubscriptionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.finicity.com");
    
    // Configure API key authorization: FinicityAppToken
    ApiKeyAuth FinicityAppToken = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppToken");
    FinicityAppToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //FinicityAppToken.setApiKeyPrefix("Token");

    // Configure API key authorization: FinicityAppKey
    ApiKeyAuth FinicityAppKey = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppKey");
    FinicityAppKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //FinicityAppKey.setApiKeyPrefix("Token");

    WebhookSubscriptionApi apiInstance = new WebhookSubscriptionApi(defaultClient);
    String subscriptionId = "661f3c48-f596-423b-81f5-d275d4dd1345"; // String | A unique UUID identifier of a webhook subscription.
    Subscription subscription = new Subscription(); // Subscription | Request body for updating event subscription.
    String xExternalRequestId = "f6250b41-8632-4fe1-9353-899f419ae67b"; // String | A unique identifier for the request.
    try {
      SubscriptionDetail result = apiInstance.updateWebhookSubscription(subscriptionId, subscription, xExternalRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookSubscriptionApi#updateWebhookSubscription");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **subscriptionId** | **String**| A unique UUID identifier of a webhook subscription. | |
| **subscription** | [**Subscription**](Subscription.md)| Request body for updating event subscription. | |
| **xExternalRequestId** | **String**| A unique identifier for the request. | [optional] |

### Return type

[**SubscriptionDetail**](SubscriptionDetail.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Subscription updated successfully |  -  |
| **400** | Bad Request |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;App-Key\&quot; or \&quot;App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

<a id="updateWebhookSubscriptionEvent"></a>
# **updateWebhookSubscriptionEvent**
> WebhookEvent updateWebhookSubscriptionEvent(subscriptionId, webhookEventId, webhookEvent, xExternalRequestId)

Update Webhook Subscription Event

Updates a specific webhook event in a subscription. Use subscription Id and webhook Event Id to identify the event and modify its details.   _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebhookSubscriptionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.finicity.com");
    
    // Configure API key authorization: FinicityAppToken
    ApiKeyAuth FinicityAppToken = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppToken");
    FinicityAppToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //FinicityAppToken.setApiKeyPrefix("Token");

    // Configure API key authorization: FinicityAppKey
    ApiKeyAuth FinicityAppKey = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppKey");
    FinicityAppKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //FinicityAppKey.setApiKeyPrefix("Token");

    WebhookSubscriptionApi apiInstance = new WebhookSubscriptionApi(defaultClient);
    String subscriptionId = "661f3c48-f596-423b-81f5-d275d4dd1345"; // String | A unique UUID identifier of a webhook subscription.
    String webhookEventId = "661f3c48-f596-423b-81f5-d275d4dd1346"; // String | A unique UUID identifier of a webhook event.
    WebhookEvent webhookEvent = new WebhookEvent(); // WebhookEvent | Request body to update Event
    String xExternalRequestId = "f6250b41-8632-4fe1-9353-899f419ae67b"; // String | A unique identifier for the request.
    try {
      WebhookEvent result = apiInstance.updateWebhookSubscriptionEvent(subscriptionId, webhookEventId, webhookEvent, xExternalRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookSubscriptionApi#updateWebhookSubscriptionEvent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **subscriptionId** | **String**| A unique UUID identifier of a webhook subscription. | |
| **webhookEventId** | **String**| A unique UUID identifier of a webhook event. | |
| **webhookEvent** | [**WebhookEvent**](WebhookEvent.md)| Request body to update Event | |
| **xExternalRequestId** | **String**| A unique identifier for the request. | [optional] |

### Return type

[**WebhookEvent**](WebhookEvent.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Event updated successfully |  -  |
| **400** | Bad Request |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;App-Key\&quot; or \&quot;App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

