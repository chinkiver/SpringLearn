package com.my.dao.impl;

import com.my.dao.PersonDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDaoImplTest {

    @Test
    public void scopePrototypeTest() {

        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");

        // scope 为 prototype 时，每次 getBean 时创建
        PersonDao person1 = factory.getBean(PersonDao.class);
        PersonDao person2 = factory.getBean(PersonDao.class);

        System.out.println(person1);
        System.out.println(person2);
    }
}
