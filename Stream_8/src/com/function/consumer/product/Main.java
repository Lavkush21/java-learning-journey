package com.function.consumer.product;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Product {
	String name;
	double originalPrice;
	String category;
	
	Product(String name, double originalPrice, String category)
	{
		this.name = name;
		this.originalPrice = originalPrice;
		this.category = category;
	}
}
public class Main {

	public static void main(String[] args) {
	ArrayList<Product> productList = new ArrayList<>();
	
	productList.add(new Product("Laptop", 12000.0, "Electronics"));
	productList.add(new Product("Smartphone", 800.0, "Electronics"));
	productList.add(new Product("Headphone", 150.0, "Audio"));
	productList.add(new Product("Smartwatch", 350.0, "Wearables"));
	
	

    // 1. Function: Applies a 15% store discount and returns the new price
	Function<Product, Double> applyDiscount = prod ->prod.originalPrice*.85;
	


    // 2. Predicate: Checks if the final price qualifies as a "Premium Item" (over $300)
	
	Predicate<Double>isPremiumPrice = price ->price > 300.0;
	
    // 3. Consumer: Sends/Prints a luxury marketing alert for the item
	
	Consumer<Product>sendAlert = prod-> {
		
		System.out.println("Luxury Alert: " + prod.name.toUpperCase());
		System.out.println("Category: " + prod.category);
		System.out.println("Original Price: " + prod.originalPrice);
	};
	
	
	 // Processing the inventory
    System.out.println("--- Processing Premium Discounted Items ---");
    
    for(Product p : productList) {
    	
    	double finalPrice = applyDiscount.apply(p);
    	
    	if(isPremiumPrice.test(finalPrice)) {
    		sendAlert.accept(p);
    	
    	       System.out.printf("Special Promo Price: $%.2f%n", finalPrice);
               System.out.println("------------------------------------------");
    	}
    }
	}

}
