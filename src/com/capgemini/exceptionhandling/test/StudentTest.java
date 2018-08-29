package com.capgemini.exceptionhandling.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.exceptionhandling.Student;
import com.capgemini.exceptionhandling.exception.AgeNotWithinRangeException;
import com.capgemini.exceptionhandling.exception.NameNotValidException;

class StudentTest {

	
	@Test
	void testStudent()throws NameNotValidException,AgeNotWithinRangeException {
		
		
			assertThrows(AgeNotWithinRangeException.class,()-> new Student(11,"Shubham",22,"Java"));
			//assertDoesNotThrow(()-> new Student(11,"Shubham",21,"Java"));
			assertThrows(NameNotValidException.class,()-> new Student(11,"Shu2bham",21,"Java"));
			assertAll(()-> new Student(11,"Shubham",21,"Java"));
		try {
			 new Student(11,"Shubham",21,"Java");
		}
		catch(Exception e)
		{
			fail("Failed Statement");
		}
		
	}
}
