package com.revature.models;

import java.util.List;
import java.util.Set;

public class Account {
    private String accountType;
    private double balance;
    private Integer accountId;
    private boolean approved;
    private User accountUser;
    private List<Transaction> transactions;

    public Account() {

    }

    public Account(String accountType, Integer accountId, User accountUser){
        this.accountType = accountType;
        this.balance = 0;
        this.approved = false;
        this.accountId = accountId;
        this.accountUser = accountUser;
    }
    public Account(String accountType, double balance, Integer accountId, boolean approved, User accountUser){
        this.accountType = accountType;
        this.balance = balance;
        this.accountId = accountId;
        this.approved = approved;
        this.accountUser = accountUser;
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
    public Integer getAccountId() {
        return accountId;
    }
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }
    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public User getAccountUser() {
        return accountUser;
    }
    public void setAccountUser(User accountUser) {
        this.accountUser = accountUser;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountType='" + accountType + '\'' +
                ", balance=" + balance +
                ", accountId=" + accountId +
                ", approved=" + approved +
                ", accountUser=" + accountUser.getUsername() +
                ", transactions=" + transactions +
                '}';
    }
}
