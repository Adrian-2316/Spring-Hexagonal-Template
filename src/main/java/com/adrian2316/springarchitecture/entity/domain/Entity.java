package com.adrian2316.springarchitecture.entity.domain;

import com.sun.istack.NotNull;
import lombok.*;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Entity {

    @NotNull
    private Long id;
    // Variables
    public Entity(
            @NonNull Long id) {
        this.id = id;
    }
}
