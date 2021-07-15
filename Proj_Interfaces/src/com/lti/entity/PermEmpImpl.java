package com.lti.entity;

//ms office has abstract class for save as 
//wrd , excel,ppt will implement and wrk on it

public class PermEmpImpl implements IPerson{
	
	private int permEmpId;
	private double basicSal;
	
	
	public PermEmpImpl() {
		super();
	}

	public PermEmpImpl(int permEmpId, double basicSal) {
		super();
		this.permEmpId = permEmpId;
		this.basicSal = basicSal;
	}

	public int getPermEmpId() {
		return permEmpId;
	}


	public void setPermEmpId(int permEmpId) {
		this.permEmpId = permEmpId;
	}


	public double getBasicSal() {
		return basicSal;
	}


	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}


	@Override
	public void calc() {
	
		double tSal=basicSal + 500;
		System.out.println("perm emp sal " + tSal);
	}


	@Override
	public String toString() {
		return "PermEmpImpl [permEmpId=" + permEmpId + ", basicSal=" + basicSal + "]";
	}

	
}
