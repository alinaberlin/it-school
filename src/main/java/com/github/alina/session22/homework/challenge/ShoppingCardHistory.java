package com.github.alina.session22.homework.challenge;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCardHistory {
  List<String> items = new ArrayList<>();

    public void addItems(ShoppingCart cart) {
        this.items.addAll(cart.items);
    }
}
