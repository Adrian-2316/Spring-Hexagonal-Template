package com.adrian2316.springarchitecture.entity.application.port.out.service;

import com.adrian2316.springarchitecture.common.UseCase;
import com.adrian2316.springarchitecture.entity.application.port.in.EntityUseCase;
import com.adrian2316.springarchitecture.entity.domain.Entity;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@UseCase
public class EntityService implements EntityUseCase {

    @Override
    public Entity query(Long id) {
        Entity entity;
        entity = new Entity(id);
        return entity;
    }
}
