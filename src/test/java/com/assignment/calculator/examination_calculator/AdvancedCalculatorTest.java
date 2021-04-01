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

	@Test//positive numbers
	public void testSquarePositive() {
		for (double i = 0; i < 10; i++) {
			number = 1.0 + (100.0 - 1.0) * random.nextDouble();// range (1 to 100)
			// random value = minRange + (maxRange - minRange)* random.nextDouble()
			System.out.println(number);
			result = number * number;
			assertEquals(advanceCalc.square(number), result, 0);
		}
	}
	@Test// zero
	public void testSquareZero() {
		    number = 0.0;
			result = number * number;
			assertEquals(advanceCalc.square(number), result, 0);
		}
	
	@Test// negative numbers
	public void testSquareNegative() {
		for (double i = 0; i < 10; i++) {
			number = -1.0 + (-100.0 + 1.0) * random.nextDouble();// range (-1 to -100)
			// random value = minRange + (maxRange - minRange)* random.nextDouble()
			System.out.println(number);
			result = number * number;
			assertEquals(advanceCalc.square(number), result, 0);
		}
	}
	@Test//positive numbers
	public void testSquareRootPositive() {
		for (double i = 0; i < 10; i++) {
			number = 1.0 + (100.0 - 1.0) * random.nextDouble();// range (1 to 100)
			// random value = minRange + (maxRange - minRange)* random.nextDouble()
			System.out.println(number);
			result = Math.sqrt(number);
			assertEquals(advanceCalc.squareRoot(number), result, 0);
			}
		}
	@Test// zero
	public void testSquareRootZero() {
		    number = 0.0;
			result = Math.sqrt(number);
			assertEquals(advanceCalc.squareRoot(number), result, 0);
			}
		
	
	@Test//positive numbers
	public void testAbsoluteValuePositive() {
		for (double i = 0; i < 10; i++) {
			number = 1.0 + (100.0 - 1.0) * random.nextDouble();// range (1 to 100)
			// random value = minRange + (maxRange - minRange)* random.nextDouble()
			System.out.println(number);
			result = Math.abs(number);
			assertEquals(advanceCalc.absoluteValue(number), result, 0);
		}
	}
	@Test// zero
	public void testAbsoluteValueZero() {
	        number = 0.0;
			result = Math.abs(number);
			assertEquals(advanceCalc.absoluteValue(number), result, 0);
		}
	@Test// negative numbers
	public void testAbsoluteValueNegative() {
		for (double i = 0; i < 10; i++) {
			number = -1.0 + (-100.0 + 1.0) * random.nextDouble();// range (-1 to -100)
			// random value = minRange + (maxRange - minRange)* random.nextDouble()
			System.out.println(number);
			result = Math.abs(number);
			assertEquals(advanceCalc.absoluteValue(number), result, 0);
		}
	}
	@Test//positive numbers
	public void testRaisedToThePowerOfPositive() {
		for (double i = 0; i < 10; i++) {
			base = 1.0 + (100.0 - 1.0) * random.nextDouble();// range (1 to 100)
			// random value = minRange + (maxRange - minRange)* random.nextDouble()
			System.out.println(number);
			exponent = 1.0 + (100.0 - 1.0) * random.nextDouble();// range (1 to 100)
			result = Math.pow(base, exponent);
			assertEquals(advanceCalc.raisedToThePowerOf(base, exponent), result, 0);
		}
	}
	@Test// zero
	public void testRaisedToThePowerOfZero() {
		for (double i = 0; i < 10; i++) {
			base = 0.0;
			exponent = 0.0;
			result =Math.pow(base, exponent) ;
			assertEquals(advanceCalc.raisedToThePowerOf(base, exponent), result, 0);
		}
	}
	@Test// negative numbers
	public void testRaisedToThePowerOfNegative() {
		for (double i = 0; i < 10; i++) {
			base = -1.0 + (-100.0 + 1.0) * random.nextDouble();// range (-1 to -100)
			// random value = minRange + (maxRange - minRange)* random.nextDouble()
			System.out.println(base);
			exponent = -1.0 + (-100.0 + 1.0) * random.nextDouble();// range (-1 to -100)
			System.out.println(exponent);
			result = Math.pow(base, exponent);
			assertEquals(advanceCalc.raisedToThePowerOf(base, exponent), result, 0);
		}
	}
	@Test//positive numbers
	public void testModulusPositive() {
		for (double i = 0; i < 10; i++) {
			dividend = 1.0 + (100.0 - 1.0) * random.nextDouble();// range (1 to 100)
			// random value = minRange + (maxRange - minRange)* random.nextDouble()
			System.out.println(dividend);
			divisor = 1.0 + (100.0 - 1.0) * random.nextDouble();// range (1 to 100)
			System.out.println(divisor);
			result = dividend % divisor;
			assertEquals(advanceCalc.modulus(dividend, divisor), result, 0);
		}
	}
	@Test// zero
	public void testModulusZero() {
		for (double i = 0; i < 10; i++) {
			dividend = 0.0;
			divisor = 1.0 + (100.0 - 1.0) * random.nextDouble();// range (1 to 100)
			System.out.println(divisor);
			result = dividend % divisor;
			assertEquals(advanceCalc.modulus(dividend, divisor), result, 0);
		}
	}
	@Test// negative numbers
	public void testModulusNegative() {
		for (double i = 0; i < 10; i++) {
			dividend = -1.0 + (-100.0 + 1.0) * random.nextDouble();// range -1 to -100)
			// random value = minRange + (maxRange - minRange)* random.nextDouble()
			System.out.println(dividend);
			divisor = -1.0 + (-100.0 + 1.0) * random.nextDouble();// range (-1 to -100)
			System.out.println(divisor);
			result = dividend % divisor;
			assertEquals(advanceCalc.modulus(dividend, divisor), result, 0);
		}
	}
	
	}

