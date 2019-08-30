package com.google.test.app;

import com.google.dao.ProductDAO;
import com.google.dao.bean.ProductBean;
import com.google.dao.exp.DataSourceException;

public class TestCaseUpdateProductPriceByID {
	
	public static void main(String[] args) {
		
		ProductDAO productDAO = new ProductDAO();
		
		try {
		boolean flag =	productDAO.updatePriceById(111, 30000f);
		if(flag)
		{
			System.out.println(" PRICE UPDATED SUCESSFULLY");
			
		}else
		{
			System.out.println(" PRODUCT ID DOES Not EXIST");
		}
		} catch (DataSourceException e) {
			e.printStackTrace();
		}
	}

}
