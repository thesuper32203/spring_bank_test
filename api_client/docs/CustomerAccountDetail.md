

# CustomerAccountDetail

Additional customer account details. Not all data points will return for each account type. You can see the account type that each data point will return for in descriptions. The data point are also subject to availability by the institution.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dateAsOf** | **Long** | (All Account Types) Most recent date of the following information. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**availableBalanceAmount** | **BigDecimal** | (Checking/Savings/CD/MoneyMarket) and (Mortgage/Loan) The available balance (typically the current balance with adjustments for any pending transactions) |  [optional] |
|**openDate** | **Long** | (Checking/Savings/CD/MoneyMarket) Date when account was opened. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**periodStartDate** | **Long** | (Checking/Savings/CD/MoneyMarket) Start date of period. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**periodEndDate** | **Long** | End date of period. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**periodInterestRate** | **BigDecimal** | (Checking/Savings/CD/MoneyMarket) The APY for the current period interest rate |  [optional] |
|**periodDepositAmount** | **BigDecimal** | (Checking/Savings/CD/MoneyMarket) Amount deposited in period |  [optional] |
|**periodInterestAmount** | **BigDecimal** | (Checking/Savings/CD/MoneyMarket) Interest accrued during the current period |  [optional] |
|**interestYtdAmount** | **BigDecimal** | (Checking/Savings/CD/MoneyMarket) Interest accrued year-to-date |  [optional] |
|**interestPriorYtdAmount** | **BigDecimal** | (Checking/Savings/CD/MoneyMarket) Interest earned in prior year |  [optional] |
|**maturityDate** | **Long** | (Checking/Savings/CD/MoneyMarket) Maturity date of account type. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**interestRate** | **String** | (Credit Card/Line Of Credit) and (Mortgage/Loan) The account&#39;s current interest rate |  [optional] |
|**creditAvailableAmount** | **BigDecimal** | (Credit Card/Line Of Credit) The available credit (typically the credit limit minus the current balance) |  [optional] |
|**creditMaxAmount** | **BigDecimal** | (Credit Card/Line Of Credit) The account&#39;s credit limit |  [optional] |
|**cashAdvanceAvailableAmount** | **BigDecimal** | (Credit Card/Line Of Credit) Currently available cash advance |  [optional] |
|**cashAdvanceMaxAmount** | **BigDecimal** | (Credit Card/Line Of Credit) Maximum cash advance amount |  [optional] |
|**cashAdvanceBalance** | **BigDecimal** | (Credit Card/Line Of Credit) Balance of current cash advance |  [optional] |
|**cashAdvanceInterestRate** | **BigDecimal** | (Credit Card/Line Of Credit) Interest rate for cash advances |  [optional] |
|**currentBalance** | **BigDecimal** | (Credit Card/Line Of Credit) and (Investment) Current balance |  [optional] |
|**paymentMinAmount** | **BigDecimal** | (Credit Card/Line Of Credit) and (Mortgage/Loan) Minimum payment due |  [optional] |
|**paymentDueDate** | **Long** | (Credit Card/Line Of Credit) Due date for the next payment. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**previousBalance** | **BigDecimal** | (Credit Card/Line Of Credit) Prior balance in last statement |  [optional] |
|**statementStartDate** | **Long** | (Credit Card/Line Of Credit) Start date of statement period. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**statementEndDate** | **Long** | (Credit Card/Line Of Credit) End date of statement period. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**statementPurchaseAmount** | **BigDecimal** | (Credit Card/Line Of Credit) Purchase amount of statement period |  [optional] |
|**statementFinanceAmount** | **BigDecimal** | (Credit Card/Line Of Credit) Finance amount of statement period |  [optional] |
|**statementCreditAmount** | **BigDecimal** | (Credit Card/Line Of Credit) Credit amount applied in statement period |  [optional] |
|**rewardEarnedBalance** | **Float** | (Credit Card/Line Of Credit) Earned reward balance |  [optional] |
|**pastDueAmount** | **BigDecimal** | (Credit Card/Line Of Credit) and (Mortgage/Loan) Balance past due |  [optional] |
|**lastPaymentAmount** | **BigDecimal** | (Credit Card/Line Of Credit) and (Mortgage/Loan) The amount received in the last payment |  [optional] |
|**lastPaymentDate** | **Long** | (Credit Card/Line Of Credit) The date of the last payment. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**statementCloseBalance** | **BigDecimal** | (Credit Card/Line Of Credit) Balance of statement at close |  [optional] |
|**termOfMl** | **String** | (Mortgage/Loan) Length of loan in months |  [optional] |
|**mlHolderName** | **String** | (Mortgage/Loan) Holder of the mortgage or loan |  [optional] |
|**description** | **String** | (Mortgage/Loan) Description of loan |  [optional] |
|**lateFeeAmount** | **BigDecimal** | (Mortgage/Loan) Late fee charged |  [optional] |
|**payoffAmount** | **BigDecimal** | (Mortgage/Loan) The amount required to payoff the loan |  [optional] |
|**payoffAmountDate** | **Long** | (Mortgage/Loan) Date of final payment. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**originalMaturityDate** | **Long** | (Mortgage/Loan) Original date of loan maturity. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**principalBalance** | **BigDecimal** | (Mortgage/Loan) The principal balance |  [optional] |
|**escrowBalance** | **BigDecimal** | (Mortgage/Loan) The escrow balance |  [optional] |
|**interestPeriod** | **String** | (Mortgage/Loan) Period of interest |  [optional] |
|**initialMlAmount** | **BigDecimal** | (Mortgage/Loan) Original loan amount |  [optional] |
|**initialMlDate** | **Long** | (Mortgage/Loan) Original date of loan. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**nextPaymentPrincipalAmount** | **BigDecimal** | (Mortgage/Loan) Amount towards principal in next payment |  [optional] |
|**nextPaymentInterestAmount** | **BigDecimal** | (Mortgage/Loan) Amount of interest in next payment |  [optional] |
|**nextPayment** | **BigDecimal** | (Mortgage/Loan) Minimum payment due |  [optional] |
|**nextPaymentDate** | **Long** | (Mortgage/Loan) Due date for the next payment. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**lastPaymentDueDate** | **Long** | (Mortgage/Loan) Due date of last payment. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**lastPaymentReceiveDate** | **Long** | (Mortgage/Loan) The date of the last payment. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**lastPaymentPrincipalAmount** | **BigDecimal** | (Mortgage/Loan) Amount towards principal in last payment |  [optional] |
|**lastPaymentInterestAmount** | **BigDecimal** | (Mortgage/Loan) Amount of interest in last payment |  [optional] |
|**lastPaymentEscrowAmount** | **BigDecimal** | (Mortgage/Loan) Amount towards escrow in last payment |  [optional] |
|**lastPaymentLastFeeAmount** | **BigDecimal** | (Mortgage/Loan) Amount of last fee in last payment |  [optional] |
|**lastPaymentLateCharge** | **BigDecimal** | (Mortgage/Loan) Amount of late charge in last payment |  [optional] |
|**ytdPrincipalPaid** | **BigDecimal** | (Mortgage/Loan) Principal paid year-to-date |  [optional] |
|**ytdInterestPaid** | **BigDecimal** | (Mortgage/Loan) Interest paid year-to-date |  [optional] |
|**ytdInsurancePaid** | **BigDecimal** | (Mortgage/Loan) Insurance paid year-to-date |  [optional] |
|**ytdTaxPaid** | **BigDecimal** | (Mortgage/Loan) Tax paid year-to-date |  [optional] |
|**autoPayEnrolled** | **Boolean** | (Mortgage/Loan) Enrolled in autopay (F/Y) |  [optional] |
|**marginAllowed** | **Boolean** | Margin trading indicator (true / false) |  [optional] |
|**cashAccountAllowed** | **Boolean** | Cash account allowed indicator (true / false) |  [optional] |
|**collateral** | **String** | (Mortgage/Loan) Collateral on loan |  [optional] |
|**currentSchool** | **String** | (Mortgage/Loan) Current school |  [optional] |
|**firstPaymentDate** | **Long** | (Mortgage/Loan) First payment due date. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**firstMortgage** | **Boolean** | (Mortgage/Loan) First mortgage (F/Y) |  [optional] |
|**loanPaymentFreq** | **String** | (Mortgage/Loan) Frequency of payments (monthly, etc.) |  [optional] |
|**originalSchool** | **String** | (Mortgage/Loan) Original school |  [optional] |
|**recurringPaymentAmount** | **BigDecimal** | (Mortgage/Loan) Recurring payment amount |  [optional] |
|**lender** | **String** | (Mortgage/Loan) Owner of loan |  [optional] |
|**endingBalanceAmount** | **BigDecimal** | (Mortgage/Loan) Ending balance |  [optional] |
|**loanTermType** | **String** | (Mortgage/Loan) Type of loan term |  [optional] |
|**paymentsMade** | **Integer** | (Mortgage/Loan) Number of payments made |  [optional] |
|**balloonAmount** | **BigDecimal** | (Mortgage/Loan) Balloon payment amount |  [optional] |
|**projectedInterest** | **BigDecimal** | (Mortgage/Loan) Projected interest on the loan |  [optional] |
|**interestPaidLtd** | **BigDecimal** | (Mortgage/Loan) Interest paid since inception of loan (life to date) |  [optional] |
|**interestRateType** | **String** | (Mortgage/Loan) Type of interest rate |  [optional] |
|**loanPaymentType** | **String** | (Mortgage/Loan) Type of loan payment |  [optional] |
|**repaymentPlan** | **String** | (Mortgage/Loan) Type of repayment plan for the student loan |  [optional] |
|**paymentsRemaining** | **Integer** | (Mortgage/Loan) Number of payments remaining before loan is paid off |  [optional] |
|**marginBalance** | **BigDecimal** | (Investment) Net interest earned after deducting interest paid out |  [optional] |
|**shortBalance** | **BigDecimal** | (Investment) Sum of short balance |  [optional] |
|**availableCashBalance** | **BigDecimal** | (Investment) Amount available for cash withdrawal |  [optional] |
|**maturityValueAmount** | **BigDecimal** | (Investment) amount payable to an investor at maturity |  [optional] |
|**vestedBalance** | **BigDecimal** | (Investment) Vested amount in account |  [optional] |
|**empMatchAmount** | **BigDecimal** | (Investment) Employer matched contributions |  [optional] |
|**empPretaxContribAmount** | **BigDecimal** | (Investment) Employer pretax contribution amount |  [optional] |
|**empPretaxContribAmountYtd** | **BigDecimal** | (Investment) Employer pretax contribution amount year to date |  [optional] |
|**contribTotalYtd** | **BigDecimal** | (Investment) Total year to date contributions |  [optional] |
|**cashBalanceAmount** | **BigDecimal** | (Investment) Cash balance of account |  [optional] |
|**preTaxAmount** | **BigDecimal** | (Investment) Pre-tax amount of total balance |  [optional] |
|**afterTaxAmount** | **BigDecimal** | (Investment) After-tax amount of total balance |  [optional] |
|**matchAmount** | **BigDecimal** | (Investment) Amount matched |  [optional] |
|**profitSharingAmount** | **BigDecimal** | (Investment) Amount of balance for profit sharing |  [optional] |
|**rolloverAmount** | **BigDecimal** | (Investment) Amount of balance rolled over from original account (401k, etc.) |  [optional] |
|**otherVestAmount** | **BigDecimal** | (Investment) Other vested amount |  [optional] |
|**otherNonvestAmount** | **BigDecimal** | (Investment) Other nonvested amount |  [optional] |
|**currentLoanBalance** | **BigDecimal** | (Investment) Current loan balance |  [optional] |
|**loanRate** | **BigDecimal** | (Investment) Interest rate of loan |  [optional] |
|**buyPower** | **BigDecimal** | (Investment) Money available to buy securities |  [optional] |
|**rolloverLtd** | **BigDecimal** | (Investment) Life to date of money rolled over |  [optional] |
|**loanAwardId** | **String** | (Student Loan) The federal unique loan identifying number |  [optional] |
|**originalInterestRate** | **BigDecimal** | (Student Loan) The original interest rate to which the loan was disbursed, in APY |  [optional] |
|**guarantor** | **String** | (Student Loan) The financial institution guarantor of the loan (who will pay the loan amount to the owner if the borrower defaults) |  [optional] |
|**owner** | **String** | (Student Loan) Owner of the loan |  [optional] |
|**interestSubsidyType** | **String** | (Student Loan) The indication of the presence of an interest subsidy (i.e. subsidized) |  [optional] |
|**interestBalance** | **BigDecimal** | (Student Loan) The total outstanding interest balance |  [optional] |
|**remainingTermOfMl** | **BigDecimal** | (Student Loan) The number of months still outstanding on a loan |  [optional] |
|**initialInterestRate** | **BigDecimal** | (Student Loan) Initial interest rate of loan |  [optional] |
|**feesBalance** | **BigDecimal** | (Student Loan) The total outstanding fees balance |  [optional] |
|**loanYtdInterestPaid** | **BigDecimal** | (Student Loan) Loan interest paid year-to-date |  [optional] |
|**loanYtdFeesPaid** | **BigDecimal** | (Student Loan) Loan fees paid year-to-date |  [optional] |
|**loanYtdPrincipalPaid** | **BigDecimal** | (Student Loan) Loan principal paid year-to-date |  [optional] |
|**loanStatus** | **String** | (Student Loan) The repayment status phase (i.e. In School, Grace, Repayment, Deferment, Forbearance) |  [optional] |
|**loanStatusStartDate** | **Long** | (Student Loan) The start date of the current status. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**loanStatusEndDate** | **Long** | (Student Loan) The end date of the current status. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**weightedInterestRate** | **BigDecimal** | (Student Loan) The interest rate of multiple interest rates and balances at the group level, in APY |  [optional] |
|**repaymentPlanStartDate** | **Long** | (Student Loan) The start date of the current repayment plan. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**repaymentPlanEndDate** | **Long** | (Student Loan) The end date of the current repayment plan. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**expectedPayoffDate** | **Long** | (Student Loan) The expected date of the payoff date. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**outOfSchoolDate** | **Long** | (Student Loan) The date the borrower graduated or dropped below half-time enrollment in school. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**convertToRepayment** | **Long** | (Student Loan) The date the loan enters into repayment. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**daysDelinquent** | **Integer** | (Student Loan) The number of days past a due date that a payment should have been made |  [optional] |
|**totalPrincipalPaid** | **BigDecimal** | (Mortgage/Loan/Student Loan) The total amount paid towards the principal balance |  [optional] |
|**totalInterestPaid** | **BigDecimal** | (Mortgage/Loan/Student Loan) The total amount paid towards interest |  [optional] |
|**totalAmountPaid** | **BigDecimal** | (Student Loan) The total amount paid |  [optional] |
|**statementCloseDate** | **Long** | (Mortgage/Loan) Date the statement closed. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://docs.finicity.com/endpoint-syntax-and-format/). |  [optional] |
|**loanTypeDesc** | **String** | (Mortgage/Loan) Description of the mortgage or loan type |  [optional] |



