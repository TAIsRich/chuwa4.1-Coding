
public class BankAccount extends Account implements ShowBalance{
    private double balance;


    public BankAccount() {
        balance = 0.00;
    }


    public BankAccount(double initialAmount) {
        balance = initialAmount;
    }


    @Override
    public void deposit(double amount) {
        balance += amount;
    }



    @Override
    public void withdraw(double amount) {
        try {
            if (!(this.balance >= amount)) {
                throw new BankAccountException("Could not Withdraw: Insufficient Amount.");
            }

            this.balance -= amount;
        } catch (BankAccountException var4) {
            System.err.println(var4);
            var4.printStackTrace();
        }

    }


    public double getBalance() {
        return balance;
    }

    public void transfer(BankAccount other, double amount) {
        withdraw(amount);
        other.deposit(amount);
    }



    @Override
    public String toString() {
        return "Account balance: " + balance;
    }


    @Override
    public void showBalance() {
        System.out.println("Account balance: " + balance);
    }
}
