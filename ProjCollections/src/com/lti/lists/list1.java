//heterogenous data

package com.lti.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class list1 {
	public static void main(String[] args) {
		
		List myList = new ArrayList();
		myList.add("Anu");
		myList.add(170801008);
		myList.add(100.99);
		myList.add("japs");
		myList.add(null);
		myList.add("Anu"); // dup allowed , order maintained
		
		System.out.println(myList);
		
		myList.remove(2); //110.99 (using index)
		
		System.out.println(myList);
		
		myList.remove(null); 
		myList.remove("Anu"); //only 1st name will be removed
		
		System.out.println(myList);
		
	}

}
