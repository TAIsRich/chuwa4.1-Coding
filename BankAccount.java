package chuwa;

import java.util.Scanner;

class BankAccount{
    //definitions
    private int accountID;
    private int password;
    private double balance;
    //constructors
    BankAccount(){
        accountID = 0;
        password = 0;
        balance = 0.0;
    }
    BankAccount(int newID, int newPass, double newBalance){
         accountID = newID;
         password = newPass;
         balance =  newBalance;
    }
    // accessor and mutators
    public int getAccountID(){
        return accountID;
    }
    public int getPassword(){
        return password;
    }
    public double getBalance(){
        return balance;
    }
    public void setAccountID(int newID){
        accountID = newID;
    }
    public void getPassword(int newPass){
        password = newPass;
    }
    public void setBalance(double newBalance){
        balance = newBalance;
    }

    // Driver
    public static void main(String[] args) {
        //account information
        int ID, password;
        int amount;
        double balance;
        //initialize account
        BankAccount  account1 = new BankAccount(1,1234,5000.0);
        //main menu
        Scanner scanner = new Scanner(System.in);//get input from customer
        System.out.println("Please enter your customer ID");
        ID = scanner.nextInt();
        System.out.println("Please enter your password");
        password = scanner.nextInt();
        if(ID == 1 && password == 1234){
            System.out.println("Login Successfully!");
            System.out.println("Your account balance is  "+ account1.getBalance());
            System.out.println("Please enter withdraw amount:");
            amount = scanner.nextInt();
            if(amount < 5000){
                account1.setBalance(account1.getBalance()-amount);
                System.out.println("Now the balance is" + account1.getBalance());
            }
            else{
                System.out.println("Invalid withdraw amount,please enter again:");
            }
        }
        else{
            System.out.println("The ID or password is wrong!");
        }
    }
}
