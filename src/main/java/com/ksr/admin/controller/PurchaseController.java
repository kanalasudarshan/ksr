package com.ksr.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PurchaseController {
	
	@RequestMapping(value="/loadPurchase", method = RequestMethod.GET)
	public String getPurhcahsePage(){
		return "purchase";
	}

}
