package com.my.dao;

/**
 * Dao 工厂
 */
public class BeanFactory {

    public static DemoDao getDemoDao() {

        try {
            return (DemoDao) Class.forName("com.my.dao.implement.DemoDaoImpl").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("DemoDao instantiation error, cause " + e.getMessage());
        }
    }
}
