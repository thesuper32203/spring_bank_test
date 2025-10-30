

# TransferDepositSwitchParameters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**serviceAgreement** | [**ServiceAgreement**](ServiceAgreement.md) |  |  [optional] |
|**accounts** | [**List&lt;DepositSwitchAccount&gt;**](DepositSwitchAccount.md) | List of customer accounts (one or more) for Deposit Switch. |  |
|**partnerId** | **String** | Your Partner ID displayed in the [Developer Dashboard](https://developer.mastercard.com/account/log-in) |  |
|**customerId** | **String** | A customer ID. See Add Customer API for how to create a customer ID. |  |
|**language** | **String** | By default, the Connect application is in English. You don&#39;t need to pass this parameter unless you want to translate Connect into one of our supported languages.  * Spanish (United States): &#x60;es&#x60;  |  [optional] |
|**webhook** | **String** | The publicly available URL you want to be notified with events as the user progresses through the application. See [Connect Webhook Event](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-connect/) for event details. |  [optional] |
|**webhookContentType** | **String** | The content type the webhook events will be sent in. Supported types: \&quot;application/json\&quot; and \&quot;application/xml\&quot;. |  [optional] |
|**webhookData** | **Object** | Allows additional identifiable information to be inserted into the payload of connect webhook events. See: [Custom Webhooks](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-custom/). |  [optional] |
|**webhookHeaders** | **Object** | Allows additional identifiable information to be included as headers of connect webhook event. See: [Custom Webhooks](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-custom/). |  [optional] |
|**redirectUri** | **String** | The URL that customers will be redirected to after completing Finicity Connect.  Required unless Connect is embedded inside our application (iframe). Required for NON SDK integrations, should be iOS universal link OR Android app link  when Connect is hosted in a web view / secure container of the partner mobile app. |  [optional] |
|**experience** | **String** | The &#x60;experience&#x60; field allows you to customize:    * To toggle landing screen visibility    Note: the Finicity sales engineers (SE) help you set up a default   experience for your company. For each additional experience you create   thereafter, they&#39;ll give you a unique ID. See [Configure the Connect   Experience](https://developer.mastercard.com/open-banking-us/documentation/connect/configure-connect-experience/).     Experience values options:    * \&quot;default\&quot;: your default experience (must be defined)   * GUID: the code for a different experience |  [optional] |



