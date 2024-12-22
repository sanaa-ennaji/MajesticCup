package org.sanaa.brif10.majesticcup.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.sanaa.brif10.majesticcup.model.dto.ResultDTO;

import javax.xml.transform.Result;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ResultMapper {
    ResultDTO toDTO(Result entity);
    Result toEntity(ResultDTO dto);
    List<ResultDTO> toDTOList(List<Result> entities);
    List<Result> toEntityList(List<ResultDTO> dtos);

    void updateEntityFromRequest(ResultDTO dto, @MappingTarget Result result);
}
