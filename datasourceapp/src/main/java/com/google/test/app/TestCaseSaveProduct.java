package com.google.test.app;

import com.google.dao.ProductDAO;
import com.google.dao.bean.ProductBean;
import com.google.dao.exp.DataSourceException;

public class TestCaseSaveProduct {
	
	public static void main(String[] args) {
		
		ProductDAO productDAO = new ProductDAO();
		
		ProductBean product = new ProductBean(111, "APPLE4S", 15000f);
		
		try {
		boolean flag =	productDAO.saveProduct(product);
		if(flag)
		{
			System.out.println("Product Saved SUCESSFULLY");
			
		}else
		{
			System.out.println(" Please check Product Save Failed ");
		}
		} catch (DataSourceException e) {
			e.printStackTrace();
		}
	}

}
