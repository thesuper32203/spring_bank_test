

# AccountOwnerVerificationMatchingDetails

Owner of a customer account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**relationship** | **String** | The type of relationship to the account: * \&quot;AUTHORIZED_USER\&quot;  * \&quot;BUSINESS\&quot;  * \&quot;FOR_BENEFIT_OF_PRIMARY\&quot;  * \&quot;FOR_BENEFIT_OF_PRIMARY_JOINT_RESTRICTED\&quot;  * \&quot;FOR_BENEFIT_OF_SECONDARY\&quot;  * \&quot;FOR_BENEFIT_OF_SECONDARY_JOINT_RESTRICTED\&quot;  * \&quot;FOR_BENEFIT_OF_SOLE_OWNER_RESTRICTED\&quot;  * \&quot;POWER_OF_ATTORNEY\&quot;  * \&quot;PRIMARY_JOINT_TENANTS\&quot;  * \&quot;PRIMARY\&quot;  * \&quot;PRIMARY_BORROWER\&quot;  * \&quot;PRIMARY_JOINT\&quot;  * \&quot;SECONDARY\&quot;  * \&quot;SECONDARY_JOINT_TENANTS\&quot;  * \&quot;SECONDARY_BORROWER\&quot;  * \&quot;SECONDARY_JOINT\&quot;  * \&quot;SOLE_OWNER\&quot;  * \&quot;TRUSTEE\&quot;  * \&quot;UNIFORM_TRANSFER_TO_MINOR\&quot; |  [optional] |
|**ownerName** | **String** | The full name of the account owner. Multiple account owners are returned in one string per the source data from the institution. |  |
|**firstName** | **String** | The first name of the account holder |  [optional] |
|**middleName** | **String** | The middle name of the account holder |  [optional] |
|**lastName** | **String** | The last name of the account holder |  [optional] |
|**suffix** | **String** | A generational or academic suffix |  [optional] |
|**nameScores** | [**NameScore**](NameScore.md) |  |  |
|**nameClassification** | **String** | The classification of the account holder: * \&quot;person / personal / home\&quot; * \&quot;business\&quot; * \&quot;other\&quot; |  |
|**nameClassificationconfidencescore** | **BigDecimal** | The confidence score 0 – 1.0 of the name classification. |  [optional] |
|**addresses** | [**List&lt;AccountOwnerVerificationMatchingAddress&gt;**](AccountOwnerVerificationMatchingAddress.md) | List of addresses |  [optional] |
|**emails** | [**List&lt;AccountOwnerVerificationMatchingEmail&gt;**](AccountOwnerVerificationMatchingEmail.md) | List of emails |  [optional] |
|**phones** | [**List&lt;AccountOwnerVerificationPhone&gt;**](AccountOwnerVerificationPhone.md) | List of phones |  [optional] |
|**documentations** | [**List&lt;AccountOwnerDocumentation&gt;**](AccountOwnerDocumentation.md) | List of account owner documentation |  [optional] |
|**identityInsights** | [**AccountOwnerIdentityInsights**](AccountOwnerIdentityInsights.md) |  |  [optional] |



