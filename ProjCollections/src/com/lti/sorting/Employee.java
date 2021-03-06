package com.lti.sorting;

public class Employee implements Comparable<Employee>{
	
	int empId;
	String empName;
	double empSal;
	
	public Employee() {
		super();
	}

	public Employee(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}


	@Override
	public int compareTo(Employee o) {
		
		if (o.getEmpId() == this.getEmpId()) {
			return 0;
		} else if (o.getEmpId() < this.getEmpId()) {
			return 1;
		} else {
			return -1;
		}

	}
	
	@Override
	public String toString() {
		return "Employee \n [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]\n";
	}

	
	

}
