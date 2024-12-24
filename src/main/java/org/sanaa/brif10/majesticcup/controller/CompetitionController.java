package org.sanaa.brif10.majesticcup.controller;

import lombok.RequiredArgsConstructor;
import org.sanaa.brif10.majesticcup.model.dto.Request.CompetitionRequestDTO;
import org.sanaa.brif10.majesticcup.model.dto.Response.CompetitionResponseDTO;
import org.sanaa.brif10.majesticcup.service.Impl.CompetitionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/competitions")
@RequiredArgsConstructor
public class CompetitionController {

    private final CompetitionService competitionService;

    @PostMapping
    public ResponseEntity<CompetitionResponseDTO> createCompetition(@RequestBody CompetitionRequestDTO competitionRequestDTO) {
        return ResponseEntity.ok(competitionService.createCompetition(competitionRequestDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CompetitionResponseDTO> updateCompetition(@PathVariable String id, @RequestBody CompetitionRequestDTO competitionRequestDTO) {
        return ResponseEntity.ok(competitionService.updateCompetition(id, competitionRequestDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCompetition(@PathVariable String id) {
        competitionService.deleteCompetition(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CompetitionResponseDTO> getCompetitionById(@PathVariable String id) {
        return ResponseEntity.ok(competitionService.getCompetitionById(id));
    }

    @GetMapping
    public ResponseEntity<List<CompetitionResponseDTO>> getAllCompetitions() {
        return ResponseEntity.ok(competitionService.getAllCompetitions());
    }
}
