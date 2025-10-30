

# TransactionPayload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**externalCustomerId** | **String** | A unique identifier assigned to the customer for a particular institution. __Note:__ The externalCustomerId and externalAccountId fields are to allow you to map the transactions back to your data. __Do not send Mastercard plaintext representations of customer or account IDs.__ The representative IDs must be obfuscated through cryptographically strong hashing (we recommend using SHA-2 or SHA-3 methods). |  |
|**externalAccountId** | **String** | A unique identifier assigned to the accounts for a particular institution. __Note:__ The externalCustomerId and externalAccountId fields are to allow you to map the transactions back to your data. __Do not send Mastercard plaintext representations of customer or account IDs.__ The representative IDs must be obfuscated through cryptographically strong hashing (we recommend using SHA-2 or SHA-3 methods). |  |
|**accountType** | **String** | Indicates the type of account associated with the transaction. Listed below are the current account types supported:  \&quot;checking\&quot;, \&quot;savings\&quot;, \&quot;creditCard\&quot;, \&quot;brokerageAccount\&quot;, \&quot;investment\&quot;, \&quot;healthSavingsAccount\&quot;, \&quot;unknown\&quot;  NOTE : If \&quot;unknown\&quot; is provided, the enrichment service will assume it is a \&quot;checking\&quot; account. An incorrect assumption could impact the results from the enrichment service.  |  |
|**externalTransactionId** | **String** | A unique identifier for the transaction that assists in linking data back to your systems. |  |
|**postedTimestamp** | **String** | The date and time when the transaction was officially recorded in the account.  Supported formats are yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;, yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;, yyyy-MM-dd HH:mm:ss.0, yyyy-MM-dd.  |  [optional] |
|**transactionTimestamp** | **String** | The exact date and time when the transaction was initiated or occurred.  Supported formats are yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;, yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;, yyyy-MM-dd HH:mm:ss.0, yyyy-MM-dd.  |  |
|**description** | **String** | Description of the transaction. |  |
|**memo** | **String** | Memo of the transaction. |  [optional] |
|**amount** | **Double** | Value amount for transaction. |  |
|**transactionFee** | **Double** | A charge applied to the transaction. |  [optional] |
|**type** | **String** | Type of the transaction. |  [optional] |
|**directionIndicator** | **String** | - The directionIndicator should be from the perspective of the account holder. - If you always send us positive amount values, you MUST send us corresponding directionIndicator values to ensure the categorization logic works as intended. - If you have internal logic to provide the amount field as either positive or negative, do not send us data in the directionIndicator.  - Listed below are the current directionIndicator types supported:   - \&quot;Debit\&quot;   - \&quot;Credit\&quot;  |  [optional] |
|**additionalDetails** | **Map&lt;String, String&gt;** | A dictionary containing additional details of the transaction being returned in the enrichment response. - This object should not contain any PII. - The max number of allowed keys are 30. - The key max length should be 100. - The value max length should be 255.  |  [optional] |
|**cardAcceptorId** | **String** | Also known as CAID, Merchant ID, or DE42, cardAcceptorId is an alphanumeric string assigned by the acquiring bank (Acquirer) to a merchant or merchant location. It serves as a unique identifier for the point of transaction origin, such as a physical store, payment terminal, or online checkout page. |  [optional] |
|**inputIsRecurringTransaction** | **Boolean** | A flag indicating whether the transaction is recurring or not. |  [optional] |
|**inputMerchantInformation** | [**InputMerchantInformation**](InputMerchantInformation.md) |  |  [optional] |



