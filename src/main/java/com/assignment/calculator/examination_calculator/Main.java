package com.assignment.calculator.examination_calculator;

public class Main {

	public static void main(String[] args) {
		BasicCalculator basicCal = new BasicCalculator();
		System.out.println(basicCal.addition(-2.0,-3.0));
		System.out.println(basicCal.subtraction(-2.0, -3.0));
		System.out.println(basicCal.multiplication(-2.0, -3.0));
		System.out.println(basicCal.division(-2.0, 0.0));
		
		AdvancedCalculator advanceCalc = new AdvancedCalculator();
		System.out.println(advanceCalc.square(0.0));
		System.out.println(advanceCalc.squareRoot(-3.0));
		System.out.println(advanceCalc.absoluteValue(0.0));
		System.out.println(advanceCalc.raisedToThePowerOf(0.0, 0.0));
		System.out.println(advanceCalc.modulus(0.0, 0.0));
	}

}
