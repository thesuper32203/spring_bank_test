

# GetInstitutionsByRoutingNumber200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**found** | **Integer** | The total number of results matching search criteria |  [optional] |
|**displaying** | **Integer** | The number of results returned |  [optional] |
|**moreAvailable** | **Boolean** | If the value of &#x60;moreAvailable&#x60; is \&quot;true\&quot;, you can retrieve the next page of results by increasing the value of the start parameter in your next request:\&quot;...&amp;start&#x3D;6&amp;limit&#x3D;5\&quot; |  [optional] |
|**createdDate** | **Long** | A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**institutions** | [**List&lt;InstitutionsWithRoutingNumber&gt;**](InstitutionsWithRoutingNumber.md) | List of institutions with matching routing numbers |  [optional] |



