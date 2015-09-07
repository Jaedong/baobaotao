package com.baobaotao.processor;

import java.beans.PropertyDescriptor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter{

	@Override
	/**
	 * 接口方法：实例化bean之后进行调用
	 */
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		if("car".equalsIgnoreCase(beanName)){
			System.out.println("MyInstantiationAwareBeanPostProcessor.postProcessAfterInstantiation");
		}
		return true;
	}

	@Override
	/**
	 * 接口方法：实例化bean前进行调用
	 */
	public Object postProcessBeforeInstantiation(Class beanClass, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		if("car".equalsIgnoreCase(beanName)){
			System.out.println("MyInstantiationAwareBeanPostProcessor.postProcessBeforeInstantiation");
			System.out.println(beanClass.getName());
		}
		return null;
	}

	@Override
	/**
	 * 接口方法：在设置某个属性时候调用
	 */
	public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean,
			String beanName) throws BeansException {
		// TODO Auto-generated method stub
		if("car".equalsIgnoreCase(beanName)){
			System.out.println("MyInstantiationAwareBeanPostProcessor.postProcessPropertyValues");
		}
		return pvs;
	}

}
