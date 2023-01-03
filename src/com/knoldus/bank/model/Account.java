package com.knoldus.bank.model;

public class Account {
    private int balance = 15000;

    public int getBalance() {
        return balance;
    }
    public void withdraw(int amount) {
        balance = balance - amount;
    }
}

