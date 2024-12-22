package org.sanaa.brif10.majesticcup.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.sanaa.brif10.majesticcup.model.dto.Request.UserRequestDTO;
import org.sanaa.brif10.majesticcup.model.dto.Response.UserResponseDTO;
import org.springframework.security.core.userdetails.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserResponseDTO toResponseDTO(User entity);
    User toEntity(UserRequestDTO requestDTO);
    List<UserResponseDTO> toResponseDTOList(List<User> entities);
    List<User> toEntityList(List<UserRequestDTO> requestDTOs);

    void updateEntityFromRequest(UserRequestDTO requestDTO, @MappingTarget User user);
}
