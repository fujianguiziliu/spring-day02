package com._520it._01_extends;



public class StudentDAOImpl extends DAOSupport{

	/*@Setter
	private String datasource;*/
	
	public void save(){
		System.out.println("获取到连接池对象" + datasource +"666");
	}
}
