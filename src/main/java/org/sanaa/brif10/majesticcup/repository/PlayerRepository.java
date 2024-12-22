package org.sanaa.brif10.majesticcup.repository;

import org.sanaa.brif10.majesticcup.model.entity.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayerRepository extends MongoRepository<Player, String> {
}
