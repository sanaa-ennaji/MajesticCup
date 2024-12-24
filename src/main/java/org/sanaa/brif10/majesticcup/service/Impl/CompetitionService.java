package org.sanaa.brif10.majesticcup.service.Impl;

import org.sanaa.brif10.majesticcup.model.dto.Request.CompetitionRequestDTO;
import org.sanaa.brif10.majesticcup.model.dto.Response.CompetitionResponseDTO;
import org.sanaa.brif10.majesticcup.model.entity.Competition;
import org.sanaa.brif10.majesticcup.model.mapper.CompetitionMapper;
import org.sanaa.brif10.majesticcup.repository.CompetitionRepository;
import org.sanaa.brif10.majesticcup.service.Interface.CompetitionServiceI;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompetitionService implements CompetitionServiceI {

    private final CompetitionRepository competitionRepository;
    private final CompetitionMapper competitionMapper;


    public CompetitionService(CompetitionRepository competitionRepository, CompetitionMapper competitionMapper) {
        this.competitionRepository = competitionRepository;
        this.competitionMapper = competitionMapper;
    }

    @Override
    public CompetitionResponseDTO createCompetition(CompetitionRequestDTO competitionRequestDTO) {
        Competition competition = competitionMapper.toEntity(competitionRequestDTO);
        Competition savedCompetition = competitionRepository.save(competition);
        return competitionMapper.toResponseDTO(savedCompetition);
    }

    @Override
    public CompetitionResponseDTO updateCompetition(String id, CompetitionRequestDTO competitionRequestDTO) {
        Competition competition = competitionRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Competition not found"));
        competitionMapper.updateEntityFromRequest(competitionRequestDTO, competition);
        Competition updatedCompetition = competitionRepository.save(competition);
        return competitionMapper.toResponseDTO(updatedCompetition);
    }

    @Override
    public void deleteCompetition(String id) {
        Competition competition = competitionRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Competition not found"));
        competitionRepository.delete(competition);
    }

    @Override
    public CompetitionResponseDTO getCompetitionById(String id) {
        Competition competition = competitionRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Competition not found"));
        return competitionMapper.toResponseDTO(competition);
    }

    @Override
    public List<CompetitionResponseDTO> getAllCompetitions() {
        List<Competition> competitions = competitionRepository.findAll();
        return competitions.stream()
            .map(competitionMapper::toResponseDTO)
            .collect(Collectors.toList());
    }
}
