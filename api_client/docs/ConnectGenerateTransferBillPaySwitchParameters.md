

# ConnectGenerateTransferBillPaySwitchParameters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**serviceAgreement** | [**ServiceAgreement**](ServiceAgreement.md) |  |  [optional] |
|**accounts** | [**List&lt;DepositSwitchAccount&gt;**](DepositSwitchAccount.md) | List of customer accounts (one or more) for Deposit Switch. |  [optional] |
|**partnerId** | **String** | Your Partner ID displayed in the [Developer Dashboard](https://developer.mastercard.com/account/log-in) |  |
|**customerId** | **String** | A customer ID. See Add Customer API for how to create a customer ID. |  |
|**experience** | **String** | The &#x60;experience&#x60; field allows you to customize:    * To toggle landing screen visibility    Note: the Finicity sales engineers (SE) help you set up a default   experience for your company. For each additional experience you create   thereafter, they&#39;ll give you a unique ID. See [Configure the Connect   Experience](https://developer.mastercard.com/open-banking-us/documentation/connect/configure-connect-experience/).     Experience values options:    * \&quot;default\&quot;: your default experience (must be defined)   * GUID: the code for a different experience |  [optional] |
|**language** | **String** | By default, the Connect application is in English. You don&#39;t need to pass this parameter unless you want to translate Connect into one of our supported languages.  * Spanish (United States): &#x60;es&#x60;  |  [optional] |
|**singleUseUrl** | **Boolean** | \&quot;true\&quot;: The URL link expires after a Connect session successfully completes.  Note: when the &#x60;singleUseUrl&#x60; and the &#x60;experience&#x60; parameters are passed in the same call, the &#x60;singleUseUrl&#x60; value overrides the &#x60;singleUseUrl&#x60; value configured in the &#x60;experience&#x60; parameter. |  |
|**redirectUri** | **String** | The URL that customers will be redirected to after completing Finicity Connect.  Required unless Connect is embedded inside our application (iframe). Required for NON SDK integrations, should be iOS universal link OR Android app link  when Connect is hosted in a web view / secure container of the partner mobile app. |  [optional] |
|**cards** | [**List&lt;Card&gt;**](Card.md) | List of the user cards. Mandatory when use case is BPS. |  |
|**identity** | [**BillPaySwitchIdentity**](BillPaySwitchIdentity.md) |  |  |



