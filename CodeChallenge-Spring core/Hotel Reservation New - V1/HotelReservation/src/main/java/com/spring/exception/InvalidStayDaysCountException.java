package com.spring.exception;

public class InvalidStayDaysCountException extends Exception
{
	
	public InvalidStayDaysCountException(String msg)
	{
		System.out.println(msg);
	}

}
