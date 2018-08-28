package com.capgemini.exceptionhandling;

import javax.naming.NameNotFoundException;

import com.capgemini.exceptionhandling.exception.*;

public class Student {

	private int studentRollNo;
	private String studentName;
	private int studentAge;
	private String course;

	public Student() {
	}

	public Student(int studentRollNo, String studentName, int studentAge, String course) throws AgeNotWithinRangeException, NameNotValidException {
		this.studentRollNo = studentRollNo;
		for (int i = 0; i < studentName.length(); i++) {
			if (studentName.charAt(i) >= 'a' && studentName.charAt(i) <= 'z'
					|| studentName.charAt(i) >= 'A' && studentName.charAt(i) <= 'Z') {
			} else {
				throw new NameNotValidException("Name contains a number or a special character");
			}
		}
		this.studentName = studentName; 
		if(studentAge >= 15 && studentAge <= 21)
			this.studentAge = studentAge;
		else
			throw new AgeNotWithinRangeException("Age should be between 15 and 21");
		this.course = course;
	}

}
