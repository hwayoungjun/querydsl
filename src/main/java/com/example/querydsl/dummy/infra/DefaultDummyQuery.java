package com.example.querydsl.dummy.infra;

import com.example.querydsl.dummy.domain.*;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DefaultDummyQuery implements DummyQuery {

    private final JPAQueryFactory queryFactory;

    @Override
    public List<DummyFirst> findAllFirst() {
        QDummyFirst dummyFirst = QDummyFirst.dummyFirst;
        return queryFactory.selectFrom(dummyFirst)
                .fetch();
    }

    @Override
    public List<DummySecond> findAllSecond() {
        QDummySecond dummySecond = QDummySecond.dummySecond;
        return queryFactory.selectFrom(dummySecond)
                .fetch();
    }
}
