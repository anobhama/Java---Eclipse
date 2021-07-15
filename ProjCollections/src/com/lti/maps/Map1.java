//hash maps

package com.lti.maps;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
	public static void main(String[] args) {
	
		Map<String, String> mailId = new HashMap<String, String>();
		mailId.put("anobhama99@gmail.com","pswrd1");
		mailId.put("anobhama99@gmail.com","japs"); //pswrd changed
		mailId.put("anobhama@gmail.com","pswrd2");
		mailId.put("ano@gmail.com","pswrd2");
		
		System.out.println(mailId);
}
}
