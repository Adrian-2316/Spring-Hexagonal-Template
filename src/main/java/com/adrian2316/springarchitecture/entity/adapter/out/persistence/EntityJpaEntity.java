package com.adrian2316.springarchitecture.entity.adapter.out.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name = "entity")
@Data
@AllArgsConstructor
@NoArgsConstructor
class EntityJpaEntity {

    @javax.persistence.Id
    @Id
    @GeneratedValue
    private Long id;
}