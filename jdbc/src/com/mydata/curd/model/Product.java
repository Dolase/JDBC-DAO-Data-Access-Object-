package com.mydata.curd.model;

import java.io.Serializable;

public class Product implements Serializable{

	private int product_id;
	private String product_name;
	private float product_cost;
	private int product_Quantity;
	
	
	public Product() {
		
	}


	public Product(int product_id, String product_name, float product_cost, int product_Quantity) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_cost = product_cost;
		this.product_Quantity = product_Quantity;
	}


	public int getProduct_id() {
		return product_id;
	}


	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}


	public String getProduct_name() {
		return product_name;
	}


	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}


	public float getProduct_cost() {
		return product_cost;
	}


	public void setProduct_cost(float product_cost) {
		this.product_cost = product_cost;
	}


	public int getProduct_Quantity() {
		return product_Quantity;
	}


	public void setProduct_Quantity(int product_Quantity) {
		this.product_Quantity = product_Quantity;
	}


	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_cost=" + product_cost
				+ ", product_Quantity=" + product_Quantity + "]";
	}
	
	
}
