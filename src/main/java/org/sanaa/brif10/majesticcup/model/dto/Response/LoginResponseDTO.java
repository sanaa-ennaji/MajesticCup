package org.sanaa.brif10.majesticcup.model.dto.Response;



public record LoginResponseDTO(
    String token,
    long expiresIn
) {
}
