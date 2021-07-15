package com.lti.entity;

public class Employee {
	
	private int empId;
	private String empName;
	private float empSal;
	private String companyName;
	
	public Employee() {
		super();
	}

	public Employee(int empId, String empName, float empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.companyName="LTI";
	}

	public float Tot_sal()
	{
		float hra=1000.00f;
    	float ta=2000.00f;
    	float tax= empSal* 0.10f;
    	float tSal=empSal + hra+ta-tax;
    	//System.out.println("Ttal Salary : "+tSal);
    	return (float)tSal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", companyName="
				+ companyName + "]";
	}

}
	
