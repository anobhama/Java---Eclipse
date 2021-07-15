//making the code short using lambda
//searching and printing the details

package com.lti.lambdademo;

import java.util.*;

public class AfterJava8 {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
	            new Person("Jay", 30),
	            new Person("Vijay", 20),
	            new Person("Sanjay", 40)
	    );

	    Person result1 = persons.stream()                        // Convert to steam
	            .filter(x -> "Anu".equals(x.getName()))        // we want "jack" only
	            .findAny()                                      // If 'findAny' then return found
	            .orElse(null);                                // If not found, return null 	

	    System.out.println(result1);
	}

}
