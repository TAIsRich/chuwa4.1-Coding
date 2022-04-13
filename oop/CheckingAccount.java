import exceptions.InvalidInputException;

import java.math.BigDecimal;

public class CheckingAccount extends DebitAccount {

    public CheckingAccount() {
        super();
    }

    @Override
    public void withdraw(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) < 0 || amount.compareTo(balance) >= 0) {
            throw new InvalidInputException(String.format("Withdraw amount cannot be negative or greater " +
                    "than available balance for withdraw amount %s, available balance %s", amount, balance));
        }
        balance = balance.subtract(amount);
    }
}

