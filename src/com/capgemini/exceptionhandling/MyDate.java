package com.capgemini.exceptionhandling;

import com.capgemini.exceptionhandling.exception.InvalidDayException;
import com.capgemini.exceptionhandling.exception.InvalidMonthException;

public class MyDate {

	public MyDate(){
	}
	public MyDate(int day, int month, int year) throws InvalidMonthException, InvalidDayException
	{
		if(year % 4 == 0 || year % 400 == 0)
		{
			if(month == 2)
			{
				if(day < 1 || day > 29)
					throw new InvalidDayException("The Day is invalid");
				System.out.println("Valid Date");
			}
			else if (month < 1 || month > 12)
				throw new InvalidMonthException("The Month is invalid");
			else 
			{
				if(month == 1 || month == 3 ||month == 5 ||month == 7 ||month == 8 ||month == 10 || month == 12)
				{
					if(day < 1 || day > 31)
					throw new InvalidDayException("The Day is invalid");
					System.out.println("Valid Date");
				}
				else
				{
					if(day < 1 || day > 30)
						throw new InvalidDayException("The Day is invalid");
					System.out.println("Valid Date");
				}
			}
		}
		else
		{
			if(month == 2)
			{
				if(day < 1 || day > 28)
					throw new InvalidDayException("The Day is invalid");
				System.out.println("Valid Date");
			}
			else if (month < 1 || month > 12)
				throw new InvalidMonthException("The Month is invalid");
			else 
			{
				if(month == 1 || month == 3 ||month == 5 ||month == 7 ||month == 8 ||month == 10 || month == 12)
				{
					if(day < 1 || day > 31)
					throw new InvalidDayException("The Day is invalid");
				System.out.println("Valid Date");
				}
				else
				{
					if(day < 1 || day > 30)
						throw new InvalidDayException("The Day is invalid");
					System.out.println("Valid Date");
				}
			}
		}
}
}
