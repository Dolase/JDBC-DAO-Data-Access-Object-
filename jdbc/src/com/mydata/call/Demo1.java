package com.mydata.call;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter details");
		int i=sc.nextInt();
		String n=sc.next();
		float s=sc.nextFloat();
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/adjt68","root","root");
			
			CallableStatement ps=con.prepareCall("{call InsertEmployee(?,?,?)}");
			
			ps.setInt(1, i);
			ps.setString(2, n);
			ps.setFloat(3, s);
			
			int x=ps.executeUpdate();
			System.out.println(x+"rows are affected..");
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
	}

}
