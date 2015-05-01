package com.ksr.admin.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ksr.admin.dto.UserDTO;


@Component("userDAO")
public class UserDAOImpl extends BaseDAOImpl implements UserDAO{
	
	/*@Override
	public UserDTO getUserDataBaseOnUserName(String userName){
		return selectHQLQuery("From UserEntity");
	}*/

	public String createUser(UserDTO userDTO){
		
		insertCriteriaQuery(userDTO);
		insertCriteriaQuery(userDTO.getAddressDTO());
		return "User create successfully";
	}
	
	public List<Object> getAllUsers(){
		return selectHQLQuery("From UserDTO");
		
	}
}
