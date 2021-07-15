package com.lti.user;

import com.lti.entity.Customer;
import com.lti.entity.Employee;
import com.lti.entity.Person;

public class UserApp {
	
	public static void main(String[] args) {
		
		//parent class
		Person p1=new Person(100,"Anu");
		System.out.println(p1);
		
		System.out.println("**********");
		//child class
		Employee emp1=new Employee(101,"Aji");
		emp1.setBasicSal(9000);
		System.out.println(emp1);
		//System.out.println(emp1.getpId());
		//System.out.println(emp1.getpName());
		//System.out.println(emp1.getBasicSal());
		emp1.calc();
		
		System.out.println("**********");
		
		Customer cus1=new Customer();
		System.out.println("Cus 1 "+cus1);
		cus1.calc();
		
		System.out.println("**********");
		
		Customer cus2=new Customer();
		cus2.setpId(709); //from the parent class
		System.out.println(cus2.getpId());
	}

}
