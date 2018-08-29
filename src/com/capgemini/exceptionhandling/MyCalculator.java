package com.capgemini.exceptionhandling;


public class MyCalculator {

	public static long power(int n,int p) throws Exception {
		long result = 1;
		if(n<0 || p<0)
		{
			throw new Exception("n and p should be non-negative") ;
			//return 0 ;
		}
		else if(n==0 && p==0)
		{
			throw new Exception("n and p should not be zero") ;
			//return 0 ;
		}
		else
		{
			for(int i = 1; i <= p; i++)
			{
				result = result * n;
			}
		}
			return result;
	}

}
