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

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Items() {
        items = new ArrayList<>();
    }

    public void addItem(Item newItem) {
        items.add(newItem);
    }

    public List<Item> getItems() {
        return items;
    }
}
