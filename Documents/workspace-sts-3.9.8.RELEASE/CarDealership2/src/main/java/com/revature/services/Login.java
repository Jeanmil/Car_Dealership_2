package com.revature.services;

import java.util.Scanner;

import com.revature.logs.LoggingUtil;
import com.revature.ui.PromptCustomer;
import com.revature.ui.PromptEmployee;
import com.revature.ui.PromptRegister;
import com.revature.ui.Screen;

public class Login implements Screen {

	
	private static Screen empOptions = new PromptEmployee();
	private static Screen cosOptions = new PromptCustomer();
	private static Screen registerUser = new PromptRegister();
	
	
	public void display() {
		LoggingUtil.trace("Logging in a user");
		
		
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();

	if (input.equalsIgnoreCase("Employee")) {
		System.out.println("Please enter password");
		String password = scan.nextLine();
		LoggingUtil.trace("Employee logged in");
		empOptions.display();
		
		
		}
	
	else if (input.equalsIgnoreCase("Customer")) {
		System.out.println("Please enter password");
		String password2 = scan.nextLine();
		cosOptions.display();
	}

	
	
	else if (input.equalsIgnoreCase("1"))
		registerUser.display();
	}
}
