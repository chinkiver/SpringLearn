package com.my.cat.impl;

import com.my.cat.Cat;
import com.my.person.Person;
import lombok.Data;

@Data
public class CatImpl implements Cat {

    protected Integer id;
    protected String name;
    protected String nickName;
    protected Integer age;
    protected Person master;
}
