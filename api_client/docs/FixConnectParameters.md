

# FixConnectParameters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**language** | **String** | By default, the Connect application is in English. You don&#39;t need to pass this parameter unless you want to translate Connect into one of our supported languages.  * Spanish (United States): &#x60;es&#x60; * French (Canada): &#x60;fr&#x60;  |  [optional] |
|**partnerId** | **String** | Your Partner ID displayed in the [Developer Dashboard](https://developer.mastercard.com/account/log-in) |  |
|**customerId** | **String** | A customer ID. See Add Customer API for how to create a customer ID. |  |
|**institutionLoginId** | **String** | An institution login ID (from the account record) |  |
|**redirectUri** | **String** | The URL that customers will be redirected to after completing Finicity Connect.  Required unless Connect is embedded inside our application (iframe). Required for NON SDK integrations, should be iOS universal link OR Android app link  when Connect is hosted in a web view / secure container of the partner mobile app. |  [optional] |
|**webhook** | **String** | The publicly available URL you want to be notified with events as the user progresses through the application. See [Connect Webhook Event](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-connect/) for event details. |  [optional] |
|**webhookContentType** | **String** | The content type the webhook events will be sent in. Supported types: \&quot;application/json\&quot; and \&quot;application/xml\&quot;. |  [optional] |
|**webhookData** | **Object** | Allows additional identifiable information to be inserted into the payload of connect webhook events. See: [Custom Webhooks](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-custom/). |  [optional] |
|**webhookHeaders** | **Object** | Allows additional identifiable information to be included as headers of connect webhook event. See: [Custom Webhooks](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-custom/). |  [optional] |
|**experience** | **String** | The &#x60;experience&#x60; field allows you to customize: * Brand: color and logo * Icon: displayed on the \&quot;Share your data\&quot; page * Popular institutions: displayed on the Bank Search page * Report: the credit decisioning report to send when Connect completes. * MVS modules: financial, payroll, paystub  Note: the Finicity sales engineers (SE) help you set up a default experience for your company. For each additional experience you create thereafter, they&#39;ll give you a unique ID. See [Configure the Connect Experience](https://developer.mastercard.com/open-banking-us/documentation/connect/configure-connect-experience/).  Experience values options: * \&quot;default\&quot;: your default experience (must be defined) * GUID: the code for a different experience * Not defined: If you don&#39;t pass the experience parameter, then Connect&#39;s out of the box default experience (add accounts but no branding) is used, and the MVS modules will not run. |  [optional] |
|**singleUseUrl** | **Boolean** | \&quot;true\&quot;: The URL link expires after a Connect session successfully completes.  Note: when the &#x60;singleUseUrl&#x60; and the &#x60;experience&#x60; parameters are passed in the same call, the &#x60;singleUseUrl&#x60; value overrides the &#x60;singleUseUrl&#x60; value configured in the &#x60;experience&#x60; parameter. |  [optional] |
|**isHostedInMobileApp** | **Boolean** | Indicates whether Connect is hosted in a web view / secure container of the partner mobile app. It is only required for NON SDK integrations. |  [optional] |
|**isWebView** | **Boolean** | \&quot;true\&quot;: Indicates that the Connect Session will be displayed within a WebView. When the &#x60;isWebView&#x60; parameter is &#x60;true&#x60; the &#x60;redirectUri&#x60; parameter is required.  Note: This parameter is no longer recommended. We instead recommend specifying a &#x60;redirectUrl&#x60; through our WebSDK. Please refer to the following documentation:  - [iOS](https://developer.mastercard.com/open-banking-us/documentation/connect/integrating/webviews/ios-webviews/)  - [Android](https://developer.mastercard.com/open-banking-us/documentation/connect/integrating/webviews/android-webviews/) |  [optional] |



