package com.study.jpa.repository.querydsl;


import com.querydsl.jpa.impl.JPAQueryFactory;
import com.study.jpa.entity.Member;
import com.study.jpa.entity.QMember;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.study.jpa.entity.QMember.member;

@SpringBootTest
@Transactional
class MemberSpringDataJpaQueryDslRepositoryImplTest {

    @PersistenceContext
    private EntityManager em;
    private JPAQueryFactory queryFactory;

    @PostConstruct
    public void init(){
        this.queryFactory = new JPAQueryFactory(this.em);
    }

    @Test
    public void querydslCheck(){


        Member member1 = new Member("member1", 1);
        this.em.persist(member1);


        Member findMember = this.queryFactory.select(member)
                            .from(member)
                            .fetchOne();

        Assertions.assertThat(member1).isEqualTo(findMember);

    }

}