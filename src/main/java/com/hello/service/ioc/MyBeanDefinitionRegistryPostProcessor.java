package com.hello.service.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        // 向beanDefinitionMap中注册自定义的beanDefinition对象
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(BeanDemo.class);
        registry.registerBeanDefinition("beanDemo", beanDefinition);
    }

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("beanDemo");
        beanDefinition.getPropertyValues().addPropertyValue("name", "world");

        // 直接向beanFactory中注册对象
        BeanDemo beanDemo2 = new BeanDemo();
        beanFactory.registerSingleton("beanDemo2", beanDemo2);
        System.out.println(beanFactory.getBeanDefinitionNames());
    }

}
