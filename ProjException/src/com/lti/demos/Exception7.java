//user defined exception

package com.lti.demos;

class MyOwnException extends Exception{
	@Override
	public String getMessage() {
		System.out.println("Please enter number within range");
		return super.getMessage();
	}
}

public class Exception7 {
	public static void main(String[] args) {
		
		int n1=100;
		int n2=10;
		int res=0;
		
		try {
			res = calcDiv(n1,n2);
			System.out.println(res);
			} 
		catch(MyOwnException e) {
				System.out.println("Please check n2 value, might be zero");
			}
			System.out.println("Program continues");
		}
		
		public static int calcDiv(int num1, int num2) throws MyOwnException
		{
			
			if(num2 == 0) {
				throw new MyOwnException();  //new Object gets created by JVM of user-defined class
			} else {
				return num1/num2;
			}	
	}
}
