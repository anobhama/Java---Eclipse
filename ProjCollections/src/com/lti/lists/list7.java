//linked list
//list iterator

package com.lti.lists;

import java.util.LinkedList;
import java.util.ListIterator;

public class list7 {
	public static void main(String[] args) {
		
		LinkedList<String> lst=new LinkedList<>();
		lst.add("J");
		lst.add("A");
		lst.add("P");
		lst.add("P");
		lst.add("Y");
		
		System.out.println(lst);
		
		lst.addFirst("HI");
		System.out.println(lst);
		
		
		//works only with linked list
		ListIterator itr=lst.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}
	

}
