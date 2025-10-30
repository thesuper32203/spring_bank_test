

# TransactionalAttribute

An attribute which represents some categorization/classification of transactions. Enumerates those identified transactions and reports aggregations of them over the requested time interval(s).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aggregatedByTimePeriods** | [**List&lt;TransactionalTimeInterval&gt;**](TransactionalTimeInterval.md) | List of aggregations by specified Time Interval |  |
|**attributeName** | **String** | Name of Attribute as mentioned in Data Dictionary |  |
|**streamIds** | **List&lt;String&gt;** | List of stream IDs categorized as belonging to this attribute |  |
|**transactionIds** | **List&lt;String&gt;** | List of transaction IDs categorized as belonging to this attribute |  |



