package com.atugigu.spring.test;

import com.atguigu.spring.pojo.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZJ
 * @ClassName HelloWorldTest
 * @Description TODO
 * @date 2024/6/30 15:57
 * @Version 1.0
 */
public class HelloWorldTest {

    @Test
    public void test(){
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取IOC容器中的bean对象
        HelloWorld helloworld = (HelloWorld)ioc.getBean("helloworld");
        helloworld.sayHello();
    }
}
