package com.lti.user;

import com.lti.entity.Employee;

public class EmpTota {
	public static void main(String[] args) {
		
		/*we dont use bec validation is done b4 this
		 * Employee emp1=new Employee(); System.out.println(emp1.Tot_sal());
		 * System.out.println(emp1);
		 */
		Employee emp2=new Employee(101,"Anu",3000.00f);
		System.out.println(emp2.Tot_sal());
		System.out.println(emp2);
	}

}
