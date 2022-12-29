package com.careerit.cj.basics.oops;

public class AccountManager {
    public static void main(String[] args) {
        Account acc1 = new Account(1011,"krish",45000);
        Account acc2 = new Account(1002,"manoj",95000);
        acc1.showInfo();
        acc2.showInfo();
        acc1.deposit(5000);
    }
}
