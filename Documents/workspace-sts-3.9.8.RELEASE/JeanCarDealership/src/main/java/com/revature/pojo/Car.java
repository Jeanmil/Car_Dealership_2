package com.revature.pojo;

import java.util.ArrayList;
import java.util.Scanner;

import com.revature.ui.Screen;

public class Car {
	 private String _make;
	 private String _year;
	 private int _price;
	 Scanner scan = new Scanner(System.in);
	 
	 public static ArrayList<Car> carlist = new ArrayList<Car>();
	 
	
	 public ArrayList<Car> getCarList()
	 {
		 return carlist;
		 
	 }
	 public void addToList(Car c) {
		 
		 carlist.add(c);
	 }
	public void removeFromList(Car c) {
		carlist.remove(c);
		
	}
	
	
	 
	public Car(String make, String year, int price) {
		_make = make;
		_year = year;
		_price = price;
	}

	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String get_make() {
		return _make;
	}

	public void set_make(String make) {
		_make = make;
	}

	public String get_year() {
		return _year;
	}

	public void set_year(String year) {
		_year = year;
	}

	public int get_price() {
		return _price;
	}

	public void set_price(int price) {
		_price = price;
	}
	
	
	public String toString() 
	{
		return _make + " " + _year + " " + Integer.toString(_price);
		
	}
	
	
}
