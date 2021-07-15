package com.jpa.util;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jpa.entity.inheritance.Animal;
import com.jpa.entity.inheritance.Cat;
import com.jpa.entity.inheritance.Dog;
import com.jpa.entity.university.Book;
import com.jpa.entity.university.BookDetails;
import com.jpa.entity.university.BookId;
import com.jpa.entity.university.CourseEntity;
import com.jpa.entity.university.GenderEnum;
import com.jpa.entity.university.Student;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@Transactional
public class HibernateUtil {

    @Autowired
    EntityManagerFactory emf;

    public void insertNewBook() {

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.getTransaction().commit();
        log.info("insertBook end");		
    }

    public void insertNewCourse() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        CourseEntity course = new CourseEntity().setName("JPA");

        em.persist(course);

        CourseEntity course2 = new CourseEntity().setName("Java");

        em.persist(course2);

        em.getTransaction().commit();
        log.info("insertNewCourse end");		
    }

    public void insertNewStudent() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Student student = new Student()
                .setName("John Smith")
                .setGender(GenderEnum.NOT_KNOWN)
                .setCNP("1234567890123");

        em.persist(student);

        em.getTransaction().commit();
        log.info("insertBook end");		
    }

    public void insertAnimals() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        List<Animal> animalList = Arrays.asList(
                new Cat().setPurrs(true),
                new Dog().setBites(true)
                );
        for(Animal animal: animalList) {
            em.persist(animal);
            em.flush();
            em.clear();
        }

        em.getTransaction().commit();
        log.info("insertBook end");		
    }



}
