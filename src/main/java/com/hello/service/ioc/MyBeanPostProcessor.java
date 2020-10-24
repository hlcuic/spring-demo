//package com.hello.service.ioc;
//
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.config.BeanPostProcessor;
//import org.springframework.stereotype.Service;
//
//@Service
//public class MyBeanPostProcessor implements BeanPostProcessor {
//
//    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        return bean;
//    }
//
//    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        if (beanName.equals("beanDemo")) {
//            BeanDemo beanDemo = (BeanDemo) bean;
//            beanDemo.setName("kitty");
//            return beanDemo;
//        }
//        return bean;
//    }
//}
