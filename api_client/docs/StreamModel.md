

# StreamModel

Describes a history of repeated transactions between the same parties.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cadence** | **Integer** | Number of days that occur between each transaction in the stream |  |
|**id** | **String** | Stream Id assigned to identified Stream |  |
|**payee** | **String** | The party in the transaction that is receiving the funds |  |
|**payor** | **String** | The party in the transaction that is sending the funds |  |
|**recency** | **Integer** | Number of days since the last transaction occurred in the stream |  |
|**transactionIds** | **List&lt;String&gt;** | List of Transaction IDs that comprise the stream |  |



