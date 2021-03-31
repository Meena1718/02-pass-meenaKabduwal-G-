package com.assignment.calculator.examination_calculator;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class AdvancedCalculatorTest {

	AdvancedCalculator advanceCalc = new AdvancedCalculator();
	Random random = new Random();
	double number = 0.0;
	double exponent = 0.0;
	double base = 0.0;
	double dividend = 0.0;
	double divisor = 0.0;
	double result = 0.0;

	@Test
	public void testSquare() {
		for (double i = 0; i < 10; i++) {
			number = -10.0 + (30.0 + 10.0) * random.nextDouble();// range (-10 to 30)
			// random value = minRange + (maxRange - minRange)* random.nextDouble()
			System.out.println(number);
			result = number * number;
			assertEquals(advanceCalc.square(number), result, 0);
		}
	}
	@Test
	public void testSquareRoot() {
		for (double i = 0; i < 10; i++) {
			number = -10.0 + (30.0 + 10.0) * random.nextDouble();// range (-10 to 30)
			// random value = minRange + (maxRange - minRange)* random.nextDouble()
			System.out.println(number);
			if (number < 0.0) {
				System.out.println("There is no square root of negative number.");
			}else {
			result = Math.sqrt(number);
			assertEquals(advanceCalc.squareRoot(number), result, 0);
			}
		}
	}
	@Test
	public void testAbsoluteValue() {
		for (double i = 0; i < 10; i++) {
			number = -10.0 + (30.0 + 10.0) * random.nextDouble();// range (-10 to 30)
			// random value = minRange + (maxRange - minRange)* random.nextDouble()
			System.out.println(number);
			result = Math.abs(number);
			assertEquals(advanceCalc.absoluteValue(number), result, 0);
		}
	}
	@Test
	public void testRaisedToThePowerOf() {
		for (double i = 0; i < 10; i++) {
			base = -10.0 + (30.0 + 10.0) * random.nextDouble();// range (-10 to 30)
			System.out.println(base);
			exponent = -10.0 + (30.0 + 10.0) * random.nextDouble();
			// random value = minRange + (maxRange - minRange)* random.nextDouble()
			System.out.println(exponent);
			result =Math.pow(base, exponent) ;
			assertEquals(advanceCalc.raisedToThePowerOf(base, exponent), result, 0);
		}
	}
	@Test
	public void testModulus() {
		for (double i = 0; i < 10; i++) {
			dividend = -10.0 + (30.0 + 10.0) * random.nextDouble();// range (-10 to 30)
			// random value = minRange + (maxRange - minRange)* random.nextDouble()
			System.out.println(dividend);
			divisor = -10.0 + (30.0 + 10.0) * random.nextDouble();
			System.out.println(divisor);
			if (divisor == 0) {
				System.out.println("You can not divide by zero");
			}
			else {
				result = dividend % divisor;
			    assertEquals(advanceCalc.modulus(dividend, divisor), result, 0);
		}
	}
	}
}
