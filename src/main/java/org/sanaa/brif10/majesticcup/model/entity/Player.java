package org.sanaa.brif10.majesticcup.model.entity;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Player {
    private String id;
    private String name;
    private String surname;
    private String position;
    private int number;
}
