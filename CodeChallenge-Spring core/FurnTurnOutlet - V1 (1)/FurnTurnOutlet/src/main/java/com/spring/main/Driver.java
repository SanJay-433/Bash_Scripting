package com.spring.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.ApplicationConfig;
import com.spring.exception.InvalidProductIdException;
import com.spring.service.ProductService;

public class Driver {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		String productId,productName,dimension,woodType;
		double mrpValue,amount=0;
		ApplicationContext ctx=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		ProductService productbObj=(ProductService)ctx.getBean("productService");
		
		System.out.println("Enter the product id:");
		productId=in.nextLine();
		System.out.println("Enter the product name:");
		productName=in.nextLine();
		System.out.println("Enter the mrp value:");
		mrpValue=in.nextDouble();
		System.out.println("Enter the dimension details:");
		in.nextLine();
		dimension=in.nextLine();
		System.out.println("Enter the wood type:");
		woodType=in.nextLine();
		try
		{
		amount=productbObj.calculateBill(productId,productName,mrpValue,dimension,woodType);
		System.out.println("Amount to bepaIDIS: "+amount);
		}	 	  	    	    		        	 	
		catch(InvalidProductIdException str)
		{
			    System.out.println(str.getMessage());               
		}
		

	}

}
