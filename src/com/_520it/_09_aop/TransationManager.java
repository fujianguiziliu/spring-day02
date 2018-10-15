package com._520it._09_aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
/*<aop:pointcut expression="execution(* com._520it._09_aop.*Service.*(..))"
			 id="pc"/>*/
public class TransationManager {

	@Pointcut("execution(* com._520it._09_aop.*Service.*(..))")
	public void pc(){
		
	
	}
	@Before("pc()")
	public void  begin() {
		System.out.println("开始事务");
	}
	

	@AfterReturning("pc()")
	public void  commit() {
		System.out.println("提交事务");

	}
	

	@AfterThrowing("pc()")
	public void  rollback() {
		System.out.println("回滚事务");

	}
	
	public void  destroy() {
		System.out.println("销毁事务");

	}
	
	public Object  around(ProceedingJoinPoint pjp)   {
		System.out.println(pjp.getSignature().getDeclaringTypeName());
		System.out.println(pjp.getTarget());
		Object ret= null;
		try {
			System.out.println("开启事务");
			ret=pjp.proceed();
			System.out.println("提交事务");
		} catch (Throwable e) {
			System.out.println("回滚事务");

			e.printStackTrace();
		} finally{
				System.out.println("资源销毁");
		}
		return ret;

	}
}
