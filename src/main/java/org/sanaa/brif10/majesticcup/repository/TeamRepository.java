package org.sanaa.brif10.majesticcup.repository;

import org.sanaa.brif10.majesticcup.model.entity.Team;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeamRepository extends MongoRepository<Team, String> {
}
