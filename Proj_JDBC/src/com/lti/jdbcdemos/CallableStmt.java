//calling the procedure 

package com.lti.jdbcdemos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableStmt {
	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:oracle:thin:@localhost:1521/XE"; // orcl or XE or OSE
		Connection conn=DriverManager.getConnection(url,"HR","hr");
		Scanner in=new Scanner(System.in);
		CallableStatement cstmt=null;
		
		if (conn != null)
		{
		System.out.println("Connected");
		}
		
		try
		{
			cstmt =conn.prepareCall("{ call getProductName(?,?)}");
			//input parameters of procedure
			//cstmt.setInt(1, 1111);  
			//user input
			System.out.println("Enter the prod id");
			cstmt.setInt(1, in.nextInt());
			
			//output paramater of procedure 
			//output is strin so varchar is used
			cstmt.registerOutParameter(2,java.sql.Types.VARCHAR);
			
			//executing
			cstmt.executeUpdate();
			
			//printing the output
			String prdName=cstmt.getNString(2);
			System.out.println(prdName);
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
