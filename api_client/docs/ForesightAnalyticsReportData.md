

# ForesightAnalyticsReportData

Parameters supplied by the client requesting the analytics.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**forCraPurpose** | **Boolean** | Field to indicate if the requested report is for CRA or NONCRA. For small business lending or other similar business use cases, pass the value as “true” for purposes of this field. |  |
|**segments** | [**ForesightAnalyticsReportDataSegments**](ForesightAnalyticsReportDataSegments.md) |  |  [optional] |
|**analytics** | **List&lt;String&gt;** | Analytics information for the requested report. The allowed values are benchmarking &amp; forecasting. If it is null, default to benchmarking and forecasting |  [optional] |
|**timeIntervalTypes** | **List&lt;String&gt;** | Requested time interval for attribute values. |  [optional] |



