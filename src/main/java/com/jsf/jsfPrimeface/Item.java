package com.jsf.jsfPrimeface;

import java.io.Serializable;

public class Item implements Serializable {
    private String code;
    private String name;
    private String category;
    private double price;

    public Item(String code, String name, String category, double price) {
        this.code = code;
        this.name = name;
        this.category = category;
        this.price = price;
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

}
