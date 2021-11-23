package com.company;

public class Premium extends Account {
    public Premium(int accountNumber) {
        super(accountNumber, 0.0D, 0.0D, 0.0D);
    }

    public double Withdraw(double amount) {
        this.balance -= amount;
        return amount;
    }

    public void Deposit(double amount) {
        this.balance += amount;
    }
}
