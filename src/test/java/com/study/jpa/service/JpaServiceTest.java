package com.study.jpa.service;

import com.study.jpa.entity.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transactional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpaServiceTest {

    private final EntityManagerFactory emf;
    private final EntityManager em;
    private final EntityTransaction tx;

    public JpaServiceTest(){
        this.emf = Persistence.createEntityManagerFactory("study");
        this.em = this.emf.createEntityManager();
        this.tx = this.em.getTransaction();
    }

    @Test
    public void jpaCheck(){
        tx.begin();

            Member member1 = new Member("Member3", 22);
            em.persist(member1);
            Member findMember = em.find(Member.class, member1.getId());

            Assertions.assertThat(member1).isEqualTo(findMember);

        tx.rollback();
        em.close();
        emf.close();
    }
}