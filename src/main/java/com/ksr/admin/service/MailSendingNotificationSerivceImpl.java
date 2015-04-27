package com.ksr.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksr.admin.dao.MailSendingNotificationDAO;
import com.ksr.util.MailSendingUtil;

@Service("mailSendingNotificationService")
public class MailSendingNotificationSerivceImpl implements MailSendingNotificationService {
	
	@Autowired
	MailSendingUtil mailSendingUtil;
	@Autowired
	MailSendingNotificationDAO mailSendingNotificationDAO;
	
	public boolean sendMailNotification(){
		
		mailSendingNotificationDAO.getUserMailDetails();
		
		mailSendingUtil.sendMail(messageDTO);
		return true;
	}
}
