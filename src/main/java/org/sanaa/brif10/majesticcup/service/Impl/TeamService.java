package org.sanaa.brif10.majesticcup.service.Impl;

import org.sanaa.brif10.majesticcup.model.dto.Request.TeamRequestDTO;
import org.sanaa.brif10.majesticcup.model.dto.Response.TeamResponseDTO;
import org.sanaa.brif10.majesticcup.model.entity.Team;
import org.sanaa.brif10.majesticcup.model.mapper.TeamMapper;
import org.sanaa.brif10.majesticcup.repository.TeamRepository;
import org.sanaa.brif10.majesticcup.service.Interface.TeamServiceI;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamService implements TeamServiceI {

    private final TeamRepository teamRepository;
    private final TeamMapper teamMapper;



    public TeamService(TeamRepository teamRepository, TeamMapper teamMapper) {
        this.teamRepository = teamRepository;
        this.teamMapper = teamMapper;
    }

    @Override
    public TeamResponseDTO createTeam(TeamRequestDTO teamRequestDTO) {
        Team team = teamMapper.toEntity(teamRequestDTO);
        Team savedTeam = teamRepository.save(team);
        return teamMapper.toResponseDTO(savedTeam);
    }

    @Override
    public TeamResponseDTO updateTeam(String id, TeamRequestDTO teamRequestDTO) {
        Team team = teamRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Team not found"));
        teamMapper.updateEntityFromRequest(teamRequestDTO, team);
        Team updatedTeam = teamRepository.save(team);
        return teamMapper.toResponseDTO(updatedTeam);
    }

    @Override
    public void deleteTeam(String id) {
        Team team = teamRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Team not found"));
        teamRepository.delete(team);
    }

    @Override
    public TeamResponseDTO getTeamById(String id) {
        Team team = teamRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Team not found"));
        return teamMapper.toResponseDTO(team);
    }

    @Override
    public List<TeamResponseDTO> getAllTeams() {
        List<Team> teams = teamRepository.findAll();
        return teams.stream()
            .map(teamMapper::toResponseDTO)
            .collect(Collectors.toList());
    }
}
