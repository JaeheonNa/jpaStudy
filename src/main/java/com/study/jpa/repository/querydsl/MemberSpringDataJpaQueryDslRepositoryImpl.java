package com.study.jpa.repository.querydsl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

@Repository
public class MemberSpringDataJpaQueryDslRepositoryImpl implements MemberQueryDslRepository{

    private final EntityManager em;
    private JPAQueryFactory queryFactory;

    public MemberSpringDataJpaQueryDslRepositoryImpl(EntityManager em){
        this.em = em;
        this.queryFactory = new JPAQueryFactory(em);
    }

}
