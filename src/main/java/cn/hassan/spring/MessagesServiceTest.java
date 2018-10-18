package cn.hassan.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with idea
 * Author: hss
 * Date: 10/18/2018 8:04 AM
 * Description:
 */
public class MessagesServiceTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		System.out.println("context is running");
		MessageService messageService = applicationContext.getBean(MessageService.class);
		System.out.println(messageService.getMessages());
	}
}
