

# Institution

A financial institution

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The ID of a financial institution, represented as a number |  |
|**name** | **String** | The name of the institution |  [optional] |
|**transAgg** | **Boolean** | \&quot;true\&quot;: The institution is certified for the Transaction Aggregation product \&quot;false\&quot;: The institution is decertified for the Transaction Aggregation product |  |
|**ach** | **Boolean** | \&quot;true\&quot;: The institution is certified for the ACH product \&quot;false\&quot;: The institution is decertified for the ACH product |  |
|**stateAgg** | **Boolean** | \&quot;true\&quot;: The institution is certified for the Statement Aggregation product \&quot;false\&quot;: The institution is decertified for the Statement Aggregation product |  |
|**voi** | **Boolean** | \&quot;true\&quot;: The institution is certified for the VOI product \&quot;false\&quot;: The institution is decertified for the VOI product |  |
|**voa** | **Boolean** | \&quot;true\&quot;: The institution is certified for the VOA product \&quot;false\&quot;: The institution is decertified for the VOA product |  |
|**aha** | **Boolean** | \&quot;true\&quot;: The institution is certified for the Account History Aggregation product \&quot;false\&quot;: The institution is decertified for the Account History Aggregation product |  |
|**availBalance** | **Boolean** | \&quot;true\&quot;: The institution is certified for the Account Balance Check (ABC) product \&quot;false\&quot;: The institution is decertified for the Account Balance Check (ABC) product |  |
|**accountOwner** | **Boolean** | \&quot;true\&quot;: The institution is certified for the Account Owner product \&quot;false\&quot;: The institution is decertified for the Account Owner product |  |
|**studentLoanData** | **Boolean** | \&quot;true\&quot;: The institution is certified for the Student Loan Data product  \&quot;false\&quot;: The institution is decertified for the Student Loan Data product |  [optional] |
|**loanPaymentDetails** | **Boolean** | \&quot;true\&quot;: The institution is certified for the Loan Payment Detail product  \&quot;false\&quot;: The institution is decertified for the Loan Payment Detail product |  [optional] |
|**accountTypeDescription** | **String** | Values: Banking, Investments, Credit Cards/Accounts, Workplace Retirement, Mortgages and Loans, Insurance |  [optional] |
|**phone** | **String** | A phone number (max length 15). |  [optional] |
|**urlHomeApp** | **String** | The URL of the institution&#39;s primary home page |  [optional] |
|**urlLogonApp** | **String** | The URL of the institution&#39;s login page |  [optional] |
|**oauthEnabled** | **Boolean** | \&quot;true\&quot;: The institution is an OAuth connection  \&quot;false\&quot;: The institution isn&#39;t an OAuth connection |  |
|**urlForgotPassword** | **String** | Institution&#39;s forgot password page |  [optional] |
|**urlOnlineRegistration** | **String** | Institution&#39;s signup page |  [optional] |
|**propertyClass** | **String** | Institution&#39;s class |  [optional] |
|**specialText** | **String** | Special instructions given to customers for login |  [optional] |
|**timeZone** | **String** | The time zone of the institution. |  [optional] |
|**specialInstructions** | **List&lt;String&gt;** | Instructions given to the customer before they are sent to the institution website to login for OAuth institutions.  Note: this helps the customer to provide the proper permission for data needed for the application. |  [optional] |
|**specialInstutionsTitle** | **String** | The title of the special instructions, if one exists or is required. |  [optional] |
|**address** | [**InstitutionAddress**](InstitutionAddress.md) |  |  [optional] |
|**currency** | **String** | A currency code |  |
|**email** | **String** | An email address |  [optional] |
|**status** | **String** | Status for the institution: \&quot;online\&quot;, \&quot;offline\&quot;, \&quot;maintenance\&quot;, \&quot;testing\&quot;, \&quot;beta\&quot;, \&quot;validated\&quot;, \&quot;migrating\&quot; |  |
|**newInstitutionId** | **Long** | The ID of a financial institution, represented as a number |  [optional] |
|**branding** | [**Branding**](Branding.md) |  |  [optional] |
|**oauthInstitutionId** | **Long** | The ID of a financial institution, represented as a number |  [optional] |



