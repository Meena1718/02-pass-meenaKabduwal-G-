package com.assignment.calculator.examination_calculator;

public class AdvancedCalculator extends BasicCalculator implements AdvancedMathOperationsInterface{

	
	public double square(double number) {
		double result = number * number;
		return result;
	}

	public double squareRoot(double number) {
		double result = Math.sqrt(number);
		return result;
	}

	public double absoluteValue(double number) {
		double result = Math.abs(number);
		return result;
	}

	public double raisedToThePowerof(double base, double exponent) {
		double result = Math.pow (base, exponent);
		return result;
	}

	public double modulus(double dividend, double divisor) {
		double result = dividend % divisor;
		return result;
	}

}
