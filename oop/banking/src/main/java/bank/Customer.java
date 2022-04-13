package bank;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Customer{
    private String first_name;
    private String last_name;

    private List<Account> accounts;

    public void setFirst_name(String first) {
        this.first_name = first;
    }

    public void setLast_name(String last) {
        this.last_name = last;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void addAccount(Account acct) {
        accounts.add(acct);
    }

    public int getNumOfAccounts(){
        return accounts.size();
    }

    public Account getAccount(int index) {
        return accounts.get(index);
    }

    public Iterator<Account> getAccounts() {
        return accounts.iterator();
    }
}
