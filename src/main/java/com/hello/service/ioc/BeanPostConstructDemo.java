package com.hello.service.ioc;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BeanPostConstructDemo {

    @PostConstruct
    public void init() {
        System.out.println("初始化类BeanPostConstructDemo......");
    }

}
