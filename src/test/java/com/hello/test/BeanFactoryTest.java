package com.hello.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

public class BeanFactoryTest {

    public static void main(String[] args) {
        ResourceLoader resourceLoader = new PathMatchingResourcePatternResolver();
        Resource resource = resourceLoader.getResource("spring-context.xml");
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory((resource));
        System.out.println(xmlBeanFactory);
        System.out.println(xmlBeanFactory.getBean("student"));
    }

}
