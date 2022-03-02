package com.my;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuickstartByNameApplication {

    public static void main(String[] args) {

        BeanFactory factory = new ClassPathXmlApplicationContext("quickstart-byname.xml");

        Person person = (Person) factory.getBean("person");

        System.out.println(person.index().toString());
    }
}
