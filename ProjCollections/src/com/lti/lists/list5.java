//accessing student.java and book.java

package com.lti.lists;

import java.util.ArrayList;
import java.util.List;

public class list5 {
	
public static void main(String[] args) {
		
	//generics
		List<Student> myList=new ArrayList<Student>(); //only stud can be done not the book 
		
		Student s1=new Student(101,"Anu",1000);
		Student s2=new Student(102,"Aji",1000);
		Student s3=new Student(103,"Asu",1000);
		
		Book b1=new Book(1111,"Java",2000);
		myList.add(s1);
		myList.add(s2);
		myList.add(s3);
//		myList.add(b1);
		myList.add(s2);
		
		//System.out.println(myList);
		
		myList.remove(s2);
		//System.out.println(myList);
		
		/*
		 * for (Student s:myList) { System.out.println(s); }
		 */
		
		for(Student s:myList)
		{
			if(s.getStuName()=="Anu")
			{
				System.out.println(s);
			}
		}
	}

}
