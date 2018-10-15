package com._520it._06_static_proxy;

//IUserService的静态代理类
public class UserServiceImplByStaticproxy implements IUserService{

	private IUserService target;

	public void setTarget(IUserService target){
		this.target = target;
	}
	@Override
	public void save(User u) {
		
		try {
			System.out.println("开启事务");
			
			target.save(u);
			
			System.out.println("提交事务");
		} catch (Exception e) {
			System.out.println("回滚事务");

			e.printStackTrace();
		} 
	}

	@Override
	public void update(User u) {

		try {
			System.out.println("开启事务");
			
			target.update(u);			
			System.out.println("提交事务");
		} catch (Exception e) {
			System.out.println("回滚事务");

			e.printStackTrace();
		} 
	}

}
