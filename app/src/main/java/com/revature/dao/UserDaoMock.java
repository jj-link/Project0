package com.revature.dao;

import com.revature.models.User;
import java.util.Map;

public class UserDaoMock implements IUserDao {

    Map<String,User> db = MockUserDB.getInstance().getDb();

    @Override
    public User createUser(User u){
        //store user in mock database
        db.put(u.getUsername(), u);
        return u;
    }

    @Override
    public User getUserByUsername(String username){
        return db.get(username);
    }

}
