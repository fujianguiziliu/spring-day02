package com._520it._06_static_proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
//装饰模式
public class UserServiceTest {

	@Autowired
	private UserServiceImplByStaticproxy proxy;
	@Test
	public void testSave() throws Exception {
		
	/*IUserService target = new UserServiceImpl();
	
	UserServiceImplByStaticproxy userService =	new UserServiceImplByStaticproxy();
	userService.setTarget(target);*/
	
	User user = new User();
	proxy.save(user);
	//userService.save(user);
	}
}
