package com.ksr.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ksr.admin.dto.PurchaseDTO;


@Controller
public class PurchaseContoller {
	@RequestMapping(value="/loadPurchase", method = RequestMethod.GET)
	public String getPurchasePage(){
		return "purchase";
	}
	
	@RequestMapping(value="/savePurchase", method = RequestMethod.GET)
	public String savePurchase(@ModelAttribute("purchaseDTO") PurchaseDTO purchaseDTO,BindingResult bindingResult ){
		return "purchase";
	}
}
