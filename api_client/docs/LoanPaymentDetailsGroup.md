

# LoanPaymentDetailsGroup

Group details

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | An account ID |  |
|**groupNumber** | **String** | Institution&#39;s ID of the Student Loan Group |  |
|**groupPaymentNumber** | **String** | The payment number given by the institution. This number is typically for manual payments. This is not an ACH payment number. |  |
|**groupPaymentAddress** | **String** | The payment address to which send manual payments should be sent |  |
|**groupFuturePayoffAmount** | **BigDecimal** | The payoff amount for the group |  [optional] |
|**groupFuturePayoffDate** | **OffsetDateTime** | The date to which the \&quot;Future Payoff Amount\&quot; applies |  [optional] |
|**groupLoanDetail** | [**List&lt;LoanPaymentDetailsLoan&gt;**](LoanPaymentDetailsLoan.md) |  |  |



