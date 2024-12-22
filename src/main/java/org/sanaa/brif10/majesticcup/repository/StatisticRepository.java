package org.sanaa.brif10.majesticcup.repository;

import org.sanaa.brif10.majesticcup.model.entity.Statistic;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StatisticRepository extends MongoRepository<Statistic, String> {
}
