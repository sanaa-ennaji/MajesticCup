package org.sanaa.brif10.majesticcup.service.Interface;

import org.sanaa.brif10.majesticcup.model.dto.Request.CompetitionRequestDTO;
import org.sanaa.brif10.majesticcup.model.dto.Response.CompetitionResponseDTO;

import java.util.List;

public interface CompetitionServiceI {
    CompetitionResponseDTO createCompetition(CompetitionRequestDTO competitionRequestDTO);

    CompetitionResponseDTO updateCompetition(String id, CompetitionRequestDTO competitionRequestDTO);

    void deleteCompetition(String id);

    CompetitionResponseDTO getCompetitionById(String id);

    List<CompetitionResponseDTO> getAllCompetitions();
}
