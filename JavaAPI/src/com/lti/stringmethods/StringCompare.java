package com.lti.stringmethods;

public class StringCompare {

	public static void main(String[] args) {
		
		String s1="Hi ";  
		String s2="I am Anu";
		String s4 = "Hi ";  //equal hashcode as s1
		String s3=new String("Hi");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println("************88");
		System.out.println(s1==s2); //false
		System.out.println(s1==s3);
		System.out.println(s1==s3); //false
		
		System.out.println("**** equals() *****");
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s3));
	}
}
