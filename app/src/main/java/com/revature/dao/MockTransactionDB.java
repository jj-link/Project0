package com.revature.dao;

import com.revature.models.Transaction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MockTransactionDB {

    private Map<Integer, List<Transaction>> db;

    private static MockTransactionDB mockDBInstance = new MockTransactionDB();

    private MockTransactionDB(){
        db = new HashMap<Integer, List<Transaction>>();
    }

    public static MockTransactionDB getInstance(){
        return mockDBInstance;
    }

    public Map<Integer,List<Transaction>> getDb(){
        return db;
    }

}
