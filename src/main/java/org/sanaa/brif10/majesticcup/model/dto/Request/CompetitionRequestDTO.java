package org.sanaa.brif10.majesticcup.model.dto.Request;


import lombok.Data;

@Data
public class CompetitionRequestDTO {
    private String name;
    private int numberOfTeams;
    private int currentRound;

}
