package com.revature.models;

import com.revature.exceptions.InvalidAmountException;
import com.revature.exceptions.NegativeBalanceException;

import java.util.Date;

public class Transaction {
    private String transactionType;
    private User user;
    private Account fromAccount;
    private Account toAccount;
    private double amount;
    private Date timestamp;


    public Transaction(String transactionType, User user, Account fromAccount, Account toAccount, double amount, Date timestamp) {
        this.transactionType = transactionType;
        this.user = user;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.timestamp = timestamp;
    }


    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Account getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(Account fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Account getToAccount() {
        return toAccount;
    }

    public void setToAccount(Account toAccount) {
        this.toAccount = toAccount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionType='" + transactionType + '\'' +
                ", user=" + user +
                ", fromAccount=" + fromAccount +
                ", toAccount=" + toAccount +
                ", amount=" + amount +
                ", timestamp=" + timestamp +
                '}';
    }
}
