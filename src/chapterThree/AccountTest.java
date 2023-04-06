package chapterThree;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("favour",25.5);
        Account account1 = new Account("hadiza",-76);
        System.out.printf("account summary %s %.2f%n",account.getAccountName(),account.getBalance());
        System.out.printf("account1 summary %s %.2f%n%n",account1.getAccountName(),account1.getBalance());


        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount");
        double amount = input.nextDouble();
//        account1.deposit(amount);
//        System.out.println("account1 balance is: " + account1.getBalance());


        account.withdrawal(amount);
        System.out.println("account balance is: "+ account.getBalance());
    }
}
