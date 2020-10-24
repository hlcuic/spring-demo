package com.hello.service.ioc;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class MyFactoryBeanDemo implements FactoryBean {

    public Object getObject() throws Exception {
        return new User();
    }

    public Class<?> getObjectType() {
        return User.class;
    }

    public boolean isSingleton() {
        return true;
    }

}
