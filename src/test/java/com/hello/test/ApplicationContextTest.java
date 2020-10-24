package com.hello.test;

import com.hello.model.Person;
import com.hello.model.School;
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
        // 获取person1对象
        Person person1 = (Person) applicationContext.getBean("person1");
        System.out.println("person1: "+person1);

        // 获取person2对象
        Person person2 = (Person) applicationContext.getBean("person2");
        System.out.println("person2: "+person2);

        // 获取person3对象
        Person person3 = (Person) applicationContext.getBean("person3");
        System.out.println("person3: "+person3);

        // 获取person4对象
        School school = (School) applicationContext.getBean("school");
        System.out.println("person4: "+school.findPerson());

        // 通过别名获取bean对象
        System.out.println(applicationContext.getBean("jack"));
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
