package com._520it._08_cglib_proxy;

public class UserServiceImpl implements IUserService {

	@Override
	public void save(User u) {
		System.out.println("保存用户");

	}

	@Override
	public void update(User u) {

		System.out.println("更新用户");

	}

}
