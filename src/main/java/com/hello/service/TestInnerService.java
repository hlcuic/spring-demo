//package com.hello.service;
//
//import com.hello.mapper.UserMapper;
//import com.hello.model.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//
//@Component
//public class TestInnerService {
//
//    @Autowired
//    private UserMapper userMapper;
//
//    @Transactional(rollbackFor = Exception.class, propagation = Propagation.NEVER)
//    public int addData() {
//        User user = new User();
//        user.setName("Lucy");
//        user.setAge("30");
//        int effectCount = userMapper.insert(user);
//        System.out.println("影响条数: " + effectCount);
//        int i = 10 / 0;
//        return 0;
//    }
//}
