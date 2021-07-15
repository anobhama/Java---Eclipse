package com.lti.user;

import com.lti.entity.IPerson;
import com.lti.entity.PermEmpImpl;
import com.lti.entity.TempEmpImpl;

public class UserApp {
	public static void main(String[] args) {
		
//cant create a obj for IPerson class 
		
		PermEmpImpl pt1=new PermEmpImpl(101,4000);
		pt1.calc();
		
		TempEmpImpl te1=new TempEmpImpl(102,40,30);
		te1.calc();
		
		IPerson ip = new PermEmpImpl();
		ip.calc();
		
		IPerson ip1 = new TempEmpImpl(103,50,50);
		ip1.calc();
	}

}
