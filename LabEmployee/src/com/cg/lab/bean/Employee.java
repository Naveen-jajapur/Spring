package com.cg.lab.bean;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private String businessUnit;
	private int age;
	
	public SBU getSbu() {
		return sbu;
	}



	public void setSbu(SBU sbu) {
		this.sbu = sbu;
	}



	private SBU sbu;
	
	
	public int getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}



	public String getEmployeeName() {
		return employeeName;
	}



	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public double getEmployeeSalary() {
		return employeeSalary;
	}



	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}



	public String getBusinessUnit() {
		return businessUnit;
	}



	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public void getEmployeeDetails() {
		
		System.out.println("Employee ID : "+this.employeeId);
		System.out.println("Employee Name : "+this.employeeName);
		System.out.println("Employee Salary : "+this.employeeSalary);
		System.out.println("Employee BU : "+this.businessUnit);
		System.out.println("Employee Age : "+this.age);
		System.out.println(sbu);
		
	}

}
