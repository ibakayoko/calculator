package com.ibakayoko.calculator;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	private Calculator calculator = new Calculator();
	
	@Test
	void testSum() {
		assertEquals(5, calculator.sum(2, 3));
		//fail("Not yet implemented");
	}

}
