package com.cg.demo.pl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.demo.bean.Triangle;
import com.cg.demo.config.BeanConfig;

public class Client {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
		Triangle triangle = ctx.getBean(Triangle.class);
		triangle.draw();
	}

}
