package com.study.jpa.repository;

import com.study.jpa.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberSpringDataJpaRepository extends JpaRepository<Member, Long> {
}
