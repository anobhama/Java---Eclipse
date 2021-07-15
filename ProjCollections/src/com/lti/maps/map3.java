//hash code
//set usage - no duplicate is allowed
//to remove duplicate, hashcode () and equals() are added in product.java
//tree set- by default ordered
package com.lti.maps;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class map3 {
	
	public static void main(String[] args) {
		
		Product p1=new Product(101,"Mobile",40000);
		Product p2=new Product(102,"charger",80000);
		Product p3=new Product(101,"Mobile",40000); //its same
		Product p4=new Product(103,"mobile",90000);//it executes 
	
		//cross check with prod id
		//hash set
		//Set<Product> mySet = new HashSet<>();
		
		//tree set
		//sorted order
		Set<Product> mySet = new TreeSet();
		
		mySet.add(p1);
		mySet.add(p2);
		mySet.add(p3);
		mySet.add(p4);
		//mySet.add(p1); //duplicate (omited)
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		System.out.println(p4.hashCode());
		
		System.out.println(mySet);
	}

}
