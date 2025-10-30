

# PayStatement

A pay statement document and pay statement label

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**label** | **String** | The label to be associated with the pay statement. This label will allow the paystub to go through data extraction. * &#x60;lastPayPeriod&#x60;: default label that should be used for the VOIE - Paystub products * &#x60;lastPayPeriodMinusOne&#x60;: the second most recent pay statement * &#x60;lastPayPeriodMinusTwo&#x60;: the third most recent pay statement * &#x60;previousYearLastPayPeriod&#x60; Last pay statement of the previous calendar year * &#x60;previousYear2LastPayPeriod&#x60;: last pay statement of the calendar year 2 years prior * &#x60;earliestPayPeriod&#x60;: the earliest pay statement |  |
|**statement** | **String** | A Base64 encoded pay statement file. Finicity supports PDF, JPG, or PNG files. |  |



