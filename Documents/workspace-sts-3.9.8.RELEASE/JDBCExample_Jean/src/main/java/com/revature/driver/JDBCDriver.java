package com.revature.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDriver {
	
	
	private static String username = "jeanmil";
	private static String url = "jdbc:postgresql://jean-mil.cxcb5hubgxwh.us-east-2.rds.amazonaws.com:5432/jean_mil?";
	private static String password = "Hytrex007";
	
			
	
	
	public static void main(String[] args) {
		
		
		try  (Connection conn = DriverManager.getConnection(url, username, password);) {
			
				
			System.out.println("Worked!!!");
			
			String sql = "Create table bounce_house ("
					+ "bounce_house_id serial primary key,"
					+ ")";
			
			Statement stmt = conn.createStatement();
			
			stmt.executeUpdate(sql);
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Failed!!! :(");
		
		} 
		
		
		
	}

}
