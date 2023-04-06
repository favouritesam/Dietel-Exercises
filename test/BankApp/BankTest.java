package BankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    private Bank gtBank;

    @BeforeEach
    public void startWithThis(){
        gtBank = new Bank("Guaranteed Trusted Bank");
        gtBank.createAccountFor("favour girl","1234");
    }
@Test
    public void createAccount(){
        assertEquals(1,gtBank.countNumberOfAccount());
}
@Test
    public void checkBalanceOfNewAccountIsZeroByDefault(){
        assertEquals(0,gtBank.checkBalanceFor(1,"1234"));
}
@Test
    public void depositCheckBalance(){
        gtBank.deposit(5000,1);
        assertEquals(5000,gtBank.checkBalanceFor(1,"1234"));
}
@Test
    public void transferMoneyTest(){
        gtBank.createAccountFor("Favour Black","receiverPin");
        gtBank.deposit(4_500,1);
        gtBank.transfer(2_000,1,2,"1234");
        assertEquals(2_500,gtBank.checkBalanceFor(1,"1234"));
        assertEquals(2_000,gtBank.checkBalanceFor(2,"receiverPin"));
}
}