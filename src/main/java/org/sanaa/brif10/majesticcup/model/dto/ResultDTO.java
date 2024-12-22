package org.sanaa.brif10.majesticcup.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class ResultDTO {
    private int team1Goals;
    private int team2Goals;
    private List<StatisticDTO> statistics;


}
