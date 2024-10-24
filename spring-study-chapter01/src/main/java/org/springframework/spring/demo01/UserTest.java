package org.springframework.spring.demo01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author czsm
 * @description
 * @data 2024/10/24
 */
public class UserTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		User user = context.getBean("user", User.class);// 假设 "beanName" 是配置文件中定义的一个 Bean 的名称
		System.out.println(user);
	}
}
