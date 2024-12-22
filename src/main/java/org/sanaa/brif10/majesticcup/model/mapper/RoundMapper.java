package org.sanaa.brif10.majesticcup.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.sanaa.brif10.majesticcup.model.dto.Response.RoundResponseDTO;
import org.sanaa.brif10.majesticcup.model.dto.RoundRequestDTO;
import org.sanaa.brif10.majesticcup.model.entity.Round;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoundMapper {
    RoundResponseDTO toResponseDTO(Round entity);
    Round toEntity(RoundRequestDTO requestDTO);
    List<RoundResponseDTO> toResponseDTOList(List<Round> entities);
    List<Round> toEntityList(List<RoundRequestDTO> requestDTOs);

    void updateEntityFromRequest(RoundRequestDTO requestDTO, @MappingTarget Round round);
}
