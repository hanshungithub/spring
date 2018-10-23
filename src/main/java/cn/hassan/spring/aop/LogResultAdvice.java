package cn.hassan.spring.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created with idea
 * Author: hss
 * Date: 10/23/2018 9:00 AM
 * Description:
 */
public class LogResultAdvice implements AfterReturningAdvice {
	@Override
	public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
		System.out.println("方法返回：" + o);
	}
}
