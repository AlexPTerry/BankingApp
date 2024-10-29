package org.example.accounts;

public class SavingsAccount extends Account{

    private double interestRate;

    public SavingsAccount(String accountHolderName, double minimumBalance, double balance, double interestRate) {
        super(accountHolderName, minimumBalance, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    @Override
    public String toString() {
        return "Account Type: Savings Account\n" +
                super.toString() +
                "\nInterest Rate: %.2f".formatted(this.interestRate);
    }
}
