package org.sanaa.brif10.majesticcup.model.entity;

import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Result {
    @Id
    private Long id;
    private int team1Goals;
    private int team2Goals;
    @Field("players")
    private List<Statistic> statistics;


}
