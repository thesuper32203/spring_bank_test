

# TransactionalTimeInterval

For a TransactionalAttribute, describes a time interval type being reported and a list of periods generated according to that type.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**periods** | [**List&lt;TransactionalPeriod&gt;**](TransactionalPeriod.md) | Periods of the specified time interval type, describing the attribute calculations |  |
|**timeIntervalType** | **String** | Possible values for strategies in which attributes may be aggregated and reported across varying time intervals. Allowed Values - MONTHLY_CALENDAR - MONTHLY_ROLLING_30 |  |



