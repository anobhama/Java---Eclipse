//generics
//define the specific datatype

package com.lti.lists;

import java.util.ArrayList;
import java.util.List;

public class list4 {
	public static void main(String[] args) {
		
		int no=100;
		Integer iobj=new Integer(no); //wrapper class
		int i=iobj.intValue();
		
		List<String> myList = new ArrayList();
		myList.add("Anu");
		myList.add("japs");
		myList.add(null);
		myList.add("Aji");
		
		System.out.println(myList);
	}

}
