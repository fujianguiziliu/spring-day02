package com._520it._05_wrapper;

import org.junit.Test;

//装饰模式注重的是过程
public class UserServiceTest {

	@Test
	public void testSave() throws Exception {
		
	IUserService target = new UserServiceImpl();
	
	IUserService userService =	new UserServiceImplWrapper(target);
	
	
	User user = new User();
	userService.save(user);
	}
}
