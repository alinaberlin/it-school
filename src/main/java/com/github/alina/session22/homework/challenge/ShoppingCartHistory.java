package com.github.alina.session22.homework.challenge;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartHistory {
  private  List<String> items = new ArrayList<>();

    public List<String> getItems() {
        return items;
    }

    public void addItems(ShoppingCart cart) {
        this.items.addAll(cart.getItems());
    }
}
