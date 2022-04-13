package bank;


public class Account {

    private double balance;

    public void Account(double init_balance){
        balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws OverdraftException {
        if(balance >= amount)
        {
            balance -= amount;
        }
        else
        {
            throw new OverdraftException("Not enough moeny in your account", amount - balance);
        }

    }
}
