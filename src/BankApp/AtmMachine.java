package BankApp;

import javax.swing.*;
import java.util.Scanner;

public class AtmMachine {
    private static Bank AccessBank = new Bank("Access Bank");
    public static void main(String[] args) {
        displayMainMenu();
    }
    private static void displayMainMenu(){
        String mainMenu = """
                Welcome to Access Bank
                1 -> Create Account
                2 -> Deposit
                3 -> Withdraw
                4 -> Transfer
                5 -> Check Balance
                """;
        System.out.println(mainMenu);
        Scanner scanner = new Scanner(System.in);
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)) {
            case '1' -> createAccount();
            case '2' -> deposit();
            //case '3' -> withdraw();
            //case '4' -> transfer();
            case '5' -> checkBalance();

            default -> {//"don't be silly".
                //show menu again
            }
        }
    }

    private static void checkBalance() {
        int accountNumber = Integer.parseInt(input("What is your account number?"));
        String pin = input("Enter pin");
        int balance = AccessBank.checkBalanceFor(accountNumber,pin);
        display("Your balance is " + balance);
        displayMainMenu();
    }


    private static void createAccount(){
        String accountName = input("What is the account name?"); //1. collect account name
        String accountPin = input("What is the account pin?"); //2. collect account pin

        //create account from bank

        AccessBank.createAccountFor("Legend","1234");
        display("Account created successfully");


        //3. collect account from bank
        displayMainMenu(); //4. return back to main menu
    }

    private static void deposit(){
        int accountNumber = Integer.parseInt(input(("What is your account number?")));
        int amount  = Integer.parseInt(input("How much do you want to deposit?"));

        AccessBank.deposit(amount,accountNumber);
        display("Deposited successfully");
        displayMainMenu();
    }

    private static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(prompt);
//        return scanner.nextLine();
    }
    private static void display(String message) {
        JOptionPane.showMessageDialog(null, message);
        //System.out.println(message);
    }

    private static void print(String message) {
        System.out.println(message);
    }
}
