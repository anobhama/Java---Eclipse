package com.lti.demos;

import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		
		int x=0,y = 0,add=0;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the 1st number");
		x=in.nextInt();
		System.out.println("enter the 2nd number");
		y=in.nextInt();
		add=x+y;
	System.out.println("The added result is " +add);
		in.close();
	}

}
