# AccountValidationAssistanceApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMicroDepositsDetails**](AccountValidationAssistanceApi.md#getMicroDepositsDetails) | **GET** /microentry/v1/customers/{customerId}/accounts/{accountId} | Get Micro Entries Details |
| [**initiateMicroAmountDeposits**](AccountValidationAssistanceApi.md#initiateMicroAmountDeposits) | **POST** /microentry/v1/customers/{customerId} | Initiate Micro Entries |
| [**verifyMicroAmountDeposits**](AccountValidationAssistanceApi.md#verifyMicroAmountDeposits) | **POST** /microentry/v1/customers/{customerId}/accounts/{accountId}/amounts | Verify Micro Entries |


<a id="getMicroDepositsDetails"></a>
# **getMicroDepositsDetails**
> MicroDepositDetails getMicroDepositsDetails(customerId, accountId)

Get Micro Entries Details

Fetch the micro entries details. &#x60;customerId&#x60; and &#x60;accountId&#x60; are the identifiers of the customer and account receiving the micro entries.    _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountValidationAssistanceApi;

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

    AccountValidationAssistanceApi apiInstance = new AccountValidationAssistanceApi(defaultClient);
    String customerId = "1005061234"; // String | A customer ID
    String accountId = "5011648377"; // String | The account ID
    try {
      MicroDepositDetails result = apiInstance.getMicroDepositsDetails(customerId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountValidationAssistanceApi#getMicroDepositsDetails");
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

[**MicroDepositDetails**](MicroDepositDetails.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Micro entries were successfully retrieved |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

<a id="initiateMicroAmountDeposits"></a>
# **initiateMicroAmountDeposits**
> InitiatedMicroDeposit initiateMicroAmountDeposits(customerId, microDepositInitiation)

Initiate Micro Entries

Initiate the micro entries to customer&#39;s account.  Two random micro amounts less than a dollar each will be deposited to provided customer&#39;s account.    _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountValidationAssistanceApi;

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

    AccountValidationAssistanceApi apiInstance = new AccountValidationAssistanceApi(defaultClient);
    String customerId = "1005061234"; // String | A customer ID
    MicroDepositInitiation microDepositInitiation = new MicroDepositInitiation(); // MicroDepositInitiation | 
    try {
      InitiatedMicroDeposit result = apiInstance.initiateMicroAmountDeposits(customerId, microDepositInitiation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountValidationAssistanceApi#initiateMicroAmountDeposits");
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
| **microDepositInitiation** | [**MicroDepositInitiation**](MicroDepositInitiation.md)|  | |

### Return type

[**InitiatedMicroDeposit**](InitiatedMicroDeposit.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Micro entries were successfully initiated |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |
| **409** | The resource already exists |  -  |
| **429** | The service can&#39;t accept more requests or is not available from the Test Drive. |  -  |

<a id="verifyMicroAmountDeposits"></a>
# **verifyMicroAmountDeposits**
> VerifiedMicroDeposit verifyMicroAmountDeposits(customerId, accountId, microDepositVerification)

Verify Micro Entries

Verify the micro entries as received by customer in customer&#39;s account. Customer needs to verify the micro amounts received in customer&#39;s account. &#x60;customerId&#x60; and &#x60;accountId&#x60; are the identifiers of the customer and account  receiving the micro entries.    _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountValidationAssistanceApi;

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

    AccountValidationAssistanceApi apiInstance = new AccountValidationAssistanceApi(defaultClient);
    String customerId = "1005061234"; // String | A customer ID
    String accountId = "5011648377"; // String | The account ID
    MicroDepositVerification microDepositVerification = new MicroDepositVerification(); // MicroDepositVerification | 
    try {
      VerifiedMicroDeposit result = apiInstance.verifyMicroAmountDeposits(customerId, accountId, microDepositVerification);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountValidationAssistanceApi#verifyMicroAmountDeposits");
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
| **microDepositVerification** | [**MicroDepositVerification**](MicroDepositVerification.md)|  | |

### Return type

[**VerifiedMicroDeposit**](VerifiedMicroDeposit.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Micro entries were successfully verified |  -  |
| **400** | Micro entries verification failed. status field could be any except \&quot;Verified\&quot; and \&quot;Completed\&quot;. |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

