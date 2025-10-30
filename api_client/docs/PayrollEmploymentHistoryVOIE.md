

# PayrollEmploymentHistoryVOIE


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**asOfDate** | **Long** | The last time the payroll data was updated in the payroll provider&#39;s system |  |
|**employmentId** | **String** | This is a Mastercard assigned ID to the employment record. It remains consistent for that employment record, even if the report is refreshed. It can be used to limit the employment records that are returned in the report. |  [optional] |
|**employerName** | **String** | Name of the employer as stated by the employer in the payroll system |  |
|**payrollSource** | **String** | The name of the payroll source where the data was retrieved |  |
|**payrollProvider** | **String** | The name of the provider who provides payroll data to payroll source |  [optional] |
|**employee** | [**PayrollEmployeeRecord**](PayrollEmployeeRecord.md) |  |  |
|**employment** | [**PayrollEmploymentRecord**](PayrollEmploymentRecord.md) |  |  |
|**income** | [**PayrollVOIEIncomeRecord**](PayrollVOIEIncomeRecord.md) |  |  |



