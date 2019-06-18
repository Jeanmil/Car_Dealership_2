package com.revature.ui;

import com.revature.logs.LoggingUtil;

public class WelcomeScreen implements Screen {
	

	public static final String WELCOME_MESSAGE = ("--------------Welcome To Superhero's Car Dealership Application---------------\n"
			+ " \n"
			+ "Please log in with your USERNAME\n" 
			+ "First time here? Press [1] to register");
	 

	public void display() {
		
		System.out.println(WELCOME_MESSAGE);

	}

}
