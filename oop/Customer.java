public class Customer {

    private Account account;
    private int number;
    private int password;


    public Customer(int number, int password) {
        this.number = number;
        this.password = password;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    protected void setNumber(int number) {
        this.number = number;
    }

    protected int getNumber() {
        return number;
    }

    protected void setPassword(int password) {
        this.password = password;
    }

    protected int getPassword() {
        return password;
    }


}