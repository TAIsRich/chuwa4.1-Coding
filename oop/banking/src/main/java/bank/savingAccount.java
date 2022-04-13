package bank;

import java.sql.Savepoint;

public class savingAccount extends Account{
    private double interestRate;
    public void SavingAccount(double balance, double init){
        super(balance);
        this.interestRate = init;
    }

    public double getInterestRate(){
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
