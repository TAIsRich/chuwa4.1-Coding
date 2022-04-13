public class SavingAccount extends Account{
    private double balance;

    public SavingAccount() {
        this.balance = 0;
    }

    @Override
    public double getBalanced() {
        return this.balance;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void deposit(double amount1, double amount2) {
        this.balance += amount1;
        this.balance += amount2;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("This is a saving account, you cannot withdraw money. Please withdraw your money in Bank");

    }
}
