//nested try() block

package com.lti.demos;

public class Exception6 {
	public static void main(String[] args) {
	
		try
		{
			int x = 2;
			int y = 500/x;
			System.out.println("y "+y);

		try
		{ // nested try block
			if (x==2)
			x = x/(x-x); // division by zero

			if(x==2)
			{
				int arr[]={5,20,25};
				arr[20]= 100; // generate an out-of-bounds exception
			}
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("\n Array index out of Bounds...."+e);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("\n Division by zero....."+e);
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
