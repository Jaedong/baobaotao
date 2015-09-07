package com.baobaotao.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.baobaotao.domain.Car;

public class MyBeanPostProcessor implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		if(beanName.equalsIgnoreCase("car")){
			Car car = (Car)bean;
			if(car.getMaxSpeed() >= 200){
				System.out.println("调用BeanPostProcessor.postProcessAfterInitialization方法," + "MaxSpeed调整为200");
				car.setMaxSpeed(200);
			}
			
		}
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		if(beanName.equalsIgnoreCase("car")){
			Car car = (Car)bean;
			if(car.getColor() == null){
				System.out.println("调用BeanPostProcessor.postProcessBeforeInitialization方法");
				car.setColor("黑色");
			}
			
		}
		return bean;
	}

}
