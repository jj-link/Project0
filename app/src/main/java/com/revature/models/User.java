package com.revature.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {

    private String first;
    private String last;
    private String email;
    private String username;
    private String password;
    private int userId;
    private List<Account> accounts;
    private List<Transaction> transactions;
    private boolean loggedIn;



    public User(){
    }

    public User(String first, String last, String email, String username, String password, String userId){

    }

    public User(String first, String last, String email, String username, String password, int userId) {
        this.first = first;
        this.last = last;
        this.email = email;
        this.username = username;
        this.password = password;
        this.userId = userId;
        this.accounts = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    public User(String first, String last, String email, String username, String password, int userId, List<Account> accounts, List<Transaction> transactions, boolean loggedIn) {
        this.first = first;
        this.last = last;
        this.email = email;
        this.username = username;
        this.password = password;
        this.userId = userId;
        this.accounts = accounts;
        this.transactions = transactions;
        this.loggedIn = loggedIn;
    }



    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }


    @Override
    public String toString() {
        return "User{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userId=" + userId +
                ", accounts=" + accounts +
                ", transactions=" + transactions +
                ", loggedIn=" + loggedIn +
                '}';
    }
}

