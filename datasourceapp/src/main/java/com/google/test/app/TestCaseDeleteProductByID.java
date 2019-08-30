package com.google.test.app;

import com.google.dao.ProductDAO;
import com.google.dao.bean.ProductBean;
import com.google.dao.exp.DataSourceException;

public class TestCaseDeleteProductByID {
	
	public static void main(String[] args) {
		
		ProductDAO productDAO = new ProductDAO();
		
		try {
		boolean flag =	productDAO.deleteProductById(323);
		if(flag)
		{
			System.out.println("Product Deleted SUCESSFULLY");
			
		}else
		{
			System.out.println(" PRODUCT ID DOES Not EXIST");
		}
		} catch (DataSourceException e) {
			e.printStackTrace();
		}
	}

}
