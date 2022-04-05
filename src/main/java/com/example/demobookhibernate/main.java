package com.example.demobookhibernate;
import entities.Author;
import entities.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Book b = new Book("La Celestina");
        Book b2 = new Book("Crónica de una muerte anunciada");
        Author a = new Author("Gabriel", "García-Márquez");
        a.addBook(b);
        a.addBook(b2);
        System.out.println(a);
        entityManager.persist(a);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

    }
}
