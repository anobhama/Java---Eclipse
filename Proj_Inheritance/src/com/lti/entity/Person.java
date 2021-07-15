package com.lti.entity;

public class Person {
	
	protected int pId;
	protected String pName;
	
	
	public Person(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}

	public Person() {
		super();
	}

	public int getpId() {
		return pId;
	}


	public void setpId(int pId) {
		this.pId = pId;
	}


	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}

	public void calc()
	{
		System.out.println("persons - cal() method");
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + "]";
	}
	
	

}
