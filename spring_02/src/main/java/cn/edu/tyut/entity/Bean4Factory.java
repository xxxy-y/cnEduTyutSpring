package cn.edu.tyut.entity;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author 羊羊
 * @ClassName Bean4Factory
 * @SubmitTime 周二
 * @DATE 2023/11/21
 * @Time 10:32
 * @Package_Name cn.edu.tyut.entity
 */
public class Bean4Factory implements FactoryBean<Bean4> {
    public Bean4Factory() {
        System.out.println("Bean4 Factory");
    }

    public Bean4 createBean4() {
        return new Bean4();
    }

    @Override
    public Bean4 getObject() throws Exception {
        return createBean4();
    }

    @Override
    public Class<?> getObjectType() {
        return Bean4.class;
    }
}
