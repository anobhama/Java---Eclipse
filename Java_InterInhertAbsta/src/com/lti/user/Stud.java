package com.lti.user;

import java.util.Scanner;

import com.lti.entity.StudDetails;
import com.lti.service.Info;

public class Stud {
	public static void main(String[] args) {
		
		StudDetails s1=new StudDetails(100,"Anu",50000);
		
		Info info = new Info();
		info.Display(s1);
		
		StudDetails[] stuArr=new StudDetails[2];
		Scanner in = new Scanner(System.in);
		for(int i=0;i<2;i++) {
			//alternate to write in single line
			//stuArr[i]=new StudDetails(in.nextInt(),in.nextLine(),in.nextInt());
			System.out.println("enter the details ");
			stuArr[i]=new StudDetails();
			stuArr[i].setStudId(in.nextInt());
			stuArr[i].setStudName(in.next());
			stuArr[i].setStudFees(in.nextInt());
		}
		info.Display(stuArr);
		/*StudDetails stud1=new StudDetails();
		 * System.out.println(stud1);
		 * 
		 * StudDetails stud2=new StudDetails(111,"Anu",20000.00f);
		 * System.out.println(stud2);
		 * 
		 * StudDetails stud3=new StudDetails(); stud3.setStudId(101);
		 * stud3.setStudName("Aji"); stud3.setStudFees(200000.05f);
		 * System.out.println(stud3.getStudId()); System.out.println(stud3);
		 */
	}

}
