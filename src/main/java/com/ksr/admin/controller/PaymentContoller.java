package com.ksr.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PaymentContoller {
	
	@RequestMapping(value="/loadPayment", method = RequestMethod.GET)
	public String getPaymentPage(){
		return "payment";
	}
}
