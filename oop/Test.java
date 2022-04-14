public class Test {
    public static void main(String[] args) throws Exception {

        Customer customer = new Customer(123, 456);
        customer.setAccount(new Account(5000));
        Bank bank = new Bank();
        bank.addCustomer(customer);
        bank.login_myBank(customer);
        bank.login_option(customer);

    }


}
