//using product.java class
//widely used in real time apps

package com.lti.maps;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
	
	public static void main(String[] args) {
		
		Product p1=new Product(101,"Mobile",40000);
		Product p2=new Product(102,"charger",80000);
		Product p3=new Product(103,"Mobile",40000);

		Map<Integer, Product> prodMap=new HashMap<Integer, Product>();
		prodMap.put(101, p1);
		prodMap.put(102, p2);
		prodMap.put(103, p3);
		
		//iterator is not for maps
		//using entry set 
		for (Map.Entry<Integer,Product> entry : prodMap.entrySet())
		{
			System.out.println(entry.getKey() + ":"+ entry.getValue());
		}
		
		
	}

}
