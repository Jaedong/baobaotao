package com.baobaotao.fb;

import org.springframework.beans.factory.FactoryBean;

import com.baobaotao.domain.Car;

public class CarFactoryBean implements FactoryBean<Car>{
	
	private String carInfo;

	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.setBrand(carInfo.split(",")[0]);
		car.setMaxSpeed(Integer.parseInt(carInfo.split(",")[1]));
		car.setPrice(Double.parseDouble(carInfo.split(",")[2]));
		return car;
	}

	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getCarInfo() {
		return carInfo;
	}

	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}

}
