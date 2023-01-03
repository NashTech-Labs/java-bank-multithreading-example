package com.knoldus.bank;

import com.knoldus.bank.model.Account;
import com.knoldus.bank.worker.AccountHolder;

public class User {

    public static void main(String[] args) {

        Account account = new Account();
        AccountHolder accountHolder = new AccountHolder(account);
        Thread t1 = new Thread(accountHolder);
        Thread t2 = new Thread(accountHolder);
        t1.setName("Deepak");
        t2.setName("Shashikant");

        t1.start();
        t2.start();
    }
}
