package org.sanaa.brif10.majesticcup.model.dto.Request;

import lombok.Data;

@Data
public class MatchRequestDTO {
    private int round;
    private String team1;
    private String team2;
    private Long resultId;
    private String winner;
}
