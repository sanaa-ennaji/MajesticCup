package org.sanaa.brif10.majesticcup.model.dto;

import lombok.Data;
import java.util.List;

@Data
public class RoundRequestDTO {
    private int roundNumber;
    private String competitionId;
    private List<String> matches;

}
