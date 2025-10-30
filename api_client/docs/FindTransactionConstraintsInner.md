

# FindTransactionConstraintsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**findTransactionDescriptionMemo** | **String** | A string to return transactions that have an exact match to Description/Memo.&lt;/br&gt; - Description/Memo&lt;/br&gt;   - Found in the PDF report for reach transactions.&lt;/br&gt;   - A combination of **description** and **memo** from the JSON version of the report.&lt;/br&gt;  |  [optional] |
|**findTransactionAmountFrom** | **BigDecimal** | A decimal value to return transactions with **amount** greater than or equal to **findTransactionAmountFrom**.&lt;/br&gt; - If both **findTransactionAmountFrom** and **findTransactionAmountTo** are present. Then transactions with  **amount** between (inclusive) both values will be returned.  |  [optional] |
|**findTransactionAmountTo** | **BigDecimal** | A decimal value to return transactions with **amount** less than or equal to **findTransactionAmountTo**.&lt;/br&gt; - If both **findTransactionAmountFrom** and **findTransactionAmountTo** are present. Then transactions with  **amount** between (inclusive) both values will be returned.  |  [optional] |
|**findTransactionCategory** | **List&lt;String&gt;** | An array of **categories** to return transactions with an exact match to the array of **category**. Limit of 10.  |  [optional] |



