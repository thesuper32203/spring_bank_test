# ConnectComponentsApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteConfigurationsConfigurationId**](ConnectComponentsApi.md#deleteConfigurationsConfigurationId) | **DELETE** /connect-components/configurations/{configuration_id} | Delete Configuration |
| [**getConfigurations**](ConnectComponentsApi.md#getConfigurations) | **GET** /connect-components/configurations | Get All Configurations for Current Partner |
| [**getConfigurationsConfigurationId**](ConnectComponentsApi.md#getConfigurationsConfigurationId) | **GET** /connect-components/configurations/{configuration_id} | Get Configuration Details |
| [**postConfigurations**](ConnectComponentsApi.md#postConfigurations) | **POST** /connect-components/configurations | Create Components Configuration |
| [**postInstitutionsInstitutionIdLoginForms**](ConnectComponentsApi.md#postInstitutionsInstitutionIdLoginForms) | **POST** /connect-components/institutions/{institution_id}/login-forms | Create Login Form |
| [**postInstitutionsInstitutionIdOauthUrls**](ConnectComponentsApi.md#postInstitutionsInstitutionIdOauthUrls) | **POST** /connect-components/institutions/{institution_id}/oauth-urls | Create OAuth URL |
| [**postReconnections**](ConnectComponentsApi.md#postReconnections) | **POST** /connect-components/customers/{customer_id}/institution-login-ids/{institution_login_id}/reconnections | Initiate Reconnection |


<a id="deleteConfigurationsConfigurationId"></a>
# **deleteConfigurationsConfigurationId**
> deleteConfigurationsConfigurationId(configurationId)

Delete Configuration

Removes the configuration from the database

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectComponentsApi;

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

    ConnectComponentsApi apiInstance = new ConnectComponentsApi(defaultClient);
    UUID configurationId = UUID.fromString("9082affa-d965-40be-a3ed-a320bb3467ff"); // UUID | The unique identifier for a configuration object
    try {
      apiInstance.deleteConfigurationsConfigurationId(configurationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectComponentsApi#deleteConfigurationsConfigurationId");
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
| **configurationId** | **UUID**| The unique identifier for a configuration object | |

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
| **204** | Empty Response Body |  -  |
| **401** | The request was rejected |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

<a id="getConfigurations"></a>
# **getConfigurations**
> List&lt;ModelConfiguration&gt; getConfigurations()

Get All Configurations for Current Partner

Get all previously saved Connect Component configurations.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectComponentsApi;

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

    ConnectComponentsApi apiInstance = new ConnectComponentsApi(defaultClient);
    try {
      List<ModelConfiguration> result = apiInstance.getConfigurations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectComponentsApi#getConfigurations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ModelConfiguration&gt;**](ModelConfiguration.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of available configurations |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |

<a id="getConfigurationsConfigurationId"></a>
# **getConfigurationsConfigurationId**
> ModelConfiguration getConfigurationsConfigurationId(configurationId)

Get Configuration Details

Returns the configuration with the specified id if the configuration exists and belongs to the partner calling this endpoint

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectComponentsApi;

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

    ConnectComponentsApi apiInstance = new ConnectComponentsApi(defaultClient);
    UUID configurationId = UUID.fromString("9082affa-d965-40be-a3ed-a320bb3467ff"); // UUID | The unique identifier for a configuration object
    try {
      ModelConfiguration result = apiInstance.getConfigurationsConfigurationId(configurationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectComponentsApi#getConfigurationsConfigurationId");
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
| **configurationId** | **UUID**| The unique identifier for a configuration object | |

### Return type

[**ModelConfiguration**](ModelConfiguration.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An object used to modify the login behavior |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

<a id="postConfigurations"></a>
# **postConfigurations**
> ModelConfiguration postConfigurations(postConfigurationsRequest)

Create Components Configuration

Optional endpoint. This endpoint is use to generate a configuration  object, which an then be passed in during the login flow. If used, the ID provided will need to be passed in the Create Login  Form or Create OAuth URL.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectComponentsApi;

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

    ConnectComponentsApi apiInstance = new ConnectComponentsApi(defaultClient);
    PostConfigurationsRequest postConfigurationsRequest = new PostConfigurationsRequest(); // PostConfigurationsRequest | 
    try {
      ModelConfiguration result = apiInstance.postConfigurations(postConfigurationsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectComponentsApi#postConfigurations");
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
| **postConfigurationsRequest** | [**PostConfigurationsRequest**](PostConfigurationsRequest.md)|  | |

### Return type

[**ModelConfiguration**](ModelConfiguration.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | An object used to modify the login behavior |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |

<a id="postInstitutionsInstitutionIdLoginForms"></a>
# **postInstitutionsInstitutionIdLoginForms**
> PostInstitutionsInstitutionIdLoginForms201Response postInstitutionsInstitutionIdLoginForms(institutionId, postInstitutionsInstitutionIdLoginFormsRequest)

Create Login Form

Generate a new login form for a given institution, customer, and language.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectComponentsApi;

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

    ConnectComponentsApi apiInstance = new ConnectComponentsApi(defaultClient);
    Integer institutionId = 170716; // Integer | The financial institution id at Mastercard.
    PostInstitutionsInstitutionIdLoginFormsRequest postInstitutionsInstitutionIdLoginFormsRequest = new PostInstitutionsInstitutionIdLoginFormsRequest(); // PostInstitutionsInstitutionIdLoginFormsRequest | An optional configuration object can be applied by including a valid `configurationId` in the request body. <br><br> The preferred language translation for the login form is request with the `language` property in the request body. Supported languages are:   * English: `en`   * English-United States:'en-us`   * Spanish: `es`   * Spanish-United States: `es-us`   * French: `fr`   * French-Canada: `fr-ca`
    try {
      PostInstitutionsInstitutionIdLoginForms201Response result = apiInstance.postInstitutionsInstitutionIdLoginForms(institutionId, postInstitutionsInstitutionIdLoginFormsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectComponentsApi#postInstitutionsInstitutionIdLoginForms");
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
| **institutionId** | **Integer**| The financial institution id at Mastercard. | |
| **postInstitutionsInstitutionIdLoginFormsRequest** | [**PostInstitutionsInstitutionIdLoginFormsRequest**](PostInstitutionsInstitutionIdLoginFormsRequest.md)| An optional configuration object can be applied by including a valid &#x60;configurationId&#x60; in the request body. &lt;br&gt;&lt;br&gt; The preferred language translation for the login form is request with the &#x60;language&#x60; property in the request body. Supported languages are:   * English: &#x60;en&#x60;   * English-United States:&#39;en-us&#x60;   * Spanish: &#x60;es&#x60;   * Spanish-United States: &#x60;es-us&#x60;   * French: &#x60;fr&#x60;   * French-Canada: &#x60;fr-ca&#x60; | |

### Return type

[**PostInstitutionsInstitutionIdLoginForms201Response**](PostInstitutionsInstitutionIdLoginForms201Response.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Generate a new login form entry |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

<a id="postInstitutionsInstitutionIdOauthUrls"></a>
# **postInstitutionsInstitutionIdOauthUrls**
> PostInstitutionsInstitutionIdOauthUrls201Response postInstitutionsInstitutionIdOauthUrls(institutionId, postInstitutionsInstitutionIdOauthUrlsRequest)

Create OAuth URL

Generates a new OAuth URL that can be used to connect an end-user into their direct-connection institution. The &#x60;redirectURI&#x60; will be called when the oauth session has completed. An optional configuration object can be applied by including a valid &#x60;configurationId&#x60; in the request body.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectComponentsApi;

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

    ConnectComponentsApi apiInstance = new ConnectComponentsApi(defaultClient);
    Integer institutionId = 170716; // Integer | The financial institution id at Mastercard.
    PostInstitutionsInstitutionIdOauthUrlsRequest postInstitutionsInstitutionIdOauthUrlsRequest = new PostInstitutionsInstitutionIdOauthUrlsRequest(); // PostInstitutionsInstitutionIdOauthUrlsRequest | 
    try {
      PostInstitutionsInstitutionIdOauthUrls201Response result = apiInstance.postInstitutionsInstitutionIdOauthUrls(institutionId, postInstitutionsInstitutionIdOauthUrlsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectComponentsApi#postInstitutionsInstitutionIdOauthUrls");
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
| **institutionId** | **Integer**| The financial institution id at Mastercard. | |
| **postInstitutionsInstitutionIdOauthUrlsRequest** | [**PostInstitutionsInstitutionIdOauthUrlsRequest**](PostInstitutionsInstitutionIdOauthUrlsRequest.md)|  | |

### Return type

[**PostInstitutionsInstitutionIdOauthUrls201Response**](PostInstitutionsInstitutionIdOauthUrls201Response.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The returned oauth url, as well as a reference back to this resource in case modifications are needed |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

<a id="postReconnections"></a>
# **postReconnections**
> PostInstitutionsInstitutionIdLoginForms201Response postReconnections(customerId, institutionLoginId, body)

Initiate Reconnection

Use the Connect Fix API when the following conditions occur:   * The connection to the user&#39;s financial institution is lost.   * The user&#39;s credentials were updated (for any number of reasons).   * The user&#39;s MFA challenge has expired.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectComponentsApi;

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

    ConnectComponentsApi apiInstance = new ConnectComponentsApi(defaultClient);
    String customerId = "1005061234"; // String | Unique identifier of the customer
    Long institutionLoginId = 7008461438L; // Long | Institution login id of the customer.
    Object body = null; // Object | 
    try {
      PostInstitutionsInstitutionIdLoginForms201Response result = apiInstance.postReconnections(customerId, institutionLoginId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectComponentsApi#postReconnections");
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
| **customerId** | **String**| Unique identifier of the customer | |
| **institutionLoginId** | **Long**| Institution login id of the customer. | |
| **body** | **Object**|  | |

### Return type

[**PostInstitutionsInstitutionIdLoginForms201Response**](PostInstitutionsInstitutionIdLoginForms201Response.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Generate a new login form entry |  -  |
| **203** | MFA challenges required to log in |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |

