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

	@Test
	public void testAddition() {
		for (double i = 0; i < 10; i++) {
			firstNumber = -10.0 + (30.0 + 10.0) * random.nextDouble();// range (-10 to 30)
			// random value = minRange + (maxRange - minRange)* random.nextDouble()
			System.out.println(firstNumber);
			secondNumber = -10.0 + (30.0 + 10.0) * random.nextDouble();
			System.out.println(secondNumber);
			result = firstNumber + secondNumber;
			assertEquals(basicCal.addition(firstNumber, secondNumber), result, 0);
		}
	}
		@Test
		public void testSubtraction() {
			for (double i = 0; i < 10; i++) {
				firstNumber = -10.0 + (30.0 + 10.0) * random.nextDouble();
				// random value = minRange + (maxRange - minRange)* random.nextDouble()
				System.out.println(firstNumber);
				secondNumber = -10.0 + (30.0 + 10.0) * random.nextDouble();
				System.out.println(secondNumber);
				result = firstNumber - secondNumber;
				assertEquals(basicCal.subtraction(firstNumber, secondNumber), result, 0);
			}
	}
		@Test
		public void testMultiplication() {
			for (double i = 0; i < 10; i++) {
				firstNumber = -10.0 + (30.0 + 10.0) * random.nextDouble();
				// random value = minRange + (maxRange - minRange)* random.nextDouble()
				System.out.println(firstNumber);
				secondNumber = -10.0 + (30.0 + 10.0) * random.nextDouble();
				System.out.println(secondNumber);
				result = firstNumber * secondNumber;
				assertEquals(basicCal.multiplication(firstNumber, secondNumber), result, 0);
			}
	}
		@Test
		public void testDivision() {
			for (double i = 0; i < 10; i++) {
				firstNumber = -10.0 + (30.0 + 10.0) * random.nextDouble();
				// random value = minRange + (maxRange - minRange)* random.nextDouble()
				System.out.println(firstNumber);
				secondNumber = -10.0 + (30.0 + 10.0) * random.nextDouble();
				System.out.println(secondNumber);
				result = firstNumber / secondNumber;
				assertEquals(basicCal.division(firstNumber, secondNumber), result, 0);
			}
	}
}
