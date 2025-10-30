# TransactionDataEnrichmentApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**enrichTransactions**](TransactionDataEnrichmentApi.md#enrichTransactions) | **POST** /data-enrichment/transactions | Performs enrichment of the provided transactions |


<a id="enrichTransactions"></a>
# **enrichTransactions**
> EnrichedTransactions enrichTransactions(enrichTransactionsPayload)

Performs enrichment of the provided transactions

The operation processes the enclosed transactions for enrichment with categorization and entity recognition. Accepts a batch of 1000 transactions.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionDataEnrichmentApi;

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

    TransactionDataEnrichmentApi apiInstance = new TransactionDataEnrichmentApi(defaultClient);
    EnrichTransactionsPayload enrichTransactionsPayload = new EnrichTransactionsPayload(); // EnrichTransactionsPayload | A list of maximum of 1000 transactions to submit for transaction enrichment
    try {
      EnrichedTransactions result = apiInstance.enrichTransactions(enrichTransactionsPayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionDataEnrichmentApi#enrichTransactions");
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
| **enrichTransactionsPayload** | [**EnrichTransactionsPayload**](EnrichTransactionsPayload.md)| A list of maximum of 1000 transactions to submit for transaction enrichment | |

### Return type

[**EnrichedTransactions**](EnrichedTransactions.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Enriched Transactions Response. |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | Resource not found. |  -  |

