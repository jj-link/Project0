package com.revature.models;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String first;
    private String last;
    private String email;
    private String username;
    private String password;
    private List<Account> accounts;

    public User(){
        accounts = new ArrayList<>();
    }

    public User(String first, String last, String email, String password){
        this.first=first;
        this.last=last;
        this.email=email;
        this.password=password;
        this.accounts = new ArrayList<>();
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

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}

