package com.baobaotao.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MailSender implements ApplicationContextAware{
	private ApplicationContext applicationContext;
	public void setApplicationContext(ApplicationContext ApplicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.applicationContext = ApplicationContext;
	}
	
	public void sendMail(String to){
		System.out.println("MailSender发送邮件");
		MailSendEvent mailSendEvent = new MailSendEvent(applicationContext, to);
		applicationContext.publishEvent(mailSendEvent);
	}

}
