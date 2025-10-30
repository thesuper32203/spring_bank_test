

# AppStatus

Registration status details for the application

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**partnerId** | **String** | Your Partner ID displayed in the [Developer Dashboard](https://developer.mastercard.com/account/log-in) |  |
|**preAppId** | **String** | Identifier to track the application registration from the App Registration and Get App Registration Status APIs |  |
|**note** | **String** | A note on the registration. Typically used to indicate reasons for rejected apps. |  [optional] |
|**applicationId** | **String** | &#x60;applicationId&#x60; value returned from the Get App Registration Status API and the partner assign the customers to. This cannot be changed once set. Only applicable in cases of partners with multiple registered applications. If the partner only has one app, this can usually be omitted. This field is populated after the app is in a status approved. |  [optional] |
|**appName** | **String** | The name of the application assigned to the customer |  |
|**submittedDate** | **Long** | A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  |
|**modifiedDate** | **Long** | A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  |
|**status** | **String** | The status of an app registration request. \&quot;A\&quot; means approved. \&quot;P\&quot; means pending which is the status when initially submitted or when the app is modified and awaiting approval. \&quot;R\&quot; means rejected. If it is rejected there will be a note with the rejected reason. \&quot;S\&quot; stands for \&quot;Skipped\&quot; and indicates that app registration with the data provider will not be required. |  |
|**scopes** | **String** | Indicates scopes of data accessible to the app |  [optional] |
|**institutionDetails** | [**List&lt;AppFinancialInstitutionStatus&gt;**](AppFinancialInstitutionStatus.md) | A list of the registration status for each FI for the application |  [optional] |



