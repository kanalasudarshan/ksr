package com.ksr.admin.dao;

import java.util.List;

import com.ksr.admin.dto.UserDTO;

public interface  UserDAO{

	//public UserDTO getUserDataBaseOnUserName(String userName);
	
	public String createUser(UserDTO userDTO);
	public List<Object> getAllUsers();
}
