package com.mydata.curd.util;

import java.sql.Connection;
import java.sql.DriverManager;

import org.omg.CORBA.PUBLIC_MEMBER;

public class CreateConnection {
	public static String dname="com.mysql.jdbc.Driver";
	public static String url="jdbc:mysql://localhost:3306/adjt68";
	public static String username="root";
	public static String password="root";
	public static Connection initConnection(){
		Connection con=null;
		try {
			Class.forName(dname);
			
			con=DriverManager.getConnection(url, username, password);
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
