

# AnalyticsReportData

Parameters supplied by the client requesting the analytics.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**forCraPurpose** | **Boolean** | Field to indicate if the requested report is for CRA or NONCRA. For small business lending or other similar business use cases, pass the value as “true” for purposes of this field. |  |
|**applicantIsPersonalGuarantor** | **Boolean** | Field to indicate if the business owner will personally guarantee the loan. If true, a consumer record will be required. |  [optional] |
|**timeIntervalTypes** | **List&lt;String&gt;** | Requested time interval for attribute values. |  [optional] |



