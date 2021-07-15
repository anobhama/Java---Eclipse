//natural sorting

package com.lti.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserApp {
	public static void main(String[] args) {
		
		Employee e1= new Employee(105,"Anu",4000);
		Employee e2= new Employee(101,"Aji",9000);
		Employee e3= new Employee(103,"Asu",6000);
		
		List myList = new ArrayList();
		
		myList.add(4000);
		myList.add(1000);
		myList.add(3000);
		
		System.out.println(myList);
		
		//sorting
		Collections.sort(myList);
		System.out.println(myList);
		
		//for employee.java 
		List<Employee> myList1 = new ArrayList();
		
		myList1.add(e1);
		myList1.add(e2);
		myList1.add(e3);
		
		System.out.println(myList1);
		
		//natural sorting
		//error comes so implement comparable in employee.java
		Collections.sort(myList1);
		System.out.println(myList1);
		
		//sorting by sal
		Collections.sort(myList1,new EmpSortBySal());
		System.out.println(myList1);
	}

}
