

# Transactions

A list of transactions

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**found** | **Integer** | The total number of results matching search criteria |  |
|**displaying** | **Integer** | The number of results returned |  |
|**moreAvailable** | **String** | If the value of &#x60;moreAvailable&#x60; is \&quot;true\&quot;, you can retrieve the next page of results by increasing the value of the start parameter in your next request:\&quot;...&amp;start&#x3D;6&amp;limit&#x3D;5\&quot; |  |
|**fromDate** | **String** | Value of the &#x60;fromDate&#x60; request parameter that generated this response. This date is in Unix epoch time (in seconds). |  |
|**toDate** | **String** | Value of the &#x60;toDate&#x60; request parameter that generated this response. This date is in Unix epoch time (in seconds). |  |
|**sort** | **String** | Value of the sort request parameter that generated this response |  |
|**transactions** | [**List&lt;Transaction&gt;**](Transaction.md) | The array of transactions |  |
|**dailyBalances** | [**List&lt;DailyBalance&gt;**](DailyBalance.md) | Array of daily beginning and ending account balances for each day that transactions are recorded |  [optional] |



