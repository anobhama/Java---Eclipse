package com.lti.user;

import java.util.Scanner;

import com.lti.methods.Excel;

public class UserAppExcel {
	public static void main(String[] args) {
		
		Excel ws = new Excel();
		int num1=0,num2=0,res;
		Scanner in=new Scanner(System.in);
		//System.out.println("Enter the 1st number ");
		num1=in.nextInt();
		//System.out.println("Enter the 2nd number");
		num2=in.nextInt();
		res=ws.Sum(num1,num2);
		System.out.println("sum "+res);
		in.close();
	}

}
