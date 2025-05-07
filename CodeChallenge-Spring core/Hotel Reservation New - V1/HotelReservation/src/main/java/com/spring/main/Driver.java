package com.spring.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.exception.InvalidStayDaysCountException;
import com.spring.service.InvoiceService;

public class Driver {

	public static void main(String[] args) 
	{
		int daysCount;
		String roomType,reservationId;
		double totalCharge;
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		InvoiceService obj=(InvoiceService)ctx.getBean("invoiceservice");
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Reservation ID:");
		reservationId=in.nextLine();
		System.out.println("Enter the total days stayed:");
		daysCount=in.nextInt();
		System.out.println("Enter the type of room stayed:");
		roomType=in.next();
		
		try
		{
			totalCharge=obj.calculateTotalBill(reservationId, daysCount, roomType);
			System.out.println("Total amount to be paid:"+totalCharge);
		}
		catch(InvalidStayDaysCountException str)
		{
			//System.out.println(str);
			str.printStackTrace();
		}	 	  	    	    		        	 	

	}

}
