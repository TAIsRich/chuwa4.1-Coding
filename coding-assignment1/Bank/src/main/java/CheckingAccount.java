public class CheckingAccount extends Account {

    private int maxAmountWithdraw;

    public CheckingAccount(String id) {
        setId(id);;
        setMaxAmountWithdraw(0);
        setInterest(0);
        setBalance(0);
    }

    public int getMaxAmountWithdraw() {
        return maxAmountWithdraw;
    }

    public void setMaxAmountWithdraw(int maxAmountWithdraw) {
        this.maxAmountWithdraw = maxAmountWithdraw;
    }

    @Override
    public void withdraw(int amount) throws InefficientException, ThresholdException{
        if (amount > getBalance()) {
            throw new InefficientException("Inefficient ERROR!");
        }
        if (amount > maxAmountWithdraw) {
            throw new ThresholdException("Threshold ERROR!");
        }
        setBalance(getBalance() - amount);
    }
}
