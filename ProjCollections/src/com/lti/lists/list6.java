//accessing student.java and book.java
//iterator is used to print all the array list
//iterator is fail fast behaviour

package com.lti.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class list6 {
	
public static void main(String[] args) {
		
		List myList=new ArrayList(); //only stud can be done not the book 
		
		Student s1=new Student(101,"Anu",1000);
		Student s2=new Student(102,"Aji",1000);
		Student s3=new Student(103,"Asu",1000);
		
		Book b1=new Book(1111,"Java",2000);
		myList.add(s1);
		myList.add(s2);
		myList.add(s3);
		myList.add(b1);
		myList.add(s2);
		
		//System.out.println(myList);
		
		myList.remove(s2);
		
		//for each loop
		//rarely used
		for(Object o:myList)
		{
				System.out.println(o);
		}
		
		//commonly used is iterator
		//cursors in collections (fast)
		//used for all collections
		Iterator itr=myList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
