package com.baobaotao.event;

import org.springframework.context.ApplicationListener;

public class MailSendListener implements ApplicationListener<MailSendEvent>{

	public void onApplicationEvent(MailSendEvent mailSendEvent) {
		// TODO Auto-generated method stub
		System.out.println("发送邮件" + mailSendEvent.getTo());
		
	}
	

}
