package com.my;

import com.my.dao.PersonDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationPerson {

    public static void main(String[] args) {

        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonDao person = factory.getBean(PersonDao.class);

        System.out.println(person.getPersonNameList().toString());
    }
}
