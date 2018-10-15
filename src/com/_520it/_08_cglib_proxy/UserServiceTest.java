package com._520it._08_cglib_proxy;

import java.lang.reflect.InvocationHandler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
//JDK动态代理
public class UserServiceTest {

	@Autowired
	private TranscationManagerByCGLIB handler;
	@Test
	public void testSave() throws Exception {
		IUserService userService= (IUserService) handler.getProxyObject();
	
		User u = new User();
		//userService.save(u);保存操作
		userService.update(u);
		System.out.println(userService.getClass());
	}
}
