package org.sanaa.brif10.majesticcup.model.dto.Response;

import lombok.Data;

@Data
public class MatchResponseDTO {
    private String id;
    private int round;
    private String team1;
    private String team2;
    private Long resultId;
    private String winner;
}
