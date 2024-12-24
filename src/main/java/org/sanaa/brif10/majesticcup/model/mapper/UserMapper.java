package org.sanaa.brif10.majesticcup.model.mapper;

import org.mapstruct.Mapper;
import org.sanaa.brif10.majesticcup.model.dto.Request.UserRequestDTO;
import org.sanaa.brif10.majesticcup.model.dto.Response.UserResponseDTO;
import org.sanaa.brif10.majesticcup.model.entity.MajeUser;

import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.sanaa.brif10.majesticcup.model.entity.Role;


@Mapper(componentModel = "spring")
public interface UserMapper {


    @Mapping(source = "role.id", target = "roleId")
    @Mapping(source = "username", target = "username")
    UserResponseDTO toResponseDTO(MajeUser entity);

    @Mapping(source = "roleId", target = "role", qualifiedByName = "mapRole")
    @Mapping(source = "userName", target = "username")
    MajeUser toEntity(UserRequestDTO requestDTO);

    @Named("mapRole")
    default Role mapRole(Long roleId) {
        if (roleId == null) {
            return null;
        }
        Role role = new Role();
        role.setId(roleId);
        return role;
    }
}
