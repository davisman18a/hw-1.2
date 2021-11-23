package com.company;

public class Standard extends Account {
    public Standard(int accountNumber, double creditLimit) {
        super(accountNumber, 0.0D, creditLimit, 0.0D);
    }

    public double Withdraw(double amount) {
        if (this.creditLimit < amount) {
            this.balance -= this.creditLimit;
            return this.balance;
        } else {
            this.balance -= amount;
            return super.Withdraw(amount);
        }
    }

    public void Deposit(double amount) {
        this.balance += amount;
    }
}
