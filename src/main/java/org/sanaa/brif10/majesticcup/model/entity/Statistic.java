package org.sanaa.brif10.majesticcup.model.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Statistic {
    private String playerId;
    private int goals;
    private int assists;
    private int yellowCards;
    private int redCards;


}
