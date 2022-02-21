package com.adrian2316.springarchitecture.entity.application.port.in;

import com.adrian2316.springarchitecture.entity.domain.Entity;

public interface EntityUseCase {
    Entity query(Long id);
}
