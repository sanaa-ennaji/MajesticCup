package org.sanaa.brif10.majesticcup.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.sanaa.brif10.majesticcup.model.dto.StatisticDTO;
import org.sanaa.brif10.majesticcup.model.entity.Statistic;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StatisticMapper {
    StatisticDTO toDTO(Statistic entity);
    Statistic toEntity(StatisticDTO dto);
    List<StatisticDTO> toDTOList(List<Statistic> entities);
    List<Statistic> toEntityList(List<StatisticDTO> dtos);

    void updateEntityFromRequest(StatisticDTO dto, @MappingTarget Statistic statistic);
}
