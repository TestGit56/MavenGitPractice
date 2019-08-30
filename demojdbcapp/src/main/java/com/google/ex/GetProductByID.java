package com.google.ex;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.ResultSet;

public class GetProductByID
	{
public static void main(String args[]) throws Exception
{

		Scanner scan = new Scanner(System.in);
		System.out.println(" Please Enter ProductID ");
		int id = scan.nextInt();
		

	String sql = "Select PID ,PNAME,PRICE From Product where PID = ?";


	Class.forName("oracle.jdbc.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setInt(1,id);
	
	ResultSet rs = ps.executeQuery();
	
		if(rs.next())
		{
		  System.out.println(rs.getInt("PID")+" : "+rs.getString("PNAME")+" : "+rs.getFloat("PRICE"));	
		}else
		{
	System.out.println(" Invalid Product ID ");
		}
	rs.close();
	ps.close();
	con.close();
}
	}












