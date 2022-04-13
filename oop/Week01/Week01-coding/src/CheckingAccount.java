public class CheckingAccount extends Account{
    private double balance;

    public CheckingAccount(){
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
        if (this.balance - amount < 0) {
            System.out.println("Do not have enough money");
            return;
        }
        this.balance -= amount;
    }
}
