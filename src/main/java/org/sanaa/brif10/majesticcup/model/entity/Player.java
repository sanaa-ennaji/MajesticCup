package org.sanaa.brif10.majesticcup.model.entity;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    private String id;

    private String name;

    private String surname;

    private String position;

    private int number;
}
