package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class inventoryDAO implements inventoryDAOinter {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleTest");
    EntityManager em = emf.createEntityManager();


    @Override
    public void addinventory(inventory i) {
        em.getTransaction().begin();
        em.persist(i);
        em.getTransaction().commit();
        em.close();

        System.out.println("Entity added");

    }



    @Override
    public void deleteinventory(int i) {
        em.getTransaction().begin();
       // em.find(inventory.class,i);
        em.remove(em.find(inventory.class,i));
        em.getTransaction().commit();
        em.close();
System.out.println("Data Deleted");
    }

    @Override
    public inventory findinventory(int i) {
        return em.find(inventory.class, i);
    }
}
