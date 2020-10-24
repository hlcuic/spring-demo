package com.hello.model;

import lombok.Data;

@Data
public class Person {
    // 身份证号
    private String id;
    // 姓名
    private String name;
    // 房产
    private House house;
}
