package com.adrian2316.springarchitecture.entity.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

interface  SpringDataEntityRepository extends JpaRepository<EntityJpaEntity, Long> {

    @Query("select a from EntityJpaEntity a " +
            "where a.id = :id ")
    List<EntityJpaEntity> findByIdSampleQuery(
            @Param("id") Long id);
}
