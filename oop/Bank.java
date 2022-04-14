import java.util.Scanner;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    public Bank() {
        customers = new Customer[10];
    }

    public void addCustomer(Customer cust) {

        customers[numberOfCustomers++] = cust;
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    public void login_myBank(Customer customer) {
        Scanner input = new Scanner(System.in);
        System.out.println("===MyBank Login ===");
        System.out.println();
        System.out.println("1,Account Number:");
        int num = input.nextInt();
        System.out.println("2,Password: ");
        int pass = input.nextInt();
        Customer cust = null;
        for (int i = 0; i < numberOfCustomers; i++) {

            if (customer.getNumber() == num && customer.getPassword() == pass) {
                System.out.println("Login Successes !");
                break;

            } else {
                System.out.println("Wrong input");
            }
        }

    }


    public void login_option(Customer cust) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("===MyBank Option ===");
        System.out.println();
        System.out.println("1, Deposit\t2, Withdraw");
        int num = input.nextInt();

        if (num == 1) {
            login_deposit(cust);
        } else if (num == 2) {
            login_withdraw(cust);
        } else {
            System.out.println("Wrong Input");
        }

    }

    public void login_deposit(Customer cust) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("===MyBank Deposit ===");
        System.out.println();
        System.out.println("Your Account: " + cust.getAccount().getBalance());
        System.out.println("Deposit Number:");
        double num = input.nextDouble();

        cust.getAccount().depositBalance(num);


    }


    public void login_withdraw(Customer cust) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("===MyBank Withdraw ===");
        System.out.println();
        System.out.println("Your Account: " + cust.getAccount().getBalance());
        System.out.println("Withdraw Number:");
        double num = input.nextDouble();

        cust.getAccount().withdrawBalance(num);


    }


}
