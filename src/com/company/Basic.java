package com.company;

public class Basic extends Account {
    public Basic(int accountNumber, double withdrawalLimit) {
        super(accountNumber, withdrawalLimit, 0.0D, 0.0D);
    }

    public double Withdraw(double amount) {
        double balance = this.GetCurrentBalance();
        if (balance < amount) {
            balance -= balance;
            return balance;
        } else {
            double var10000;
            if (this.withdrawLimit < amount) {
                var10000 = balance - this.withdrawLimit;
                return this.withdrawLimit;
            } else {
                var10000 = balance - amount;
                return amount;
            }
        }
    }

    public void Deposit(double amount) {
        this.balance += amount;
    }
}

