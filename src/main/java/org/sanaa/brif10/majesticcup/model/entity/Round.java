package org.sanaa.brif10.majesticcup.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Document(collection = "rounds")
    public class Round {
        @Id
        @JsonProperty("_id")
        private String id;

        @JsonProperty("roundNumber")
        private int roundNumber;
        @JsonProperty("competitionId")
        private String competitionId;

        @JsonProperty("matches")
        private List<Match> matches;

}
