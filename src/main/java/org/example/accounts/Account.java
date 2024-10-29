package org.example.accounts;

public abstract class Account {

    String accountHolderName;
    double minimumBalance;
    double balance;

    public Account(String accountHolderName, double minimumBalance, double balance) {
        this.accountHolderName = accountHolderName;
        this.minimumBalance = minimumBalance;
        this.balance = balance;
    }

    public void deposit(double quantity) {
        this.balance += quantity;
    }

    public void withdraw(double quantity) {
        double newBalance = this.balance - quantity;
        this.balance = newBalance < minimumBalance ? this.balance : newBalance;
    }

    public double getMinimumBalance() {
        return this.minimumBalance;
    }
    public double getBalance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return "Account Holder Name: %s\n".formatted(this.accountHolderName) +
                "Minimum Balance: %.2f\n".formatted(this.minimumBalance) +
                "Balance: %.2f".formatted(this.balance);
    }

}
