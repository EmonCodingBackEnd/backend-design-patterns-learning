package com.coding.design.patterns.structural.p11bridge.example1;

public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}
