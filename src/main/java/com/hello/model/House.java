package com.hello.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author cuihailong
 * @since 2020/10/24
 *
 * 房子
 */
@Data
@AllArgsConstructor
public class House {
    // 地址
    private String address;
    // 价格
    private Double price;
    // 房龄
    private Integer age;
}
