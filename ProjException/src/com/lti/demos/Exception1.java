//unchecked exception - at run time 

package com.lti.demos;

public class Exception1 {
	
	public static void main(String[] args) {
		
		int k=1000;
		try
		{
		int i=0;
		int j=500/i;
		System.out.println("j "+j);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cant be divided by 0");
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("k "+k);
	}

}
