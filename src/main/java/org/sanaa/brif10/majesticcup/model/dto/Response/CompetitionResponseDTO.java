package org.sanaa.brif10.majesticcup.model.dto.Response;

import lombok.Data;

import java.util.List;

@Data
public class CompetitionResponseDTO {
    private String id;
    private String name;
    private int numberOfTeams;
    private List<String> teams;
    private int currentRound;
    private List<String> rounds;
}
