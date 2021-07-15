package com.lti.entity;

public class Customer extends Person {

	double billAmt;
	public Customer(int pId, String pName) {
		super(pId, pName);
	}
	
	public Customer()
	{
		super();
	}
	
	public void calc()
	{
		System.out.println("customer - cal() method");
	}
	@Override
	public String toString() {
		return "Customer [ pId "+ pId+ "name "+ pName+"billAmt" + billAmt + "]";
	}
	

}
