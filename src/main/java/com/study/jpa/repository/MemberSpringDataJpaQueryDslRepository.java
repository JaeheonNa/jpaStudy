package com.study.jpa.repository;

import com.study.jpa.entity.Member;
import com.study.jpa.repository.querydsl.MemberQueryDslRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberSpringDataJpaQueryDslRepository extends JpaRepository<Member, Long>, MemberQueryDslRepository {
}
