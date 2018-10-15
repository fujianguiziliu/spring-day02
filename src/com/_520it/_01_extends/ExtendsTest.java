package com._520it._01_extends;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration

public class ExtendsTest {

	@Autowired
	private ApplicationContext ctx;
	
	@Test
	public void testExtends() throws Exception {
		
		StudentDAOImpl bean = ctx.getBean("studentDAO",StudentDAOImpl.class);
		
		bean.save();
		
	}
	
	@Test
	public void testA() throws Exception {
		
		UserDAOImpl bean = ctx.getBean("userDAO",UserDAOImpl.class);
		
		bean.save();
	}
	
	
	
	
}
