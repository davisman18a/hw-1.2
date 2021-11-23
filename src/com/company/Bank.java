package com.company;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank implements IBank {
    protected List<IAccount> accounts;
    protected double balance = 0.0D;
    private int accountNumber;
    private static int lastAccount = 0;

    public void OpenAccount(IAccount account) {
        this.accounts.add(account);
    }

    public void CloseAccount(int accountNumber) {
        List<IAccount> to_remove = new ArrayList();
        Iterator var3 = this.accounts.iterator();

        while(var3.hasNext()) {
            IAccount account = (IAccount)var3.next();
            if (accountNumber == account.GetAccountNumber()) {
                if (account.GetCurrentBalance() >= 0.0D) {
                    to_remove.add(account);
                } else {
                    System.out.println(" The account is not closed due to the debt. Please pay ASAP");
                }
            }
        }

        this.accounts.removeAll(to_remove);
    }

    public List<IAccount> GetAllAccounts() {
        return this.accounts;
    }

    public List<IAccount> GetAllAccountsInDebt() {
        List<IAccount> debts = new ArrayList();
        Iterator var2 = this.accounts.iterator();

        while(var2.hasNext()) {
            IAccount account = (IAccount)var2.next();
            if (account.GetCurrentBalance() < 0.0D) {
                debts.add(account);
            }
        }

        return debts;
    }

    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {
        List<IAccount> bigger = new ArrayList();
        Iterator var4 = this.accounts.iterator();

        while(var4.hasNext()) {
            IAccount account = (IAccount)var4.next();
            if (account.GetCurrentBalance() > balanceAbove) {
                bigger.add(account);
            }
        }

        return bigger;
    }

    public Bank() {
        this.accountNumber = lastAccount + 1;
        lastAccount = this.accountNumber;
        this.accounts = new ArrayList();
    }
}
