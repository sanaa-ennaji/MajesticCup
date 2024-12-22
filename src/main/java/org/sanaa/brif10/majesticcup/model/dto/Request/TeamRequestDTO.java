package org.sanaa.brif10.majesticcup.model.dto.Request;

import lombok.Data;

import java.util.List;
@Data
public class TeamRequestDTO {
    private String name;
    private String city;
    private List<PlayerRequestDTO> players;
}
