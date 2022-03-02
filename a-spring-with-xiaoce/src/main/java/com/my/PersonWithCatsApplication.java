package com.my;

import com.my.cat.Cat;
import com.my.person.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonWithCatsApplication {

    public static void main(String[] args) {

        BeanFactory factory = new ClassPathXmlApplicationContext("person-with-cats.xml");

        Person person = factory.getBean(Person.class);
        Cat cat = factory.getBean(Cat.class);

        System.out.println(person);
        System.out.println(cat);
    }
}
