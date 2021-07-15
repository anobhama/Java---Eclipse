package com.lti.stringmethods;

public class StringDemo {
	public static void main(String[] args) {
		
		String Str = new String("Aelxander");   
	 	 
	       //first way of implementation
	        System.out.print("The extracted substring: "); 
	               
	        //2nd way of implementation 
	        System.out.println(Str.substring(1,4));	
		
		String strings[]={"started","starting","ended","ending"};
		
 
	   for (int i=0 ;i <strings.length; i++ )
	   {
	   if(strings[i].startsWith("st"))
		   System.out.println(strings[i] + "  starts with st");
	   }
	   
	System.out.println("=================");
	  
	for (int i=0 ;i <strings.length; i++ )
	   {
	   if(strings[i].startsWith("art",2))
		   System.out.println(strings[i] + "   art at position 2");
	   }
	
	System.out.println("=================");
	
	for (int count=0 ;count <strings.length; count++ )
	   {
	   if(strings[count].endsWith("ed"))
		   System.out.println(strings[count] + "  ends with ed");
	   }
	}

}
