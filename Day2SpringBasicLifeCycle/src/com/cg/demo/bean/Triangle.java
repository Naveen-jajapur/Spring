package com.cg.demo.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle {
	
	public void draw() {
		System.out.println(" Draw Triangle");
	}

	
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Triangle Destroy method called");
		
	}
	@PostConstruct
	public void init() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Triangle Bean init method called");
		
	}

}
