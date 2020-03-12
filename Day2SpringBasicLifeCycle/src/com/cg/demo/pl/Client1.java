package com.cg.demo.pl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.demo.bean.Employee;

public class Client1 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		Employee employee =(Employee)ctx.getBean("emp");
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getEmployeeName());
		employee.getSkill().stream().forEach(p->System.out.println(p));

	}

}
