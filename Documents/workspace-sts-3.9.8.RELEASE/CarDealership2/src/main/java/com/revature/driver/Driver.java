package com.revature.driver;

import java.sql.Connection;

import com.revature.Dao.CarDaoImpl;
import com.revature.pojo.Car;
import com.revature.services.Login;
import com.revature.ui.Screen;
import com.revature.ui.WelcomeScreen;
import com.revature.util.ConnectionFactory;

public class Driver {
	
	private static Screen welcome = new WelcomeScreen();
	private static Screen logInUser = new Login();
	public static Car car = new Car();
	public static CarDaoImpl cds=new CarDaoImpl();
	
	
	public static void main (String[] args) {
		
		
		//Cars already in the lot
		car.addToList(new Car("Ford", "2008", 12000));
		car.addToList(new Car("Toyota", "2017", 12000));
		car.addToList(new Car("Honda", "2011", 12000));
		car.addToList(new Car("Nissan", "2010", 12000));
		
		welcome.display();
		logInUser.display();
	}
	

}
