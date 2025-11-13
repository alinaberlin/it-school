package com.github.alina.session25.homework.fourteen;

import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private String category;

    public Product(String name, int price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return getPrice() == product.getPrice() && Objects.equals(getName(), product.getName()) && Objects.equals(getCategory(), product.getCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getCategory());
    }
}
