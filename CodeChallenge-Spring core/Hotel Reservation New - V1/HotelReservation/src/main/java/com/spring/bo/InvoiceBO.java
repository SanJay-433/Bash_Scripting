package com.spring.bo;

import com.spring.model.Invoice;

public class InvoiceBO 
{
	public double calculateTotalBill(Invoice cObj,String roomType)
	{
		int daysCount=cObj.getStayDaysCount();
		//float charge=cObj.getGstPercentage();
		float roomCharge=0;
		if(cObj.getRoomCharge().getRoomCharges().get(roomType)!=null)
		{
			roomCharge= cObj.getRoomCharge().getRoomCharges().get(roomType);
		}
		//System.out.println("Service charge"+serviceCharge);
		double totalCharge;
		
		if(cObj.getRoomCharge().getRoomCharges().containsKey(roomType))
		{
// 			double billAmount=0;
			totalCharge=daysCount*roomCharge;
			totalCharge = totalCharge + (totalCharge * 12 /100.0);
// 			return billAmount;
		}
		else
		{
			totalCharge=daysCount*1000;
			
		}
		return totalCharge;
	}

}
	 	  	    	    		        	 	
