package com._520it._05_wrapper;

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
