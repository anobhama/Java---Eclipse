package com.lti.user;

import java.sql.SQLException;
import java.util.Scanner;

import com.lti.entity.AddComponents;
import com.lti.service.ServiceLayer;


public class UserApp {
	public static void main(String[] args) throws SQLException {
		
		AddComponents ac = new AddComponents();
		ServiceLayer ml= new ServiceLayer();
		
		Scanner sc = new Scanner(System.in);
		int res = ml.emptyOrNot(ac.getConn1());
		if (res == 0) {
			System.out.println("Enter 1 to load data from a CSV file into a database");
			
			int loadData = sc.nextInt();
			final String link = "complaints.csv";
			ac.readAndAdd(link);
		}
		System.out.println("Database already contains records");
		int option=0;
		do {
			System.out.println("1. Display all records based on year\n"
					+ "2.Display by bank\n"
					+ "3.Display complaints based on the complaint id provided by the user\n"
					+ "4.Display number of days took by the Bank to close the complaint\n"
					+ "5.Display all the complaints closed/closed with explanation\n"
					+ "6.Display all the complaints which received a timely response\n"
					+ "7.Take input from user for storing new complaints\n"
					+"8.Exit");
			System.out.println("Enter an option from menu");
			option = sc.nextInt();

			switch (option) {
			case 1:System.out.println("Enter year");
			String year=sc.next();
			ml.displayByYear(year);
			break;
			case 2:System.out.println("Enter bankname");
			String bankname=sc.next();
			ml.displayBybank(bankname);
			break;
			case 3:System.out.println("cusid?");
			String custid=sc.next();
			ml.displayBycustid(custid);
			break;
			case 4:System.out.println("custid");
			String custid1=sc.next();
			int diff=ml.getDayscount(custid1);
			System.out.println(diff+" this is the difference");
			break;
			case 5:ml.ccExplaination();
			break;
			case 6:ml.timelyResponse();
			break;
			case 7:System.out.println("Enter all details");
			String[]arr=new String[14];
			for(int i=0;i<14;i++) {
				
				arr[i]=sc.next();
				
			}
			int res11=ml.insertRecord(arr);
			System.out.println(res11);
			break;
				
			}
		}while(option!=8);
	}
}
