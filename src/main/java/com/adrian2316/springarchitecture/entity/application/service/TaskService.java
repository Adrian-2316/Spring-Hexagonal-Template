package com.adrian2316.springarchitecture.entity.application.service;

import com.adrian2316.springarchitecture.common.UseCase;
import com.adrian2316.springarchitecture.entity.application.port.in.EntityUseCase;
import com.adrian2316.springarchitecture.entity.domain.Entity;
import lombok.RequiredArgsConstructor;

import javax.transaction.Transactional;

@UseCase
@Transactional
@RequiredArgsConstructor
public class TaskService implements EntityUseCase {
    @Override
    public Entity query(Long id) {
        // Operations
        return null;
    }
}
