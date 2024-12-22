package org.sanaa.brif10.majesticcup.model.dto;

import lombok.Data;

@Data
public class StatisticDTO {
    private String playerId;
    private int goals;
    private int assists;
    private int yellowCards;
    private int redCards;
}
