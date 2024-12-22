package org.sanaa.brif10.majesticcup.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.sanaa.brif10.majesticcup.model.dto.Request.TeamRequestDTO;
import org.sanaa.brif10.majesticcup.model.dto.Response.TeamResponseDTO;
import org.sanaa.brif10.majesticcup.model.entity.Team;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TeamMapper {
    TeamResponseDTO toResponseDTO(Team entity);
    Team toEntity(TeamRequestDTO requestDTO);
    List<TeamResponseDTO> toResponseDTOList(List<Team> entities);
    List<Team> toEntityList(List<TeamRequestDTO> requestDTOs);

    void updateEntityFromRequest(TeamRequestDTO requestDTO, @MappingTarget Team team);
}
