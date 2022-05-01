package com.revature.dao;

import com.revature.models.User;

public interface IUserDao {

    User createUser(User u);
    User getUserByUsername(String Username);


}
