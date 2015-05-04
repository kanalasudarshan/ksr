package com.ksr.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ksr.admin.dto.PaymentDTO;

@Controller
public class PaymentContoller {
	
	@RequestMapping(value="/loadPayment", method = RequestMethod.GET)
	public String getPaymentPage(){
		return "payment";
	}
	
	@RequestMapping(value="/savePayment", method = RequestMethod.GET)
	public String savePayment(@ModelAttribute("paymentDTO") PaymentDTO paymentDTO,BindingResult bindingResult ){
		return "payment";
	}
}
