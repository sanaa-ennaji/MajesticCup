package org.sanaa.brif10.majesticcup.model.dto.Request;

import jakarta.validation.constraints.NotBlank;

public record LoginRequestDTO(
    @NotBlank
    String username,
    @NotBlank
    String password
) {
}
