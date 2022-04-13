
public class TimeDepositAccount extends SavingsAccount {
    // Inherits balance from BankAccount, but cannot access it directly.
    // Inherits interestRate from SavingsAccount, but cannot access it directly.
    private int elapsedPeriods;           // Periods the account has existed
    private int maturityPeriods;          // Periods for account to mature
    private double interestPenaltyRate;   // Rate of interest to be deducted in
    //   case of early withdrawal.


    public TimeDepositAccount(double rate, double initialAmount, int maturity,
                              double penalty) {
        super(rate, initialAmount);
        elapsedPeriods = 0;
        maturityPeriods = maturity;
        interestPenaltyRate = penalty;
    }



    @Override
    public void addPeriodicInterest() {
        elapsedPeriods++;
        super.addPeriodicInterest();
    }


    @Override
    public void withdraw(double amount) {
        if (elapsedPeriods < maturityPeriods)
            super.withdraw((interestPenaltyRate / 100) * elapsedPeriods * getBalance());
        super.withdraw(amount);
    }
}
