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
		// 启动 Spring 的 IOC 容器
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-aop-test.xml");

		UserService userService = context.getBean(UserService.class);
		OrderService orderService = context.getBean(OrderService.class);

		userService.createUser("Tom", "Cruise", 55);
		userService.queryUser();

		orderService.createOrder("Leo", "随便买点什么");
		orderService.queryOrder("Leo");
	}
}
