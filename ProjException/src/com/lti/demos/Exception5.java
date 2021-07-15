//finally block usage

package com.lti.demos;

public class Exception5 {
	public static void main(String[] args) {
	
		int arr[] = {10,5};
		int a = 5;

		try
		{
		arr[0]=100;
		int b = arr[0]/10;
		int c = arr[0]/0;
		System.out.println(c);
		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("Finally executed");
	}
	}
}
