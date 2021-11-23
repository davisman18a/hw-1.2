//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

public class Account implements IAccount {
    protected int accountNumber;
    protected double creditLimit;
    protected double withdrawLimit;
    protected double balance;

    public Account(int accountNumber, double withdrawalLimit, double creditLimit, double balance) {
        this.accountNumber = accountNumber;
        this.withdrawLimit = withdrawalLimit;
        this.creditLimit = creditLimit;
    }

    public void Deposit(double amount) {
        this.balance += amount;
    }

    public double Withdraw(double amount) {
        this.balance -= amount;
        return amount;
    }

    public double GetCurrentBalance() {
        return this.balance;
    }

    public int GetAccountNumber() {
        return this.accountNumber;
    }
}
