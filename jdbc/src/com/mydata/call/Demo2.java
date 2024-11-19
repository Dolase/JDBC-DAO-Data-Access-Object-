package com.mydata.call;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
				
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/adjt68","root","root");
					
					CallableStatement ps=con.prepareCall("{call viewEmp()}");
				
					ResultSet rs =ps.executeQuery();
					
					while(rs.next()){
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
					}
					
					con.close();
					
				} catch (Exception e) {
					
					System.out.println(e);
				}
	}

}
