package com.lti.demos;

import java.util.Scanner;

public class Details {
public static void main(String[] args) {
	
	String name;
	float sal;
	
	Scanner in =new Scanner(System.in);
	System.out.println("Enter the name");
	name=in.next();
	
	System.out.println("Enter the salary");
	sal=in.nextFloat();
	
	System.out.println("Ur name is " + name );
	System.out.println("The salary entered is "+ sal);
	
	in.close();
}

}
