package com.adrian2316.springarchitecture.entity.adapter.in.web;

import com.adrian2316.springarchitecture.entity.application.port.in.EntityUseCase;

import com.adrian2316.springarchitecture.entity.domain.Entity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.mockito.BDDMockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

class EntityControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EntityUseCase entityUseCase;

    @Test
    void testEntity() throws Exception {

        mockMvc.perform(post("/entity/command/{id}",
                        11L)
                        .header("Content-Type", "application/json"))
                .andExpect(status().isOk());

        then(entityUseCase).should()
                .query(eq((11L)));
    }
}
