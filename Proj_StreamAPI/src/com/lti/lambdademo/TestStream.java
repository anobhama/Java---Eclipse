//lambdas implement function interfaces by own
//implement annonymous classes
//wrks with streams 


package com.lti.lambdademo;

public class TestStream {
	public static void main(String[] args) {
		
		//interface usage for finding largest no
		//MaxFinderImpl mf1=new MaxFinderImpl();
		//double max=mf1.maximum(10,20);
		//System.out.println(max);
		
		//doing without MaxFinderImpl.java
		
		MaxFinder mf=(num1,num2)-> num1>num2 ? num1:num2;
		
		double max=mf.maximum(1000, 600);
		System.out.println(max);
	}

}
