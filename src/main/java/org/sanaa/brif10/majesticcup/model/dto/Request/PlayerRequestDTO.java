package org.sanaa.brif10.majesticcup.model.dto.Request;

import lombok.Data;

@Data
public class PlayerRequestDTO {
    private String name;
    private String surname;
    private String position;
    private int number;
}
