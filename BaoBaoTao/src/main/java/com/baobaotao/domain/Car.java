package com.baobaotao.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car implements BeanFactoryAware,BeanNameAware,InitializingBean,DisposableBean{

	private String brand;
	private String color;
	private int maxSpeed;
	
	private BeanFactory beanFactory;
	private String beanName;
	
	public Car(){
		System.out.println("调用Car的构造函数！");
	}
	//beanFactoryAware
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("调用beanFactoryAware方法");
		this.beanFactory = beanFactory;
	}

	//BeanNameAware
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		System.out.println("调用BeanNameAware方法");
		this.beanName = beanName;
		
	}
	
	//DisposableBean
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("调用DisposableBean方法中");
	}
	
	//InitializingBean
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("调用InitializingBean方法");
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		System.out.println("调用setBrand()设置属性");
		this.brand = brand;
	}
	public void introduce(){
		System.out.println("brand:"+brand + ";color:"+color + ";maxSpeed" + maxSpeed);
	}
	
	public void myInint(){
		System.out.println("调用init方法");
	}
	
	public void myDestory(){
		System.out.println("调用myDestory方法");
	}


}
