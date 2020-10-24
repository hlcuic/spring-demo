//package com.hello.service;
//
//import com.hello.mapper.UserMapper;
//import com.hello.model.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//
//@Service
//public class TestOuterService {
//
//    @Autowired
//    private TestInnerService service;
//
//    @Autowired
//    private UserMapper userMapper;
//
//    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
//    public int add() {
//        return service.addData();
//    }
//
//}
