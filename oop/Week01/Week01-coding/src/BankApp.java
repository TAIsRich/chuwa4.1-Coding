import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        int accountkind = 0;
        System.out.println("Welcome to Xuebin's Bank !!!");
        System.out.println("-------------------------------");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What kind of account you want to create: (1. Saving account) (2. Checking account)");
            System.out.println("-------------------------------");

            try {
                accountkind = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("!!! Please choose between 1 and 2 !!!");
            }
        }

        switch(accountkind) {
            case 1:
                SavingAccount savingAccount = new SavingAccount();
                Menu m1 = new Menu();
                m1.showMenu(savingAccount);
                break;

            case 2:
                CheckingAccount checkingAccount = new CheckingAccount();
                Menu m2 = new Menu();
                m2.showMenu(checkingAccount);
                break;

            default:
                System.out.println("!!! Account create unsuccessful !!!");
        }


    }
}
