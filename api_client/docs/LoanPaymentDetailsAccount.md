

# LoanPaymentDetailsAccount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | An account ID |  |
|**accountNumber** | **String** | Institution&#39;s ID of the Student Loan Account |  |
|**accountPaymentNumber** | **String** | The payment number given by the institution. This number is typically for manual payments. This is not an ACH payment number. |  |
|**accountPaymentAddress** | **String** | The payment address to which send manual payments should be sent |  |
|**accountFuturePayoffAmount** | **BigDecimal** | The payoff amount for the account |  [optional] |
|**accountFuturePayoffDate** | **OffsetDateTime** | The date to which the \&quot;Future Payoff Amount\&quot; applies |  [optional] |
|**groupDetail** | [**List&lt;LoanPaymentDetailsGroup&gt;**](LoanPaymentDetailsGroup.md) | Group details |  [optional] |
|**loanDetail** | [**List&lt;LoanPaymentDetailsLoan&gt;**](LoanPaymentDetailsLoan.md) | Loan details |  [optional] |



