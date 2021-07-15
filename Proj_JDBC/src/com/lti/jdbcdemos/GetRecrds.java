package com.lti.jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class GetRecrds {
	
	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:oracle:thin:@localhost:1521/XE"; // orcl or XE or OSE
		Connection conn=DriverManager.getConnection(url,"HR","hr");

		if (conn != null)
		{
		System.out.println("Connected");
		}
		
		//to run the sql cmd, statement is created
		Statement stmt = conn.createStatement();
		
		//sql from executeQuery is send to rs which is a java obj 
		ResultSet rs =stmt.executeQuery("Select * from Products");
		
		//storing the data to display it  
		while(rs.next())
		{
			int id=rs.getInt("PRDID");
			String name= rs.getString("PRDNAME");
			float cost = rs.getFloat("PRDCOST");
			System.out.println(id+" " + name+ " "+cost);
		}
		
		System.out.println("closing the connection");
		conn.close();
	}

}
