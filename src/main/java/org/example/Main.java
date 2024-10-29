package org.example;

import org.example.accounts.CurrentAccount;
import org.example.accounts.SavingsAccount;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        CurrentAccount currentAccount = new CurrentAccount("Alex", 10, 200, 100);
        SavingsAccount savingsAccount = new SavingsAccount("Alex", 10, 200, 5);
        System.out.println(currentAccount + "\n");
        System.out.println(savingsAccount);
    }
}
