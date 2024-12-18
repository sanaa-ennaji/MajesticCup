package org.sanaa.brif10.majesticcup.model.entity;

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
    private String id;
    private int roundNumber;
    private String competitionId;
    private List<Match> matches;

}
