package cn.hassan.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with idea
 * Author: hss
 * Date: 10/23/2018 10:04 AM
 * Description:
 */
public class AOPTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application-aop.xml");
		System.out.println("context is running");
		UserService userService = (UserService) applicationContext.getBean("userServiceProxy");
		userService.createUser("han", "hassan", 25);
		userService.queryUser();
	}
}
