package com.my.dao.impl;

import com.my.dao.UserDao;

import java.util.Arrays;
import java.util.List;

public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
        System.out.println("UserDaoImpl created ...");
    }

    public void init() {
        System.out.println("UserDaoImpl init ...");
    }

    public void destroy() {
        System.out.println("UserDaoImpl destroy ...");
    }

    @Override
    public List<String> index() {
        return Arrays.asList("Tom", "Jack", "Toni");
    }
}
