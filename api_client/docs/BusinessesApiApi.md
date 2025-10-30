# BusinessesApiApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addBusinessDetails**](BusinessesApiApi.md#addBusinessDetails) | **POST** /business-services/customers/{customer_id}/businesses | Create a New Business for a Customer |
| [**getBusinessByCustomer**](BusinessesApiApi.md#getBusinessByCustomer) | **GET** /business-services/customers/{customer_id}/businesses | Get Business for Customer |
| [**getBusinessById**](BusinessesApiApi.md#getBusinessById) | **GET** /business-services/businesses/{business_id} | Get Business by ID |
| [**updateBusiness**](BusinessesApiApi.md#updateBusiness) | **PUT** /business-services/businesses/{business_id} | Update Business by ID |


<a id="addBusinessDetails"></a>
# **addBusinessDetails**
> Business addBusinessDetails(customerId, newBusiness)

Create a New Business for a Customer

Create a new business record for the associated customer. A customer can have one business record associated.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BusinessesApiApi;

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

    BusinessesApiApi apiInstance = new BusinessesApiApi(defaultClient);
    String customerId = "1005061234"; // String | Unique identifier of the customer
    NewBusiness newBusiness = new NewBusiness(); // NewBusiness | 
    try {
      Business result = apiInstance.addBusinessDetails(customerId, newBusiness);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessesApiApi#addBusinessDetails");
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
| **newBusiness** | [**NewBusiness**](NewBusiness.md)|  | |

### Return type

[**Business**](Business.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The business was successfully created. |  -  |
| **404** | The customer does not exist |  -  |
| **409** | The resource already exists |  -  |

<a id="getBusinessByCustomer"></a>
# **getBusinessByCustomer**
> List&lt;Business&gt; getBusinessByCustomer(customerId)

Get Business for Customer

Retrieve business details associated with a specific customer. By providing the unique customer identifier, details about the associated business can be accessed.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BusinessesApiApi;

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

    BusinessesApiApi apiInstance = new BusinessesApiApi(defaultClient);
    String customerId = "1005061234"; // String | Unique identifier of the customer
    try {
      List<Business> result = apiInstance.getBusinessByCustomer(customerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessesApiApi#getBusinessByCustomer");
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

### Return type

[**List&lt;Business&gt;**](Business.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The business information was successfully retrieved. |  -  |
| **404** | The customer does not exist |  -  |

<a id="getBusinessById"></a>
# **getBusinessById**
> List&lt;Business&gt; getBusinessById(businessId)

Get Business by ID

Retrieve business details.  _Supported regions_: ![\\U0001F1FA\\U0001F1F8](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BusinessesApiApi;

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

    BusinessesApiApi apiInstance = new BusinessesApiApi(defaultClient);
    String businessId = "192323"; // String | Unique identifier of the business
    try {
      List<Business> result = apiInstance.getBusinessById(businessId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessesApiApi#getBusinessById");
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
| **businessId** | **String**| Unique identifier of the business | |

### Return type

[**List&lt;Business&gt;**](Business.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The business information was successfully retrieved. |  -  |
| **404** | The business does not exist |  -  |

<a id="updateBusiness"></a>
# **updateBusiness**
> Business updateBusiness(businessId, newBusiness)

Update Business by ID

Update the details of a business based on its unique identifier. By providing the specific business ID and the updated information in the request, modifications can be made to the business&#39;s profile.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BusinessesApiApi;

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

    BusinessesApiApi apiInstance = new BusinessesApiApi(defaultClient);
    String businessId = "192323"; // String | Unique identifier of the business
    NewBusiness newBusiness = new NewBusiness(); // NewBusiness | 
    try {
      Business result = apiInstance.updateBusiness(businessId, newBusiness);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessesApiApi#updateBusiness");
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
| **businessId** | **String**| Unique identifier of the business | |
| **newBusiness** | [**NewBusiness**](NewBusiness.md)|  | |

### Return type

[**Business**](Business.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The business information was updated. |  -  |
| **404** | The business does not exist |  -  |

