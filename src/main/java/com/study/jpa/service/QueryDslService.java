package com.study.jpa.service;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.study.jpa.repository.MemberSpringDataJpaQueryDslRepository;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QueryDslService {

    private final MemberSpringDataJpaQueryDslRepository memberSpringDataJpaQueryDslRepository;

}
