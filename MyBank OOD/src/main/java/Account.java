import java.util.*;

public class Account {
    String username;
    int userID;
    double balance;

    public Account(String username, int userID) {
        this.username = username;
        this.userID = userID;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void showMenu() {
        System.out.println("Welcome, " + username + "!");
        System.out.println("Your ID is: " + userID);
        System.out.println("A. Check your balance");
        System.out.println("B. Make a deposit");
        System.out.println("C. Make a withdraw");
        System.out.println("D. Exit");

        char option = '-';

        while (option != 'D') {
            System.out.println("Enter an option then press return");
            Scanner sc = new Scanner(System.in);
            String s = sc.next();

            option = Character.toUpperCase(s.charAt(0));

            try {
                List<Character> list = Arrays.asList('A','B','C','D');
                if (!list.contains(option) || s.length() != 1) {
                    System.out.println("Invalid option");
                }
            } catch(Exception e) {
                System.out.println("Please re-enter your option");
            }

            if (option == 'A') {
                System.out.println("Your balance is: " + "$" + balance);
            } else if (option == 'B') {
                System.out.println("Enter an amount to deposit:");
                double amount = sc.nextDouble();

                try {
                    if (amount < 0) {
                        System.out.println("Invalid amount");
                    }
                } catch(Exception e) {
                    System.out.println("Please re-enter your amount");
                }

                deposit(amount);
                System.out.println("Deposit complete");
            } else if (option == 'C') {
                System.out.println("Enter an amount to withdraw:");
                double amount = sc.nextDouble();

                try {
                    if (amount < 0) {
                        System.out.println("Invalid amount");
                    }
                } catch(Exception e) {
                    System.out.println("Please re-enter your amount");
                }

                withdraw(amount);
                System.out.println("Withdraw complete");
            }
        }
        System.out.println("You have exited.");
    }
}
