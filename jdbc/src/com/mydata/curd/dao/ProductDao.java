package com.mydata.curd.dao;

import java.util.List;

import com.mydata.curd.model.Product;

public interface ProductDao {

	
	public int saveProduct(Product p);
	String updateProduct(int i,float c);
	int deleteProduct(int i);
	List<Product> listAllProduct();
	Product fetchAllProductById(int i);
	
	
}
