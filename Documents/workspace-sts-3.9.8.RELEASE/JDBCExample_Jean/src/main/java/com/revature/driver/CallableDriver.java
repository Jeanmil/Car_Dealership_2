package com.revature.driver;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableDriver {

	private static String username = "jeanmil";
	private static String url = "jdbc:postgresql://jean-mil.cxcb5hubgxwh.us-east-2.rds.amazonaws.com:5432/jean_mil?";
	private static String password = "Hytrex007";
	
			
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try (Connection conn = DriverManager.getConnection(url, username, password)){
			conn.setAutoCommit(false);
			String sql = "{call expensive tracks proc(?)}";
			CallableStatement call = conn.prepareCall(sql);
			call.setDouble(1, .99);
			ResultSet rsInit = call.executeQuery();
			ResultSet rs = (ResultSet) rsInit.getObject(1);
			while (rs.next()) {
			System.out.println("Name: " + rs.getString(1));
			System.out.println("Unitprice: " + rs.getDouble(2));
			}
			
		} catch (SQLException e) {
			System.out.println("Failed to connect or something!");
			e.printStackTrace();
		}
	
	}
}
