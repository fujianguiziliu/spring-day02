package com._520it._03_register.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {

	private Long id;
	private String username;
	private String password;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + "]";
	}
	
	
}
