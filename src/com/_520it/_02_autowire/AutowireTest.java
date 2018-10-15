package com._520it._02_autowire;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class AutowireTest {

	@Autowired
	private ApplicationContext ctx;
	@Test
	public void testAutowire() throws Exception {
		Employee e = ctx.getBean("e1",Employee.class);
		System.out.println(e);
	
		
		
	}	
}
