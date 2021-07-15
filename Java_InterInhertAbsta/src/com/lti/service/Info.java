package com.lti.service;

import com.lti.entity.StudDetails;

public class Info {
	
	public void Display(StudDetails s)
	{
		System.out.println("Displayed "+ s);
	}
	
	public void Display(StudDetails s[])
	{
		for(int i=0;i<2;i++)
		{
			System.out.println(s[i]);
		}
	}

}
