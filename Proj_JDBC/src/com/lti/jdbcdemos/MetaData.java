//details on how to get the dataset info 
//get the db used info

package com.lti.jdbcdemos;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MetaData {
public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:oracle:thin:@localhost:1521/XE"; // orcl or XE or OSE
		Connection conn=DriverManager.getConnection(url,"HR","hr");
		
		Scanner in=new Scanner(System.in);
		
		if (conn != null)
		{
		System.out.println("Connected");
		}
		
		Statement stmt=null;
		try
		{

		 	  stmt = conn.createStatement();
		      String query = "select * from Products";
		      ResultSet rs = stmt.executeQuery(query);
		      
		      //methods used
		      ResultSetMetaData rsmd = rs.getMetaData();		   			     			      
		      System.out.println("no of columns in the table= "+      rsmd.getColumnCount());
		      System.out.println("Name of the first column "+        rsmd.getColumnName(1));
		      System.out.println("Type of the second column "+       rsmd.getColumnTypeName(2));
		      System.out.println("No of characters in 3rd column "+       rsmd.getColumnDisplaySize(2));	   
				
		      
		      //database info
		      DatabaseMetaData dma = conn.getMetaData();
		      
		      System.out.println("\n connected to "+ dma.getURL());
		      System.out.println(" driver "+ dma.getDriverName());
		      System.out.println(" version "+ dma.getDatabaseProductName());  
              System.out.println(" version "+ dma.getUserName()); 
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
