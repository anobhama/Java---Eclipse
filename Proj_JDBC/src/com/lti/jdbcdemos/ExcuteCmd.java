//if its execute() we have to use boolean

package com.lti.jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExcuteCmd {

public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:oracle:thin:@localhost:1521/XE"; // orcl or XE or OSE
		Connection conn=DriverManager.getConnection(url,"HR","hr");
		
		try
		{
			Statement stmt = conn.createStatement();
			Boolean i =stmt.execute("insert into PRODUCTS values(1114,'Pencil',900)");
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
