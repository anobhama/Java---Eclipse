package com.lti.jdbcdemos;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class InsertRecrd {
	
	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:oracle:thin:@localhost:1521/XE"; // orcl or XE or OSE
		Connection conn=DriverManager.getConnection(url,"HR","hr");
		
		try
		{
			Statement stmt = conn.createStatement();
			int i =stmt.executeUpdate("insert into PRODUCTS values(104,'Pen',500)");
			System.out.println("no of recrds added "+i);
		}
		catch(SQLException e)
		{
		System.out.println(e.getMessage());
		}
		finally
		{
		conn.close();
		}
	}

}
