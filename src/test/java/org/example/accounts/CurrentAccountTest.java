package org.example.accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CurrentAccountTest {

    CurrentAccount currentAccount;

    @BeforeEach
    public void setCurrentAccount() {
        currentAccount = new CurrentAccount("Alex", 10, 200, 100);
    }

    @Test
    public void getBalanceTest() {
        Assertions.assertEquals(currentAccount.getBalance(), 200);
    }

    @Test
    public void depositTest() {
        currentAccount.deposit(15);
        Assertions.assertEquals(currentAccount.getBalance(), 215);
    }

    @Test
    public void withdrawTest() {
        currentAccount.withdraw(30);
        Assertions.assertEquals(currentAccount.getBalance(), 170);
    }

    @Test
    public void maxWithdrawTest() {
        currentAccount.withdraw(150);
        Assertions.assertEquals(currentAccount.getBalance(), 200);
    }

    @Test
    public void minBalanceTest() {
        currentAccount.withdraw(100); // Set balance -> 100
        currentAccount.withdraw(100); // Attempt to set balance -> 0
        Assertions.assertEquals(currentAccount.getBalance(), 100); // Second withdrawal should fail
    }

}
