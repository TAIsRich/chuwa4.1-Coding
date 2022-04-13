import exceptions.InvalidInputException;

import java.math.BigDecimal;

public class SavingAccount extends DebitAccount {
    private int withdrawTimes;
    public static int MAX_WITHDRAW_TIMES = 5;

    public SavingAccount() {
        super();
        withdrawTimes = 0;
    }

    @Override
    public void withdraw(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) < 0 || amount.compareTo(balance) >= 0
                || withdrawTimes >= MAX_WITHDRAW_TIMES) {
            throw new InvalidInputException(String.format("Can not withdraw due to request amount is negative " +
                    "or greater than balance or exceed max withdraw times with amount %s, balance %s, current" +
                    "withdraw times %s, max withdraw times %s", amount, balance, withdrawTimes, MAX_WITHDRAW_TIMES));
        }
        balance = balance.subtract(amount);
        withdrawTimes += 1;
    }
}
