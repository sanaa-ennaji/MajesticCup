package org.sanaa.brif10.majesticcup.model.entity;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    private String id;

    @Field("name")
    private String name;

    @Field("surname")
    private String surname;

    @Field("position")
    private String position;

    @Field("number")
    private int number;
}

