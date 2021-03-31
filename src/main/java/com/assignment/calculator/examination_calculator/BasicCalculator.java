package com.assignment.calculator.examination_calculator;

public class BasicCalculator implements BasicMathOperationsInterface {


	public double addition(double firstNumber, double secondNumber) {
		double result = firstNumber + secondNumber;
		return result;
	}

	public double subtraction(double firstNumber, double secondNumber) {
		double result = firstNumber - secondNumber;
		return result;
    }

	public double multiplication(double firstNumber, double secondNumber) {
		double result = firstNumber * secondNumber;
		return result;
	}

	public double division(double firstNumber, double secondNumber) {
		if (secondNumber == 0) {
		System.out.println("You can not divide by zero");
		return -0.321456;
		
	}else {
		double result = firstNumber / secondNumber; 
		return result;
	}
  }

}
