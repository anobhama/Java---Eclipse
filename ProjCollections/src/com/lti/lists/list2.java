package com.lti.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list2 {
	
	public static void main(String[] args) {
		
	List myList=new ArrayList();
	myList.add("Anu");
	myList.add("Aji");
	myList.add("Tilak");
	myList.add("Asu");
	myList.add(null);
	myList.add("Anu");
	
	System.out.println(myList);
	System.out.println(myList.get(2));
	
	myList.remove(4);
	System.out.println(myList);
	
	myList.remove("Anu"); //only 1st occurance is removed
	System.out.println(myList);
	
	//sorting
	Collections.sort(myList);
	System.out.println(myList);
	}

}
