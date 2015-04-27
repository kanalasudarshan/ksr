package com.ksr.admin.controller;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ksr.admin.dto.AddressDTO;
import com.ksr.admin.dto.UserDTO;
import com.ksr.admin.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService UserService;
	
	@RequestMapping(value ="/userpage", method = RequestMethod.GET)
	public ModelAndView welcomePage() {
 
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Custom Login Form");
		model.addObject("message", "This is welcome page!");
		model.setViewName("index");
		return model;
 
	}
 
	@RequestMapping(value = "/createuser", method = RequestMethod.GET)
	public ModelAndView createUser(
			@Validated @ModelAttribute("UserDTO") UserDTO userDTO,
			@ModelAttribute("AddressDTO") AddressDTO addressDTO, BindingResult bindingResult,ModelAndView model){
		
			if (bindingResult.hasErrors()) {           
				model.setViewName("registration");
	        }
			Calendar calendar = Calendar.getInstance();
			Timestamp time= new Timestamp(calendar.getTime().getTime());
			
			addressDTO.setUserDTO(userDTO);	
			addressDTO.setCreatedDate(time);
			addressDTO.setMofiedDate(time);
			addressDTO.setIsActive(1);
			Set<AddressDTO> data=new HashSet<AddressDTO>();
			data.add(addressDTO);
			
			userDTO.setAddressDTO(data);
			userDTO.setCreatedDate(time);
			userDTO.setIsActive(1);
			userDTO.setIsDeleted(0);
			
			UserService.createUser(userDTO);		
			
			model.setViewName("login");
		
		return model;
 
	}
 
	//Spring Security see this :
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(
		@RequestParam(value = "error", required = false) String error,
		@RequestParam(value = "logout", required = false) String logout) {
 
		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}
 
		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		model.setViewName("login");
 
		return model;
 
	}
	
	@RequestMapping(value = "/registeruser", method = RequestMethod.GET)
	public ModelAndView registerUser() {
 
		ModelAndView model = new ModelAndView();		
		model.setViewName("registration");
 
		return model;
 
	}
	
}
