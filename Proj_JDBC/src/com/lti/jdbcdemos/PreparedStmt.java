//in place of placeholder(?) it will take the user input and prepare the stmt
//stmt gets prepared as per user (dynamic)
//stmt are in pre compiled form so it is faster (parsing ->excute ->fetch)


package com.lti.jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStmt {
	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:oracle:thin:@localhost:1521/XE"; // orcl or XE or OSE
		Connection conn=DriverManager.getConnection(url,"HR","hr");
		
		try
		{
			//? is a placeholder
			PreparedStatement pstmt = conn.prepareStatement("insert into PRODUCTS values(?,?,?)");			
			
			System.out.println("Enter the details ");
			Scanner in=new Scanner(System.in);
			
			System.out.println("Enter the prod id ");
			pstmt.setInt(1, in.nextInt());
			
			System.out.println("Enter the prod name ");
			pstmt.setString(2, in.next());
			
			System.out.println("Enter the cost ");
			pstmt.setFloat(3, in.nextFloat());
			
			//updating 
			int rec=pstmt.executeUpdate();
			
			//just to know whether its updated or not
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
