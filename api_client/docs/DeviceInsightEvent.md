

# DeviceInsightEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**insightEvent** | **String** | Event label associated with specific insight, for example: AD. |  [optional] |
|**insightLevel** | **Integer** | Insight level value between 0-5. |  [optional] |
|**insightSignals** | **List&lt;String&gt;** | During the insight evaluation, risk signals are generated when a request triggers either the rules or machine learning model. Each risk signal and it&#39;s associated definition is shown below.   * &#x60;account_carrier_unknown&#x60; - Carrier information for account is unknown   * &#x60;account_carrier&#x60; - Carrier velocity attempts count more than or equal to 50 within 4 hours   * &#x60;account_city_unknown&#x60; - City information for account is unknown   * &#x60;account_city&#x60; - Account has not been seen using the City   * &#x60;account_state_unknown&#x60; - State/Province information for account is unknown   * &#x60;account_state&#x60; - Account has not been seen using the State/Province   * &#x60;account_country_unknown&#x60; - Country information for account is unknown   * &#x60;account_country&#x60; - Account has not been seen using the Country   * &#x60;account_ip&#x60; - Account has not been seen using the IP   * &#x60;account_ua&#x60; - Account has not been seen using the UA   * &#x60;device_velocity&#x60; - Device Fingerprint velocity attempts count more than 100   * &#x60;ip_velocity&#x60; - Current IP velocity greater than 50 in the past 4 hours   * &#x60;login_failures&#x60; - High failure rate for account login in the past 30 minutes   * &#x60;login_velocity&#x60; - The account has +30 login attempts in the past 30 minutes (overall login attempts)   * &#x60;account_velocity&#x60; - Account logins have exceeded 10 attempts   * &#x60;ip_blocklist&#x60; - IP is in block list  These risk signals are informational but may be useful for a service provider to understand a detailed view of the associated risk present in a request. |  [optional] |



