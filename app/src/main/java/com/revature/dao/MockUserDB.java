package com.revature.dao;

import java.util.Map;
import java.util.HashMap;
import com.revature.models.User;

//eager singleton
public class MockUserDB {

    //using hashmap as temporary mock database

    private Map<String, User> db;
    private static MockUserDB mockDBInstance = new MockUserDB();

    private MockUserDB(){
        db = new HashMap<>();
    }

    public static MockUserDB getInstance(){
        return mockDBInstance;
    }

    public Map<String,User> getDb(){
        return db;
    }

}
