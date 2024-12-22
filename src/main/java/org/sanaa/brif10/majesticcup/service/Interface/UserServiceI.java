package org.sanaa.brif10.majesticcup.service.Interface;

import org.sanaa.brif10.majesticcup.model.dto.Request.UserRequestDTO;
import org.sanaa.brif10.majesticcup.model.dto.Response.UserResponseDTO;
import org.sanaa.brif10.majesticcup.model.entity.User;

import java.util.List;

public interface UserServiceI {
    UserResponseDTO create(UserRequestDTO userRequestDTO);

    UserResponseDTO update(String id, UserRequestDTO userRequestDTO);

    void delete(String id);

    UserResponseDTO getById(String id);

    List<UserResponseDTO> getAll();

//    List<UserResponseDTO> getByRole(User.UserRole role);
}
