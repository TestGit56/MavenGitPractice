package com.google.dao;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class DataSourceUtil {

	private static final BasicDataSource DATA_SOURCE ;
	
	static
	{

		synchronized (DataSourceUtil.class) {
			DATA_SOURCE = new BasicDataSource();
			DATA_SOURCE.setDriverClassName("oracle.jdbc.OracleDriver");
			DATA_SOURCE.setUsername("system");
			DATA_SOURCE.setPassword("tiger");
			DATA_SOURCE.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
					
		}
	
	}
	
	public static DataSource getDataSource()
	{
		return DATA_SOURCE;
	}
}
