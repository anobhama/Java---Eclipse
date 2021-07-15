package com.lti.lambdademo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaStream {
	public static void main(String[] args) {
		
		//creating the list and storing the values
		List<Person> per=Arrays.asList(new Person("Anu",21),
				new Person("Aji", 20));
		
		//converting into streams
		per.stream();
		
		//functional interfaces
		//per.stream().filter(predicate);
		
		//filtering the output
		List<Person> p1 =per.stream()
				.filter(p -> p.name.startsWith("A"))
				.collect(Collectors.toList());
		
		System.out.println(p1);
		
	}

}
