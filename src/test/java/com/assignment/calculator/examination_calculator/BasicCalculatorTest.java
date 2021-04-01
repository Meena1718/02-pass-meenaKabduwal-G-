package com.assignment.calculator.examination_calculator;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class BasicCalculatorTest {

	BasicCalculator basicCal = new BasicCalculator();
	Random random = new Random();
	double firstNumber = 0.0;
	double secondNumber = 0.0;
	double result = 0.0;

	@Test // positive numbers
	public void testAdditionPositive() {
		for (double i = 0; i < 10; i++) {
			firstNumber = 1.0 + (100.0 - 1.0) * random.nextDouble();// range (1 to 100)
			// random value = minRange + (maxRange - minRange)* random.nextDouble()
			System.out.println(firstNumber);
			secondNumber = 1.0 + (100.0 - 1.0) * random.nextDouble();// range (1 to 100)
			System.out.println(secondNumber);
			result = firstNumber + secondNumber;
			assertEquals(basicCal.addition(firstNumber, secondNumber), result, 0);
		}
	}

	@Test // Zero
	public void testAdditionZero() {
		firstNumber = 0.0;
		secondNumber = 0.0;
		result = firstNumber + secondNumber;
		assertEquals(basicCal.addition(firstNumber, secondNumber), result, 0);
	}

	@Test // negative numbers
	public void testAdditionNegative() {
		for (double i = 0; i < 10; i++) {
			firstNumber = -1.0 + (-100.0 + 1.0) * random.nextDouble();// range (-1 to -100)
			// random value = minRange + (maxRange - minRange)* random.nextDouble()
			System.out.println(firstNumber);
			secondNumber = -1.0 + (-100.0 + 1.0) * random.nextDouble();// range (-1 to -100)
			System.out.println(secondNumber);
			result = firstNumber + secondNumber;
			assertEquals(basicCal.addition(firstNumber, secondNumber), result, 0);
		}
	}

	@Test// positive numbers
	public void testSubtractionPositive() {
		for (double i = 0; i < 10; i++) {
			firstNumber = 1.0 + (100.0 - 1.0) * random.nextDouble();// range (1 to 100)
			// random value = minRange + (maxRange - minRange)* random.nextDouble()
			System.out.println(firstNumber);
			secondNumber = 1.0 + (100.0 - 1.0) * random.nextDouble();// range (1 to 100)
			System.out.println(secondNumber);
			result = firstNumber - secondNumber;
			assertEquals(basicCal.subtraction(firstNumber, secondNumber), result, 0);
		}
	}
	@Test // Zero
	public void testSubtractionZero() {
		firstNumber = 0.0;
		secondNumber = 0.0;
		result = firstNumber - secondNumber;
		assertEquals(basicCal.subtraction(firstNumber, secondNumber), result, 0);
	}

	@Test // negative numbers
	public void testSubtractionNegative() {
		for (double i = 0; i < 10; i++) {
			firstNumber = -1.0 + (-100.0 + 1.0) * random.nextDouble();// range (-1 to -100)
			// random value = minRange + (maxRange - minRange)* random.nextDouble()
			System.out.println(firstNumber);
			secondNumber = -1.0 + (-100.0 + 1.0) * random.nextDouble();// range (-1 to -100)
			System.out.println(secondNumber);
			result = firstNumber - secondNumber;
			assertEquals(basicCal.subtraction(firstNumber, secondNumber), result, 0);
		}
	}

	@Test // positive numbers
	public void testMultiplicationPositive() {
		for (double i = 0; i < 10; i++) {
			firstNumber = 1.0 + (100.0 - 1.0) * random.nextDouble();// range (1 to 100)
			// random value = minRange + (maxRange - minRange)* random.nextDouble()
			System.out.println(firstNumber);
			secondNumber = 1.0 + (100.0 - 1.0) * random.nextDouble();// range (1 to 100)
			System.out.println(secondNumber);
			result = firstNumber * secondNumber;
			assertEquals(basicCal.multiplication(firstNumber, secondNumber), result, 0);
		}
	}
	@Test // Zero
	public void testMultiplicationZero() {
		firstNumber = 0.0;
		secondNumber = 0.0;
		result = firstNumber * secondNumber;
		assertEquals(basicCal.multiplication(firstNumber, secondNumber), result, 0);
	}

	@Test // negative numbers
	public void testMultiplicationNegative() {
		for (double i = 0; i < 10; i++) {
			firstNumber = -1.0 + (-100.0 + 1.0) * random.nextDouble();// range (-1 to -100)
			// random value = minRange + (maxRange - minRange)* random.nextDouble()
			System.out.println(firstNumber);
			secondNumber = -1.0 + (-100.0 + 1.0) * random.nextDouble();// range (-1 to -100)
			System.out.println(secondNumber);
			result = firstNumber * secondNumber;
			assertEquals(basicCal.multiplication(firstNumber, secondNumber), result, 0);
		}
	}

	@Test // positive numbers
	public void testDivisionPositive() {
		for (double i = 0; i < 10; i++) {
			firstNumber = 1.0 + (100.0 - 1.0) * random.nextDouble();// range (1 to 100)
			// random value = minRange + (maxRange - minRange)* random.nextDouble()
			System.out.println(firstNumber);
			secondNumber = 1.0 + (100.0 - 1.0) * random.nextDouble();// range (1 to 100)
			System.out.println(secondNumber);
			result = firstNumber / secondNumber;
			assertEquals(basicCal.division(firstNumber, secondNumber), result, 0);
		}
	}
	@Test // Zero
	public void testDivisionZero() {
		for (double i = 0; i < 10; i++) {
		firstNumber = 0.0;
		secondNumber = 1.0 + (100.0 - 1.0) * random.nextDouble();// range (1 to 100)
		System.out.println(secondNumber);
		result = firstNumber / secondNumber;
		assertEquals(basicCal.division(firstNumber, secondNumber), result, 0);
	}
	}
	@Test // negative numbers
	public void testDivisionNegative() {
		for (double i = 0; i < 10; i++) {
			firstNumber = -1.0 + (-100.0 + 1.0) * random.nextDouble();// range (-1 to -100)
			// random value = minRange + (maxRange - minRange)* random.nextDouble()
			System.out.println(firstNumber);
			secondNumber = -1.0 + (-100.0 + 1.0) * random.nextDouble();// range (-1 to -100)
			System.out.println(secondNumber);
			result = firstNumber / secondNumber;
			assertEquals(basicCal.division(firstNumber, secondNumber), result, 0);
		}
	}
}
