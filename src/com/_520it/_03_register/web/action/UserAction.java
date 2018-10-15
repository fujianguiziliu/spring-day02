package com._520it._03_register.web.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import lombok.Setter;

import com._520it._03_register.service.IUserService;

@Setter
@Controller
@Scope("prototype")
public class UserAction {

	@Autowired
	private IUserService userService ;
	
	private String username ="admin";
	private String password ="123456";
	
	public void register(){
		
		userService.register(username, password);
	
	}
}
