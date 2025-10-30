# AuthenticationApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createToken**](AuthenticationApi.md#createToken) | **POST** /aggregation/v2/partners/authentication | Create Access Token |
| [**modifyPartnerSecret**](AuthenticationApi.md#modifyPartnerSecret) | **PUT** /aggregation/v2/partners/authentication | Modify Partner Secret |


<a id="createToken"></a>
# **createToken**
> AccessToken createToken(partnerCredentials)

Create Access Token

Send Partner ID and Partner Secret to the Partner Authentication service to obtain a token for accessing Finicity APIs. * The token is valid for two hours and is required on all calls to the Finicity APIs * As a best practice, use a single token for all calls. Assign a timestamp for each token, and then check the current timestamp before making any calls. If the token is greater than 90 minutes, generate a new one. * ⚠️ After five failed attempts to authenticate, your account will be locked. To reset your account, you can report a support issue using the support.finicity.com portal. Alternatively, contact your Client Success Manager or your onboarding representative.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.finicity.com");
    
    // Configure API key authorization: FinicityAppKey
    ApiKeyAuth FinicityAppKey = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppKey");
    FinicityAppKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //FinicityAppKey.setApiKeyPrefix("Token");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    PartnerCredentials partnerCredentials = new PartnerCredentials(); // PartnerCredentials | 
    try {
      AccessToken result = apiInstance.createToken(partnerCredentials);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#createToken");
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
| **partnerCredentials** | [**PartnerCredentials**](PartnerCredentials.md)|  | |

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The access token was successfully created |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check Partner ID, Partner Secret or Finicity-App-Key. |  -  |

<a id="modifyPartnerSecret"></a>
# **modifyPartnerSecret**
> modifyPartnerSecret(partnerCredentialsWithNewSecret)

Modify Partner Secret

Change the Partner Secret used to authenticate this partner.  The secret does not expire, but can be changed by calling this API. A valid Partner Secret may contain upper and lowercase characters, numbers, and the characters !, @, #, $, %, &amp;, *, _, -, +. It must include at least one number and at least one letter, and its length should be between 12 and 255 characters.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.finicity.com");
    
    // Configure API key authorization: FinicityAppKey
    ApiKeyAuth FinicityAppKey = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppKey");
    FinicityAppKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //FinicityAppKey.setApiKeyPrefix("Token");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    PartnerCredentialsWithNewSecret partnerCredentialsWithNewSecret = new PartnerCredentialsWithNewSecret(); // PartnerCredentialsWithNewSecret | 
    try {
      apiInstance.modifyPartnerSecret(partnerCredentialsWithNewSecret);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#modifyPartnerSecret");
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
| **partnerCredentialsWithNewSecret** | [**PartnerCredentialsWithNewSecret**](PartnerCredentialsWithNewSecret.md)|  | |

### Return type

null (empty response body)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The Partner Secret was successfully updated |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check Partner ID, Partner Secret or Finicity-App-Key. |  -  |

