package com.my.dao.impl;

import com.my.dao.PersonDao;

import java.util.Arrays;
import java.util.List;

public class PersonDaoImpl implements PersonDao {

    public PersonDaoImpl() {
        System.out.println("PersonDaoImpl created ...");
    }

    @Override
    public List<String> getPersonNameList() {
        return Arrays.asList("Tom", "Lucy", "Lili", "Jack");
    }
}
