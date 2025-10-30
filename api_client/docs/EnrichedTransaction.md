

# EnrichedTransaction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**externalCustomerId** | **String** | A unique identifier assigned to the customer for a particular institution. |  [optional] |
|**externalAccountId** | **String** | A unique identifier assigned to the accounts for a particular institution. |  [optional] |
|**accountType** | **String** | Indicates the type of account associated with the transaction. Listed below are the current account types supported:  \&quot;checking\&quot;, \&quot;savings\&quot;, \&quot;creditCard\&quot;, \&quot;brokerageAccount\&quot;, \&quot;investment\&quot;, \&quot;healthSavingsAccount\&quot;, \&quot;unknown\&quot;  NOTE : If \&quot;unknown\&quot; is provided, the enrichment service will assume it is a \&quot;checking\&quot; account. An incorrect assumption could impact the results from the enrichment service.  |  [optional] |
|**externalTransactionId** | **String** | A unique identifier for the transaction that assists in linking data back to your systems. |  [optional] |
|**postedTimestamp** | **String** | The date and time when the transaction was officially recorded in the account.  Supported formats are yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;, yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;, yyyy-MM-dd HH:mm:ss.0, yyyy-MM-dd.  |  [optional] |
|**transactionTimestamp** | **String** | The exact date and time when the transaction was initiated or occurred.  Supported formats are yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;, yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;, yyyy-MM-dd HH:mm:ss.0, yyyy-MM-dd.  |  [optional] |
|**description** | **String** | Description of the transaction. |  [optional] |
|**memo** | **String** | Memo of the transaction. |  [optional] |
|**amount** | **Double** | Value amount for transaction. |  [optional] |
|**transactionFee** | **Double** | A charge applied to the transaction. |  [optional] |
|**transactionCategory** | **String** | Transaction Category for the transaction. |  [optional] |
|**transactionCategoryScore** | **Double** | A confidence score between 0 – 100.0 for the transaction category. |  [optional] |
|**transactionCategoryGroup** | **String** | The parent group that a transaction category belongs to. |  [optional] |
|**type** | **String** | Type for transaction. |  [optional] |
|**directionIndicator** | **String** | - The directionIndicator should be from the perspective of the account holder. - If you always send us positive amount values, you MUST send us corresponding directionIndicator values to ensure the categorization logic works as intended. - If you have internal logic to provide the amount field as either positive or negative, do not send us data in the directionIndicator.  - Listed below are the current directionIndicator types supported:   - \&quot;Debit\&quot;   - \&quot;Credit\&quot;  |  [optional] |
|**entities** | [**List&lt;EntitiesInner&gt;**](EntitiesInner.md) | Entities refer to the distinct parties involved in the transaction. |  [optional] |
|**address** | [**DESAddress**](DESAddress.md) |  |  [optional] |
|**additionalDetails** | **Map&lt;String, String&gt;** | A dictionary containing additional details of the transaction being returned in the enrichment response. - This object should not contain any PII. - The max number of allowed keys are 30. - The key max length should be 100. - The value max length should be 255.  |  [optional] |
|**cardAcceptorId** | **String** | Also known as CAID, Merchant ID, or DE42, cardAcceptorId is an alphanumeric string assigned by the acquiring bank (Acquirer) to a merchant or merchant location. It serves as a unique identifier for the point of transaction origin, such as a physical store, payment terminal, or online checkout page. |  [optional] |
|**inputIsRecurringTransaction** | **Boolean** | A flag in the input indicating whether the transaction is recurring or not. |  [optional] |
|**inputMerchantInformation** | [**InputMerchantInformation**](InputMerchantInformation.md) |  |  [optional] |
|**isRecurringTransaction** | **Boolean** | A flag indicating whether the transaction is recurring or not. |  [optional] |
|**locationId** | **BigDecimal** | The Mastercard assigned location id representing this merchant location. |  [optional] |
|**isEcommerce** | **Boolean** | A flag indicating whether the business location is ecommerce or not. |  [optional] |
|**isBrickAndMortar** | **Boolean** | A boolean value indicating if the identified merchant is a brick and mortar location. |  [optional] |
|**matchConfidenceScore** | **BigDecimal** | If the merchantDescriptor is used to select the locationId and location details, a matchConfidenceScore is returned, indicating the score between the merchantDescriptor and the selected information from our internal data on merchants. |  [optional] |



