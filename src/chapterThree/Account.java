package chapterThree;

public class Account {
    private  String accountName;
    private double  balance;

    public Account(String accountName, double balance) {
        this.accountName = accountName;
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0.0) {
            balance += amount;
        }
    }
    public void withdrawal(double amount){
        if (amount > 0.0 ){
            balance -= amount;
        }
    }
}


