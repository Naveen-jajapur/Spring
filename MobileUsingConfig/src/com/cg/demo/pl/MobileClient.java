package com.cg.demo.pl;




import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.cg.demo.bean.Mobile;
import com.cg.demo.config.config;


public class MobileClient {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(config.class);
		Mobile mobile =ctx.getBean(Mobile.class);
		mobile.makeCall();
		mobile.takePicture();

	}

}
