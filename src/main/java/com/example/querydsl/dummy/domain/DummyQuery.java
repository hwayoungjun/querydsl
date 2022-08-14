package com.example.querydsl.dummy.domain;

import java.util.List;

public interface DummyQuery {

    List<DummyFirst> findAllFirst();

    List<DummySecond> findAllSecond();
}
