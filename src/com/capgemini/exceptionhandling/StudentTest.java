package com.capgemini.exceptionhandling;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.exceptionhandling.exception.AgeNotWithinRangeException;
import com.capgemini.exceptionhandling.exception.NameNotValidException;

class StudentTest {

	
	@Test
	void testStudent()throws NameNotValidException,AgeNotWithinRangeException {
		//	Assert(null,new Student(11,"Shubham",22,"Java"));
			assertThrows(AgeNotWithinRangeException.class,()-> new Student(11,"Shubham",22,"Java"));
			assertThrows(NameNotValidException.class,()-> new Student(11,"Shu2bham",21,"Java"));

	}

}
