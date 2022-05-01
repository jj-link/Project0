package com.revature.dao;

import com.revature.models.Account;
import com.revature.models.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AccountDaoMock implements IAccountDao {

    Map<String, List<Account>> db = MockAccountDB.getInstance().getDb();

    @Override
    public void createAccount(Account a) {

        String userName = a.getAccountUser().getUsername();
        List<Account> accounts = db.get(userName);

        if(accounts != null){
            accounts.add(a);
        }else{
            accounts = new ArrayList<>();
            accounts.add(a);
        }
        db.put(userName, accounts);
    }

    public List<Account> getAccountsByUsername(String userName) {
        return db.get(userName);
    }

    public Account getAccountById(Integer id, String userName){
        List<Account> accountList = getAccountsByUsername(userName);
        Iterator<Account> aIterator = getAccountsByUsername(userName).iterator();
        int iCounter = 0;
        int indexFound = 0;
        while(aIterator.hasNext()){
            Account currentAccount = aIterator.next();
            if (currentAccount.getAccountId() == id){
                indexFound = iCounter;
            }
            iCounter++;
        }
        return accountList.get(indexFound);
    }

}
