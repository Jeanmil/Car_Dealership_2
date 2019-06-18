package com.revature.pojo;

import java.util.ArrayList;
import java.util.Scanner;

import com.revature.Dao.CarDaoImpl;

public class Car {
	
	 private int id;
	 private String _make;
	 private String _year;
	 private int _price;
	 Scanner scan = new Scanner(System.in);


	 
	 
	 
	 public static ArrayList<Car> carlist = new ArrayList<>();
	 
	
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
	
	

	
	public Car(int id, String _make, String _year, int _price) {
		super();
		this.id = id;
		this._make = _make;
		this._year = _year;
		this._price = _price;
	}
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
