package BankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {
    private Account account;
    @BeforeEach

    public void setUp(){
        account = new Account(1,"Favour Black","1234");
    }
    @Test
    public void depositTes(){
        account.deposit(1_500);
        assertEquals(1_500,account.checkBalance("1234"));
       }
       @Test
    public void checkBalanceWithWrongPinReturnZeroTest(){
        account.deposit(1_500);
        assertEquals(1_500,account.checkBalance("1234"));

       }
       @Test
    public void withdrawMoneyTest(){
        account.deposit(8_000);
        account.withdraw(4_000,"1234");
        assertEquals(4_000,account.checkBalance("1234"));
       }
       @Test
    public void withdrawWithWrongPinDoesNotWorkTest(){
        account.deposit(8_000);
        account.withdraw(4_000,"1234");
        assertEquals(4_000,account.checkBalance("1234"));
       }
    }

