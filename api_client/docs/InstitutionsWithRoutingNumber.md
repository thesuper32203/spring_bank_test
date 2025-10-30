

# InstitutionsWithRoutingNumber

List of institutions with matching routing numbers

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The ID of a financial institution, represented as a number |  [optional] |
|**name** | **String** | The name of the institution |  [optional] |
|**transAgg** | **Boolean** | \&quot;true\&quot;: The institution is certified for the Transaction Aggregation product \&quot;false\&quot;: The institution is decertified for the Transaction Aggregation product |  [optional] |
|**ach** | **Boolean** | \&quot;true\&quot;: The institution is certified for the ACH product \&quot;false\&quot;: The institution is decertified for the ACH product |  [optional] |
|**stateAgg** | **Boolean** | \&quot;true\&quot;: The institution is certified for the Statement Aggregation product \&quot;false\&quot;: The institution is decertified for the Statement Aggregation product |  [optional] |
|**voi** | **Boolean** | \&quot;true\&quot;: The institution is certified for the VOI product \&quot;false\&quot;: The institution is decertified for the VOI product |  [optional] |
|**voa** | **Boolean** | \&quot;true\&quot;: The institution is certified for the VOA product \&quot;false\&quot;: The institution is decertified for the VOA product |  [optional] |
|**aha** | **Boolean** | \&quot;true\&quot;: The institution is certified for the Account History Aggregation product \&quot;false\&quot;: The institution is decertified for the Account History Aggregation product |  [optional] |
|**availBalance** | **Boolean** | \&quot;true\&quot;: The institution is certified for the Account Balance Check (ABC) product \&quot;false\&quot;: The institution is decertified for the Account Balance Check (ABC) product |  [optional] |
|**accountOwner** | **Boolean** | \&quot;true\&quot;: The institution is certified for the Account Owner product \&quot;false\&quot;: The institution is decertified for the Account Owner product |  [optional] |
|**studentLoanData** | **Boolean** | \&quot;true\&quot;: The institution is certified for the Student Loan Data product  \&quot;false\&quot;: The institution is decertified for the Student Loan Data product |  [optional] |
|**loanPaymentDetails** | **Boolean** | \&quot;true\&quot;: The institution is certified for the Loan Payment Detail product  \&quot;false\&quot;: The institution is decertified for the Loan Payment Detail product |  [optional] |
|**paymentInitiation** | **Boolean** | Institution connection is certified for paymentInitiation |  [optional] |
|**billPayData** | **Boolean** | billPayData is certified |  [optional] |
|**liabilityData** | **Boolean** | liabilityData is certified |  [optional] |
|**accountTypeDescription** | **String** | Values: Banking, Investments, Credit Cards/Accounts, Workplace Retirement, Mortgages and Loans, Insurance |  [optional] |
|**phone** | **String** | A phone number (max length 15). |  [optional] |
|**urlHomeApp** | **String** | The URL of the institution&#39;s primary home page |  [optional] |
|**urlLogonApp** | **String** | The URL of the institution&#39;s login page |  [optional] |
|**oauthEnabled** | **Boolean** | \&quot;true\&quot;: The institution is an OAuth connection  \&quot;false\&quot;: The institution isn&#39;t an OAuth connection |  [optional] |
|**urlForgotPassword** | **String** | Institution&#39;s forgot password page |  [optional] |
|**urlOnlineRegistration** | **String** | Institution&#39;s signup page |  [optional] |
|**propertyClass** | **String** | Institution&#39;s class |  [optional] |
|**specialText** | **String** | Special instructions given to customers for login |  [optional] |
|**timeZone** | **String** | The time zone of the institution. |  [optional] |
|**specialInstructions** | **List&lt;String&gt;** | Instructions given to the customer before they are sent to the institution website to login for OAuth institutions.  Note: this helps the customer to provide the proper permission for data needed for the application. |  [optional] |
|**specialInstutionsTitle** | **String** | The title of the special instructions, if one exists or is required. |  [optional] |
|**address** | [**InstitutionAddress**](InstitutionAddress.md) |  |  [optional] |
|**currency** | **String** | A currency code |  [optional] |
|**email** | **String** | An email address |  [optional] |
|**status** | **String** | Status for the institution: \&quot;online\&quot;, \&quot;offline\&quot;, \&quot;maintenance\&quot;, \&quot;testing\&quot;, \&quot;beta\&quot;, \&quot;validated\&quot;, \&quot;migrating\&quot; |  [optional] |
|**newInstitutionId** | **Long** | The ID of a financial institution, represented as a number |  [optional] |
|**branding** | [**Branding**](Branding.md) |  |  [optional] |
|**displayName** | **String** | A version of the institution connection name that is more user friendly |  [optional] |
|**oauthInstitutionId** | **Long** | The ID of a financial institution, represented as a number |  [optional] |
|**countryCodes** | [**List&lt;InstitutionsWithRoutingNumberCountryCodesInner&gt;**](InstitutionsWithRoutingNumberCountryCodesInner.md) |  |  [optional] |
|**overallStatusTemp** | **String** | Beta Data - Can be ignored. Should use &#x60;status&#x60; field instead. The overall status for the institution:   - online - Connection is active, financial institution is available and functioning   - offline - Connection is inactive due to an issue. Financial institution is not available in Connect search   - maintenance - Financial institution is undergoing planned maintenance and is not available at this time   - testing (Limited Availability)  - A new connection with the financial institution is still undergoing development and is only available to some select partners   - investigating - Connection is new and/or under monitoring due to instability |  [optional] |
|**transAggStatus** | **String** | Beta Data - Can be ignored. Should use &#x60;status&#x60; field instead. The production status for the Transaction Aggregation product for the institution.   - online - product is functioning correctly for the institution   - investigating - product is degraded for the institution and is being investigated   - offline - product is offline for the institution |  [optional] |
|**voaStatus** | **String** | Beta Data - Can be ignored. Should use &#x60;status&#x60; field instead. The production status for the VOA  product for the institution.   - online - product is functioning correctly for the institution   - investigating - product is degraded for the institution and is being investigated   - offline - product is offline for the institution |  [optional] |
|**voiStatus** | **String** | Beta Data - Can be ignored. Should use &#x60;status&#x60; field instead. The production status for the VOI product for the institution.   - online - product is functioning correctly for the institution   - investigating - product is degraded for the institution and is being investigated   - offline - product is offline for the institution |  [optional] |
|**stateAggStatus** | **String** | Beta Data - Can be ignored. Should use &#x60;status&#x60; field instead. The production status for the Statement Aggregation product for the institution.   - online - product is functioning correctly for the institution   - investigating - product is degraded for the institution and is being investigated   - offline - product is offline for the institution |  [optional] |
|**achStatus** | **String** | Beta Data - Can be ignored. Should use &#x60;status&#x60; field instead. The production status for the ACH product for the institution.   - online - product is functioning correctly for the institution   - investigating - product is degraded for the institution and is being investigated   - offline - product is offline for the institution |  [optional] |
|**ahaStatus** | **String** | Beta Data - Can be ignored. Should use &#x60;status&#x60; field instead. The production status for the Account History Aggregation product for the institution.   - online - product is functioning correctly for the institution   - investigating - product is degraded for the institution and is being investigated   - offline - product is offline for the institution |  [optional] |



