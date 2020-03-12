package com.cg.demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Airtel implements Sim{
	
	@Value("calling from airtel sim")
	String str ;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public void makeCall() {
		System.out.println(str);
		
	}

}
