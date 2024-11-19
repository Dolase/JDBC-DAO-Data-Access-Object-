package com.mydata.prest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		
			
			
			Scanner sc=new Scanner(System.in);
					
					System.out.println("Enter details");
					int i=sc.nextInt();
					
					try {
						
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/adjt68","root","root");
						
						PreparedStatement ps=con.prepareStatement("delete from employee where id=?");
						
						ps.setInt(1, i);
						int x=ps.executeUpdate();
						System.out.println(x+"rows are affected..");
						
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
