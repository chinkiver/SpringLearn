package com.my.implement;

import com.my.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void store() {
        System.out.println("User stored !!");
    }
}
