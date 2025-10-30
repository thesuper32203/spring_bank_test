# AnalyticsApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateForesightAnalyticsNonCraReport**](AnalyticsApi.md#generateForesightAnalyticsNonCraReport) | **POST** /decisioning/customers/{customerId}/reports/foresight-analytics/userTypes/{userType} | Generate foresight analytics non-CRA report for the customer - Personal |


<a id="generateForesightAnalyticsNonCraReport"></a>
# **generateForesightAnalyticsNonCraReport**
> AnalyticsReportAck generateForesightAnalyticsNonCraReport(customerId, userType, foresightAnalyticsReportConstraints, callbackUrl)

Generate foresight analytics non-CRA report for the customer - Personal

Generate a foresight analytics non-CRA report for a given customer. The report includes benchmarking and forecasting data for a customer based on inputs of account and transaction data as permitted by the customer, and segments (e.g., postal code) provided by the partner. A consumer is not required to generate this report.  If no account type of checking, credit card, or savings is found, the service will return an HTTP 400 Bad Request.  This is a premium service, billable per every successful API call for non-testing customers. A successful call to this API will generate a foresight analytics report which can be retrieved via Get Report by Customer.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnalyticsApi;

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

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    String customerId = "1005061234"; // String | A customer ID
    String userType = "personal"; // String | UserType indicates if the request is for a personal use case, Allowed values: personal.
    ForesightAnalyticsReportConstraints foresightAnalyticsReportConstraints = new ForesightAnalyticsReportConstraints(); // ForesightAnalyticsReportConstraints | 
    String callbackUrl = "https://finicity-test/webhook"; // String | A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code.
    try {
      AnalyticsReportAck result = apiInstance.generateForesightAnalyticsNonCraReport(customerId, userType, foresightAnalyticsReportConstraints, callbackUrl);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#generateForesightAnalyticsNonCraReport");
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
| **userType** | **String**| UserType indicates if the request is for a personal use case, Allowed values: personal. | |
| **foresightAnalyticsReportConstraints** | [**ForesightAnalyticsReportConstraints**](ForesightAnalyticsReportConstraints.md)|  | |
| **callbackUrl** | **String**| A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. | [optional] |

### Return type

[**AnalyticsReportAck**](AnalyticsReportAck.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status. |  * Location - Please Check the Report status at URL /decisioning/v3/customers/{customer_id}/reports/{report_id} <br>  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **403** | The active security freeze for this consumer exists. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

