package com.my.service.implement;

import com.my.dao.BeanFactory;
import com.my.dao.DemoDao;
import com.my.service.DemoService;

import java.util.List;

public class DemoServiceImpl implements DemoService {

    private final DemoDao demoDao = BeanFactory.getDemoDao();

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
