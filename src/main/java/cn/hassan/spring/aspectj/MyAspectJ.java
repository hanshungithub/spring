package cn.hassan.spring.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created with idea
 * Author: hss
 * Date: 10/23/2018 10:31 AM
 * Description:
 */
//@Aspect
public class MyAspectJ {

	@Pointcut("execution(public * cn.hassan.spring.impl..*ServiceImpl.*(..))")
	public void pointcut() {

	}


}
