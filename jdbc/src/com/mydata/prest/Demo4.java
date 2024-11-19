package com.mydata.prest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo4 {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/adjt68","root","root");
			
			PreparedStatement ps=con.prepareStatement("select * from employee");
			
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
