package com._520it._03_register.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com._520it._03_register.web.action.UserAction;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration

public class UserActionTest {
	@Autowired
	private ApplicationContext ctx;
	@Test
	public void testRegister() throws Exception {
		UserAction action = ctx.getBean("userAction",UserAction.class);
		action.register();
	}
	
	
	
}
