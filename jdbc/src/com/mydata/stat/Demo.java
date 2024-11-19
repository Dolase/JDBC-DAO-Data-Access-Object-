package com.mydata.stat;

import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {


		try {
            //register the driver
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("Driver loaded successfully!");

			//estabalished the conn
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/adjt68","root","root");
			
			//System.out.println("connetion created successfully!");

			//create stat
			
			Statement st =con.createStatement();
			
		//	System.out.println("statment created successfully!");

			//st.execute("insert into employee(id,name,sal)values(102,'dada',100000)");
			//System.out.println("statement executed successfully!");

			//st.execute("update employee set name='abhishek',sal=200000 where id=101");
			
			st.execute("delete from employee where id=102");
			
			con.close();
			System.out.println(" executed successfully!");

		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
