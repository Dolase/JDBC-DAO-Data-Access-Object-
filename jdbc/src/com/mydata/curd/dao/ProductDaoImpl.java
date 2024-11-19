package com.mydata.curd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mydata.curd.model.Product;
import com.mydata.curd.util.CreateConnection;

public class ProductDaoImpl implements ProductDao{

	Connection con=CreateConnection.initConnection();
	
	@Override
	public int saveProduct(Product p) {
		int x=0;
		try {
			
			PreparedStatement ps=con.prepareStatement("insert into product value(?,?,?,?)");
			ps.setInt(1, p.getProduct_id());
			ps.setString(2, p.getProduct_name());
			ps.setFloat(3, p.getProduct_cost());
			ps.setInt(4, p.getProduct_Quantity());
			x=ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e);		}
		return x;
	}

	@Override
	public String updateProduct(int i, float c) {
		String res=null;
		
		try {
			
			PreparedStatement ps=con.prepareStatement("update product set product_cost=? where product_id=?");
			
			ps.setFloat(1, c);
			ps.setInt(2, i);
			int x=ps.executeUpdate();
			if(x>0){
				res="success";
			}else{
				res="fail";
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return res;
	}

	@Override
	public int deleteProduct(int i) {
		int x=0;
		
		try {
			
			PreparedStatement ps=con.prepareStatement("delete from product where product_id=?");
			ps.setInt(1, i);
			
			x=ps.executeUpdate();
			System.out.println("Successfully deleted..");
		} catch (Exception e) {
			System.out.println(e);
		}
		return x;
	}

	@Override
	public List<Product> listAllProduct() {
		List<Product> list=new ArrayList<>();
			
		try {
			
			PreparedStatement ps=con.prepareStatement("select * from product");
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Product product=new Product(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getInt(4));
				list.add(product);
			}
		} catch (Exception e) {
			
			
		}
		return list;
	}

	@Override
	public Product fetchAllProductById(int i) {
		
		Product p=new Product();
		try {
			PreparedStatement ps=con.prepareStatement("select * from product where product_id=?");
			ps.setInt(1, i);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				
				p.setProduct_id(rs.getInt(1));
				p.setProduct_name(rs.getString(2));
				p.setProduct_cost(rs.getFloat(3));
				p.setProduct_Quantity(rs.getInt(4));
				
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getFloat(3));
				System.out.println(rs.getInt(4));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return p;
	}

}
