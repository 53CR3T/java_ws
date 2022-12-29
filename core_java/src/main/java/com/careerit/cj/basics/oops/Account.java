package com.careerit.cj.basics.oops;

public class Account {
    int accNumber;
    String name;
    double balance;
    public Account(int accNumber, String name, double balance){
        this.accNumber=accNumber;
        this.name=name;
        this.balance=balance;
    }
    public void withdraw(double amount){
        if (amount>balance){
            System.out.println("insufficient balance");
        }
        balance -= amount;
        System.out.println("balance is "+ balance);
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("balance is "+ balance);
    }
    public void showBalance(){
        System.out.println("balance is "+ balance);
    }
    public void showInfo(){
        System.out.println("account number: "+ accNumber);
        System.out.println("account name: "+ name);
        System.out.println("account balance: "+ balance);
    }

}
