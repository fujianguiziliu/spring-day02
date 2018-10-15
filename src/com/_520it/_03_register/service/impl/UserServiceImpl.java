package com._520it._03_register.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com._520it._03_register.mapper.UserMapper;
import com._520it._03_register.service.IUserService;
import com._520it._03_register.util.MyBatisUtil;

@Service
public class UserServiceImpl implements IUserService {

	@Override
	public void register(String username, String password) {
		SqlSession session = MyBatisUtil.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		System.out.println(mapper.getClass());
		mapper.register(username, password);
		session.commit();
		session.close();

	}

}
