package com.cg.demo.bean;

public class Airtel implements Sim{
	
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
