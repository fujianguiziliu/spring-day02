package com._520it._09_aop;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration

public class UserServiceTest {

	@Autowired
	private IUserService userService ;
	@Test
	public void testSave() throws Exception {
		System.out.println(userService.getClass());
		User u = new User();
		userService.save(u);
		
	}
}
