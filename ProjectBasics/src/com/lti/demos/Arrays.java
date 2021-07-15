package com.lti.demos;

import java.util.Scanner;

public class Arrays {
public static void main(String[] args) {
	
	int n=0;
	System.out.println("enter the number length ");
	Scanner in = new Scanner(System.in);
	n=in.nextInt();
	int marks[]=new int[10];
	for(int i=0;i<n;i++)
	{
		System.out.println("enter the marks ");
		marks[i]=in.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		System.out.println(marks[i]);
	}
}
}
