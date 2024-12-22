package org.sanaa.brif10.majesticcup.service.Interface;


import org.sanaa.brif10.majesticcup.model.dto.Request.TeamRequestDTO;
import org.sanaa.brif10.majesticcup.model.dto.Response.TeamResponseDTO;

import java.util.List;

public interface TeamServiceI {
    TeamResponseDTO createTeam(TeamRequestDTO teamRequestDTO);

    TeamResponseDTO updateTeam(String id, TeamRequestDTO teamRequestDTO);

    void deleteTeam(String id);

    TeamResponseDTO getTeamById(String id);

    List<TeamResponseDTO> getAllTeams();
}
