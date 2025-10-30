# CashFlowApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateCashFlowBusinessReport**](CashFlowApi.md#generateCashFlowBusinessReport) | **POST** /decisioning/v2/customers/{customerId}/cashFlowBusiness | Generate Cash Flow Report for the customer (Business) |
| [**generateCashFlowPersonalReport**](CashFlowApi.md#generateCashFlowPersonalReport) | **POST** /decisioning/v2/customers/{customerId}/cashFlowPersonal | Generate Cash Flow Report for the customer (Personal) |


<a id="generateCashFlowBusinessReport"></a>
# **generateCashFlowBusinessReport**
> CashFlowReportAck generateCashFlowBusinessReport(customerId, cashFlowReportConstraints, callbackUrl)

Generate Cash Flow Report for the customer (Business)

Generate a Cash Flow Report (Business) report for all checking and savings under the given customer. This service retrieves up to two years of transaction history for the given account. It then uses this information to generate the CFR report. A consumer is not required to generate this report.  This report is not provided under FCRA rules, and this report is not available in the Finicity Consumer Portal for the borrower to view.  If no account type of checking or savings is found, the service will return HTTP 400 Bad Request.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CashFlowApi;

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

    CashFlowApi apiInstance = new CashFlowApi(defaultClient);
    String customerId = "1005061234"; // String | A customer ID
    CashFlowReportConstraints cashFlowReportConstraints = new CashFlowReportConstraints(); // CashFlowReportConstraints | 
    String callbackUrl = "https://finicity-test/webhook"; // String | A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code.
    try {
      CashFlowReportAck result = apiInstance.generateCashFlowBusinessReport(customerId, cashFlowReportConstraints, callbackUrl);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CashFlowApi#generateCashFlowBusinessReport");
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
| **cashFlowReportConstraints** | [**CashFlowReportConstraints**](CashFlowReportConstraints.md)|  | |
| **callbackUrl** | **String**| A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. | [optional] |

### Return type

[**CashFlowReportAck**](CashFlowReportAck.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status. |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **403** | The active security freeze for this consumer exists. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

<a id="generateCashFlowPersonalReport"></a>
# **generateCashFlowPersonalReport**
> CashFlowReportAck generateCashFlowPersonalReport(customerId, cashFlowReportConstraints, callbackUrl)

Generate Cash Flow Report for the customer (Personal)

Generate a Cash Flow Report (Personal) report for all checking and savings under the given customer. This service retrieves up to two years of transaction history for the given account. It then uses this information to generate the CFR report.  This report is provided under FCRA rules, with Finicity acting as the CRA (Consumer Reporting Agency). If an individual account is included in the report - for example, with an individual acting as an personal guarantor on the loan - then this version of the report should be used. In case of an adverse action on the loan where the decision was based on this report, then the borrower can be referred to the [Finicity Consumer Portal](https://consumer.finicityreports.com) where they can view this report and submit a dispute if they feel any information in this report is inaccurate.  Before calling this API, a consumer must be created for the given customer ID (see Consumers APIs).  If no account type of checking or savings is found, the service will return HTTP 400 Bad Request.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CashFlowApi;

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

    CashFlowApi apiInstance = new CashFlowApi(defaultClient);
    String customerId = "1005061234"; // String | A customer ID
    CashFlowReportConstraints cashFlowReportConstraints = new CashFlowReportConstraints(); // CashFlowReportConstraints | 
    String callbackUrl = "https://finicity-test/webhook"; // String | A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code.
    try {
      CashFlowReportAck result = apiInstance.generateCashFlowPersonalReport(customerId, cashFlowReportConstraints, callbackUrl);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CashFlowApi#generateCashFlowPersonalReport");
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
| **cashFlowReportConstraints** | [**CashFlowReportConstraints**](CashFlowReportConstraints.md)|  | |
| **callbackUrl** | **String**| A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. | [optional] |

### Return type

[**CashFlowReportAck**](CashFlowReportAck.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status. |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **403** | The active security freeze for this consumer exists. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

