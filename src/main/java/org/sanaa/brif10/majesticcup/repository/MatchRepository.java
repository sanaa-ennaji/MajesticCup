package org.sanaa.brif10.majesticcup.repository;

import org.sanaa.brif10.majesticcup.model.entity.Match;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MatchRepository extends MongoRepository<Match, String> {
}
