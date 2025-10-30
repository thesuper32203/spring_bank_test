# PaymentEnablementBundleApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAccountDetailsByAccountId**](PaymentEnablementBundleApi.md#getAccountDetailsByAccountId) | **GET** /aggregation/v1/paysuite/customers/{customerId}/accounts/{accountId} | Fetch all the requested details using the account ID |
| [**getAccountDetailsByInstitutionLoginId**](PaymentEnablementBundleApi.md#getAccountDetailsByInstitutionLoginId) | **GET** /aggregation/v1/paysuite/customers/{customerId}/institutionLogins/{institutionLoginId}/accounts | Fetch all the requested field details using institution login ID |


<a id="getAccountDetailsByAccountId"></a>
# **getAccountDetailsByAccountId**
> PaymentEnablementBundle getAccountDetailsByAccountId(customerId, accountId, include, balanceCacheInterval)

Fetch all the requested details using the account ID

This bundled API will return any or all of the Payments endpoints in one API call using account ID. This includes, Account Simple details, ACH details, Account Owner, and Account Balance. This requires initial setup to determine which endpoints are included in the API response. For Account Balance, You can define an additional query parameter &#x60;balance_cache_interval&#x60; to specify the time interval of the last cached balance.  This parameter will be used by the server to determine whether the cached balance is still valid or if it needs to be refreshed.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentEnablementBundleApi;

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

    PaymentEnablementBundleApi apiInstance = new PaymentEnablementBundleApi(defaultClient);
    String customerId = "1005061234"; // String | A customer ID
    String accountId = "5011648377"; // String | The account ID
    String include = "balanceDetails, paymentInstruction, accountIdentity"; // String | If you do not require all API fields ( `balanceDetails`, `accountIdentity` and `paymentInstruction`) then mention specific API fields you are interested in.  For example, If you are interested in only `balanceDetails` and `paymentInstruction`, then send query string as include=`balanceDetails`,`paymentInstruction`
    Integer balanceCacheInterval = 30; // Integer | `balance_cache_interval` (in minutes) is used at server side to decide whether to return existing cached balance or retrieve from financial institution in real-time. Details explained below: 1. If the cached balance data at server is older than provided `balance_cache_interval` then live balance from financial institution will be retrieved. 2. If the cached balance data is within provided `balance_cache_interval` allowed interval then balance from cache will be returned. 3. If `balance_cache_interval` is not provided, then by default pre defined cache interval will be used to decide whether to return existing cached balance or retrieve from financial institution in real-time.
    try {
      PaymentEnablementBundle result = apiInstance.getAccountDetailsByAccountId(customerId, accountId, include, balanceCacheInterval);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentEnablementBundleApi#getAccountDetailsByAccountId");
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
| **customerId** | **String**| A customer ID | |
| **accountId** | **String**| The account ID | |
| **include** | **String**| If you do not require all API fields ( &#x60;balanceDetails&#x60;, &#x60;accountIdentity&#x60; and &#x60;paymentInstruction&#x60;) then mention specific API fields you are interested in.  For example, If you are interested in only &#x60;balanceDetails&#x60; and &#x60;paymentInstruction&#x60;, then send query string as include&#x3D;&#x60;balanceDetails&#x60;,&#x60;paymentInstruction&#x60; | [optional] |
| **balanceCacheInterval** | **Integer**| &#x60;balance_cache_interval&#x60; (in minutes) is used at server side to decide whether to return existing cached balance or retrieve from financial institution in real-time. Details explained below: 1. If the cached balance data at server is older than provided &#x60;balance_cache_interval&#x60; then live balance from financial institution will be retrieved. 2. If the cached balance data is within provided &#x60;balance_cache_interval&#x60; allowed interval then balance from cache will be returned. 3. If &#x60;balance_cache_interval&#x60; is not provided, then by default pre defined cache interval will be used to decide whether to return existing cached balance or retrieve from financial institution in real-time. | [optional] [default to 30] |

### Return type

[**PaymentEnablementBundle**](PaymentEnablementBundle.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | We successfully fetched the requested details |  -  |
| **400** | We couldn&#39;t handle your request, see response payload for more information. |  -  |
| **401** | The request lacks valid authentication credentials. Check Partner ID, Partner Secret or Finicity-App-Key. |  -  |
| **404** | Customer ID or Account ID does not exist |  -  |

<a id="getAccountDetailsByInstitutionLoginId"></a>
# **getAccountDetailsByInstitutionLoginId**
> PaymentEnablementBundle getAccountDetailsByInstitutionLoginId(customerId, institutionLoginId, include, balanceCacheInterval)

Fetch all the requested field details using institution login ID

This bundled API returns any or all of the Payments endpoints in one API call using institution login ID. This includes, Account Simple details, ACH details, Account Owner, and Account Balance. This requires initial setup to determine which endpoints are included in the API response. For Account Balance, You can define an additional query parameter &#x60;balance_cache_interval&#x60; to specify the time interval of the last cached balance.  This parameter is used by the server to determine whether the cached balance is still valid or if it needs to be refreshed.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentEnablementBundleApi;

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

    PaymentEnablementBundleApi apiInstance = new PaymentEnablementBundleApi(defaultClient);
    String customerId = "1005061234"; // String | A customer ID
    Long institutionLoginId = 1007302745L; // Long | The institution login ID
    String include = "balanceDetails, paymentInstruction, accountIdentity"; // String | If you do not require all API fields ( `balanceDetails`, `accountIdentity` and `paymentInstruction`) then mention specific API fields you are interested in.  For example, If you are interested in only `balanceDetails` and `paymentInstruction`, then send query string as include=`balanceDetails`,`paymentInstruction`
    Integer balanceCacheInterval = 30; // Integer | `balance_cache_interval` (in minutes) is used at server side to decide whether to return existing cached balance or retrieve from financial institution in real-time. Details explained below: 1. If the cached balance data at server is older than provided `balance_cache_interval` then live balance from financial institution will be retrieved. 2. If the cached balance data is within provided `balance_cache_interval` allowed interval then balance from cache will be returned. 3. If `balance_cache_interval` is not provided, then by default pre defined cache interval will be used to decide whether to return existing cached balance or retrieve from financial institution in real-time.
    try {
      PaymentEnablementBundle result = apiInstance.getAccountDetailsByInstitutionLoginId(customerId, institutionLoginId, include, balanceCacheInterval);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentEnablementBundleApi#getAccountDetailsByInstitutionLoginId");
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
| **customerId** | **String**| A customer ID | |
| **institutionLoginId** | **Long**| The institution login ID | |
| **include** | **String**| If you do not require all API fields ( &#x60;balanceDetails&#x60;, &#x60;accountIdentity&#x60; and &#x60;paymentInstruction&#x60;) then mention specific API fields you are interested in.  For example, If you are interested in only &#x60;balanceDetails&#x60; and &#x60;paymentInstruction&#x60;, then send query string as include&#x3D;&#x60;balanceDetails&#x60;,&#x60;paymentInstruction&#x60; | [optional] |
| **balanceCacheInterval** | **Integer**| &#x60;balance_cache_interval&#x60; (in minutes) is used at server side to decide whether to return existing cached balance or retrieve from financial institution in real-time. Details explained below: 1. If the cached balance data at server is older than provided &#x60;balance_cache_interval&#x60; then live balance from financial institution will be retrieved. 2. If the cached balance data is within provided &#x60;balance_cache_interval&#x60; allowed interval then balance from cache will be returned. 3. If &#x60;balance_cache_interval&#x60; is not provided, then by default pre defined cache interval will be used to decide whether to return existing cached balance or retrieve from financial institution in real-time. | [optional] [default to 30] |

### Return type

[**PaymentEnablementBundle**](PaymentEnablementBundle.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | We successfully fetched the requested details |  -  |
| **400** | We couldn&#39;t handle your request, see response payload for more information. |  -  |
| **401** | The request lacks valid authentication credentials. Check Partner ID, Partner Secret or Finicity-App-Key. |  -  |
| **404** | The requested details do not match with the existing details or you requested something we don&#39;t have or was deleted. |  -  |

