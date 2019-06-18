package com.revature.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.logs.LoggingUtil;
import com.revature.pojo.Car;
import com.revature.ui.PromptEmployee;
import com.revature.ui.Screen;
import com.revature.util.ConnectionFactory;


public class CarDaoImpl implements CarDao{
	private static Screen empOptions = new PromptEmployee();
	private Connection conn = ConnectionFactory.getConnection();

	@Override
//	public void addCar(int id, String make, String year, int price) {
	public boolean addCar(Car car) {
//		Car ret = null;
		String sql = "insert into project_car(carID, carmake, caryear, carprice) VALUES (?,?,?,?)";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, car.getId());
			stmt.setString(2, car.get_make());
			stmt.setString(3, car.get_year());
			stmt.setInt(4, car.get_price());
			
			int res = stmt.executeUpdate();
			
			if (res > 0) {
				LoggingUtil.trace("Car added");
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			LoggingUtil.error(e.getMessage());
		}
		
		return false;
		
	}

	@Override
	public void removeCar(int id) {

		String sql = "delete from project_car where carid =" + id;
		Statement stmt ;
		try {
			stmt= conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				
				System.out.println(rs.getInt(1)+ "\t" +rs.getString(2)+ "\t" +rs.getString(3)+ "\t" +rs.getInt(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			empOptions.display();
			e.printStackTrace();
			System.out.println("not working");
		}
	}

	@Override
	public void getCarById(int id) {
		
		String sql = "select * from project_car where carID=" + id;
		Statement stmt ;
		try {
			stmt= conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("not working");
		}
		
	}

	@Override
//	public void getAllCars() {
//		// TODO Auto-generated method stub
//		return null;
//	}


	public void getAllCars() {
//		List<Car> cars = new ArrayList<Car>();
		
 		String sql = "select * from project_car";
		Statement stmt ;
		try {
			stmt= conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
//				Car car = new Car(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
//				cars.add(car);
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
			}
			
//			return cars;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("not working");
		}
	}
	


}
