package com.mydata.prest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter details");
		int i=sc.nextInt();
		String n=sc.next();
		float s=sc.nextFloat();
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/adjt68","root","root");
			
			PreparedStatement ps=con.prepareStatement("update employee set name=?,sal=? where id=?");
			
			ps.setString(1, n);
			ps.setFloat(2, s);
			ps.setInt(3, i);
			
			int x=ps.executeUpdate();
			System.out.println(x+"rows affected..");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
