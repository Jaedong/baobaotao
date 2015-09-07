package com.baobaotao.anno;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.baobaotao.domain.Car;

@Component
public class Boss {
	@Autowired
	private Car car;
	
	@PostConstruct
	public void init1(){
		System.out.println("init 1");
	}
	
	@PostConstruct
	public void init2(){
		System.out.println("init 2");
	}
	
	@PreDestroy
	public void destory1(){
		System.out.println("destory 1");
	}

}
