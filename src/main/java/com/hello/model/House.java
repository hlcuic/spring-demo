package com.hello.model;

import lombok.Data;

/**
 * @author cuihailong
 * @since 2020/10/24
 */
@Data
public class House {
    // 地址
    private String address;
    // 价格
    private Double price;
    // 房龄
    private Integer age;
}
