package com.ksr.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksr.admin.dao.UserDAO;
import com.ksr.admin.dto.UserDTO;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDAO userDAO;
	
	@Override
	public String createUser(UserDTO userDTO){
		return userDAO.createUser(userDTO);
	}

}
