package com.lti.user;

import java.util.Scanner;

import com.lti.entity.Course;
import com.lti.entity.Student;
import com.lti.service.Info;

public class Stud {
	public static void main(String[] args) {
	
		Info info = new Info();
		Scanner in = new Scanner(System.in);
		
		Student stuArr = new Student();
		Course crsArr= new Course();
		
		int choice=0;
		
		while(choice !=5)
		{
			System.out.println("Enter Your Choice");
			System.out.println("1. Student registration /n 2.Course registration /n 3. View Student details /n 4.View course details /n 5.exit");
			choice = in.nextInt();
			
			switch(choice)
			{
			case 1:
				for(int i=0;i<1;i++) {
					System.out.println("enter the details ");
					stuArr=new Student();
					System.out.println("Enter the stud id ");
					stuArr.setStudId(in.nextInt());
					System.out.println("Enter the stud name ");
					stuArr.setStudName(in.next());
					System.out.println("Enter the stud fees ");
					stuArr.setStudFees(in.nextInt());
				}
				break;
			case 2: 
				for(int i=0;i<1;i++) {
					System.out.println("enter the details ");
					crsArr=new Course();
					System.out.println("Enter the course id ");
					crsArr.setCourseId(in.nextInt());
					System.out.println("Enter the course name ");
					crsArr.setCourseName(in.next());
					System.out.println("Enter the course fees ");
					crsArr.setCourseFees(in.nextInt());
				}
				break;
			case 3:
				info.Register(stuArr);
				break;
				
			case 4:
				info.IntroCourse(crsArr);
				break;
				
			default:
				System.out.println("Exit");
			}
		}
	}
	
	
}