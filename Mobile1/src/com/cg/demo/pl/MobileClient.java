package com.cg.demo.pl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.demo.bean.Mobile;


public class MobileClient {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		Mobile mobile =(Mobile)ctx.getBean("mobile");
		mobile.makeCall();
		mobile.takePicture();

	}

}
