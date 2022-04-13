public abstract class Account {

    private String id;
    private int balance;
    private double interest;

    public String getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public double getInterest() {
        return interest;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public abstract void withdraw(int amount) throws InefficientException, ThresholdException;
}
