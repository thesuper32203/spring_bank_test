

# PostReconnections203ResponseInnerMfaChallengesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The unique identifier for the MFA challenge |  |
|**mfaType** | **String** | The type of MFA challenge:   * TFA_TEXT:  This challenge type will present a single input box to the customer and is commonly used for things like One-Time Passwords.   * TFA_CHOICE: The TFA_CHOICE object represents a multiple choice question and answer selection.   * TFA_MULTI: The TFA_MULTI challenge type will present the customer with multiple images to select from.   * TFA_IMAGE: A TFA_IMAGE challenge will present a captcha-style image the customer will need to decipher. |  |
|**prompt** | **String** | The MFA prompt text |  |
|**choiceIds** | **List&lt;UUID&gt;** | An array of unique identifiers for the MFA choices |  |



