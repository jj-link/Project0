package com.revature.services;

import com.revature.exceptions.UsernameOrPasswordIncorrectException;
import com.revature.models.User;
import com.revature.dao.IUserDao;

public class UserService {

    private IUserDao uDao;

    public UserService(IUserDao uDao){
        this.uDao = uDao;
    }

    //register new user
    public void registerUser(String first, String last, String email, String userName, String password, int userId){
        //check to see if user exists already
        User register = new User(first, last, email, userName, password, userId);

        uDao.createUser(register);
    }

    //login user
    public User loginUser(String userName, String password) throws UsernameOrPasswordIncorrectException {

       User u = uDao.getUserByUsername(userName);

        if (u == null || !password.equals(u.getPassword())){
            throw new UsernameOrPasswordIncorrectException();
        }
        else{
            u.setLoggedIn(true);
            return u;
        }
    }

    //logout user
    public User logoutUser(String userName) throws UsernameOrPasswordIncorrectException{
        User u = uDao.getUserByUsername(userName);

        if (u == null){
            throw new UsernameOrPasswordIncorrectException();
        }else{
            u.setLoggedIn(false);
            return u;
        }
    }

}
