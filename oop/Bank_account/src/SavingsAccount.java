
public class SavingsAccount extends BankAccount {


    private double interestRate; // Holds the interest rate for the period.

    public SavingsAccount(double rate) {

        interestRate = rate;
    }


    public SavingsAccount(double rate, double initialAmount) {
        super(initialAmount);

        interestRate = rate;
    }


    public void addPeriodicInterest() {
        double interest = getBalance() * interestRate / 100.0;
        deposit(interest);
    }
}