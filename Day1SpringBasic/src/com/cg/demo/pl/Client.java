package com.cg.demo.pl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.demo.bean.Triangle;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		Triangle triangle1 =(Triangle) ctx.getBean("trg");
		
		Triangle triangle2 =ctx.getBean("sample",Triangle.class);
		
		if(triangle1==triangle2) 
			System.out.println(" singleton ");
			else
				System.out.println(" prototype ");
		
//		triangle1.draw();
//		triangle2.draw();

	}

}
