package com.capgemini.exceptionhandling;

import com.capgemini.exceptionhandling.exception.CountryNotValidException;
import com.capgemini.exceptionhandling.exception.EmployeeNameInvalidException;
import com.capgemini.exceptionhandling.exception.TaxNotEligibleException;

public class TaxCalculator {

	public static double calculateTax(String empName, Boolean isIndian, double empSal)
			throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
		if (!isIndian)
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		if (empName.isEmpty())
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		if (empSal > 1_00_000)
			return (double)empSal * (double) (8) / 100;
		else if (empSal > 50_000 && empSal <= 1_00_000)
			return (double)empSal * (double) (6) / 100;
		else if (empSal > 30_000 && empSal <= 50_000)
			return (double)empSal * (double) (5) / 100;
		else if (empSal > 10_000 && empSal <= 30_000)
			return (double)empSal * (double) (4) / 100;
		else
			throw new TaxNotEligibleException("The employee does not need to pay tax");
	}

}
