package org.sanaa.brif10.majesticcup.repository;

import org.sanaa.brif10.majesticcup.model.entity.Round;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoundRepository extends MongoRepository<Round, String> {
}
