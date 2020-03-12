package com.cg.lab.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		Employee employee =(Employee)ctx.getBean("emp");
		System.out.println("Employee Details");
		System.out.println("------------------------------");
		employee.getEmployeeDetails();

	}

}
