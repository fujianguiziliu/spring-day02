package com._520it._02_autowire;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import lombok.Setter;
import lombok.ToString;

@ToString
@Component("e1")
//@Service("e1")//业务逻辑加@Service
//@Scope("prototype")//非单例的，加在action的
@Scope("singleton")//默认就是单例的
public class Employee {
	
	@PostConstruct
	public void init(){
		System.out.println("初始化");
	}
	@PreDestroy//单例才能显示出来，@Scope("prototype")//表示非单例的，加在action的
	public void destroy(){
		System.out.println("销毁资源");
	}
	
	@Autowired
	//第一种贴在字段注入
	private Department dept;
	//private Department2 dept2;
	//第二种贴在set方法注入
	//@Autowired
	//@Resource
	//@Resource(name="department")//指定名字，找不到或者名字重复就报错
	//@Qualifier("dept1")//不会先根据类型找，即使类型一样，都不会报错，接着指定名称找，找不到就算了
	/*public void setDept(Department dept) {
		this.dept = dept;
	}*/
	
//	//@Autowired可以注入多个
//	@Autowired
//	@Qualifier("department")//先根据类型，再根据名字去找
//	public void setXxx(Department dept,Department2 dept2) {
//		this.dept = dept;
//		this.dept2 = dept2;
//	}
}
