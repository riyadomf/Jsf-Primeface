package com.jsf.jsfPrimeface;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import entity.Item;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;

@SessionScoped
@Named(value="items")
public class Items implements Serializable {
    @PersistenceContext(unitName = "default")
    private EntityManager entityManager;

    public Items() {
    }

    public void addItem(Item newItem) {
        entityManager.getTransaction().begin();
        entityManager.persist(newItem);
        entityManager.getTransaction().commit();
    }

    public List<Item> getItems() {
        return entityManager.createQuery("SELECT i FROM Item i", Item.class).getResultList();
    }
}
