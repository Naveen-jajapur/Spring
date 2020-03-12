package com.cg.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Triangle {
	
	@Autowired
	Point point1;
	
	
	public Point getPoint1() {
		return point1;
	}
	public void setPoint1(Point point1) {
		this.point1 = point1;
		System.out.println(" Setter Injection");
	}
	public Triangle(Point point1) {
		super();
		this.point1 = point1;
		System.out.println(" Constructor Injection");
	}
	public Triangle() {
		super();
	}
	
	public void draw() {
		System.out.println(" Triangle draw");
		System.out.println(" x ="+point1.getX());
		System.out.println(" y ="+point1.getY());
	}
	

}
