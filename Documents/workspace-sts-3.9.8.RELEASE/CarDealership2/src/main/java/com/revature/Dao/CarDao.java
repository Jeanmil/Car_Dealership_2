package com.revature.Dao;

import java.util.List;

import com.revature.pojo.Car;


public interface CarDao {
	
//	public void addCar(int id, String make, String year, int price); //createUser
	
	public void removeCar(int id);//DeleteUser
	
	public void getCarById(int id);//getUserbyId
	
	public void getAllCars(); //getAll Users

	boolean addCar(Car car);



}
