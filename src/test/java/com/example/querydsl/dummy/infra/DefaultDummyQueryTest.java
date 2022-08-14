package com.example.querydsl.dummy.infra;

import com.example.querydsl.dummy.common.config.JPAQueryFactoryConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DataJpaTest
@ContextConfiguration(classes = {JPAQueryFactoryConfig.class, DefaultDummyQuery.class})
@EnableJpaRepositories(basePackages = {"com.example.querydsl.*"})
@EntityScan("com.example.querydsl.*")
class DefaultDummyQueryTest {

    @Autowired
    DefaultDummyQuery dummyQuery;

    @Test
    @DisplayName("Querydsl 을 통해 DB 조회를 할 수 있다")
    void findAllFirst() {
        dummyQuery.findAllFirst();
    }

    @Test
    @DisplayName("Querydsl 을 통해 DB 조회를 할 수 있다")
    void findAllSecond() {
        dummyQuery.findAllSecond();
    }
}