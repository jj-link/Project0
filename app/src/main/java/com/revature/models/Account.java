package com.revature.models;

public class Account {
    private String accountType;
    private double balance;

    public Account() {
        this.balance = 0;
    }

    public Account(String accountType, double balance){
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getAccountType(){
        return this.accountType;
    }

    public void setAccountType(String accountType){
        this.accountType = accountType;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
}
