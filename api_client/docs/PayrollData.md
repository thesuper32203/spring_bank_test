

# PayrollData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ssn** | **String** | The consumer&#39;s full SSN without hyphens. Only required for the Direct API Payroll solution, not required for the Credentialed Payroll solution. |  [optional] |
|**dob** | **Long** | The consumer&#39;s date of birth in Unix epoch time (in seconds). See: Handling Epoch Dates and Times. The timestamp should be set at the start of day of birth. |  [optional] |
|**reportId** | **String** | The report ID of the original payroll report for refresh use cases. If used, only the employment records from the original report will be included in the refreshed report response. |  [optional] |
|**payrollAccountIds** | **List&lt;String&gt;** |  |  [optional] |



