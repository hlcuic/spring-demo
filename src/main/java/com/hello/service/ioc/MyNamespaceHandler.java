package com.hello.service.ioc;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * 自定义<myname:user/>标签解析处理器
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {
    public void init() {
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }
}
