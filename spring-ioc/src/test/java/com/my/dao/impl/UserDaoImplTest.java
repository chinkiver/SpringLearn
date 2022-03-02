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

        UserDao user = (UserDao) factory.getBean("user");
        UserDao userCreatedByStaticFactory = (UserDao) factory.getBean("userCreatedByStaticFactory");
        UserDao userCreatedByDynaFactory = (UserDao) factory.getBean("userCreatedByDynaFactory");

        System.out.println(user);
        System.out.println(userCreatedByStaticFactory);
        System.out.println(userCreatedByDynaFactory);
    }
}
