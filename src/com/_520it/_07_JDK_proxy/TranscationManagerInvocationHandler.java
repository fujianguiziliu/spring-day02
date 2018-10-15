package com._520it._07_JDK_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TranscationManagerInvocationHandler implements InvocationHandler{

	private Object target;
	public void setTarget(Object target) {
		this.target = target;
	}
	
	//获取代理对象
	public Object getProxyObject(){
		
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), //类加载器
				target.getClass().getInterfaces(),//指定 为哪一个目标对象上的接口生成代理类
				this);
		
	}
	
	
	//在执行真是方法的前后执行的方法
	//method：真实方法
	//args：真实参数
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object ret= null;
		try {
			System.out.println("开启事务");
			
			ret = method.invoke(target, args);
			
			System.out.println("提交事务");
		} catch (Exception e) {
			
			System.out.println("回滚事务");

			e.printStackTrace();
		} 
		return ret;
	}

}
