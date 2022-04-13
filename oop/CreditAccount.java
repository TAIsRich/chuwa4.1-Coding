import exceptions.AccountUnableCloseException;
import exceptions.InvalidInputException;

import java.math.BigDecimal;


public abstract class CreditAccount implements Account {

    private AccountStatus status;
    protected BigDecimal loan;
    private BigDecimal maxLoan;

    public CreditAccount(BigDecimal initialLoan, BigDecimal maxLoan) {
        status = AccountStatus.OPENED;
        loan = initialLoan;
        this.maxLoan = maxLoan;
    }

    @Override
    public void close() {
        if (loan.compareTo(BigDecimal.ZERO) == 0) {
            status = AccountStatus.CLOSED;
        }
        throw new AccountUnableCloseException("Close account failed due to non-zero loan. " +
                "Please clear the loan before close the account.");
    }

    @Override
    public void reopen() {
        status = AccountStatus.OPENED;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public BigDecimal getLoan() {
        return loan;
    }


    public void requestLoan(BigDecimal amount) {
        if (amount.compareTo(maxLoan.subtract(loan)) > 0 || amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new InvalidInputException(String.format("Can not request loan due to request amount is negative or " +
                    "greater than available loan with amount %s, available loan %s", amount, maxLoan.subtract(loan)));
        }
        loan = loan.add(amount);
    }

    public void payLoan(BigDecimal amount) {
        if (amount.compareTo(loan) > 0 || amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new InvalidInputException(String.format("Can not pay loan due to request amount is negative or " +
                    "greater than unpaid loan with amount %s, unpaid loan %s", amount, loan));
        }
        loan = loan.subtract(amount);
    }

    /*
        Pay loan in full
     */
    public void payLoan() {
        loan = BigDecimal.ZERO;
    }

    public BigDecimal getMaxLoan() {
        return maxLoan;
    }

    public void setMaxLoan(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new InvalidInputException(String.format("Can not set max loan due to request amount is negative " +
                    "with amount %s", amount));
        }
        maxLoan = amount;
    }
}


