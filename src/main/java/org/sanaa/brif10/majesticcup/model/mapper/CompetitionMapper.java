package org.sanaa.brif10.majesticcup.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.sanaa.brif10.majesticcup.model.dto.Request.CompetitionRequestDTO;
import org.sanaa.brif10.majesticcup.model.dto.Response.CompetitionResponseDTO;
import org.sanaa.brif10.majesticcup.model.entity.Competition;

import java.util.List;


@Mapper(componentModel = "spring")
public interface CompetitionMapper {
    CompetitionResponseDTO toResponseDTO(Competition entity);
    Competition toEntity(CompetitionRequestDTO requestDTO);
    List<CompetitionResponseDTO> toResponseDTOList(List<Competition> entities);
    List<Competition> toEntityList(List<CompetitionRequestDTO> requestDTOs);

    void updateEntityFromRequest(CompetitionRequestDTO requestDTO, @MappingTarget Competition competition);
}
