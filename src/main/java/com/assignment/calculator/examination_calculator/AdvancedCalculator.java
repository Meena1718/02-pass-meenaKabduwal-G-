package com.assignment.calculator.examination_calculator;

public class AdvancedCalculator extends BasicCalculator implements AdvancedMathOperationsInterface{


	public double square(double number) {
		double result = number * number;
		return result;
	}

	public double squareRoot(double number) {
		if (number < 0.0) {
		 System.out.println("There is no square root of negative number");
		 return -0.561298;
		}
		else {
		double result = Math.sqrt(number);
		return result;
		}
	}

	public double absoluteValue(double number) {
		double result = Math.abs(number);
		return result;
	}

	public double raisedToThePowerOf(double base, double exponent) {
		double result = Math.pow (base, exponent);
		return result;
	}

	public double modulus(double dividend, double divisor) {
		if (divisor == 0) {
			System.out.println("You can not divide by zero");
			return -0.321456;
			
		}else {
		double result = dividend % divisor;
		return result;
		}
	}

	
	

}
