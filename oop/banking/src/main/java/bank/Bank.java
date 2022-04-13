package bank;
import java.util.ArrayList;
import java.util.Iterator;


public class Bank {

    private List<Customer> customers;
    private List<Branch> branchers;

    private Bank() {
        customers = new ArrayList<Customer>();
        branchers = new ArrayList<Branch>();
    }


    private static Bank bank = new Bank();

    public void addBranch(String branch_code, String city, String state, String zipcode)
    {
        Branch branch = new Branch(branch_code, city, state, zipcode);
        branchers.add(branch);
    }
    public int getNumOfBranches(){
        return branchers.size();
    }
    public Branch getBranch(int index) {
        return branchers.get(index);
    }

    public Iterator<Branch> getBranchers(){
        return branchers.iterator();
    }
    public void addCustomer(String f, String l) {
        Customer client = new Customer(f, l);
        customers.add(cust);
    }

    public int getNumOfCustomers() {
        return customers.size();
    }



    public Customer getCustomer(int index) {
        return customers.get(index);
    }

    public Iterator<Customer> getCustomers() {
        return customers.iterator();
    }
}
