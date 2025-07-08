package exercises.javabase;

import java.math.BigDecimal;

public class ContoBancario {
    private String accountNumber;
    private double accountBalance;

    public ContoBancario(String accountNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = 0;
    }

    // getters and setters

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    // methods (deposit, withdraw)
    public void deposit(double toDeposit) {
        if (toDeposit > 0) {
            accountBalance = accountBalance + toDeposit;
        }
    }

    public void withdraw(double toWithdraw) {
        if (accountBalance < toWithdraw) {
            System.out.println("Your account balance has insuffient funds to complete the operation.");
        } else {
            accountBalance = accountBalance - toWithdraw;
        }
    }
}
