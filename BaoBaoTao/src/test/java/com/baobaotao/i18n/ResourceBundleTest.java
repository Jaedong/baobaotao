package com.baobaotao.i18n;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResourceBundleTest {

	public static void main(String[] args) {
		String [] configs = {"/applicationContext.xml"};
		ApplicationContext ac = new ClassPathXmlApplicationContext(configs);
		MessageSource ms= (MessageSource)ac.getBean("myResource");
		System.out.println(ms);
		String str = ms.getMessage("com.lyu.en_name", null, Locale.US);
		System.out.println(str);
		
	}
}
