package org.sanaa.brif10.majesticcup.model.dto.Response;

import lombok.Data;

import java.util.List;
@Data
public class TeamResponseDTO {
    private String id;
    private String name;
    private String city;
    private List<PlayerResponseDTO> players;
}
