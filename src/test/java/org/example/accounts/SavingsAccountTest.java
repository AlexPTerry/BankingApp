package org.example.accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SavingsAccountTest {

    SavingsAccount savingsAccount;

    @BeforeEach
    public void setCurrentAccount() {
        savingsAccount = new SavingsAccount("Alex", 10, 200, 5);
    }

    @Test
    public void getBalanceTest() {
        Assertions.assertEquals(savingsAccount.getBalance(), 200);
    }

    @Test
    public void depositTest() {
        savingsAccount.deposit(15);
        Assertions.assertEquals(savingsAccount.getBalance(), 215);
    }

    @Test
    public void withdrawTest() {
        savingsAccount.withdraw(30);
        Assertions.assertEquals(savingsAccount.getBalance(), 170);
    }

    @Test
    public void getInterestRateTest() {
        Assertions.assertEquals(savingsAccount.getInterestRate(), 5);
    }
}
