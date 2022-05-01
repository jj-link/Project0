package com.revature.dao;

import com.revature.models.Account;
import com.revature.models.User;

import java.util.List;
import java.util.Map;

public interface IAccountDao {

    void createAccount(Account a);
    //Account deleteAccount(Account a);
    List<Account> getAccountsByUsername(String userName);

    Account getAccountById(Integer id, String userName);

}
