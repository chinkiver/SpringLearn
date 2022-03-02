package com.my.factory;

import com.my.dao.UserDao;
import com.my.dao.impl.UserDaoImpl;

public class UserDaoFactory {

    public static UserDao create() {
        return new UserDaoImpl();
    }
}
