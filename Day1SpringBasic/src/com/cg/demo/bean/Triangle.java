package com.cg.demo.bean;

public class Triangle {
	
	private String triangleName;
	private int type;
	
	private Point point;
	
	
	
	
	
	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public Triangle() {
		super();
	}

	public Triangle(String triangleName, int type) {
		super();
		this.triangleName = triangleName;
		this.type = type;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getTriangleName() {
		return triangleName;
	}

	public void setTriangleName(String triangleName) {
		this.triangleName = triangleName;
	}

	public void draw() {
		System.out.println(" Triangle Draw ");
		System.out.println("Name ="+this.getTriangleName());
		System.out.println("Type ="+this.getType());
		System.out.println(" X ="+this.getPoint().getX());
		System.out.println(" X ="+this.getPoint().getY());
	}

}
