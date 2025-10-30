

# ModelConfiguration

Used to modify behavior during the login flow

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier of the configuration object |  [optional] |
|**filterAccounts** | **List&lt;String&gt;** | An optional filter to apply during account activation with institutions that support legacy login forms. |  [optional] |
|**accountClassificationType** | **List&lt;String&gt;** | An optional filter to apply during account activation with institutions that support Oauth integration. Supported filters are: &#x60;personal&#x60;, &#x60;business&#x60;, and &#x60;unknown&#x60;. |  [optional] |
|**aoRequired** | **Boolean** | When set to true, the user must explicitly permission Account Owner details at OAuth-supported institutions. If they do not, a [239] error is returned, and the login attempt is blocked. Partners are responsible for handling user re-attempt flows to ensure proper permissions are granted |  [optional] |



