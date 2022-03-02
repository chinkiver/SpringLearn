package com.my.person.impl;

import com.my.cat.Cat;
import com.my.person.Person;
import lombok.Data;

@Data
public class PersonImpl implements Person {

    protected Integer id;
    protected String name;
}
