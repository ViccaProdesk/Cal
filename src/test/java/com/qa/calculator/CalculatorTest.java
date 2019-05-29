package com.qa.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

		Calculator calc;
		
		
		@Before
		public void setup() {
		calc = new Calculator();
		}
		
		
		@Test
		public void division() {
			
			double actualValue = calc.div(0.2, 0.2);
			Assert.assertEquals("Division", 1.0, actualValue, 0.1);

}
}