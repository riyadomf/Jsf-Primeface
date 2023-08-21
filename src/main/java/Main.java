import entity.Item;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Employee employee = new Employee();
//        employee.setFirstName("Omar");
//        employee.setLastName("Faru");

        EntityManager entityManager;
        try (EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default")) {
            entityManager = entityManagerFactory.createEntityManager();
//            Item it = entityManager.find(Item.class, 2);
            List<Item> items = entityManager.createNamedQuery("Item.findAll", Item.class).getResultList();
            for (Item item : items) {
                System.out.println(item);
            }
        }



//        entityManager.getTransaction().begin();
//        entityManager.persist(employee);
//        entityManager.getTransaction().commit();
//        entityManager.close();
//        entityManagerFactory.close();
    }
}