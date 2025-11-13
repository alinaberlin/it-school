package com.github.alina.session25.homework.fourteen;
//Given a list of products with attributes:
// name, category, and price; find the category with the highest average price.


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Fourteen {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("bred", 200, "bakery products"));
        products.add(new Product("croissant", 300, "bakery products"));
        products.add(new Product("baguette", 100, "bakery products"));
        products.add(new Product("salami", 300, "meat products"));
        products.add(new Product("sausages", 300, "meat products"));
        products.add(new Product("bacon", 600, "meat products"));
        products.add(new Product("mici", 300, "meat products"));
        products.add(new Product("frozen fish", 300, "fish and seafood products"));
        products.add(new Product("smoked fish", 35, "fish and seafood products"));
        products.add(new Product("canned fish and see food", 1500, "fish and seafood products"));
        System.out.println(findHighestAvgPrice(products));
    }

    public static String findHighestAvgPrice(List<Product> products) {
        Map<String, List<Product>> productListGrouped = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));
        Map<String, Double> categoryPrice = new HashMap<>();
        productListGrouped.forEach((k,v)->{
            double average = v.stream().mapToDouble(Product::getPrice).sum()/v.size();
            categoryPrice.put(k, average);
        });

        return categoryPrice.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    }

}
