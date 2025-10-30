

# PayrollEmploymentRecord


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employerName** | **String** | Name of the employer as stated by the employer in the payroll system |  |
|**legalEntityId** | **String** | Employer identification number (EIN) |  [optional] |
|**originalHireDate** | **Long** | The original hired date of an employee at the company |  [optional] |
|**latestHireDate** | **Long** | If an employee leaves the company and returns later, then the employer states the latest hire date at the company |  [optional] |
|**latestPayPeriodEndDate** | **Long** | The most recent pay period’s end date. |  [optional] |
|**latestPayDate** | **Long** | The most recent pay date from an employer |  [optional] |
|**daysSinceLastPay** | **Integer** | The number of days since an employee was last paid |  [optional] |
|**numberPayCadenceWithoutPay** | **Integer** | The number of pay cadences an employee has not been paid; determined by the pay frequency |  [optional] |
|**employmentEndDate** | **Long** | The date an employee ended their employment at the company |  [optional] |
|**employmentDuration** | **String** | The length of time an employee has been employed with that employer in ISO 8601 format (e.g. P1Y6M0D) |  [optional] |
|**employerAddress** | [**List&lt;PayrollEmployerAddress&gt;**](PayrollEmployerAddress.md) | Array of addresses |  [optional] |
|**employmentStatusCode** | **String** | &#39;Status codes: &#x60;A&#x60; - Active, &#x60;NLE&#x60; - No Longer Employed, &#x60;L&#x60; - Leave, &#x60;O&#x60; - Other&#39;, &#x60;I&#x60; - Inactive, &#x60;U&#x60; - Unknown&#39; |  |
|**employmentStatusName** | **String** | &#39;Status name: &#x60;Active&#x60;, &#x60;No Longer Employed&#x60;, &#x60;Leave&#x60; or &#x60;Other&#x60;, &#x60;Inactive&#x60;, or &#x60;Unknown&#x60;&#39; |  |
|**derivedEmploymentStatus** | **Boolean** | Describes the employment status - it will be true if it is not directly stated by the employer, and false otherwise |  [optional] |
|**workLevelCode** | **String** | The abbreviate code for the employment level names (workLevelName) that we receive from the employer |  [optional] |
|**workLevelName** | **String** | The employment level name is whatever we receive from the employer, such as full time, part time, temp, contractor, and more |  [optional] |
|**workLevelStatus** | **String** | The categorized work level status. Enumerations are:  * &#x60;Temporary&#x60;  * &#x60;Seasonal&#x60;  * &#x60;Retired&#x60;  * &#x60;Student&#x60;  * &#x60;Full Time&#x60;  * &#x60;Part Time&#x60;  * &#x60;Unspecified&#x60;  This is a new field, currently enabled only for testing reports. It will be added for all reports in August 2021.  |  |
|**positionTitle** | **String** | Employee job title |  [optional] |
|**positionDuration** | **String** | The length of time an employee has been employed at their current or latest position for this employment in ISO 8601 format (eg P1Y6M0D) |  [optional] |



