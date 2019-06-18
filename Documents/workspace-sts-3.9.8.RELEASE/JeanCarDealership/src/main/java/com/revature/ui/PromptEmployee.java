package com.revature.ui;

import java.util.Scanner;

import com.revature.pojo.Car;
import com.revature.services.Login;

public class PromptEmployee implements Screen{
	
		private static Screen welcome = new WelcomeScreen();
		private static Screen logInUser = new Login();
		public static int choice;
		public static Scanner input;
		public static Car car = new Car();

	public void display() {
		
		
		
		input = new Scanner(System.in);
		
	do {	
		System.out.println(" ");
		System.out.println("Employee options:"
				+ "\n[1]View Cars"
				+ "\n[2]Add Car"
				+ "\n[3]Remove Car"
				+ "\n[4]Offer Status"
				+ "\n[5]View Payments"
				+ "\n[6]Exit");
		
		choice=input.nextInt();
			
	switch(choice) {
	
		case 1 :
				viewcars();
				break;
		case 2: 
				addCar();
				break;
		case 3:
				removeFromList();
				break;
		case 4: 
				offerStatus();
			 	break;
		case 5:
				viewpayments();
				break;
		case 6: 
				exit();
				break;
		default: 
				System.out.println("Invalid choices");
			}
		
	}
	
	while(choice!=1 && choice!=2 && choice!=3 && choice!=4);
	
}

	
	private void exit() {
		welcome.display();
		logInUser.display();
	}


	private void viewpayments() {
		System.out.println("These are the payments");
	}


	private void offerStatus() {
		System.out.println("There are no offers");
		System.out.println(" ");
		display();
		
	}


	private void removeFromList() {
		System.out.println("Remove a car");
		System.out.println(" ");
		input=new Scanner(System.in);
		int i =input.nextInt();
		Car.carlist.remove(i);
	
		display();

}

	private void viewcars() {
		System.out.println(Car.carlist);
		System.out.println(" ");
		display();
}


	private void addCar() {
		
		System.out.println("Please Enter the car make");
		input = new Scanner(System.in);
		String n=input.nextLine();
		System.out.println("Please Enter the car year");
		String m=input.nextLine();
		System.out.println("Please Enter the car price");
		int i =input.nextInt();
	
		car = new Car(n,m,i);
		Car.carlist.add(car);
		System.out.println(Car.carlist);
		display();

}
}
