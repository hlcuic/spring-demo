package com.hello.test;

//import com.hello.service.TestOuterService;

import com.hello.model.Person;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {

    private ApplicationContext applicationContext;

    /**
     * 初始化applicationContext上下文对象
     */
    @Before
    public void initApplicationContext() {
        String configLocation = "spring-context.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
    }

    /**
     * 1:分析set注入源码
     */
    @Test
    public void testSetInject(){
        Person person = applicationContext.getBean(Person.class);
        System.out.println("person: "+person);
    }

		/*

		TestAopService testAopService = context.getBean(TestAopService.class);
		testAopService.test();

		TestA testA1 = (TestA)context.getBean("testA");
		System.out.println("testA1: "+testA1);
		TestA testA2 = (TestA)context.getBean("testA");
		System.out.println("testA2: "+testA2);
		context.close();

		User user = (User)context.getBean("myFactoryBean");
		System.out.println(user);
		MyFactoryBean myFactoryBean = (MyFactoryBean)context.getBean("&myFactoryBean");
		System.out.println(myFactoryBean);

		System.out.println("beanDemo: " + context.getBean("beanDemo"));
		System.out.println("beanDemo2: " + context.getBean("beanDemo2"));

		System.out.println("person: "+context.getBean("person3"));
		System.out.println("student: "+context.getBean("student1"));
		System.out.println("orderService: "+context.getBean("orderService"));

		UserStudyService userStudyService = (UserStudyService)context.getBean("userStudyService");
		userStudyService.doStudy();

		Cat cat = context.getBean(Cat.class);
		cat.sing();

		Teacher teacher = context.getBean(Teacher.class);
		teacher.study();

		User user = (User)context.getBean("hello");
		System.out.println(user);

		Child child = (Child)context.getBean("child");
		System.out.println("child: "+child);

		context.getBean(TestAutowiredModel.class).print();

		context.getBean("myFactoryBeanDemo");

		TestAopService testAopService = context.getBean(TestAopService.class);
		testAopService.test();*/

//	}
}
