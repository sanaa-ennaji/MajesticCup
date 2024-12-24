package org.sanaa.brif10.majesticcup.service.Interface;

import org.sanaa.brif10.majesticcup.model.dto.Request.LoginRequestDTO;
import org.sanaa.brif10.majesticcup.model.dto.Request.RegisterRequestDTO;
import org.sanaa.brif10.majesticcup.model.dto.Response.UserResponseDTO;

public interface  UserServiceI {
    UserResponseDTO register(RegisterRequestDTO dto);
        String verify(LoginRequestDTO user);
    }

