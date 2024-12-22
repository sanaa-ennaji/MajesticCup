package org.sanaa.brif10.majesticcup.model.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.sanaa.brif10.majesticcup.model.dto.Request.PlayerRequestDTO;
import org.sanaa.brif10.majesticcup.model.dto.Response.PlayerResponseDTO;
import org.sanaa.brif10.majesticcup.model.entity.Player;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PlayerMapper {
    PlayerResponseDTO toResponseDTO(Player entity);
    Player toEntity(PlayerRequestDTO requestDTO);
    List<PlayerResponseDTO> toResponseDTOList(List<Player> entities);
    List<Player> toEntityList(List<PlayerRequestDTO> requestDTOs);

    void updateEntityFromRequest(PlayerRequestDTO requestDTO, @MappingTarget Player player);
}
