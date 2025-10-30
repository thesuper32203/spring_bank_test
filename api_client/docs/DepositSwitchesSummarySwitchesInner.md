

# DepositSwitchesSummarySwitchesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Deposit switch ID |  |
|**status** | **String** | Deposit switch status. Possible values include &#x60;processing&#x60;, &#x60;completed&#x60;, or &#x60;failed&#x60;.  * processing - The deposit switch is currently being processed. * completed - The deposit switch has been completed successfully. * failed - The deposit switch has failed. Refer to failureReason for more details.  |  |
|**failureReason** | **String** | Deposit switch failure reason. Possible values include - * account-lockout - The account is locked out, most likely the end user has had too many failed attempts. * account-setup-incomplete - The user&#39;s account in the payroll system is not fully set up and will require additional information from the user. * account-unusable - The user&#39;s bank account is unusable for the selected product or use case. * bad-credentials - Either the username or password was incorrect. This is our most common fail reason. * connection-error - A network error occurred which caused the connection between our system and the payroll system to be lost. * distribution-not-supported - The payroll system did not support the type of distribution requested. For example, the user attempted to allocate a percentage of their paycheck, but is only eligible for fixed amounts and remainder/net balance. * device-disconnected - The device used to start the task is no longer connected. * enrolled-in-paycard - The user is enrolled in a paycard program instead of direct deposit via their bank. * expired - The user&#39;s password has expired and they must create a new one. * no-data-found - No verify data was found for the user. * product-not-supported - The payroll system did not allow the action to be taken. Many payroll systems allow HR to customize what is allowed in their system. Direct Deposit may be allowed by a payroll system, but may be disallowed by a specific employer. Therefore, when an employee of that company goes to set up Direct Deposit it is rejected, resulting in this error code. * routing-number-not-supported - The account did not support the routing number entered. * session-timeout - The user&#39;s session timed out. * system-unavailable - The system was unavailable. For example, the site is undergoing maintenance or it is outside the window of scheduled availability for the site. * transaction-pending - There is a deposit allocation already in progress and additional updates cannot be made at this time. For example, if an employer has an approval process in place, they may disallow modifications until the update has been processed. * unknown-failure - We encountered an unexpected error. * user-abandon - The user was asked an MFA question, but did not answer the question. * work-status-terminated - The task could not be completed because the user&#39;s employment has been terminated.  |  [optional] |
|**createdDate** | **String** | Date and time in ISO 8601 format (YYYY-MM-DDThh:mm:ssZ) when deposit switch was performed |  |



