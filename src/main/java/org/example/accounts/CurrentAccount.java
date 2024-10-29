package org.example.accounts;

public class CurrentAccount extends Account{

    private double maxWithdrawal;
    public CurrentAccount(String accountHolderName, double minimumBalance, double balance, double maxWithdrawal) {
        super(accountHolderName, minimumBalance, balance);
        this.maxWithdrawal = maxWithdrawal;
    }

    @Override
    public void withdraw(double quantity) {
        if (quantity <= this.maxWithdrawal) {
            super.withdraw(quantity);
        }
    }

    @Override
    public String toString() {
        return "Account Type: Current Account\n" +
                super.toString() +
                "\nMax Withdrawal: %.2f".formatted(this.maxWithdrawal);
    }

}
