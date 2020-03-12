package com.cg.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	
	@Autowired
	private Sim sim;
	@Autowired
	private Camera camera ;
	
	
	public Sim getSim() {
		return sim;
	}


	public void setSim(Sim sim) {
		this.sim = sim;
	}


	public Camera getCamera() {
		return camera;
	}


	public void setCamera(Camera camera) {
		this.camera = camera;
	}


	public void makeCall() {
		
		sim.makeCall();
		
	}
	public void takePicture() {
		camera.takePicture();
	}

}
