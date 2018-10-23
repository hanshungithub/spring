package cn.hassan.spring.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created with idea
 * Author: hss
 * Date: 10/23/2018 8:58 AM
 * Description:
 */
public class LogArgsAdvice implements MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[] objects, Object o) throws Throwable {
		System.out.println("准备执行方法: "+ method.getName()+", 参数列表: "+ Arrays.toString(objects));
	}
}
