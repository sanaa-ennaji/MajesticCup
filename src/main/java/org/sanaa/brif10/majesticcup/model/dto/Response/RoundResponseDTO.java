package org.sanaa.brif10.majesticcup.model.dto.Response;

import lombok.Data;

import java.util.List;
@Data
public class RoundResponseDTO {
    private String id;
    private int roundNumber;
    private String competitionId;
    private List<String> matches;
}
