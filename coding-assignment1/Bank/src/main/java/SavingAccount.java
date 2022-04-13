public class SavingAccount extends Account {

    public SavingAccount(String id, double interest) {
        setId(id);
        setBalance(0);
        setInterest(interest);
    }

    @Override
    public void withdraw(int amount) throws InefficientException, ThresholdException{
        if (amount < getBalance()) {
            setBalance(getBalance() - amount);
        }
        throw new InefficientException("Inefficient ERROR");
    }
}
