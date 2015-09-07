package com.baobaotao.beanFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.baobaotao.domain.Car;
import com.baobaotao.domain.MapListSetProperties;
import com.baobaotao.processor.MyBeanPostProcessor;
import com.baobaotao.processor.MyInstantiationAwareBeanPostProcessor;

public class BeanLifeCycle {
	
	private static void LifeCycleLnBeanFactory(){
		Resource resource = new ClassPathResource("/applicationContext.xml");
		BeanFactory bf = new XmlBeanFactory(resource);
		//添加后置处理器
		((ConfigurableBeanFactory)bf).addBeanPostProcessor(new MyBeanPostProcessor());
		((ConfigurableBeanFactory)bf).addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());
		
		Car car1 = (Car) bf.getBean("car");
		car1.introduce();
		car1.setColor("红色");
		
		Car car2 = (Car) bf.getBean("car");
		System.out.println("car1 == car2:" + (car1 == car2) );
		
		//关闭容器
		((XmlBeanFactory)bf).destroySingletons();
		
	}
	
	public static void main(String[] args) {
		//BeanLifeCycle.LifeCycleLnBeanFactory();
		//ApplicationContext ac = new ClassPathXmlApplicationContext(configLocations, parent);
		Resource resource = new ClassPathResource("/applicationContext.xml");
		BeanFactory bf = new XmlBeanFactory(resource);
		
		MapListSetProperties mapListSetProperties = (MapListSetProperties) bf.getBean("mapListSetProperties");
		System.out.println(mapListSetProperties.getMyList().size());
		System.out.println(mapListSetProperties.getProperties().size());
		System.out.println(mapListSetProperties.getMySet().toArray());
	}

}
