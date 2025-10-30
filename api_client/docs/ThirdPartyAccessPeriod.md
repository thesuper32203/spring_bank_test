

# ThirdPartyAccessPeriod

Object which describes access validity

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Multiple types will be supported. Presently below types are supported. * \&quot;timeframe\&quot;: Specifies a timeframe bounded by a startTime and endTime.   The startTime is the time at which the access was granted and the access key generated,   and the endTime is the time at which the access was revoked. Times are represented in ISO 8601 format(\&quot;2022-03-10T06:06:20Z\&quot;) |  |
|**startTime** | **OffsetDateTime** | A date-time with time zone |  |
|**endTime** | **OffsetDateTime** | A date-time with time zone |  |



