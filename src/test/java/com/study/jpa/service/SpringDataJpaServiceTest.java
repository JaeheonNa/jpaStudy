package com.study.jpa.service;

import com.study.jpa.entity.Member;
import com.study.jpa.repository.MemberSpringDataJpaRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest
@Transactional
class SpringDataJpaServiceTest {

    @Autowired
    private MemberSpringDataJpaRepository repository;

    @Test
    public void sringDataJpaCheck(){
        Member member0 = new Member("member0", 20);
        repository.save(member0);

        Member findMember = repository.findById(member0.getId()).get();

        Assertions.assertThat(findMember).isEqualTo(member0);
    }

}