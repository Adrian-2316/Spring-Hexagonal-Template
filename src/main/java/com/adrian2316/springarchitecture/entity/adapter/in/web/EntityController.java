package com.adrian2316.springarchitecture.entity.adapter.in.web;

import com.adrian2316.springarchitecture.common.WebAdapter;
import com.adrian2316.springarchitecture.entity.application.port.in.EntityUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
public class EntityController {
    private final EntityUseCase entityUseCase;


    //@PreAuthorize()
    @GetMapping(path = "/entity/command/{id}")
    void query(
            @PathVariable("id") Long id){

        entityUseCase.query(id);
    }
}
