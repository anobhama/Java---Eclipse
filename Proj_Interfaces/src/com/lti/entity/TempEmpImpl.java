package com.lti.entity;

public class TempEmpImpl implements IPerson{


	private int tempEmpId;
	private double salPerDay;
	private int nodays;
	
	
	public TempEmpImpl() {
		super();
	}

	public TempEmpImpl(int tempEmpId, double salPerDay, int nodays) {
		super();
		this.tempEmpId = tempEmpId;
		this.salPerDay = salPerDay;
		this.nodays = nodays;
	}


	public int getTempEmpId() {
		return tempEmpId;
	}

	public void setTempEmpId(int tempEmpId) {
		this.tempEmpId = tempEmpId;
	}

	public double getSalPerDay() {
		return salPerDay;
	}

	public void setSalPerDay(double salPerDay) {
		this.salPerDay = salPerDay;
	}

	public int getNodays() {
		return nodays;
	}

	public void setNodays(int nodays) {
		this.nodays = nodays;
	}

	@Override
	public void calc() {
		
	double tSal=salPerDay+ nodays;
	System.out.println("total sal for temp emp "+tSal);
	}

	@Override
	public String toString() {
		return "TempEmpImpl [tempEmpId=" + tempEmpId + ", salPerDay=" + salPerDay + ", nodays=" + nodays + "]";
	}

	
}
