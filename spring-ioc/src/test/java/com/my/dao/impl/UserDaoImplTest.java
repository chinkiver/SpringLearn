package com.my.dao.impl;

import com.my.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoImplTest {

    @Test
    public void scopeSingletonTest() {

        // scope 为 singleton 时，获取 xml 时创建
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserDao user1 = factory.getBean(UserDao.class);
        UserDao user2 = factory.getBean(UserDao.class);

        System.out.println(user1);
        System.out.println(user2);
    }
}
