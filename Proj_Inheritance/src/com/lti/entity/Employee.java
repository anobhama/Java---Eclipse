package com.lti.entity;

public class Employee extends Person {
	
	double basicSal;

	
	public Employee() {
		super();
	}

	public Employee(int pId, String pName) {
		super(pId, pName);
	}

	public Employee(int pId, String pName, double basicSal) {
		super(pId, pName);
		this.basicSal = basicSal;
	}

	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	public void calc()
	{
		//accessing the method of parent class
		//super.calc();
		double tSal=(double) (basicSal+500);
		System.out.println("employee - cal() method" + tSal);
	}
	
	@Override
	public String toString() {
		return "Employee [ pId  "+pId+ "name "+pName+ "basicSal" + basicSal + "]";
	}
}
