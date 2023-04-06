package BankApp;

public class Account {
    private String accountName;
    private int accountNumber;
    private int balance;
    private String pin;

    public Account(int accountNumber,String accountName, String pin){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.pin = pin;
    }
    public  void deposit(int amount){
        balance += amount;
    }
    public int checkBalance(String pin){
        if (pinIsCorrect(pin)) return balance;
        return  0;
    }
    private  boolean pinIsCorrect(String pin){
        return this.pin.equals(pin);
    }
    public void withdraw(int amount,String pin){
        if (pinIsCorrect(pin))
            balance -= amount;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
}
