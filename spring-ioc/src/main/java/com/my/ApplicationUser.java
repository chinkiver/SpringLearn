package com.my;

import com.my.dao.UserDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationUser {

    public static void main(String[] args) {

        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserDao user = factory.getBean(UserDao.class);
        System.out.println(user.index().toString());
    }
}
