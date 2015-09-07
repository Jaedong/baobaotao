package com.baobaotao.beanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baobaotao.domain.Car;
import com.baobaotao.fb.CarFactoryBean;

public class BeanFactoryTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("/applicationContext.xml");
		Car car = (Car) ac.getBean("carFactoryBean");
		//Car car = carFactoryBean.getObject();
		System.out.println(car.getBrand() + "   " + car.getMaxSpeed() + "    " + car.getPrice());
	}

}
