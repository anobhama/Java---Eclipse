package com.lti.entity;

public class Student {

	private int studId;
	private String studName;
	private double studFees;
	private String clgName="SVCE";
	
	public Student() {
		super();
	}

	public Student(int studId, String studName, double studFees) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studFees = studFees;
		this.clgName = "SVCE";
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public double getStudFees() {
		return studFees;
	}

	public void setStudFees(float studFees) {
		this.studFees = studFees;
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studFees=" + studFees + ", clgName="
				+ clgName + "]";
	}
	
}
