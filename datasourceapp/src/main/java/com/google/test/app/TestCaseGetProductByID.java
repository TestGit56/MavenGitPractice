package com.google.test.app;

import com.google.dao.ProductDAO;
import com.google.dao.bean.ProductBean;
import com.google.dao.exp.DataSourceException;

public class TestCaseGetProductByID {
	
	public static void main(String[] args) {
		
		ProductDAO productDAO = new ProductDAO();
		
		try {
		ProductBean product =	productDAO.getProductById(111);
		if(product != null)
		{
			System.out.println(product.toString());
			
		}else
		{
			System.out.println(" PRODUCT ID DOES Not EXIST");
		}
		} catch (DataSourceException e) {
			e.printStackTrace();
		}
	}

}
