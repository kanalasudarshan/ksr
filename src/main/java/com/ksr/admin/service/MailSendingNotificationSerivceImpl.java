package com.ksr.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.ksr.admin.dao.MailSendingNotificationDAO;
import com.ksr.admin.dto.MessageDTO;
import com.ksr.admin.dto.UserDTO;
import com.ksr.util.MailSendingUtil;

@Service("mailSendingNotificationService")
public class MailSendingNotificationSerivceImpl implements MailSendingNotificationService {
	
	@Autowired
	MailSendingUtil mailSendingUtil;
	@Autowired
	MailSendingNotificationDAO mailSendingNotificationDAO;
	
	//@Scheduled(cron = "0 0 9-17 * * MON-FRI")
	@Scheduled(cron = "5 * * * * *")
	public boolean sendMailNotification(){
		
		List<Object> userList=mailSendingNotificationDAO.getUserMailDetails();	
		for(Object obj:userList){
			UserDTO userDTO=(UserDTO)obj;
			MessageDTO messageDTO=new MessageDTO();
			messageDTO.setSendTo(userDTO.getUserName());
			messageDTO.setSubject("KSR Mail");
			messageDTO.setMessage("Test mail do not reply... ");
			mailSendingUtil.sendMail(messageDTO);
		}
		return true;
	}
}
