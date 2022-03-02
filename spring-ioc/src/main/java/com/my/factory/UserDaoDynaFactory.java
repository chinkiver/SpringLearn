package com.my.factory;

import com.my.dao.UserDao;
import com.my.dao.impl.UserDaoImpl;

public class UserDaoDynaFactory {

    public UserDao create() {
        return new UserDaoImpl();
    }
}
