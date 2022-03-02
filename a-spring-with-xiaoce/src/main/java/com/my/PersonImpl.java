package com.my;

import java.util.Arrays;
import java.util.List;

public class PersonImpl implements Person {

    /**
     * 返回全部用户列表
     *
     * @return List<String>
     */
    @Override
    public List<String> index() {
        return Arrays.asList("A", "B", "C");
    }
}
