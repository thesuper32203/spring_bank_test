# AppRegistrationApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAppRegistrationStatus**](AppRegistrationApi.md#getAppRegistrationStatus) | **GET** /aggregation/v2/partners/applications | Get App Registration Status |
| [**getApplications**](AppRegistrationApi.md#getApplications) | **GET** /applications | Get App Details |
| [**getRegisteredInstitutions**](AppRegistrationApi.md#getRegisteredInstitutions) | **GET** /applications/{application_id}/institutions | Get App Registration Status by Institution |
| [**migrateInstitutionLoginAccounts**](AppRegistrationApi.md#migrateInstitutionLoginAccounts) | **PUT** /aggregation/v2/customers/{customerId}/institutionLogins/{institutionLoginId}/migration | Migrate Institution Login Accounts |
| [**modifyAppRegistration**](AppRegistrationApi.md#modifyAppRegistration) | **PUT** /aggregation/v1/partners/applications/{preAppId} | Modify App Registration |
| [**registerApp**](AppRegistrationApi.md#registerApp) | **POST** /aggregation/v1/partners/applications | Register App |
| [**setCustomerAppID**](AppRegistrationApi.md#setCustomerAppID) | **PUT** /aggregation/v1/customers/{customerId}/applications/{applicationId} | Set Customer App ID |


<a id="getAppRegistrationStatus"></a>
# **getAppRegistrationStatus**
> AppStatuses getAppRegistrationStatus(preAppId, applicationId, status, appName, submittedDate, modifiedDate, page, pageSize)

Get App Registration Status

Get the status of your application registration(s).  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppRegistrationApi;

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

    AppRegistrationApi apiInstance = new AppRegistrationApi(defaultClient);
    String preAppId = "2581"; // String | The application registration tracking ID
    String applicationId = "00278431-b712-4f30-a044-b611f25e533d"; // String | The application ID
    String status = "P"; // String | Look up app registration requests by status
    String appName = "Awesome Budget App"; // String | Look up app registration requests by app name
    Long submittedDate = 1607450357L; // Long | Look up app registration requests by the date they were submitted
    Long modifiedDate = 1607450357L; // Long | Look up app registration requests by the date the request was updated. This can be used to determine when a request was updated to \"A\" or \"R\".
    Integer page = 1; // Integer | Index of the page of results to return
    Integer pageSize = 1; // Integer | Maximum number of results per page
    try {
      AppStatuses result = apiInstance.getAppRegistrationStatus(preAppId, applicationId, status, appName, submittedDate, modifiedDate, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppRegistrationApi#getAppRegistrationStatus");
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
| **preAppId** | **String**| The application registration tracking ID | [optional] |
| **applicationId** | **String**| The application ID | [optional] |
| **status** | **String**| Look up app registration requests by status | [optional] |
| **appName** | **String**| Look up app registration requests by app name | [optional] |
| **submittedDate** | **Long**| Look up app registration requests by the date they were submitted | [optional] |
| **modifiedDate** | **Long**| Look up app registration requests by the date the request was updated. This can be used to determine when a request was updated to \&quot;A\&quot; or \&quot;R\&quot;. | [optional] |
| **page** | **Integer**| Index of the page of results to return | [optional] [default to 1] |
| **pageSize** | **Integer**| Maximum number of results per page | [optional] [default to 1] |

### Return type

[**AppStatuses**](AppStatuses.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The app registration statuses were returned |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

<a id="getApplications"></a>
# **getApplications**
> ApplicationResponse getApplications(start, limit, preAppId, applicationId, name, status)

Get App Details

This endpoint returns the status of the submitted application and provides additional details.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppRegistrationApi;

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

    AppRegistrationApi apiInstance = new AppRegistrationApi(defaultClient);
    Integer start = 1; // Integer | Index of the page of results to return
    Integer limit = 50; // Integer | Maximum number of results per page
    Integer preAppId = 13; // Integer | The identifier is provided by Mastercard at the first stage of application registration.
    String applicationId = "00278431-b712-4f30-a044-b611f25e533d"; // String | The identifier is generated after the pre-app is approved. Pre-app is the first stage of application registration. Partner first submits an application registration request, then a Pre-app Id is generated for it, and if all the details are correct, the sales team will approve it, and then an application will be registered with the Application Id and associated with the Pre-app. This Application Id is utilized throughout the lifespan of an application.
    String name = "Mvelopes"; // String | The application name provided by the partner.
    String status = "P"; // String | The application registration status with Mastercard. ('A'=Approved, 'P'=Pending, 'D'=Deleted, 'R'=Rejected, 'S'=Skipped)
    try {
      ApplicationResponse result = apiInstance.getApplications(start, limit, preAppId, applicationId, name, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppRegistrationApi#getApplications");
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
| **start** | **Integer**| Index of the page of results to return | [optional] [default to 1] |
| **limit** | **Integer**| Maximum number of results per page | [optional] [default to 50] |
| **preAppId** | **Integer**| The identifier is provided by Mastercard at the first stage of application registration. | [optional] |
| **applicationId** | **String**| The identifier is generated after the pre-app is approved. Pre-app is the first stage of application registration. Partner first submits an application registration request, then a Pre-app Id is generated for it, and if all the details are correct, the sales team will approve it, and then an application will be registered with the Application Id and associated with the Pre-app. This Application Id is utilized throughout the lifespan of an application. | [optional] |
| **name** | **String**| The application name provided by the partner. | [optional] |
| **status** | **String**| The application registration status with Mastercard. (&#39;A&#39;&#x3D;Approved, &#39;P&#39;&#x3D;Pending, &#39;D&#39;&#x3D;Deleted, &#39;R&#39;&#x3D;Rejected, &#39;S&#39;&#x3D;Skipped) | [optional] |

### Return type

[**ApplicationResponse**](ApplicationResponse.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing one or more application details. |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |

<a id="getRegisteredInstitutions"></a>
# **getRegisteredInstitutions**
> InstitutionResponse getRegisteredInstitutions(applicationId, start, limit, institutionId)

Get App Registration Status by Institution

Query the status of your application registration. If you specify the ID of a financial instituion in your query then the status for that institution is returned. If you do not specify an instituion ID then the status for all financial instituions is returned.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppRegistrationApi;

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

    AppRegistrationApi apiInstance = new AppRegistrationApi(defaultClient);
    String applicationId = "234dsfdsf-535fdgdtrtr-546464564"; // String | The identifier is generated after the pre-app is approved. Pre-app is the first stage of application registration. Partner first submits an application registration request, then a Pre-app Id is generated for it, and if all the details are correct, the sales team will approve it, and then an application will be registered with the Application Id and associated with the Pre-app. This Application Id is utilized throughout the lifespan of an application.
    Integer start = 1; // Integer | Index of the page of results to return
    Integer limit = 25; // Integer | Maximum number of results per page
    Integer institutionId = 170716; // Integer | The financial institution id at Mastercard.
    try {
      InstitutionResponse result = apiInstance.getRegisteredInstitutions(applicationId, start, limit, institutionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppRegistrationApi#getRegisteredInstitutions");
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
| **applicationId** | **String**| The identifier is generated after the pre-app is approved. Pre-app is the first stage of application registration. Partner first submits an application registration request, then a Pre-app Id is generated for it, and if all the details are correct, the sales team will approve it, and then an application will be registered with the Application Id and associated with the Pre-app. This Application Id is utilized throughout the lifespan of an application. | |
| **start** | **Integer**| Index of the page of results to return | [optional] [default to 1] |
| **limit** | **Integer**| Maximum number of results per page | [optional] [default to 25] |
| **institutionId** | **Integer**| The financial institution id at Mastercard. | [optional] |

### Return type

[**InstitutionResponse**](InstitutionResponse.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested application registration status against financial institutions. |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

<a id="migrateInstitutionLoginAccounts"></a>
# **migrateInstitutionLoginAccounts**
> CustomerAccounts migrateInstitutionLoginAccounts(customerId, institutionLoginId)

Migrate Institution Login Accounts

The &#x60;institutionLoginId&#x60; parameter uses Finicity&#39;s internal FI mapping to move accounts from the current FI legacy connection to the new OAuth FI connection.  This API returns a list of accounts for the given institution login ID.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppRegistrationApi;

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

    AppRegistrationApi apiInstance = new AppRegistrationApi(defaultClient);
    String customerId = "1005061234"; // String | A customer ID
    String institutionLoginId = "1007302745"; // String | The institution login ID
    try {
      CustomerAccounts result = apiInstance.migrateInstitutionLoginAccounts(customerId, institutionLoginId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppRegistrationApi#migrateInstitutionLoginAccounts");
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
| **institutionLoginId** | **String**| The institution login ID | |

### Return type

[**CustomerAccounts**](CustomerAccounts.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The migration succeeded |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

<a id="modifyAppRegistration"></a>
# **modifyAppRegistration**
> RegisteredApplication modifyAppRegistration(preAppId, application)

Modify App Registration

Update a registered application.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppRegistrationApi;

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

    AppRegistrationApi apiInstance = new AppRegistrationApi(defaultClient);
    String preAppId = "2581"; // String | The application registration tracking ID
    Application application = new Application(); // Application | 
    try {
      RegisteredApplication result = apiInstance.modifyAppRegistration(preAppId, application);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppRegistrationApi#modifyAppRegistration");
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
| **preAppId** | **String**| The application registration tracking ID | |
| **application** | [**Application**](Application.md)|  | |

### Return type

[**RegisteredApplication**](RegisteredApplication.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The app registration was updated |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

<a id="registerApp"></a>
# **registerApp**
> RegisteredApplication registerApp(application)

Register App

Register a new application to access financial institutions using OAuth connections.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppRegistrationApi;

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

    AppRegistrationApi apiInstance = new AppRegistrationApi(defaultClient);
    Application application = new Application(); // Application | 
    try {
      RegisteredApplication result = apiInstance.registerApp(application);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppRegistrationApi#registerApp");
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
| **application** | [**Application**](Application.md)|  | |

### Return type

[**RegisteredApplication**](RegisteredApplication.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The app registration was successfully created |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |

<a id="setCustomerAppID"></a>
# **setCustomerAppID**
> setCustomerAppID(customerId, applicationId)

Set Customer App ID

If you have multiple applications for a single client, and you want to register their applications to access financial institutions using OAuth connections, then use this API to assign applications to an existing customer.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppRegistrationApi;

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

    AppRegistrationApi apiInstance = new AppRegistrationApi(defaultClient);
    String customerId = "1005061234"; // String | A customer ID
    String applicationId = "00278431-b712-4f30-a044-b611f25e533d"; // String | The application ID
    try {
      apiInstance.setCustomerAppID(customerId, applicationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppRegistrationApi#setCustomerAppID");
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
| **applicationId** | **String**| The application ID | |

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
| **200** | The app was successfully assigned |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

