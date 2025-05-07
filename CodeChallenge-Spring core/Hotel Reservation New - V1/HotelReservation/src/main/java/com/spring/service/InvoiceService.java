package com.spring.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bo.InvoiceBO;
import com.spring.exception.InvalidStayDaysCountException;
import com.spring.model.Invoice;

public class InvoiceService 
{
	
	private InvoiceBO invoiceBoObj;

	
	public InvoiceBO getInvoiceBoObj() {
		return invoiceBoObj;
	}
	public void setInvoiceBoObj(InvoiceBO invoiceBoObj) {
		this.invoiceBoObj = invoiceBoObj;
	}


	public double calculateTotalBill(String reservationId, int stayDaysCount, String roomType) throws InvalidStayDaysCountException
	{
		
		double billAmount;
		if(stayDaysCount > 0 && stayDaysCount < 30)
		{
			
			ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
			Invoice cObj=(Invoice)ctx.getBean("invoice");
			cObj.setReservationId(reservationId);
			cObj.setStayDaysCount(stayDaysCount);
			billAmount=invoiceBoObj.calculateTotalBill(cObj, roomType);
		}
		else
		{	 	  	    	    		        	 	
			throw new InvalidStayDaysCountException("Days Stayed is not valid");
		}
		
		return billAmount;
	}

}
