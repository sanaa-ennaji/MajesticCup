package org.sanaa.brif10.majesticcup.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.sanaa.brif10.majesticcup.model.dto.Request.UserRequestDTO;
import org.sanaa.brif10.majesticcup.model.dto.Response.UserResponseDTO;
import org.springframework.security.core.userdetails.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "role", source = "role.name")
    UserResponseDTO toResponseDTO(User user);

    @Mapping(target = "role", source = "role")
    User toEntity(UserRequestDTO userRequestDTO);

    List<UserResponseDTO> toResponseDTOList(List<User> users);

    List<User> toEntityList(List<UserRequestDTO> userRequestDTOs);

    void updateEntityFromRequest(UserRequestDTO userRequestDTO, @MappingTarget User user);
}
