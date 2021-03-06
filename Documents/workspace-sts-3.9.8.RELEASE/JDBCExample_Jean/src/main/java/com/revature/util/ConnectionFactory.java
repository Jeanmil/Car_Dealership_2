package com.revature.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionFactory {
	
	
	private static String url;
	private static String user;
	private static String password;
	private static final String PROPERTIES_FILE = "jdbc:postgresql://jean-mil.cxcb5hubgxwh.us-east-2.rds.amazonaws.com:5432/jean_mil?";
	
			
	private static ConnectionFactory cf;
	
	public static synchronized Connection getConnection() {
		
		if (cf == null) {
			cf = new ConnectionFactory();
			
		}
		return cf.createConnection();
	}
	
	private ConnectionFactory() {
		//private constructor makes this a single
		Properties prop = new Properties();
		try (FileInputStream fis = new FileInputStream(PROPERTIES_FILE);){
			prop.load(fis);
			url = prop.getProperty("url");
			user = prop.getProperty("user");
			password = prop.getProperty("password");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private Connection createConnection () {
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (SQLExcxeption e) {
			
		}
	}

}
