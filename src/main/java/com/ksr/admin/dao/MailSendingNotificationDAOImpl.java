package com.ksr.admin.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("mailSendingNotificationDAO")
public class MailSendingNotificationDAOImpl extends BaseDAOImpl implements MailSendingNotificationDAO {

	
	public List<Object> getUserMailDetails(){	
		
		return selectHQLQuery("from UserDTO");
	}

}
