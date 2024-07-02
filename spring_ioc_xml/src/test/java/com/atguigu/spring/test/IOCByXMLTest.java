package com.atguigu.spring.test;

import com.atguigu.spring.pojo.Clazz;
import com.atguigu.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZJ
 * @ClassName IOCByXMLTest
 * @Description TODO
 * @date 2024/6/30 16:42
 * @Version 1.0
 */
public class IOCByXMLTest {

    /**
     * 获取bean的三种方式：
     * 1、根据bean的id获取
     * 2、根据bean的类型获取
     * 注意：根据类型获取bean时，要求IOC容器中有且只有一个类型的bean
     * 若没有任何一个类型匹配的bean，此时抛出异常：NoSuchBeanDefinitionException
     * 若有多个类型匹配的bean，此时抛出异常：NoUniqueBeanDefinitionException
     * 3、根据bean的id和类型获取
     * 结论：
     * 根据类型来获取bean时，在满足bean唯一性的前提下
     * 其实只是看：【对象 instanceof 指定的类型】 的返回结果
     * 只要返回的是true，就可以认定为和类型匹配，能够获取到
     * 即通过bean的类型，bean锁继承的类的类型，bean所实现的接口的类型都可以获取bean
     */

    @Test
    public void testIOC(){
        // 获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        // 获取bean
        //Student studentOne = (Student) ioc.getBean("studentOne");
        //Student student = ioc.getBean(Student.class);
        Student studentOne = ioc.getBean("studentOne", Student.class);
        System.out.println("student = " + studentOne);
    }

    @Test
    public void testDI(){
        // 获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        // 获取bean
        Student studentTwo = ioc.getBean("studentTwo", Student.class);
        System.out.println("studentTwo = " + studentTwo);
    }

    /**
     * 构造器注入
     */
    @Test
    public void testDIstudentThree(){
        // 获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        // 获取bean
        Student studentThree = ioc.getBean("studentThree", Student.class);
        System.out.println("studentThree = " + studentThree);
    }

    @Test
    public void testDIstudentFive(){
        // 获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        // 获取bean
        Student studentFive = ioc.getBean("studentFive", Student.class);
        System.out.println("studentFive = " + studentFive);
    }

    /**
     * List赋值测试
     */
    @Test
    public void testDIList(){
        // 获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        // 获取bean
        Clazz clazz = ioc.getBean("clazzOne", Clazz.class);
        System.out.println("Clazz = " + clazz);
    }

    /**
     * map测试
     */
    @Test
    public void testDIMap(){
        // 获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        // 获取bean
        Student studentFive = ioc.getBean("studentFive", Student.class);
        System.out.println("studentFive = " + studentFive);
    }

    /**
     * p测试
     */
    @Test
    public void testDIP(){
        // 获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        // 获取bean
        Student studentSix = ioc.getBean("studentSix", Student.class);
        System.out.println("studentSix = " + studentSix);
    }
}
