package com.cg.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.cg.beans.Users;
import com.cg.daos.UsersDao;


@Component
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	UsersDao usersDao;


	@Override
	public void insertNewUser(Users user) {
		usersDao.save(user);
		
	}
		
	
}
