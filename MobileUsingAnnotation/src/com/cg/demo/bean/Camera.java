package com.cg.demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	
	@Value("took picture")
	String str;
	public void takePicture() {
		System.out.println(str);
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
}
