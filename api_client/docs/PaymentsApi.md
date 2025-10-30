# PaymentsApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAccountACHDetails**](PaymentsApi.md#getAccountACHDetails) | **GET** /aggregation/v1/customers/{customerId}/accounts/{accountId}/details | Get Account ACH Details |
| [**getAccountOwner**](PaymentsApi.md#getAccountOwner) | **GET** /aggregation/v1/customers/{customerId}/accounts/{accountId}/owner | Get Account Owner |
| [**getAccountOwnerDetails**](PaymentsApi.md#getAccountOwnerDetails) | **GET** /aggregation/v3/customers/{customerId}/accounts/{accountId}/owner | Get Account Owner Details |
| [**getAccountPaymentInstructionDetails**](PaymentsApi.md#getAccountPaymentInstructionDetails) | **GET** /aggregation/v3/customers/{customerId}/accounts/{accountId}/details | Get Account ACH Details with RTP |
| [**getAvailableBalance**](PaymentsApi.md#getAvailableBalance) | **GET** /aggregation/v1/customers/{customerId}/accounts/{accountId}/availableBalance | Get Available Balance - Cached |
| [**getAvailableBalanceLive**](PaymentsApi.md#getAvailableBalanceLive) | **GET** /aggregation/v1/customers/{customerId}/accounts/{accountId}/availableBalance/live | Get Available Balance |
| [**getLoanPaymentDetails**](PaymentsApi.md#getLoanPaymentDetails) | **GET** /aggregation/v2/customers/{customerId}/accounts/{accountId}/loanDetails | Get Loan Payment Details |


<a id="getAccountACHDetails"></a>
# **getAccountACHDetails**
> ACHDetails getAccountACHDetails(customerId, accountId)

Get Account ACH Details

Return the real account number and routing number details for an ACH payment.  Note: this is a premium service, billable per every successful API call.  _Supported account types_: \&quot;checking\&quot;, \&quot;savings\&quot;, \&quot;moneyMarket\&quot;,\&quot;certificateOfDeposit\&quot;  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsApi;

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

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String customerId = "1005061234"; // String | A customer ID
    String accountId = "5011648377"; // String | The account ID
    try {
      ACHDetails result = apiInstance.getAccountACHDetails(customerId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getAccountACHDetails");
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

### Return type

[**ACHDetails**](ACHDetails.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account ACH details were successfully retrieved |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

<a id="getAccountOwner"></a>
# **getAccountOwner**
> AccountOwner getAccountOwner(customerId, accountId)

Get Account Owner

Retrieve the names and addresses of the account owner from a financial institution.  Note: this is a premium service, billable per every successful API call.  This service retrieves account data from the institution. This usually returns quickly, but in some scenarios may take a few minutes to complete. In the event of a timeout condition, retry the call.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsApi;

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

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String customerId = "1005061234"; // String | A customer ID
    String accountId = "5011648377"; // String | The account ID
    try {
      AccountOwner result = apiInstance.getAccountOwner(customerId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getAccountOwner");
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

### Return type

[**AccountOwner**](AccountOwner.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The account owner was successfully retrieved |  -  |
| **203** | The request was unsuccessful due to a required Multi-Factor Authentication (MFA) challenge. There is no further action that can be taken to resolve this error. |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

<a id="getAccountOwnerDetails"></a>
# **getAccountOwnerDetails**
> AccountOwnerHolders getAccountOwnerDetails(customerId, accountId, withInsights, metaData)

Get Account Owner Details

This service retrieves the account details for an account holder from an institution. The following data objects are available.  * Account holders  * Addresses  * Emails  * Phones  * Documentations  * Identity Insights   Note: The data returned varies from institution to institution as not all of them make the same data available. This is a premium service, billable per each successful API call.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsApi;

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

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String customerId = "1005061234"; // String | A customer ID
    String accountId = "5011648377"; // String | The account ID
    Boolean withInsights = false; // Boolean | If this parameter is true, Identity Insights data will be returned along with the account owner information
    String metaData = "program=OBAO"; // String | OBAO is a program that is being offered to Mastercard issuers where when the new account is issued a Mastercard Debit or Prepaid account. OBAO offered partners will not be charged for ACH, AOV, and Balance API.
    try {
      AccountOwnerHolders result = apiInstance.getAccountOwnerDetails(customerId, accountId, withInsights, metaData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getAccountOwnerDetails");
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
| **withInsights** | **Boolean**| If this parameter is true, Identity Insights data will be returned along with the account owner information | [optional] |
| **metaData** | **String**| OBAO is a program that is being offered to Mastercard issuers where when the new account is issued a Mastercard Debit or Prepaid account. OBAO offered partners will not be charged for ACH, AOV, and Balance API. | [optional] |

### Return type

[**AccountOwnerHolders**](AccountOwnerHolders.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The account owner was successfully retrieved |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |

<a id="getAccountPaymentInstructionDetails"></a>
# **getAccountPaymentInstructionDetails**
> PaymentInstructions getAccountPaymentInstructionDetails(customerId, accountId)

Get Account ACH Details with RTP

Return the real account number and routing number details for an ACH payment along with the supported payment instruction details. If the RTP (Real Time Payment) value for “transferInEnabled” is true, then the account can receive RTPs. If the value for “transferOutEnabled” is true, then the account can send RTPs  Note: this is a premium service, billable per every successful API call.  _Supported account types_: \&quot;checking\&quot;, \&quot;savings\&quot;, \&quot;moneyMarket\&quot;  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsApi;

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

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String customerId = "1005061234"; // String | A customer ID
    String accountId = "5011648377"; // String | The account ID
    try {
      PaymentInstructions result = apiInstance.getAccountPaymentInstructionDetails(customerId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getAccountPaymentInstructionDetails");
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

### Return type

[**PaymentInstructions**](PaymentInstructions.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account ACH details were successfully retrieved |  -  |
| **400** | The request was rejected due to validation failures |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

<a id="getAvailableBalance"></a>
# **getAvailableBalance**
> AvailableBalance getAvailableBalance(customerId, accountId)

Get Available Balance - Cached

_This endpoint will no longer be available after June 2025. You must transition to using the regular Get Available Balance endpoint, which can return either live or cached data depending on your requirements._  Retrieve the latest cached available and cleared account balances for a customer. Since we update and store balances throughout the day, this is the most accurate balance information available when a connection to a financial institution is unavailable or when a faster response is needed. Only deposit account types are supported: Checking, Savings, Money Market, and CD.  Note: this is a premium service, billable per every successful API call. Enrollment is required.  _Supported account types_: \&quot;checking\&quot;, \&quot;savings\&quot;, \&quot;moneyMarket\&quot;, \&quot;cd\&quot;  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsApi;

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

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String customerId = "1005061234"; // String | A customer ID
    String accountId = "5011648377"; // String | The account ID
    try {
      AvailableBalance result = apiInstance.getAvailableBalance(customerId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getAvailableBalance");
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

### Return type

[**AvailableBalance**](AvailableBalance.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The balance was successfully retrieved |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

<a id="getAvailableBalanceLive"></a>
# **getAvailableBalanceLive**
> AvailableBalance getAvailableBalanceLive(customerId, accountId, balanceCacheInterval)

Get Available Balance

Retrieve the available and cleared account balances for a single account in real-time directly from a financial institution. You can define an additional query parameter &#x60;balance_cache_interval&#x60; to specify the time interval of the last cached balance. This parameter is used by the server to determine whether the cached balance is still valid or if it needs to be refreshed.   Note: this is a premium service, billable per every successful API call.  _Supported account types_: \&quot;checking\&quot;, \&quot;savings\&quot;, \&quot;moneyMarket\&quot;, \&quot;cd\&quot;  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsApi;

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

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String customerId = "1005061234"; // String | A customer ID
    String accountId = "5011648377"; // String | The account ID
    Integer balanceCacheInterval = 0; // Integer | `balance_cache_interval` (in minutes) is used to decide whether to return existing cached balance or retrieve from financial institution in real-time. Details explained below: 1. If the cached balance data at server is older than provided `balance_cache_interval` then live balance from financial institution will be retrieved. 2. If the cached balance data is within provided `balance_cache_interval` allowed interval then balance from cache will be returned. 3. If `balance_cache_interval` is 0 or not provided, then live balance from financial institution will be retrieved.
    try {
      AvailableBalance result = apiInstance.getAvailableBalanceLive(customerId, accountId, balanceCacheInterval);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getAvailableBalanceLive");
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
| **balanceCacheInterval** | **Integer**| &#x60;balance_cache_interval&#x60; (in minutes) is used to decide whether to return existing cached balance or retrieve from financial institution in real-time. Details explained below: 1. If the cached balance data at server is older than provided &#x60;balance_cache_interval&#x60; then live balance from financial institution will be retrieved. 2. If the cached balance data is within provided &#x60;balance_cache_interval&#x60; allowed interval then balance from cache will be returned. 3. If &#x60;balance_cache_interval&#x60; is 0 or not provided, then live balance from financial institution will be retrieved. | [optional] [default to 0] |

### Return type

[**AvailableBalance**](AvailableBalance.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The live balance was successfully retrieved |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

<a id="getLoanPaymentDetails"></a>
# **getLoanPaymentDetails**
> LoanPaymentDetails getLoanPaymentDetails(customerId, accountId)

Get Loan Payment Details

Return the loan payment details of the customer for a loan-type account.  Note: this is a premium service, billable per every successful API call.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsApi;

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

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String customerId = "1005061234"; // String | A customer ID
    String accountId = "5011648377"; // String | The account ID
    try {
      LoanPaymentDetails result = apiInstance.getLoanPaymentDetails(customerId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getLoanPaymentDetails");
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

### Return type

[**LoanPaymentDetails**](LoanPaymentDetails.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The loan payment details were successfully retrieved |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

