package cn.hassan.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created with idea
 * Author: hss
 * Date: 10/23/2018 10:17 AM
 * Description:
 */
public class AopInterceptor implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		System.out.println("Before: invocation=[" + methodInvocation + "]");
		// 执行 真实实现类 的方法
		Object rval = methodInvocation.proceed();
		System.out.println("Invocation returned");
		return rval;
	}
}
