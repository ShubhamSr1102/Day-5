package com.capgemini.exceptionhandling;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.exceptionhandling.exception.MathException;
import com.capgemini.exceptionhandling.exception.ZeroInputException;

class MyCalculatorTest {

MyCalculator c1 ;
	
	@BeforeEach
	void setup()
	{
		c1 = new MyCalculator() ;
	}
	
	

	@Test
	void testPower() throws MathException, ZeroInputException {
		
			assertEquals(243,c1.power(3, 5));
			assertEquals(16,c1.power(2, 4));
			assertThrows(ZeroInputException.class, () -> c1.power(0, 0));
			assertThrows(MathException.class, () -> c1.power(-1, -2));
			assertThrows(MathException.class, () -> c1.power(-1, 3));
		}
		
	}


