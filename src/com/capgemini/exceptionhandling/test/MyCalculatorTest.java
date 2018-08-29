package com.capgemini.exceptionhandling.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.capgemini.exceptionhandling.MyCalculator;

class MyCalculatorTest {

MyCalculator c1 ;

	@Test
	void testPower() throws Exception {
			Exception e;
			assertEquals(243, MyCalculator.power(3, 5));
			assertEquals(16, MyCalculator.power(2, 4));
			assertEquals(32, MyCalculator.power(2, 5));
			}
	
	@Test
	void testPowerWithNegativeInputs() {
		Exception e;
		e = assertThrows(Exception.class, () -> MyCalculator.power(-1, -2));
		assertEquals("java.lang.Exception: n and p should be non-negative",e.toString());
		e = assertThrows(Exception.class, () -> MyCalculator.power(-1, 3));
		assertEquals("java.lang.Exception: n and p should be non-negative",e.toString());
	}
		
	@Test
	void testPowerWithZero() {
		Exception e;
		e = assertThrows(Exception.class, () -> MyCalculator.power(0, 0));
		assertEquals("java.lang.Exception: n and p should not be zero",e.toString());
	}
	
	}


