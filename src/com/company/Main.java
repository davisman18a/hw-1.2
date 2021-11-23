package com.company;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        List<IAccount> accounts = new ArrayList();
        accounts.add(new Basic(1, 100.0D));
        accounts.add(new Standard(2, -100.0D));
        accounts.add(new Premium(3));
        accounts.add(new Basic(4, 200.0D));
        accounts.add(new Premium(5));
        accounts.add(new Standard(6, -1000.0D));
        Iterator var2 = accounts.iterator();

        while(var2.hasNext()) {
            IAccount account = (IAccount)var2.next();
            account.Deposit(100.0D);
            PrintStream var10000 = System.out;
            int var10001 = account.GetAccountNumber();
            var10000.println("Withdraw 500, " + var10001 + " can withdraw " + account.Withdraw(500.0D));
            var10000 = System.out;
            var10001 = account.GetAccountNumber();
            var10000.println("Withdraw 800, " + var10001 + " can withdraw " + account.Withdraw(800.0D));
        }

        Bank bank_account = new Bank();
        Account basic = new Basic(1, 100.0D);
        basic.Deposit(900.0D);
        Account premium = new Premium(2);
        premium.Deposit(200.0D);
        Account standard = new Standard(3, 100.0D);
        bank_account.OpenAccount(basic);
        bank_account.OpenAccount(premium);
        bank_account.OpenAccount(standard);
        basic.Withdraw(1000.0D);
        premium.Withdraw(500.0D);
        System.out.println(premium.GetCurrentBalance());
        bank_account.CloseAccount(2);
        System.out.println(bank_account.GetAllAccounts());
        System.out.println(bank_account.GetAllAccountsInDebt());
    }
}
