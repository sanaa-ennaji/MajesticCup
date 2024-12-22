package org.sanaa.brif10.majesticcup.service.Interface;

import org.sanaa.brif10.majesticcup.model.dto.Request.MatchRequestDTO;
import org.sanaa.brif10.majesticcup.model.dto.Response.MatchResponseDTO;

import java.util.List;

public interface MatchServiceI {
    MatchResponseDTO createMatch(MatchRequestDTO matchRequestDTO);

    MatchResponseDTO updateMatch(String id, MatchRequestDTO matchRequestDTO);

    void deleteMatch(String id);

    MatchResponseDTO getMatchById(String id);

    List<MatchResponseDTO> getAllMatches();
}
