package com.capgemini.exceptionhandling.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.exceptionhandling.TaxCalculator;
import com.capgemini.exceptionhandling.exception.CountryNotValidException;
import com.capgemini.exceptionhandling.exception.EmployeeNameInvalidException;
import com.capgemini.exceptionhandling.exception.TaxNotEligibleException;

class TaxCalculatorTest {

	@Test
	void testValidTaxCalculator() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
		assertEquals(6000,TaxCalculator.calculateTax("Shubham Srivastava", true, 1_00_000),1);	
	}
	
	void testValidCountry() {
		assertThrows(CountryNotValidException.class, ()-> TaxCalculator.calculateTax("Shubham Srivastava", false, 55000));
	}
	
	void testValidName() {
		assertThrows(EmployeeNameInvalidException .class, ()-> TaxCalculator.calculateTax("", true, 55000));
	}
	
	void testTaxEligibility() {
		assertThrows(EmployeeNameInvalidException .class, ()-> TaxCalculator.calculateTax("Shubham Srivastava", true, 1000));
	}
}
