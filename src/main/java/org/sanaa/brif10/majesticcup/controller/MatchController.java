package org.sanaa.brif10.majesticcup.controller;

import lombok.RequiredArgsConstructor;
import org.sanaa.brif10.majesticcup.model.dto.Request.MatchRequestDTO;
import org.sanaa.brif10.majesticcup.model.dto.Response.MatchResponseDTO;
import org.sanaa.brif10.majesticcup.service.Impl.MatchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/matches")
@RequiredArgsConstructor
public class MatchController {

    private final MatchService matchService;


    @PostMapping
    public ResponseEntity<MatchResponseDTO> createMatch(@RequestBody MatchRequestDTO matchRequestDTO) {
        return ResponseEntity.ok(matchService.createMatch(matchRequestDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<MatchResponseDTO> updateMatch(@PathVariable String id, @RequestBody MatchRequestDTO matchRequestDTO) {
        return ResponseEntity.ok(matchService.updateMatch(id, matchRequestDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMatch(@PathVariable String id) {
        matchService.deleteMatch(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MatchResponseDTO> getMatchById(@PathVariable String id) {
        return ResponseEntity.ok(matchService.getMatchById(id));
    }

    @GetMapping
    public ResponseEntity<List<MatchResponseDTO>> getAllMatches() {
        return ResponseEntity.ok(matchService.getAllMatches());
    }
}
