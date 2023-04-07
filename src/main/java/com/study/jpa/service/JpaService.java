package com.study.jpa.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.springframework.stereotype.Service;

@Service
public class JpaService {

    private final EntityManagerFactory emf;
    private final EntityManager em;
    private final EntityTransaction tx;

    public JpaService(){
        this.emf = Persistence.createEntityManagerFactory("study");
        this.em = this.emf.createEntityManager();
        this.tx = this.em.getTransaction();
    }


}
