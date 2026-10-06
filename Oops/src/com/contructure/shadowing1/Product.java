package com.contructure.shadowing1;

 class Product {
	String productName;
	 double productPrice;
	 String productCategory;
	 
	 Product(String name, double price, String category) 
	 {
		 this.productName = name;
		 this.productPrice = price;
		 this.productCategory = category;
	 }
	 void display() {
		 System.out.println("Product Name: " + productName);
		 System.out.println("Product Price: " + productPrice);
		 System.out.println("Product Category: " +productCategory);
		 
		 
	 }

}
