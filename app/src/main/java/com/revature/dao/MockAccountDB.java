package com.revature.dao;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import com.revature.models.Account;


//eager singleton model
public class MockAccountDB {

    private Map<String, List<Account>> db;

    private static MockAccountDB mockDBInstance = new MockAccountDB();

    private MockAccountDB(){
        db = new HashMap<String, List<Account>>();
    }

    public static MockAccountDB getInstance(){
        return mockDBInstance;
    }

    public Map<String,List<Account>> getDb(){
        return db;
    }

}
