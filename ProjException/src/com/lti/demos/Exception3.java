//multiple catch() 

package com.lti.demos;

public class Exception3 {
	public static void main(String[] args) {
		
		int x=15,y=5,a=5,z;
		int arr[] = {10,5};
		try
		{
		//int b = arr[1]/5;
		int b = arr[7]/5;
		z = 500/10; //exception
		System.out.println("z:" + z);
		//System.out.println(" This will not be Executed if error occurs");
		}
		catch(ArithmeticException e)
		{
			System.out.println(" number cant be divided by 0");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array going out of index");
		}
		
		catch(Exception e)
		{
			System.out.println("Exception throwed");
		}
	}

}
