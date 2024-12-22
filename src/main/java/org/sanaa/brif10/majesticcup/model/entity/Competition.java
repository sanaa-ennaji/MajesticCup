package org.sanaa.brif10.majesticcup.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "competitions")
public class Competition {
    @Id
    @JsonProperty("_id")
    private String id;

    private String name;

    @Field("numberOfTeams")
    private int numberOfTeams;

    @Field("teams")
    private List<String> teams;

    @Field("currentRound")
    private int currentRound;

    @Field("rounds")
    private List<String> rounds;
}
