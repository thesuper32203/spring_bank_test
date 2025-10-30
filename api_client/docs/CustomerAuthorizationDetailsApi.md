# CustomerAuthorizationDetailsApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCustomerAuthorizationDetails**](CustomerAuthorizationDetailsApi.md#getCustomerAuthorizationDetails) | **GET** /customers/institution-logins/{institution_login_id}/authorization-details | Returns customer authorization details for the institution login identification. |


<a id="getCustomerAuthorizationDetails"></a>
# **getCustomerAuthorizationDetails**
> CustomerAuthorizationDetails getCustomerAuthorizationDetails(institutionLoginId)

Returns customer authorization details for the institution login identification.

The endpoint provides customer authorization details like authorization start date, authorization end date against the requested institution login id  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomerAuthorizationDetailsApi;

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

    CustomerAuthorizationDetailsApi apiInstance = new CustomerAuthorizationDetailsApi(defaultClient);
    Long institutionLoginId = 7008461438L; // Long | Institution login id of the customer.
    try {
      CustomerAuthorizationDetails result = apiInstance.getCustomerAuthorizationDetails(institutionLoginId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAuthorizationDetailsApi#getCustomerAuthorizationDetails");
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
| **institutionLoginId** | **Long**| Institution login id of the customer. | |

### Return type

[**CustomerAuthorizationDetails**](CustomerAuthorizationDetails.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved customer authorization details by institution login id. |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

