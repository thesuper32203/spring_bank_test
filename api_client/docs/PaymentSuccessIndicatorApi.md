# PaymentSuccessIndicatorApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateFcraPaymentSuccessIndicators**](PaymentSuccessIndicatorApi.md#generateFcraPaymentSuccessIndicators) | **POST** /payments/customers/{customerId}/accounts/{accountId}/fcra-payment-success-indicators | Generate FCRA Payment Success Indicators |
| [**generatePaymentSuccessIndicators**](PaymentSuccessIndicatorApi.md#generatePaymentSuccessIndicators) | **POST** /payments/customers/{customerId}/accounts/{accountId}/payment-success-indicators | Generate Non-FCRA Payment Success Indicators |
| [**getFCRAPaymentSuccessIndicator**](PaymentSuccessIndicatorApi.md#getFCRAPaymentSuccessIndicator) | **GET** /aggregation/v1/customers/{customerId}/accounts/{accountId}/payments/paymentIndicator/fcra | Get FCRA Payment Success Indicator (Legacy) |
| [**getFcraPaymentSuccessIndicators**](PaymentSuccessIndicatorApi.md#getFcraPaymentSuccessIndicators) | **GET** /payments/customers/{customerId}/accounts/{accountId}/fcra-payment-success-indicators/{payRequestId} | Get FCRA Payment Success Indicators by Pay Request ID |
| [**getPaymentSuccessIndicator**](PaymentSuccessIndicatorApi.md#getPaymentSuccessIndicator) | **GET** /aggregation/v2/customers/{customerId}/accounts/{accountId}/payments/paymentIndicator | Get Non-FCRA Payment Success Indicator (Legacy) |
| [**getPaymentSuccessIndicators**](PaymentSuccessIndicatorApi.md#getPaymentSuccessIndicators) | **GET** /payments/customers/{customerId}/accounts/{accountId}/payment-success-indicators/{payRequestId} | Get Non-FCRA Payment Success Indicators by Pay Request ID |


<a id="generateFcraPaymentSuccessIndicators"></a>
# **generateFcraPaymentSuccessIndicators**
> PaymentSuccessIndicators generateFcraPaymentSuccessIndicators(customerId, accountId, paymentSuccessIndicatorsProperties, purpose)

Generate FCRA Payment Success Indicators

Payment Success Indicator (PSI) allows the user to evaluate the likelihood of a specific ACH transaction resulting in either an insufficient funds return (NSF) or an unauthorized return due to first- or third-party fraud. PSI is powered by a machine learning model trained on consumer-permissioned data. PSI provides a risk assessment, which includes a real-time balance check, predictive risk scores forecasting a consumer’s likelihood of having sufficient funds over a 10-day period, a real-time score predicting the likelihood of an unauthorized return, and risk attributes to explain and enhance decisioning. Provision and use of this report is subject to all applicable obligations of the FCRA and any applicable analogous state law. This product may only be used for the stated permissible purpose under the FCRA. _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentSuccessIndicatorApi;

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

    PaymentSuccessIndicatorApi apiInstance = new PaymentSuccessIndicatorApi(defaultClient);
    String customerId = "1005061234"; // String | A customer ID
    String accountId = "5011648377"; // String | The account ID
    PaymentSuccessIndicatorsProperties paymentSuccessIndicatorsProperties = new PaymentSuccessIndicatorsProperties(); // PaymentSuccessIndicatorsProperties | 
    String purpose = "3F"; // String | 2-digit code from [Permissible Purpose Codes](https://developer.mastercard.com/open-banking-us/documentation/products/lend/report-handling/permissible-purpose-codes/), specifying the reason for retrieving this report. Required for retrieving some reports.
    try {
      PaymentSuccessIndicators result = apiInstance.generateFcraPaymentSuccessIndicators(customerId, accountId, paymentSuccessIndicatorsProperties, purpose);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentSuccessIndicatorApi#generateFcraPaymentSuccessIndicators");
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
| **paymentSuccessIndicatorsProperties** | [**PaymentSuccessIndicatorsProperties**](PaymentSuccessIndicatorsProperties.md)|  | |
| **purpose** | **String**| 2-digit code from [Permissible Purpose Codes](https://developer.mastercard.com/open-banking-us/documentation/products/lend/report-handling/permissible-purpose-codes/), specifying the reason for retrieving this report. Required for retrieving some reports. | [optional] |

### Return type

[**PaymentSuccessIndicators**](PaymentSuccessIndicators.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successfully requested to generate a Payment Success Indicators score |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **403** | Forbidden |  -  |
| **404** | The resource doesn&#39;t exist |  -  |
| **406** | Not allowed |  -  |

<a id="generatePaymentSuccessIndicators"></a>
# **generatePaymentSuccessIndicators**
> PaymentSuccessIndicators generatePaymentSuccessIndicators(customerId, accountId, paymentSuccessIndicatorsProperties)

Generate Non-FCRA Payment Success Indicators

Payment Success Indicator (PSI) allows the user to evaluate the likelihood of a specific ACH transaction resulting in either an insufficient funds return (NSF) or an unauthorized return due to first- or third-party fraud. PSI is powered by a machine learning model trained on consumer-permissioned data. PSI provides a risk assessment, which includes a real-time balance check, predictive risk scores forecasting a consumer’s likelihood of having sufficient funds over a 10-day period, a real-time score predicting the likelihood of an unauthorized return, and risk attributes to explain and enhance decisioning. This product may not be used for uses subject to the FCRA.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentSuccessIndicatorApi;

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

    PaymentSuccessIndicatorApi apiInstance = new PaymentSuccessIndicatorApi(defaultClient);
    String customerId = "1005061234"; // String | A customer ID
    String accountId = "5011648377"; // String | The account ID
    PaymentSuccessIndicatorsProperties paymentSuccessIndicatorsProperties = new PaymentSuccessIndicatorsProperties(); // PaymentSuccessIndicatorsProperties | 
    try {
      PaymentSuccessIndicators result = apiInstance.generatePaymentSuccessIndicators(customerId, accountId, paymentSuccessIndicatorsProperties);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentSuccessIndicatorApi#generatePaymentSuccessIndicators");
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
| **paymentSuccessIndicatorsProperties** | [**PaymentSuccessIndicatorsProperties**](PaymentSuccessIndicatorsProperties.md)|  | |

### Return type

[**PaymentSuccessIndicators**](PaymentSuccessIndicators.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successfully requested to generate a Payment Success Indicators score |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **403** | Forbidden |  -  |
| **404** | The resource doesn&#39;t exist |  -  |
| **406** | Not allowed |  -  |

<a id="getFCRAPaymentSuccessIndicator"></a>
# **getFCRAPaymentSuccessIndicator**
> PaymentSuccessIndicator getFCRAPaymentSuccessIndicator(customerId, accountId, settlementAmount, settleByDate, purposeCode)

Get FCRA Payment Success Indicator (Legacy)

Payment Success Indicator (PSI) allows the user to evaluate the likelihood of a specific ACH transaction resulting in an insufficient funds return (NSF). PSI is powered by a machine learning model trained on Finicity’s consumer-permissioned data network. PSI provides a risk assessment, which includes a real-time balance check, a predictive risk score for the up to the next 9 days, and 8 risk attributes to explain and enhance decisioning. Provision and use of this report is subject to all applicable obligations of the FCRA and any applicable analogous state law. This product may only be used for the stated permissible purpose under the FCRA.    _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentSuccessIndicatorApi;

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

    PaymentSuccessIndicatorApi apiInstance = new PaymentSuccessIndicatorApi(defaultClient);
    String customerId = "1005061234"; // String | A customer ID
    String accountId = "5011648377"; // String | The account ID
    BigDecimal settlementAmount = new BigDecimal("10.05"); // BigDecimal | The transaction amount in USD $.
    LocalDate settleByDate = LocalDate.parse("2023-03-30"); // LocalDate | The expected date that the funds, from the consumer’s account, will be moved to the receiving account.  `settleByDate` in ISO 8601 date format (YYYY-MM-DD). `settleByDate` dictates the number of days the model responds with. The response can range from 3-10 days, including `day0`. Details explained below: 1. If `settleByDate` is 9 or more days out from today, the response includes 10 days of data, `day0` through `day9`. 2. If `settleByDate` is between 3 and 8 days out from today, the response includes 4-9 days of data, `day3-8`. 3. If `settleByDate` is between today and 2 days out from today, the response includes 3 days of data, `day0` through `day2`.
    String purposeCode = "purposeCode_example"; // String | The 2-digit code (1P) assigned to indicate the intended purpose. 1P represents the following permissible purpose: “Determine whether a consumers payment method may be accepted or authorized”, which falls under the “Legitimate Business Need” permissible purpose under section 604 of the FCRA.
    try {
      PaymentSuccessIndicator result = apiInstance.getFCRAPaymentSuccessIndicator(customerId, accountId, settlementAmount, settleByDate, purposeCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentSuccessIndicatorApi#getFCRAPaymentSuccessIndicator");
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
| **settlementAmount** | **BigDecimal**| The transaction amount in USD $. | |
| **settleByDate** | **LocalDate**| The expected date that the funds, from the consumer’s account, will be moved to the receiving account.  &#x60;settleByDate&#x60; in ISO 8601 date format (YYYY-MM-DD). &#x60;settleByDate&#x60; dictates the number of days the model responds with. The response can range from 3-10 days, including &#x60;day0&#x60;. Details explained below: 1. If &#x60;settleByDate&#x60; is 9 or more days out from today, the response includes 10 days of data, &#x60;day0&#x60; through &#x60;day9&#x60;. 2. If &#x60;settleByDate&#x60; is between 3 and 8 days out from today, the response includes 4-9 days of data, &#x60;day3-8&#x60;. 3. If &#x60;settleByDate&#x60; is between today and 2 days out from today, the response includes 3 days of data, &#x60;day0&#x60; through &#x60;day2&#x60;. | |
| **purposeCode** | **String**| The 2-digit code (1P) assigned to indicate the intended purpose. 1P represents the following permissible purpose: “Determine whether a consumers payment method may be accepted or authorized”, which falls under the “Legitimate Business Need” permissible purpose under section 604 of the FCRA. | |

### Return type

[**PaymentSuccessIndicator**](PaymentSuccessIndicator.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The payment success indicator was successfully retrieved |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | Required details not found |  -  |

<a id="getFcraPaymentSuccessIndicators"></a>
# **getFcraPaymentSuccessIndicators**
> FcraPaymentSuccessIndicators getFcraPaymentSuccessIndicators(customerId, accountId, payRequestId, includeReasons)

Get FCRA Payment Success Indicators by Pay Request ID

Get the FCRA Payment Success Indicator scores that have been generated by a previous call to Generate FCRA Payment Success Indicators. _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentSuccessIndicatorApi;

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

    PaymentSuccessIndicatorApi apiInstance = new PaymentSuccessIndicatorApi(defaultClient);
    String customerId = "1005061234"; // String | A customer ID
    String accountId = "5011648377"; // String | The account ID
    String payRequestId = "476412776235977427"; // String | Unique identifier of the Payments request
    Boolean includeReasons = true; // Boolean | If this parameter is true, the reasons codes will be provided in the results. Otherwise, the reasons will be omitted.
    try {
      FcraPaymentSuccessIndicators result = apiInstance.getFcraPaymentSuccessIndicators(customerId, accountId, payRequestId, includeReasons);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentSuccessIndicatorApi#getFcraPaymentSuccessIndicators");
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
| **payRequestId** | **String**| Unique identifier of the Payments request | |
| **includeReasons** | **Boolean**| If this parameter is true, the reasons codes will be provided in the results. Otherwise, the reasons will be omitted. | [optional] |

### Return type

[**FcraPaymentSuccessIndicators**](FcraPaymentSuccessIndicators.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully requested to retrieve a Payment Success Indicators score |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |
| **406** | Not allowed |  -  |

<a id="getPaymentSuccessIndicator"></a>
# **getPaymentSuccessIndicator**
> PaymentSuccessIndicator getPaymentSuccessIndicator(customerId, accountId, settlementAmount, settleByDate)

Get Non-FCRA Payment Success Indicator (Legacy)

Payment Success Indicator (PSI) is a Payment Intelligence solution that uses Financial Institution (FI) data to help payment originators evaluate a consumer&#39;s ability to pay now and in the future within a given time period. PSI is for payment originators to assess a consumer&#39;s real-time FI account balance and historical FI account activities to help minimize ACH declines and enable payment originators to gracefully transition to alternative payment methods or schedules when payment settlement using ACH / Account-based payment is less likely. PSI may not be used for credit or insurance underwriting, employment or rental screening, or any other purpose(s) that would implicate the Fair Credit Reporting Act or other consumer reporting law.    _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentSuccessIndicatorApi;

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

    PaymentSuccessIndicatorApi apiInstance = new PaymentSuccessIndicatorApi(defaultClient);
    String customerId = "1005061234"; // String | A customer ID
    String accountId = "5011648377"; // String | The account ID
    BigDecimal settlementAmount = new BigDecimal("10.05"); // BigDecimal | The transaction amount in USD $.
    LocalDate settleByDate = LocalDate.parse("2023-03-30"); // LocalDate | The expected date that the funds, from the consumer’s account, will be moved to the receiving account.  `settleByDate` in ISO 8601 date format (YYYY-MM-DD). `settleByDate` dictates the number of days the model responds with. The response can range from 3-10 days, including `day0`. Details explained below: 1. If `settleByDate` is 9 or more days out from today, the response includes 10 days of data, `day0` through `day9`. 2. If `settleByDate` is between 3 and 8 days out from today, the response includes 4-9 days of data, `day3-8`. 3. If `settleByDate` is between today and 2 days out from today, the response includes 3 days of data, `day0` through `day2`.
    try {
      PaymentSuccessIndicator result = apiInstance.getPaymentSuccessIndicator(customerId, accountId, settlementAmount, settleByDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentSuccessIndicatorApi#getPaymentSuccessIndicator");
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
| **settlementAmount** | **BigDecimal**| The transaction amount in USD $. | |
| **settleByDate** | **LocalDate**| The expected date that the funds, from the consumer’s account, will be moved to the receiving account.  &#x60;settleByDate&#x60; in ISO 8601 date format (YYYY-MM-DD). &#x60;settleByDate&#x60; dictates the number of days the model responds with. The response can range from 3-10 days, including &#x60;day0&#x60;. Details explained below: 1. If &#x60;settleByDate&#x60; is 9 or more days out from today, the response includes 10 days of data, &#x60;day0&#x60; through &#x60;day9&#x60;. 2. If &#x60;settleByDate&#x60; is between 3 and 8 days out from today, the response includes 4-9 days of data, &#x60;day3-8&#x60;. 3. If &#x60;settleByDate&#x60; is between today and 2 days out from today, the response includes 3 days of data, &#x60;day0&#x60; through &#x60;day2&#x60;. | |

### Return type

[**PaymentSuccessIndicator**](PaymentSuccessIndicator.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The payment success indicator was successfully retrieved |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | Required details not found |  -  |

<a id="getPaymentSuccessIndicators"></a>
# **getPaymentSuccessIndicators**
> PaymentSuccessIndicators getPaymentSuccessIndicators(customerId, accountId, payRequestId, includeReasons)

Get Non-FCRA Payment Success Indicators by Pay Request ID

Get the Non-FCRA Payment Success Indicator scores that have been generated by a previous call to Generate Payment Success Indicators.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentSuccessIndicatorApi;

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

    PaymentSuccessIndicatorApi apiInstance = new PaymentSuccessIndicatorApi(defaultClient);
    String customerId = "1005061234"; // String | A customer ID
    String accountId = "5011648377"; // String | The account ID
    String payRequestId = "476412776235977427"; // String | Unique identifier of the Payments request
    Boolean includeReasons = true; // Boolean | If this parameter is true, the reasons codes will be provided in the results. Otherwise, the reasons will be omitted.
    try {
      PaymentSuccessIndicators result = apiInstance.getPaymentSuccessIndicators(customerId, accountId, payRequestId, includeReasons);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentSuccessIndicatorApi#getPaymentSuccessIndicators");
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
| **payRequestId** | **String**| Unique identifier of the Payments request | |
| **includeReasons** | **Boolean**| If this parameter is true, the reasons codes will be provided in the results. Otherwise, the reasons will be omitted. | [optional] |

### Return type

[**PaymentSuccessIndicators**](PaymentSuccessIndicators.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully requested to retrieve a Payment Success Indicators score |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |
| **406** | Not allowed |  -  |

