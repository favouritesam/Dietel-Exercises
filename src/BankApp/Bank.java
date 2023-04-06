package BankApp;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    String accountName;
     private int LastAccountNumberGenerate;
     private String accountPin;
  private List<Account> accounts;
     private  String bankName;
    public Bank(String bankName){
        this.bankName = bankName;
        accounts = new ArrayList<>();
    }
    public void createAccountFor(String accountName,String accountPin){
        int accountNumber = generateAccountNumber();
        Account newAccount = new Account(accountNumber,accountName,accountPin);
        accounts.add(newAccount);
        this.accountName = accountName;
        this.accountPin = accountPin;
    }

    private int generateAccountNumber(){
        return ++LastAccountNumberGenerate;
    }
    public int countNumberOfAccount(){
        return accounts.size();

    }
    public  int checkBalanceFor(int accountNumber,String pin){
        Account foundAccount = findAccountByAccountNumber(accountNumber);
        return foundAccount.checkBalance(pin);
    }
    public void deposit(int amount,int accountNumber){
    Account foundAccount = findAccountByAccountNumber(accountNumber);
    foundAccount.deposit(amount);
    }
    private Account findAccountByAccountNumber(int accountNumber){
        for (Account account : accounts){
            boolean accountNumberMatches = account.getAccountNumber()== accountNumber;
            if (accountNumberMatches)return account;
        }
        return null;
    }
    public  void transfer(int amount,int senderAccountNumber,int receiverAccountNumber,String pin){
        Account senderAccount = findAccountByAccountNumber(senderAccountNumber);
        Account receiverAccount = findAccountByAccountNumber(receiverAccountNumber);
        senderAccount.withdraw(amount,pin);
        receiverAccount.deposit(amount);
    }
}
