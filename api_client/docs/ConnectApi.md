# ConnectApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateConnectUrl**](ConnectApi.md#generateConnectUrl) | **POST** /connect/v2/generate | Generate Connect URL |
| [**generateFixConnectUrl**](ConnectApi.md#generateFixConnectUrl) | **POST** /connect/v2/generate/fix | Generate Fix Connect URL |
| [**generateJointBorrowerConnectUrl**](ConnectApi.md#generateJointBorrowerConnectUrl) | **POST** /connect/v2/generate/jointBorrower | Generate Connect URL - Joint Borrower |
| [**generateLiteConnectUrl**](ConnectApi.md#generateLiteConnectUrl) | **POST** /connect/v2/generate/lite | Generate Lite Connect URL |
| [**generateTransferBillPaySwitchUrl**](ConnectApi.md#generateTransferBillPaySwitchUrl) | **POST** /connect/generate/transfer/bill-pay-switch | Connect Transfer URL for Bill Pay Switch |
| [**generateTransferDepositSwitchUrl**](ConnectApi.md#generateTransferDepositSwitchUrl) | **POST** /connect/generate/transfer/deposit-switch | Connect Transfer URL for Deposit Switch |
| [**getAllExperience**](ConnectApi.md#getAllExperience) | **GET** /connect/experiences | Get Experience IDs |
| [**sendConnectEmail**](ConnectApi.md#sendConnectEmail) | **POST** /connect/v2/send/email | Send Connect Email |
| [**sendJointBorrowerConnectEmail**](ConnectApi.md#sendJointBorrowerConnectEmail) | **POST** /connect/v2/send/email/jointBorrower | Send Connect Email - Joint Borrower |
| [**verifyMicroEntryMicrodeposit**](ConnectApi.md#verifyMicroEntryMicrodeposit) | **POST** /connect/v2/generate/microentry/verify | Account Validation Assistant User verification of microdeposits |


<a id="generateConnectUrl"></a>
# **generateConnectUrl**
> ConnectUrl generateConnectUrl(connectParameters)

Generate Connect URL

Generate a Connect URL link to add within your own applications.  Optional Parameters: * &#x60;experience&#x60;: Configure different customer experiences per Connect session by changing the brand, color, logo, icon, the type of credit decisioning report to generate after the session ends, and more. * &#x60;language&#x60;: By default, the Connect application is in English. You don&#39;t need to pass  this parameter unless you want to translate Connect into one of our supported languages.    * Spanish (United States)   * French (Canada)   MVS Developers: You can pre-populate the consumer&#39;s SSN on the Find employment records page at the beginning of the MVS payroll app. Pass the SSN value for the consumer in the body of the request call.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectApi;

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

    ConnectApi apiInstance = new ConnectApi(defaultClient);
    ConnectParameters connectParameters = new ConnectParameters(); // ConnectParameters | 
    try {
      ConnectUrl result = apiInstance.generateConnectUrl(connectParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#generateConnectUrl");
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
| **connectParameters** | [**ConnectParameters**](ConnectParameters.md)|  | |

### Return type

[**ConnectUrl**](ConnectUrl.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The URL link was successfully generated |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |

<a id="generateFixConnectUrl"></a>
# **generateFixConnectUrl**
> ConnectUrl generateFixConnectUrl(fixConnectParameters)

Generate Fix Connect URL

Use the Connect Fix API when the following conditions occur: * The connection to the user&#39;s financial institution is lost * The user&#39;s credentials were updated (for any number of reasons) * The user&#39;s MFA challenge has expired  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectApi;

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

    ConnectApi apiInstance = new ConnectApi(defaultClient);
    FixConnectParameters fixConnectParameters = new FixConnectParameters(); // FixConnectParameters | 
    try {
      ConnectUrl result = apiInstance.generateFixConnectUrl(fixConnectParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#generateFixConnectUrl");
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
| **fixConnectParameters** | [**FixConnectParameters**](FixConnectParameters.md)|  | |

### Return type

[**ConnectUrl**](ConnectUrl.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The URL link was successfully generated |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

<a id="generateJointBorrowerConnectUrl"></a>
# **generateJointBorrowerConnectUrl**
> ConnectUrl generateJointBorrowerConnectUrl(connectJointBorrowerParameters)

Generate Connect URL - Joint Borrower

Same as Connect Full (&#x60;POST /connect/v2/generate&#x60;) but for joint borrowers.  MVS prompts both the primary and joint borrower to enter each of their financial, payroll, and paystub information in the same Connect session.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectApi;

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

    ConnectApi apiInstance = new ConnectApi(defaultClient);
    ConnectJointBorrowerParameters connectJointBorrowerParameters = new ConnectJointBorrowerParameters(); // ConnectJointBorrowerParameters | 
    try {
      ConnectUrl result = apiInstance.generateJointBorrowerConnectUrl(connectJointBorrowerParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#generateJointBorrowerConnectUrl");
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
| **connectJointBorrowerParameters** | [**ConnectJointBorrowerParameters**](ConnectJointBorrowerParameters.md)|  | |

### Return type

[**ConnectUrl**](ConnectUrl.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The URL link was successfully generated |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |

<a id="generateLiteConnectUrl"></a>
# **generateLiteConnectUrl**
> ConnectUrl generateLiteConnectUrl(liteConnectParameters)

Generate Lite Connect URL

Connect Lite is a variation of Connect Full (&#x60;POST /connect/v2/generate&#x60;), which has a limited set of features. * Sign in, user&#39;s credentials, and Multi-Factor Authentication (MFA) * No user account management  The Connect Web SDK isn&#39;t a requirement when using Connect lite. However, if you want to use the SDK events, routes, and user events, then you must integrate with the Connect Web SDK.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectApi;

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

    ConnectApi apiInstance = new ConnectApi(defaultClient);
    LiteConnectParameters liteConnectParameters = new LiteConnectParameters(); // LiteConnectParameters | 
    try {
      ConnectUrl result = apiInstance.generateLiteConnectUrl(liteConnectParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#generateLiteConnectUrl");
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
| **liteConnectParameters** | [**LiteConnectParameters**](LiteConnectParameters.md)|  | |

### Return type

[**ConnectUrl**](ConnectUrl.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The URL link was successfully generated |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |

<a id="generateTransferBillPaySwitchUrl"></a>
# **generateTransferBillPaySwitchUrl**
> ConnectTransferBillPaySwitchLink generateTransferBillPaySwitchUrl(connectGenerateTransferBillPaySwitchParameters)

Connect Transfer URL for Bill Pay Switch

Generate a Connect Transfer URL which you can use in your application to allow end users to set up a bill pay switch.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectApi;

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

    ConnectApi apiInstance = new ConnectApi(defaultClient);
    ConnectGenerateTransferBillPaySwitchParameters connectGenerateTransferBillPaySwitchParameters = new ConnectGenerateTransferBillPaySwitchParameters(); // ConnectGenerateTransferBillPaySwitchParameters | 
    try {
      ConnectTransferBillPaySwitchLink result = apiInstance.generateTransferBillPaySwitchUrl(connectGenerateTransferBillPaySwitchParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#generateTransferBillPaySwitchUrl");
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
| **connectGenerateTransferBillPaySwitchParameters** | [**ConnectGenerateTransferBillPaySwitchParameters**](ConnectGenerateTransferBillPaySwitchParameters.md)|  | |

### Return type

[**ConnectTransferBillPaySwitchLink**](ConnectTransferBillPaySwitchLink.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. Returns Connect URL. |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |

<a id="generateTransferDepositSwitchUrl"></a>
# **generateTransferDepositSwitchUrl**
> ConnectTransferDepositSwitchLink generateTransferDepositSwitchUrl(transferDepositSwitchParameters)

Connect Transfer URL for Deposit Switch

Generate a Connect Transfer URL which you can use in your application to allow end users to set up a deposit switch.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectApi;

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

    ConnectApi apiInstance = new ConnectApi(defaultClient);
    TransferDepositSwitchParameters transferDepositSwitchParameters = new TransferDepositSwitchParameters(); // TransferDepositSwitchParameters | 
    try {
      ConnectTransferDepositSwitchLink result = apiInstance.generateTransferDepositSwitchUrl(transferDepositSwitchParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#generateTransferDepositSwitchUrl");
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
| **transferDepositSwitchParameters** | [**TransferDepositSwitchParameters**](TransferDepositSwitchParameters.md)|  | |

### Return type

[**ConnectTransferDepositSwitchLink**](ConnectTransferDepositSwitchLink.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. Returns Connect URL. |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |

<a id="getAllExperience"></a>
# **getAllExperience**
> List&lt;Experiences&gt; getAllExperience(appName, productCode)

Get Experience IDs

Retrieve Connect experiences by application name. Optionally, filter the experiences by product codes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectApi;

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

    ConnectApi apiInstance = new ConnectApi(defaultClient);
    String appName = "test app"; // String | Unique name of the application provided to Mastercard during app registration.
    List<String> productCode = Arrays.asList(); // List<String> | Filter the results by product code (a unique billing code assigned to each Open Finance product used). Specify either one single product or multiple products separated by commas.
    try {
      List<Experiences> result = apiInstance.getAllExperience(appName, productCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#getAllExperience");
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
| **appName** | **String**| Unique name of the application provided to Mastercard during app registration. | |
| **productCode** | [**List&lt;String&gt;**](String.md)| Filter the results by product code (a unique billing code assigned to each Open Finance product used). Specify either one single product or multiple products separated by commas. | [optional] |

### Return type

[**List&lt;Experiences&gt;**](Experiences.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. Returns all retrieved Experience. |  -  |
| **400** | The request was rejected. |  -  |
| **404** | The requested entity was not found |  -  |

<a id="sendConnectEmail"></a>
# **sendConnectEmail**
> ConnectEmailUrl sendConnectEmail(connectEmailParameters)

Send Connect Email

Same as Connect Full (&#x60;POST /connect/v2/generate&#x60;) but send a Connect email to a consumer.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectApi;

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

    ConnectApi apiInstance = new ConnectApi(defaultClient);
    ConnectEmailParameters connectEmailParameters = new ConnectEmailParameters(); // ConnectEmailParameters | 
    try {
      ConnectEmailUrl result = apiInstance.sendConnectEmail(connectEmailParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#sendConnectEmail");
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
| **connectEmailParameters** | [**ConnectEmailParameters**](ConnectEmailParameters.md)|  | |

### Return type

[**ConnectEmailUrl**](ConnectEmailUrl.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The URL link was successfully generated and the email sent |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |

<a id="sendJointBorrowerConnectEmail"></a>
# **sendJointBorrowerConnectEmail**
> ConnectEmailUrl sendJointBorrowerConnectEmail(connectJointBorrowerEmailParameters)

Send Connect Email - Joint Borrower

Same as Connect Joint Borrower (&#x60;POST /connect/v2/generate/jointBorrower&#x60;) but send a Connect email  to at least one of the joint borrower&#39;s email addresses.  When the consumer opens the email, MVS prompts both the primary and joint borrower to enter each of their financial, payroll, and paystub information in the same Connect session.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectApi;

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

    ConnectApi apiInstance = new ConnectApi(defaultClient);
    ConnectJointBorrowerEmailParameters connectJointBorrowerEmailParameters = new ConnectJointBorrowerEmailParameters(); // ConnectJointBorrowerEmailParameters | 
    try {
      ConnectEmailUrl result = apiInstance.sendJointBorrowerConnectEmail(connectJointBorrowerEmailParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#sendJointBorrowerConnectEmail");
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
| **connectJointBorrowerEmailParameters** | [**ConnectJointBorrowerEmailParameters**](ConnectJointBorrowerEmailParameters.md)|  | |

### Return type

[**ConnectEmailUrl**](ConnectEmailUrl.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The URL link was successfully generated and the email sent |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |

<a id="verifyMicroEntryMicrodeposit"></a>
# **verifyMicroEntryMicrodeposit**
> ConnectUrl verifyMicroEntryMicrodeposit(microEntryVerifyRequestParameter)

Account Validation Assistant User verification of microdeposits

The UI re-engages the consumer to enter two microdeposit amounts found in their account and validates them.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectApi;

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

    ConnectApi apiInstance = new ConnectApi(defaultClient);
    MicroEntryVerifyRequestParameter microEntryVerifyRequestParameter = new MicroEntryVerifyRequestParameter(); // MicroEntryVerifyRequestParameter | 
    try {
      ConnectUrl result = apiInstance.verifyMicroEntryMicrodeposit(microEntryVerifyRequestParameter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#verifyMicroEntryMicrodeposit");
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
| **microEntryVerifyRequestParameter** | [**MicroEntryVerifyRequestParameter**](MicroEntryVerifyRequestParameter.md)|  | |

### Return type

[**ConnectUrl**](ConnectUrl.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The URL link was successfully generated |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |

