package com.hello.service.ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestAnnotationValueInject {

    @Value("${hello.world}")
    private String helloWorld;

}
