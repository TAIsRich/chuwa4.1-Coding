public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }


    public void depositBalance(double deposit) throws Exception {
        if (deposit < 0) {
            throw new Exception("Can't input negative number ! ");
        }else{
            balance = balance + deposit;
            System.out.println("Deposit successes! New Balance: " + getBalance());
        }
    }

    public void withdrawBalance(double withdraw) throws Exception {
        if (withdraw > balance) {
            throw new Exception("Not enough balance !");
        } else if (withdraw < 0) {
            throw new Exception("Can't input negative number ! ");
        } else {
            balance = balance - withdraw;
            System.out.println("Withdraw successes! New Balance: " + getBalance());
        }
    }

}
