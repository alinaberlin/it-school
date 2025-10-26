package com.github.alina.session22.homework.challenge;
//Frequent Items in a Shopping Cart
//
//Description:
//In an e-commerce application, a feature is needed to quickly identify the most frequently purchased items in a user’s shopping history. Your task is to create a method that takes a list of shopping carts as input, where each shopping cart is represented as a list of product IDs (strings). The method should return a list of the K most frequently purchased items across all shopping carts. If there are ties, return all the items that have the tied frequency. You should also provide a method to add new purchases to the user's shopping history.
//
//Your solution should focus on efficiency, both in terms of time and space complexity. Consider how you could minimize the number of times you need to iterate over the data to find the solution. You are not limited to using just arrays and lists — think about what other data structures could help you solve this problem more efficiently.
//
//        Hints:
//Keeping a count of the occurrences of each item while going through the shopping carts can help in reducing the time complexity.
//Sorting a list can have a time complexity of O(n log n), but there might be a way to achieve a solution with a lower time complexity.
//After implementing the solution, demonstrate its usage in a main method by creating a list of shopping carts, finding, and printing the K most frequently purchased items. Ensure to handle edge cases such as when K is larger than the number of unique items in the shopping carts.
//

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Challenge {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.items = new ArrayList<>();
        cart.items.add("item1");
        cart.items.add("item2");
        ShoppingCart car2 = new ShoppingCart();
        car2.items = new ArrayList<>();
        car2.items.add("item3");
        car2.items.add("item4");
        car2.items.add("item3");
    ShoppingCardHistory cardHistory = new ShoppingCardHistory();
    cardHistory.addItems(cart);
    cardHistory.addItems(car2);
    System.out.println(findTheOccurance(cardHistory));
    }
    static Map<String, Integer> findTheOccurance(ShoppingCardHistory shoppingCardHistory) {
        Map<String, Integer> ocurance = new HashMap<>();
        for(String id: shoppingCardHistory.items) {
            ocurance.put(id, ocurance.getOrDefault(id, 0) + 1);//replace the if else
//            if(!ocurance.containsKey(id)) {
//                ocurance.put(id, 1);
//            }else  {
//                ocurance.put(id, ocurance.get(id) + 1);
//            }
        }

        return ocurance;
    }
}
