//strings are immutable
//string buffer - drawback:
//thread safe / synchronized

package com.lti.stringmethods;

public class StringImmutable {
	public static void main(String[] args) {
		
		String s1="Hi ";  //String s1=new String("hi");
		String s2="I am Anu";
		
		//concatenation
		String s3=s1+s2;
		System.out.println(s3);
		System.out.println(s1+s2);
		
		s1.concat(s2);
		System.out.println(s1);// immutable so value of s1 will not chmage even of u concat
		
		String s4=s1.concat(s2);
		System.out.println(s4);
		
		System.out.println("****************");
		//string buffer
		System.out.println("String buffer");
		StringBuffer sb=new StringBuffer("Hi ");
		sb.append("Im Anu");
		System.out.println(sb);
		
		System.out.println("****************");
		
		System.out.println("String builder");
		StringBuilder sb1=new StringBuilder("Hi ");
		sb1.append("Im Anu");
		System.out.println(sb1);
		
		System.out.println("****************");
	}

}
