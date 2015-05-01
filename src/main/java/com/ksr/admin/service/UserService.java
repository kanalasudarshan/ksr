package com.ksr.admin.service;

import java.util.List;

import com.ksr.admin.dto.UserDTO;

public interface UserService {
	public String createUser(UserDTO userDTO);
	public List<Object> getAllUsers();
}
