import exceptions.AccountUnableCloseException;
import exceptions.InvalidInputException;

import java.math.BigDecimal;

public abstract class DebitAccount implements Account {

    private AccountStatus status;
    protected BigDecimal balance;

    abstract void withdraw(BigDecimal amount);

    public DebitAccount() {
        status = AccountStatus.OPENED;
        balance = BigDecimal.ZERO;
    }

    @Override
    public void close() {
        status = AccountStatus.CLOSED;
    }

    @Override
    public void reopen() {
        status = AccountStatus.OPENED;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new InvalidInputException(String.format("Can not deposit due to request amount is negative " +
                    "with amount %s", amount));
        }
        balance = balance.add(amount);
    }

}
