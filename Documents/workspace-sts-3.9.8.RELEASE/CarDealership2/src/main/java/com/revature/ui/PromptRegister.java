package com.revature.ui;

import java.util.Scanner;

import com.revature.logs.LoggingUtil;

public class PromptRegister implements Screen {

	public static Scanner input;
	Screen cosOptions = new PromptCustomer();
	
	
	@Override
	public void display() {
		
		
		System.out.println("Please create a username");
		input = new Scanner(System.in);
		
		String newUsername = input.nextLine();
		
		System.out.println("Please create a password");
	
		String newPassword = input.nextLine();
		
		System.out.println("You are now registered!");
		
		
		cosOptions.display();
		
		
		

		
	}

}
