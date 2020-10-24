//package com.hello.service.aop;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.*;
//import org.springframework.stereotype.Component;
//
//@Component
//@Aspect
//public class AspectService {
//
//    @Pointcut("execution(* *.test(..))")
//    public void test() {
//
//    }
//
//    @Before("test()")
//    public void beforeTest() {
//        System.out.println("beforeTest......");
//    }
//
//    @After("test()")
//    public void afterTest() {
//        System.out.println("afterTest......");
//    }
//
//    @Around("test()")
//    public void aroundTest(ProceedingJoinPoint proceedingJoinPoint) {
//        System.out.println("around be......");
//        Object o = null;
//        try {
//            o = proceedingJoinPoint.proceed();
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
//        System.out.println("around af......");
//    }
//
//
//}
