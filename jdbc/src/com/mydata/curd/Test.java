package com.mydata.curd;

import java.util.List;
import java.util.Scanner;

import com.mydata.curd.dao.ProductDao;
import com.mydata.curd.dao.ProductDaoImpl;
import com.mydata.curd.model.Product;
import com.mydata.curd.util.CreateConnection;

public class Test {

	
	public static void main(String[] args) {
		ProductDao pd=new ProductDaoImpl();
		
		Scanner sc=new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("1.insert\n2.update\n3.read\n4.delete\n5.readById\n6.exist");
			System.out.println("Enter choice");
			choice=sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter pid,pname,cost,quantity");
				Product p=new Product(sc.nextInt(), sc.next(), sc.nextFloat(), sc.nextInt());
				int x=pd.saveProduct(p);
				System.out.println(x+"row are affected..");
				
				break;

			case 2:
			System.out.println("Enter pid,cost");
			int i=sc.nextInt();
			float c=sc.nextFloat();
		String status=pd.updateProduct(i, c);
		if(status.equals("success")){
			System.out.println("row updated");
		}
		else{
			System.out.println("error..");
		}
			break;
			
			case 3:
				List<Product> product=pd.listAllProduct();
				for (Product product2 : product) {
					System.out.println(product2);
				}
				
				break;
			case 4:
				System.out.println("Enter id..");
				int id=sc.nextInt();
				pd.deleteProduct(id);
				break;
				
			case 5:
				System.out.println("Enter id..");
				int ids=sc.nextInt();
				pd.fetchAllProductById(ids);
				break;
				
			case 6:
				try {
					CreateConnection.initConnection().close();
					
				} catch (Exception e) {
					System.out.println(e);
				}
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Input..");
				break;
			}
			
			
		} while (true);
		
	}

}
