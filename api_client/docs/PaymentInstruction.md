

# PaymentInstruction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | The type of payment instruction: 1. ACH: when payment instruction type is ACH (Automated Clearing House) 2. RTP: when payment instruction type is RTP (Real-Time Payments) |  |
|**accountNumber** | **String** | The account number from the institution |  |
|**tanEnabled** | **Boolean** | This field indicates whether the FI uses a tokenized account number for origination purposes. |  [optional] |
|**descriptors** | [**List&lt;Descriptor&gt;**](Descriptor.md) | List of descriptors |  [optional] |
|**transferInEnabled** | **Boolean** | Indicates whether transfer to this account is enabled or not. Applicable for \&quot;RTP\&quot; type only. |  [optional] |
|**transferOutEnabled** | **Boolean** | Indicates whether transfer from this account is enabled or not. Applicable for \&quot;RTP\&quot; type only. |  [optional] |



