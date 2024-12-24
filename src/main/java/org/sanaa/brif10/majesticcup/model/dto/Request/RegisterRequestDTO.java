package org.sanaa.brif10.majesticcup.model.dto.Request;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequestDTO {
    @NotBlank(message = "Username cannot be blank.")
    String username;

    @NotBlank(message = "Password cannot be blank.")
    String password;

    Long roleId ;

}
