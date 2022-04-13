import java.util.*;

public final class Bank {
    private Map<String, Customer> customers;

    private Bank() {
        this.customers = new HashMap<>();
    }

    private static class BankHolder {
        private static final Bank INSTANCE = new Bank();
    }

    public static Bank getInstance() {
        return BankHolder.INSTANCE;
    }

    public void addCustomer(String uid, String firstName, String lastName) {
        customers.put(uid, new Customer(uid, firstName, lastName));
    }

    public boolean removeCustomer(String uid) {
        if (customers.containsKey(uid) && customers.get(uid).isValid()) {
            customers.get(uid).setValid(false);
            return true;
        }
        return false;
    }

    public int getNumOfCustomers() {
        return customers.size();
    }
}
