package com.capgemini.exceptionhandling.exception;

public class TaxNotEligibleException extends Exception {

	public TaxNotEligibleException(String message) {
		super(message);
	}
}