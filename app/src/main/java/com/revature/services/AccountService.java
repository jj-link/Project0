package com.revature.services;

import com.revature.dao.*;
import com.revature.models.Account;
import com.revature.models.User;

import java.util.List;

public class AccountService {

    private IAccountDao aDao;

    public AccountService(IAccountDao aDao){
        this.aDao = aDao;
    }

    public void createAccount(String accountType, Integer accountId, User accountUser){
        Account newAccount = new Account(accountType,accountId,accountUser);
        aDao.createAccount(newAccount);

        //add account to user object
        List<Account> userAccounts = accountUser.getAccounts();
        userAccounts.add(newAccount);

    }

}
