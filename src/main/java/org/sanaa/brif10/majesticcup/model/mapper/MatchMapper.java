package org.sanaa.brif10.majesticcup.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.sanaa.brif10.majesticcup.model.dto.Request.MatchRequestDTO;
import org.sanaa.brif10.majesticcup.model.dto.Response.MatchResponseDTO;
import org.sanaa.brif10.majesticcup.model.entity.Match;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MatchMapper {
    MatchResponseDTO toResponseDTO(Match entity);
    Match toEntity(MatchRequestDTO requestDTO);
    List<MatchResponseDTO> toResponseDTOList(List<Match> entities);
    List<Match> toEntityList(List<MatchRequestDTO> requestDTOs);

    void updateEntityFromRequest(MatchRequestDTO requestDTO, @MappingTarget Match match);
}
