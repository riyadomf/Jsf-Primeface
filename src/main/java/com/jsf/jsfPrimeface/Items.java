package com.jsf.jsfPrimeface;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@SessionScoped
@Named("items")
public class Items implements Serializable {
    private List<Item> items;
    private String code;
    private String name;
    private String category;
    private double price;

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Items() {
        items = new ArrayList<>();
    }

    public void addItem() {
        Item newItem = new Item(code, name, category, price);
        items.add(newItem);
        clearFields();
    }

    private void clearFields() {
        code = null;
        name = null;
        category = null;
        price = 0.0;
    }

    // Getters and setters for properties

    public List<Item> getItems() {
        return items;
    }
}
