//checked exception - at compile time

package com.lti.demos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exception2 {

	public static void main(String[] args) {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
	}
}
