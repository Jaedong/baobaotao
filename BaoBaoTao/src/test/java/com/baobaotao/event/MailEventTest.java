package com.baobaotao.event;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MailEventTest {

	@Test
	public void sendTest(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		MailSender mailSender = (MailSender) ac.getBean("mailSender");
		mailSender.sendMail("liyueyu@travelsky.com");
	}
	

}
