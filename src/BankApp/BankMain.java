package BankApp;

public class BankMain {
    public static void main(String[] args) {
       Account account = new Account(1,"Favour Black","1234");
       account.withdraw(1_000,"1234");
       account.deposit(2_000);
        System.out.println(account);
    }
}
 