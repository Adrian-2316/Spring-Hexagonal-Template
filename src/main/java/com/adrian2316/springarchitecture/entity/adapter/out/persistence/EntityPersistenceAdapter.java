package com.adrian2316.springarchitecture.entity.adapter.out.persistence;

import com.adrian2316.springarchitecture.common.PersistenceAdapter;
import com.adrian2316.springarchitecture.entity.application.port.in.EntityUseCase;
import com.adrian2316.springarchitecture.entity.domain.Entity;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@PersistenceAdapter
public class EntityPersistenceAdapter implements EntityUseCase {
    private final SpringDataEntityRepository springDataEntityRepository;
    private final EntityMapper entityMapper;

    @Override
    public Entity query(Long id) {
        return null;
    }
}
