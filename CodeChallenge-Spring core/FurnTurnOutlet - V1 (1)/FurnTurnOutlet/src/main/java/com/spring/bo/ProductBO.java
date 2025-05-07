package com.spring.bo;

import org.springframework.stereotype.Component;
import com.spring.model.Product;

@Component
public class ProductBO 
{
	
	public double calculateBill(Product furObj,String woodType)
	{
		double amount=0;
		int temp;
		double mrp=furObj.getMrpValue();
		if(furObj.getShopDetails().getDiscountDetails().containsKey(woodType))
		{
			temp=furObj.getShopDetails().getDiscountDetails().get(woodType).intValue();
			amount=mrp - (mrp * temp)/100.0;
		}
		
		return amount;
	}

}
