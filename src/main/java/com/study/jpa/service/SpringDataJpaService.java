package com.study.jpa.service;

import com.study.jpa.repository.MemberSpringDataJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SpringDataJpaService {

    private final MemberSpringDataJpaRepository memberSpringDataJpaRepository;

}
