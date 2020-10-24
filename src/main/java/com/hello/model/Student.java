package com.hello.model;

import lombok.Data;

/**
 * @author cuihailong
 * @since 2020/10/24
 *
 * 学生
 */
@Data
public class Student extends Person{
    // 班级id
    private String classId;
}
