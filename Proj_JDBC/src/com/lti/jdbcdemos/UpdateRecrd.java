//updating the recrd by getting it from the user

package com.lti.jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateRecrd {
public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:oracle:thin:@localhost:1521/XE"; // orcl or XE or OSE
		Connection conn=DriverManager.getConnection(url,"HR","hr");
		Scanner in=new Scanner(System.in);
		if (conn != null)
		{
		System.out.println("Connected");
		}
		
		try
		{
			//? is a placeholder
			PreparedStatement pstmt = conn.prepareStatement("update Products set PRDCOST=? where PRDID=?");
			System.out.println("Enter the prod id ");
			pstmt.setInt(2, in.nextInt());
			
			System.out.println("Enter the cost ");
			pstmt.setFloat(1, in.nextFloat());
			
			int rec=pstmt.executeUpdate();
			
			System.out.println("recrds updated "+rec);
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
