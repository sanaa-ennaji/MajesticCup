package org.sanaa.brif10.majesticcup.model.dto.Request;

import lombok.Data;

@Data
public class UserRequestDTO {
    private String username;
    private String password;
    private String role;
}
