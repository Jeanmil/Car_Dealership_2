package com.revature.math;

public class MathApplication {
	
	private Calculator calc = new Calculator();
	
	
	public double mean(double one, double two, double three, double four) {
		double sum = calc.add(calc.add(calc.add(one, two), two), two)
		double mean = calc.divide(sum, 4);
		return mean;
	}
}
