package com._520it._08_cglib_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.cglib.proxy.Enhancer;

public class TranscationManagerByCGLIB implements 
org.springframework.cglib.proxy.InvocationHandler{

	private Object target;
	public void setTarget(Object target) {
		this.target = target;
	}
	
	//获取代理对象
	public Object getProxyObject(){
		
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(target.getClass());//设置代理类继承的父类
		enhancer.setCallback(this);//设置回掉的类型
		return enhancer.create();//
		
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
