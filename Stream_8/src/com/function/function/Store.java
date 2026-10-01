package com.function.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Product {
    String name;
    double basePrice;
    String category;

    Product(String name, double basePrice, String category) {
        this.name = name;
        this.basePrice = basePrice;
        this.category = category;
    }
}

public class Store {
    public static void main(String[] args) {

        ArrayList<Product> catalog = new ArrayList<>();
        catalog.add(new Product("Laptop", 1200.0, "Electronics"));
        catalog.add(new Product("Smartphone", 800.0, "Electronics"));
        catalog.add(new Product("Coffee Mug", 15.0, "Kitchen"));
        catalog.add(new Product("Desk Chair", 150.0, "Furniture"));

        // 1. Function: Calculates total price including category-based tax
        Function<Product, Double> priceCalculator = prod -> {
            double taxRate;
            switch (prod.category) {
                case "Electronics":
                    taxRate = 0.18; // 18% tax
                    break;
                case "Furniture":
                    taxRate = 0.12; // 12% tax
                    break;
                default:
                    taxRate = 0.05; // 5% tax for everything else
                    break;
            }
            return prod.basePrice + (prod.basePrice * taxRate);
        };

        // 2. Predicate: Checks if the final calculated price is > $200.0 (Premium Items)
        Predicate<Double> isPremium = finalPrice -> finalPrice > 200.0;

        // 3. Loop: Apply both functional interfaces
        for (Product prod : catalog) {
            // Apply function to get the transformed data (Double)
            double totalCost = priceCalculator.apply(prod);

            // Test condition using the Predicate
            if (isPremium.test(totalCost)) {
                System.out.println("Premium Item: " + prod.name 
                        + " | Base Price: $" + prod.basePrice 
                        + " | Total with Tax: $" + totalCost);
            }
        }
    }
}
