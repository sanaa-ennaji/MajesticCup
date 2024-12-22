package org.sanaa.brif10.majesticcup.service.Impl;

import org.sanaa.brif10.majesticcup.model.dto.Request.MatchRequestDTO;
import org.sanaa.brif10.majesticcup.model.dto.Response.MatchResponseDTO;
import org.sanaa.brif10.majesticcup.model.entity.Match;
import org.sanaa.brif10.majesticcup.model.mapper.MatchMapper;
import org.sanaa.brif10.majesticcup.repository.MatchRepository;
import org.sanaa.brif10.majesticcup.service.Interface.MatchServiceI;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MatchService implements MatchServiceI {

    private final MatchRepository matchRepository;
    private final MatchMapper matchMapper;


    public MatchService(MatchRepository matchRepository, MatchMapper matchMapper) {
        this.matchRepository = matchRepository;
        this.matchMapper = matchMapper;
    }

    @Override
    public MatchResponseDTO createMatch(MatchRequestDTO matchRequestDTO) {
        Match match = matchMapper.toEntity(matchRequestDTO);
        Match savedMatch = matchRepository.save(match);
        return matchMapper.toResponseDTO(savedMatch);
    }

    @Override
    public MatchResponseDTO updateMatch(String id, MatchRequestDTO matchRequestDTO) {
        Match match = matchRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Match not found"));
        matchMapper.updateEntityFromRequest(matchRequestDTO, match);
        Match updatedMatch = matchRepository.save(match);
        return matchMapper.toResponseDTO(updatedMatch);
    }

    @Override
    public void deleteMatch(String id) {
        Match match = matchRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Match not found"));
        matchRepository.delete(match);
    }

    @Override
    public MatchResponseDTO getMatchById(String id) {
        Match match = matchRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Match not found"));
        return matchMapper.toResponseDTO(match);
    }

    @Override
    public List<MatchResponseDTO> getAllMatches() {
        List<Match> matches = matchRepository.findAll();
        return matches.stream()
            .map(matchMapper::toResponseDTO)
            .collect(Collectors.toList());
    }
}
