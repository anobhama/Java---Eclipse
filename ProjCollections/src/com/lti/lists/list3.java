//wrapper class
//convert primitive to non primitive datatype
//autoboxing

package com.lti.lists;

import java.util.ArrayList;
import java.util.List;

public class list3 {
	public static void main(String[] args) {
		
		int no=100;
		Integer iobj=new Integer(no); //wrapper class
		int i=iobj.intValue();
		
		List myList = new ArrayList();
		myList.add("Anu");
		myList.add(170801008);
		myList.add(100.99);
		myList.add(iobj); //autoboxing
		myList.add("japs");
		myList.add(null);
		myList.add("Anu");
		
		System.out.println(myList);
	}

}
