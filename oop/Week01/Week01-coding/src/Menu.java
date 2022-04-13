import java.util.Scanner;

public class Menu implements MenuIf{
    public void showMenu(Account account) {
        int opt = 0;
        System.out.println("Please Select an operation: ");
        System.out.println("Enter 1 to Deposit.");
        System.out.println("Enter 2 to Withdraw.");
        System.out.println("Enter 3 to Check Balance");
        System.out.println("Press any key to Exit");
        System.out.println("-------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        try {
            opt = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
        switch (opt) {
            case 1:
                System.out.println("Please enter the amount to deposit: ");
                int depositAmount = scanner.nextInt();
                account.deposit(depositAmount);
                showMenu(account);
                break;
            case 2:
                System.out.println("Please enter the amount to withdraw: ");
                int withdrawAmount = scanner.nextInt();
                account.withdraw(withdrawAmount);
                showMenu(account);
                break;
            case 3:
                System.out.println("Your account balance is: " + account.getBalanced());
                showMenu(account);
                break;
            default:
                System.out.println("Logout !");
        }
    }
}
