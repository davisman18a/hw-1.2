package com.company;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.List;

public interface IBank {
    void OpenAccount(IAccount var1);

    void CloseAccount(int var1);

    List<IAccount> GetAllAccounts();

    List<IAccount> GetAllAccountsInDebt();

    List<IAccount> GetAllAccountsWithBalance(double var1);
}
