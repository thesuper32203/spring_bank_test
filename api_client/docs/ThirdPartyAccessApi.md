# ThirdPartyAccessApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateThirdPartyAccessKey**](ThirdPartyAccessApi.md#generateThirdPartyAccessKey) | **POST** /aggregation/v1/partners/accessKey | Generate Third Party Access Key |
| [**revokeThirdPartyAccessKey**](ThirdPartyAccessApi.md#revokeThirdPartyAccessKey) | **DELETE** /aggregation/v1/partners/accessKey/{consentReceiptId} | Revoke Third Party Access |
| [**updateThirdPartyAccessKey**](ThirdPartyAccessApi.md#updateThirdPartyAccessKey) | **PUT** /aggregation/v1/partners/accessKey/{consentReceiptId} | Update Third Party Access |


<a id="generateThirdPartyAccessKey"></a>
# **generateThirdPartyAccessKey**
> ThirdPartyAccessKeyReceiptData generateThirdPartyAccessKey(thirdPartyAccessKeyData)

Generate Third Party Access Key

Generate access key for third party partners. A partner can provide access to third party partners with this access key.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThirdPartyAccessApi;

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

    ThirdPartyAccessApi apiInstance = new ThirdPartyAccessApi(defaultClient);
    ThirdPartyAccessKeyData thirdPartyAccessKeyData = new ThirdPartyAccessKeyData(); // ThirdPartyAccessKeyData | 
    try {
      ThirdPartyAccessKeyReceiptData result = apiInstance.generateThirdPartyAccessKey(thirdPartyAccessKeyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThirdPartyAccessApi#generateThirdPartyAccessKey");
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
| **thirdPartyAccessKeyData** | [**ThirdPartyAccessKeyData**](ThirdPartyAccessKeyData.md)|  | |

### Return type

[**ThirdPartyAccessKeyReceiptData**](ThirdPartyAccessKeyReceiptData.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The third party access key was successfully generated |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

<a id="revokeThirdPartyAccessKey"></a>
# **revokeThirdPartyAccessKey**
> revokeThirdPartyAccessKey(consentReceiptId)

Revoke Third Party Access

Revoke access of third party partners

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThirdPartyAccessApi;

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

    ThirdPartyAccessApi apiInstance = new ThirdPartyAccessApi(defaultClient);
    String consentReceiptId = "cr_4pfI3r1X8aOHrDDwrwC01NHFxOXlT1"; // String | Third party access key receipt ID
    try {
      apiInstance.revokeThirdPartyAccessKey(consentReceiptId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThirdPartyAccessApi#revokeThirdPartyAccessKey");
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
| **consentReceiptId** | **String**| Third party access key receipt ID | |

### Return type

null (empty response body)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The third party access key was successfully revoked |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

<a id="updateThirdPartyAccessKey"></a>
# **updateThirdPartyAccessKey**
> ThirdPartyAccessKeyReceiptData updateThirdPartyAccessKey(consentReceiptId, thirdPartyAccessKeyData)

Update Third Party Access

Update access for third party partners

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThirdPartyAccessApi;

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

    ThirdPartyAccessApi apiInstance = new ThirdPartyAccessApi(defaultClient);
    String consentReceiptId = "cr_4pfI3r1X8aOHrDDwrwC01NHFxOXlT1"; // String | Third party access key receipt ID
    ThirdPartyAccessKeyData thirdPartyAccessKeyData = new ThirdPartyAccessKeyData(); // ThirdPartyAccessKeyData | 
    try {
      ThirdPartyAccessKeyReceiptData result = apiInstance.updateThirdPartyAccessKey(consentReceiptId, thirdPartyAccessKeyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThirdPartyAccessApi#updateThirdPartyAccessKey");
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
| **consentReceiptId** | **String**| Third party access key receipt ID | |
| **thirdPartyAccessKeyData** | [**ThirdPartyAccessKeyData**](ThirdPartyAccessKeyData.md)|  | |

### Return type

[**ThirdPartyAccessKeyReceiptData**](ThirdPartyAccessKeyReceiptData.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The third party access key was successfully updated |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

