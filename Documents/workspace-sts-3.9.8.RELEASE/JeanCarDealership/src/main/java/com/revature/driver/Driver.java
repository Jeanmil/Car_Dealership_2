package com.revature.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import javax.swing.JOptionPane;

import com.revature.pojo.Car;
import com.revature.services.Login;


import com.revature.ui.Screen;
import com.revature.ui.WelcomeScreen;

public class Driver {

	private static String username = "jeanmil";
	private static String url = "jdbc:postgresql://jean-mil.cxcb5hubgxwh.us-east-2.rds.amazonaws.com:5432/jean_mil?";
	private static String password = "Hytrex007";
	

	private static Screen welcome = new WelcomeScreen();
	private static Screen logInUser = new Login();
	public static Car car = new Car();
	
	
	
	public static void main (String[] args) {

		//Cars already in the lot
		car.addToList(new Car("Ford", "2008", 12000));
		car.addToList(new Car("Toyota", "2017", 12000));
		car.addToList(new Car("Honda", "2011", 12000));
		car.addToList(new Car("Nissan", "2010", 12000));
		
		welcome.display();
		logInUser.display();
		
//		try  (Connection conn = DriverManager.getConnection(url, username, password);) {
//			
//			
//			System.out.println("Worked!!!");
//			
//			String sql = "Create table car ("
//					+ "car_id serial primary key, "
//					+ "carmake varchar(255))";
//			
//			Statement stmt = conn.createStatement();
//			
//			stmt.executeUpdate(sql);
//			
//			
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//			System.out.println("Failed!!! :(");
//		
//		} 
//		
	

		
		
		
				
	}
}
