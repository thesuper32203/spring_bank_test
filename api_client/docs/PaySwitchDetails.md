

# PaySwitchDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerId** | **String** | A customer ID |  |
|**customerType** | **String** | The type of Mastercard Open Finance customer (&#x60;active&#x60; or &#x60;testing&#x60;) |  |
|**switchId** | **String** | Pay switch ID |  |
|**switchStatus** | **String** | Pay switch status. Possible values include &#x60;processing&#x60;, &#x60;completed&#x60;, or &#x60;failed&#x60;.  * processing - The pay switch is currently being processed. * completed - The pay switch has been completed successfully. * failed - The pay switch has failed. Refer to failureReason for more details.  |  |
|**failureReason** | **String** | Pay switch failure reason. Possible values include - * account-lockout - The account is locked out, most likely the end user has had too many failed attempts. * account-unusable - The user&#39;s bank account is unusable for the selected product or use case. * bad-credentials - Either the username or password was incorrect. This is our most common fail reason. * connection-error - A network error occurred which caused the connection between our system and the bank/payroll system to be lost. * device-disconnected - The device used to start the task is no longer connected. * expired - The user&#39;s password has expired and they must create a new one. * no-data-found - No verify data was found for the user. * routing-number-not-supported - The account did not support the routing number entered. * session-timeout - The user&#39;s session timed out. * system-unavailable - The system was unavailable. For example, the site is undergoing maintenance or it is outside the window of scheduled availability for the site. * transaction-pending - There is an allocation already in progress and additional updates cannot be made at this time. * unknown-failure - We encountered an unexpected error. * user-abandon - The user was asked an MFA question, but did not answer the question.  |  [optional] |
|**createdDate** | **String** | Date and time in ISO 8601 format (YYYY-MM-DDThh:mm:ssZ) when deposit switch was performed |  |
|**updatedDate** | **String** | Date and time in ISO 8601 format (YYYY-MM-DDThh:mm:ssZ) when deposit switch status was updated |  |
|**authenticated** | **Boolean** | Indicates whether or not the pay switch task has successfully authenticated against the payroll system |  [optional] |
|**provider** | [**PaySwitchDetailsProvider**](PaySwitchDetailsProvider.md) |  |  |
|**paymentMethods** | [**List&lt;PaySwitchDetailsPaymentMethodsInner&gt;**](PaySwitchDetailsPaymentMethodsInner.md) | Pay switch payment details |  |



