package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import com.spring.bo.ProductBO;
import com.spring.config.ApplicationConfig;
import com.spring.exception.InvalidProductIdException;
import com.spring.model.Product;


@Component
public class ProductService 
{
	
	private ProductBO productBOObj;

	@Autowired
	public ProductService(ProductBO productBOObj) {
		super();
		this.productBOObj = productBOObj;
	}

	public ProductBO getProductBOObj() {
		return productBOObj;
	}

	public void setProductBOObj(ProductBO productBOObj) {
		this.productBOObj = productBOObj;
	}



	public double calculateBill(String productId,String productName,double mrpValue,String dimension, String woodType) throws InvalidProductIdException
	{
		double amount=0;
		if(productId.matches("[0-9]+") && productId.length() == 8 )
		{	 	  	    	    		        	 	
			
			ApplicationContext ctx=new AnnotationConfigApplicationContext(ApplicationConfig.class);
			Product sObj=(Product)ctx.getBean("product");
			sObj.setProductId(productId);
			sObj.setProductName(productName);
			sObj.setMrpValue(mrpValue);
			sObj.setDimension(dimension);
			amount=productBOObj.calculateBill(sObj,woodType);	
			return amount;
		}
		else
		{
			throw new InvalidProductIdException("Invalid Product ID");
		}
	}

}
